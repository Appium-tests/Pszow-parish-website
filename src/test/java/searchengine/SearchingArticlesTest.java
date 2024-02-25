package searchengine;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.SearchEngineTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.PhrasesDataProviders;
import qa.pageobject.searchresultspage.SearchResultsPage;
import qa.steps.SearchEngineSteps;

@Epic("E2E")
@Feature("Search engine")
public class SearchingArticlesTest extends SearchEngineTest {
    private SearchResultsPage searchResultsPage;
    private SearchEngineSteps steps;

    @BeforeMethod
    public void initObjects() {

        steps = new SearchEngineSteps(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    private void actions(String phrase) {

        steps.setPhrase(phrase);
        getDriver().hideKeyboard();
        steps.tapSearchButton();
        waitForSearchResultsPage();
    }

    @Test(dataProvider = DataProviderNames.CORRECT, dataProviderClass = PhrasesDataProviders.class)
    public void correctPhrase(String phrase) {

        Allure.description("Searching the article with the \"" + phrase + "\" as the correct phrase");
        actions(phrase);

        Assert.assertTrue(searchResultsPage.getNumberOfArticles() > 0);
    }

    @Test(dataProvider = DataProviderNames.INCORRECT, dataProviderClass = PhrasesDataProviders.class)
    public void incorrectPhrase(String phrase) {

        Allure.description("Searching the article with the \"" + phrase + "\" as the incorrect phrase");
        actions(phrase);

        Assert.assertEquals(searchResultsPage.getNumberOfArticles(), 0);
    }
}
