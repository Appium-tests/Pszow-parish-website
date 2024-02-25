package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.Getter;
import qa.pageobject.searchengine.SearchEngine;

@Getter
public class SearchEngineSteps {

    private final SearchEngine searchEngine;

    public SearchEngineSteps(AndroidDriver driver) {

        this.searchEngine = new SearchEngine(driver);
    }

    public void setPhrase(String phrase) {

        Allure.step("Set the \"" + phrase + "\" phrase");
        searchEngine.setPhrase(phrase);
    }

    @Step("Tap the search button")
    public void tapSearchButton() {

        searchEngine.tapSearchButton();
    }

}
