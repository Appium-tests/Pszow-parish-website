package header;

import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.header.Header;

@Epic("E2E")
@Feature("Logo")
public class LogoTest extends BaseTest {
    private Header header;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.PHOTO_GALLERY_PAGE.getName());
        header = new Header(getDriver());
    }

    @Test
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Logo")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Touching the logo")
    @QaseId(1)
    @QaseTitle("Touching the logo")
    public void tappingLogo() {

        header.touchLogo();
        waitForUrl(URLs.HOME_PAGE.getName(), "Incorrect url");
    }
}
