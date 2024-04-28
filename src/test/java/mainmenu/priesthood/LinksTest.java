package mainmenu.priesthood;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.PriesthoodDropdownList;

@Epic("E2E")
@Feature("The \"Duszpasterstwo\" links")
public class LinksTest extends BaseTest {
    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
        priesthoodDropdownList.touchTriggerElement();
    }

    @Test(priority = 11)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.BLOCKER)
    @QaseId(30)
    @QaseTitle("The \"Caritas i działalność charytatywne\" link")
    @Description("The \"Caritas i działalność charytatywne\" link")
    public void caritasLink() {

        priesthoodDropdownList.touchCaritasLink();
        waitForUrl(URLs.CARITAS.getName(), "The page \"" + URLs.CARITAS.getName() + "\" has not been opened");
    }

    @Test(priority = 8)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(31)
    @QaseTitle("The \"Parafialna Rada Duszpasterska\" link")
    @Description("The \"Parafialna Rada Duszpasterska\" link")
    public void councilLink() {

        priesthoodDropdownList.touchCouncilLink();
        waitForUrl(URLs.COUNCIL_PAGE.getName(), "The page \"" + URLs.COUNCIL_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 7)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(32)
    @QaseTitle("The \"Ministranci i LSO\" link")
    @Description("The \"Ministranci i LSO\" link")
    public void altarBoysLink() {

        priesthoodDropdownList.touchAltarBoysLink();
        waitForUrl(URLs.ALTAR_BOYS_PAGE.getName(), "The page \"" + URLs.ALTAR_BOYS_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 10)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(33)
    @QaseTitle("The \"Dzieci Maryi\" link")
    @Description("The \"Dzieci Maryi\" link")
    public void marysChildrenLink() {

        priesthoodDropdownList.touchMarysChildrenLink();
        waitForUrl(URLs.MARYS_CHILDREN_PAGE.getName(), "The page \"" + URLs.MARYS_CHILDREN_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 8)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(34)
    @QaseTitle("The \"Oaza młodzieżowa\" link")
    @Description("The \"Oaza młodziezowa\" link")
    public void oasisLink() {

        priesthoodDropdownList.touchOasisLink();
        waitForUrl(URLs.OASIS_PAGE.getName(), "The page \"" + URLs.OASIS_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 9)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(35)
    @QaseTitle("The \"Domowy Kościół\" link")
    @Description("The \"Domowy Kościół\" link")
    public void homeChurchLink() {

        priesthoodDropdownList.touchHomeChurchLink();
        waitForUrl(URLs.HOME_CHURCH_PAGE.getName(), "The page \"" + URLs.HOME_CHURCH_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 1)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(36)
    @QaseTitle("The \"Katecheza dorosłych\" link")
    @Description("The \"Katecheza dorosłych\" link")
    public void catechesisLink() {

        priesthoodDropdownList.touchCatechesisLink();
        waitForUrl(URLs.CATECHESIS_PAGE.getName(), "The page \"" + URLs.CATECHESIS_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 5)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(37)
    @QaseTitle("The \"PoCo\" link")
    @Description("The \"PoCo\" link")
    public void pocoLink() {

        priesthoodDropdownList.touchPocoLink();
        waitForUrl(URLs.POCO_PAGE.getName(), "The page \"" + URLs.POCO_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 3)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(38)
    @QaseTitle("The \"Legion Maryi\" link")
    @Description("The \"Legion Maryi\" link")
    public void legionOfMaryLink() {

        priesthoodDropdownList.touchLegionOfMaryLink();
        waitForUrl(URLs.LEGION_OF_MARY.getName(), "The page \"" + URLs.LEGION_OF_MARY.getName() + "\" has not been opened");
    }

    @Test(priority = 2)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(39)
    @QaseTitle("The \"Żywy Różaniec\" link")
    @Description("The \"Żywy Różaniec\" link")
    public void livingRosaryLink() {

        priesthoodDropdownList.touchLivingRosaryLink();
        waitForUrl(URLs.LIVING_ROSARY_PAGE.getName(), "The page \"" + URLs.LIVING_ROSARY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 4)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(40)
    @QaseTitle("The \"Wspólnota Matki Miłosiernego\" link")
    @Description("The \"Wspólnota Matki Miłosiernego\" link")
    public void mothersCommunityLink() {

        priesthoodDropdownList.touchMothersCommunityLink();
        waitForUrl(URLs.MOTHERS_COMMUNITY.getName(), "The page \"" + URLs.MOTHERS_COMMUNITY.getName() + "\" has not been opened");
    }
}
