package searchengine;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.SearchEngineTest;
import qa.pageobject.searchengine.SearchEngine;


public class OpeningSearchResultsPageTest extends SearchEngineTest {

    private SearchEngine searchEngine;

    @BeforeMethod
    public void initSearchEngine() {

        searchEngine = new SearchEngine(getDriver());
    }

    @Test
    public void byTappingSearchButton() {

        searchEngine.setPhrase("Duszpasterze");
        getDriver().hideKeyboard();
        searchEngine.tapSearchButton();

        waitForSearchResultsPage();
    }


    @Test
    public void byTappingEnter() {

        searchEngine.setPhrase("Duszpasterze");
        getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));

        waitForSearchResultsPage();
    }
}
