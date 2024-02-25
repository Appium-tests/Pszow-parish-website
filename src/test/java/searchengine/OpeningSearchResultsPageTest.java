package searchengine;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.SearchEngineTest;
import qa.steps.SearchEngineSteps;

@Epic("E2E")
@Feature("Opening the search results page")
public class OpeningSearchResultsPageTest extends SearchEngineTest {
    private SearchEngineSteps steps;

    @BeforeMethod
    public void initSearchEngine() {

        steps = new SearchEngineSteps(getDriver());
    }

    @Test
    @Description("Opening the search results page by tapping the search button")
    public void byTappingSearchButton() {

        steps.setPhrase("Duszpasterze");
        getDriver().hideKeyboard();
        steps.tapSearchButton();
        waitForSearchResultsPage();
    }


    @Test
    @Description("Opening the search results page by tapping the submit button")
    public void byTappingSubmitZButton() {

        steps.setPhrase("Duszpasterze");
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        waitForSearchResultsPage();
    }
}
