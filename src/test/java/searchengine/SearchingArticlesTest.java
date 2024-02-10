package searchengine;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.SearchEngineTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.PhrasesDataProviders;
import qa.pageobject.searchengine.SearchEngine;
import qa.pageobject.searchresultspage.SearchResultsPage;

public class SearchingArticlesTest extends SearchEngineTest {

    private SearchEngine searchEngine;
    private SearchResultsPage searchResultsPage;

    @BeforeMethod
    public void initObjects() {

        searchEngine = new SearchEngine(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    private void actions(String phrase) {

        searchEngine.setPhrase(phrase);
        getDriver().hideKeyboard();
        searchEngine.tapSearchButton();
        waitForSearchResultsPage();
    }

    @Test(dataProvider = DataProviderNames.CORRECT, dataProviderClass = PhrasesDataProviders.class)
    public void correctPhrase(String phrase) {

        actions(phrase);

        Assert.assertTrue(searchResultsPage.getNumberOfArticles() > 0);
    }

    @Test(dataProvider = DataProviderNames.INCORRECT, dataProviderClass = PhrasesDataProviders.class)
    public void incorrectPhrase(String phrase) {

        actions(phrase);

        Assert.assertEquals(searchResultsPage.getNumberOfArticles(), 0);
    }
}
