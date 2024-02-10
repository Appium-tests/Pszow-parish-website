package header;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.header.Header;

public class LogoTest extends BaseTest {

    private Header header;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        header = new Header(getDriver());
    }

    @Test
    public void tappingLogo() {

        header.tapLogo();
        waitForUrl(URLs.HOME_PAGE.getName(), "Incorrect url");
    }
}
