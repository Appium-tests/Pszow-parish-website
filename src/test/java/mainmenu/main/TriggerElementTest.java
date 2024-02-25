package mainmenu.main;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;


public class TriggerElementTest extends BaseTest {

    private MainDropdownList mainDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        mainDropdownList = new MainDropdownList(getDriver());
    }

    private void checkCloseButtonVisibility() {

        try {
            getWebDriverWait().until(ExpectedConditions.visibilityOf(mainDropdownList.getCloseButtonLocator()));
        } catch (Exception e) {
            Assert.fail("The \"ZAMKNIJ\" button is not displayed");
        }
    }

    @Test
    public void closeButtonVisibility() {

        mainDropdownList.tapTriggerElement();
        checkCloseButtonVisibility();
    }
}
