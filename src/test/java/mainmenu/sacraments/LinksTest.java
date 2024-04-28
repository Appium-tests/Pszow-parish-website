package mainmenu.sacraments;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.SacramentsDropdownList;

@Epic("E2E")
@Feature("The \"Sakramenty\" dropdown list links")
public class LinksTest extends BaseTest {

    private SacramentsDropdownList sacramentsDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        sacramentsDropdownList = new SacramentsDropdownList(getDriver());
        sacramentsDropdownList.touchTriggerElement();
    }

    @Test(priority = 1)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(24)
    @QaseTitle("The \"Chrzest\" link")
    @Description("The \"Chrzest\" link")
    public void christeningLink() {

        sacramentsDropdownList.touchChristeningLink();
        waitForUrl(URLs.CHRISTENING_PAGE.getName(), "The page \"" + URLs.CHRISTENING_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 2)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(25)
    @QaseTitle("The \"Pierwsza Komunia\" link")
    @Description("The \"Pierwsza Komunia\" link")
    public void firstCommunionLink() {

        sacramentsDropdownList.touchFirstCommunionLink();
        waitForUrl(URLs.FIRST_COMMUNION_PAGE.getName(), "The page \"" + URLs.FIRST_COMMUNION_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 4)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(26)
    @QaseTitle("The \"Bierzmowanie\" link")
    @Description("The \"Bierzmowanie\" link")
    public void confirmationLink() {

        sacramentsDropdownList.touchConfirmationLink();
        waitForUrl(URLs.CONFIRMATION_PAGE.getName(), "The page \"" + URLs.CONFIRMATION_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 3)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(24)
    @QaseTitle("The \"Małżeństwo\" link")
    @Description("The \"Małżeństwo\" link")
    public void marriageLink() {

        sacramentsDropdownList.touchMarriageLink();
        waitForUrl(URLs.MARRIAGE_PAGE.getName(), "The page \"" + URLs.MARRIAGE_PAGE.getName() + "\" has not been opened");
    }
}
