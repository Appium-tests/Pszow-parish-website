package searchengine;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.PhrasesDataProviders;
import qa.enums.URLs;
import qa.pageobject.searchresultspage.SearchResultsPage;
import qa.steps.SearchEngineSteps;

@Epic("E2E")
@Feature("Search engine")
public class SearchingArticlesTest extends BaseTest {
    private SearchResultsPage searchResultsPage;
    private SearchEngineSteps steps;
    private final String urlFraction = "https://bazylika-pszow.pl/?s";

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new SearchEngineSteps(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    private void actions(String phrase) {

        steps.setPhrase(phrase);
        getDriver().hideKeyboard();
        steps.touchSearchButton();
        getWebDriverWait().until(ExpectedConditions.urlContains(urlFraction));
    }

    @Test(dataProvider = DataProviderNames.CORRECT, dataProviderClass = PhrasesDataProviders.class)
    @QaseId(21)
    @QaseTitle("Searching with a correct phrase")
    public void correctPhrase(String phrase) {

        Allure.description("Searching the article with the \"" + phrase + "\" as the correct phrase");
        actions(phrase);

        Assert.assertTrue(searchResultsPage.getNumberOfArticles() > 0);
    }

    @Test(dataProvider = DataProviderNames.INCORRECT, dataProviderClass = PhrasesDataProviders.class)
    @QaseId(22)
    @QaseTitle("Searching with an incorrect phrase")
    public void incorrectPhrase(String phrase) {

        Allure.description("Searching the article with the \"" + phrase + "\" as the incorrect phrase");
        actions(phrase);

        Assert.assertEquals(searchResultsPage.getNumberOfArticles(), 0);
    }
}
