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
@Feature("Expanding and collapsing the \"Duszpasterstwo\" dropdown list")
public class ContentsTest extends BaseTest {
    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod(onlyForGroups = "withoutExpandedList")
    public void prepareWithoutExpandedList() {

        initialize();
    }

    @BeforeMethod(onlyForGroups = "withExpandedList")
    public void prepareWithExpandedList() {

        initialize();
        priesthoodDropdownList.touchTriggerElement();
    }

    private void initialize() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
    }

    @Test(priority = 1, groups = "withoutExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(28)
    @QaseTitle("Expanding the \"Duszpasterstwo\" dropdown list")
    @Description("Expanding the \"Duszpasterstwo\" dropdown list")
    public void expandingDropdownList() {

        priesthoodDropdownList.touchTriggerElement();
        checkContentsVisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not expanded");
    }

    @Test(priority = 2, groups = "withExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @QaseId(29)
    @QaseTitle("Collapsing the \"Duszpasterstwo\" dropdown list")
    @Description("Collapsing the \"Duszpasterstwo\" dropdown list")
    public void collapsingDropdownList() {

        priesthoodDropdownList.touchTriggerElement();
        checkContentsInvisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not collapsed");
    }
}
