package mainmenu.worthseeing;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.WorthSeeingDropdownList;

@Epic("E2E")
@Feature("The \"Warto zobaczyć\" dropdown list links")
public class LinksTest extends BaseTest {

    private WorthSeeingDropdownList worthSeeingDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        worthSeeingDropdownList = new WorthSeeingDropdownList(getDriver());
        worthSeeingDropdownList.touchTriggerElement();
    }

    @Test(priority = 4)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(43)
    @QaseTitle("The \"Litania do Pani Usmiechniętej\" link")
    @Description("The \"Litania do Pani Uśmiechniętej\" link")
    public void litanyLink() {

        worthSeeingDropdownList.touchLitanyLink();
        waitForUrl(URLs.LITANY_PAGE.getName(), "The page \"" + URLs.LITANY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 1)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(44)
    @QaseTitle("The \"Regulamin cmentarza\" link")
    @Description("The \"Regulamin cmentarza\" link")
    public void cementeryRegulationLink() {

        worthSeeingDropdownList.touchCementeryRegulationLink();
        waitForUrl(URLs.CEMENTERY_REGULATION.getName(), "The page \"" + URLs.CEMENTERY_REGULATION.getName() + "\" has not been opened");
    }

    @Test(priority = 5)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.MINOR)
    @QaseId(45)
    @QaseTitle("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    @Description("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void delegateLink() {

        worthSeeingDropdownList.touchDelegateLink();
        waitForUrl(URLs.DELEGATE_PAGE.getName(), "The page \"" + URLs.DELEGATE_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 2)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(46)
    @QaseTitle("The \"Archidiecezja Katowicka\" link")
    @Description("The \"Archidiecezja Katowicka\" link")
    public void archdioceseLink() {

        worthSeeingDropdownList.touchArchdioceseLink();
        waitForUrl(URLs.ARCHDIOCESE.getName(), "The page \"" + URLs.ARCHDIOCESE.getName() + "\" has not been opened");
    }

    @Test(priority = 3)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(47)
    @QaseTitle("The \"Czytania liturgiczne\" link")
    @Description("The \"Czytania liturgiczne\" link")
    public void readingLink() {

        worthSeeingDropdownList.touchReadingLink();
        waitForUrl(URLs.READING.getName(), "The page \"" + URLs.READING.getName() + "\" has not been opened");
    }
}
