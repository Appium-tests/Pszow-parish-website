package searchengine;

import io.qameta.allure.Description;
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
import qa.dataproviders.DataProviders;
import qa.enums.URLs;
import qa.pageobject.searchengine.SearchEngine;
import qa.pageobject.searchresultspage.SearchResultsPage;

@Epic("E2E")
@Feature("Search engine")
public class SearchingArticlesTest extends BaseTest {
    private SearchResultsPage searchResultsPage;
    private SearchEngine searchEngine;
    private final String urlFraction = "https://bazylika-pszow.pl/?s";

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        searchEngine = new SearchEngine(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    private void actions(String phrase) {

        searchEngine.setPhrase(phrase);
        getDriver().hideKeyboard();
        searchEngine.touchSearchButton();
        getWebDriverWait().until(ExpectedConditions.urlContains(urlFraction));
    }

    @Test(priority = 1, dataProvider = DataProviderNames.CORRECT, dataProviderClass = DataProviders.class)
    @QaseId(52)
    @QaseTitle("Searching with a correct phrase")
    @Description("Searching with a correct phrase")
    public void correctPhrase(String phrase) {

        actions(phrase);
        Assert.assertTrue(searchResultsPage.getNumberOfArticles() > 0);
    }

    @Test(priority = 2, dataProvider = DataProviderNames.INCORRECT, dataProviderClass = DataProviders.class)
    @QaseId(53)
    @QaseTitle("Searching with an incorrect phrase")
    @Description("Searching with an incorrect phraase")
    public void incorrectPhrase(String phrase) {

        actions(phrase);
        Assert.assertEquals(searchResultsPage.getNumberOfArticles(), 0);
    }
}
