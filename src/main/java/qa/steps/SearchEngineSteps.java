package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import lombok.Getter;
import qa.pageobject.searchengine.SearchEngine;

@Getter
public class SearchEngineSteps {

    private final SearchEngine searchEngine;

    public SearchEngineSteps(AndroidDriver driver) {

        this.searchEngine = new SearchEngine(driver);
    }

    @io.qase.api.annotation.Step("Enter a phrase in the search field")
    public void setPhrase(String phrase) {

        Allure.step("Enter the \"" + phrase + "\" phrase");
        searchEngine.setPhrase(phrase);
    }

    @io.qase.api.annotation.Step("Touch the search button")
    @io.qameta.allure.Step("Touch the search button")
    public void touchSearchButton() {

        searchEngine.touchSearchButton();
    }

}
