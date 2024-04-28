package searchengine;

import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.enums.URLs;
import qa.steps.SearchEngineSteps;

@Epic("E2E")
@Feature("Input text verification")
public class InputTextVerificationTest extends BaseTest {
    private SearchEngineSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new SearchEngineSteps(getDriver());
    }

    @Test
    @Owner("Paweł Aksman")
    @Tag("Search engine")
    @Tag("Phrase")
    @QaseId(51)
    @QaseTitle("Input text verification")
    @Description("Checking input of the search field")
    public void byTappingSearchButton() {

        String phrase = "This is the phrase";
        Allure.parameter("Input", phrase);
        steps.setPhrase(phrase);
        getDriver().hideKeyboard();

        Assert.assertEquals(steps.getSearchEngine().getSearchFieldContent(), phrase);
    }
}
