package mainmenu.main;

import base.BaseTest;
import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;

@Epic("E2E")
@Feature("Main dropdown list links")
public class LinksTest extends BaseTest {
    private MainDropdownList mainDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        mainDropdownList = new MainDropdownList(getDriver());
        mainDropdownList.touchTriggerElement();
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(4)
    @QaseTitle("The \"Ogłoszenia duszpasterskie\" link")
    @Description("The \"Ogłoszenia duszpasterskie\" link")
    public void announcementsLink() {

        mainDropdownList.touchAnnouncementsLink();
        waitForUrl(URLs.ANNOUNCEMENTS_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(5)
    @QaseTitle("The \"Intencje mszalne\" link")
    @Description("The \"Intencje mszalne\" link")
    public void intentionsLink() {

        mainDropdownList.touchIntentionsLink();
        waitForUrl(URLs.INTENTION_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(6)
    @QaseTitle("The \"Pogrzeby\" link")
    @Description("The \"Pogrzeby\" link")
    public void funeralsLink() {

        mainDropdownList.touchFuneralsLink();
        waitForUrl(URLs.FUNERALS_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 7)
    @Severity(SeverityLevel.NORMAL)
    @QaseId(7)
    @QaseTitle("The \"Szafarze\" link")
    @Description("The \"Szafarze\" link")
    public void stewardsLink() {

        mainDropdownList.touchStewardsLink();
        waitForUrl(URLs.STEWARDS_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 6)
    @Severity(SeverityLevel.NORMAL)
    @QaseId(8)
    @QaseTitle("The \"Duszpasterze\" link")
    @Description("The \"Duszpasterze\" link")
    public void priestsLink() {

        mainDropdownList.touchPriestsLink();
        waitForUrl(URLs.PRIESTS_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 5)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(9)
    @QaseTitle("The \"Spowiedź\" link")
    @Description("The \"Spowiedź\" link")
    public void confessionLink() {

        mainDropdownList.touchConfessionLink();
        waitForUrl(URLs.CONFESSION_PAGE.getName(), "Incorrect url");
    }

    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(10)
    @QaseTitle("The \"Kancelaria\" link")
    @Description("The \"Kancelaria\" link")
    public void officeLink() {

        mainDropdownList.touchOfficeLink();
        waitForUrl(URLs.OFFICE_PAGE.getName(), "Incorrect url");
    }
}
