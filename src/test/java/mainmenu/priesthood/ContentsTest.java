package mainmenu.priesthood;

import base.BaseTest;
import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.PriesthoodDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Duszpasterstwo\" dropdown list")
public class ContentsTest extends BaseTest {
    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(28)
    @QaseTitle("Expanding the \"Duszpasterstwo\" dropdown list")
    @Description("Expanding the \"Duszpasterstwo\" dropdown list")
    public void expandingDropdownList() {

        priesthoodDropdownList.touchTriggerElement();
        checkContentsVisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(29)
    @QaseTitle("Collapsing the \"Duszpasterstwo\" dropdown list")
    @Description("Collapsing the \"Duszpasterstwo\" dropdown list")
    public void collapsingDropdownList() {

        priesthoodDropdownList.touchTriggerElement();
        priesthoodDropdownList.touchTriggerElement();
        checkContentsInvisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not collapsed");
    }
}
