package header;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
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
    @Description("Tapping the logo")
    public void tappingLogo() {

        steps.tapLogo();
        waitForUrl(URLs.HOME_PAGE.getName(), "Incorrect url");
    }
}
