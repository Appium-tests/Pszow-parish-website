package header;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.header.Header;

@Epic("E2E")
@Feature("Logo")
public class LogoTest extends BaseTest {

    private Header header;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        header = new Header(getDriver());
    }

    @Test
    @Description("Tapping the logo")
    public void tappingLogo() {

        header.tapLogo();
        waitForUrl(URLs.HOME_PAGE.getName(), "Incorrect url");
    }
}
