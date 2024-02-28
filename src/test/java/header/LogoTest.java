package header;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.enums.URLs;
import qa.steps.HeaderSteps;

@Epic("E2E")
@Feature("Logo")
public class LogoTest extends BaseTest {
    private HeaderSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        steps = new HeaderSteps(getDriver());
    }

    @Test
    @QaseId(1)
    @QaseTitle("Tapping the logo")
    @Description("Tapping the logo")
    public void tappingLogo() {

        steps.touchLogo();
        waitForUrl(URLs.HOME_PAGE.getName(), "Incorrect url");
    }
}
