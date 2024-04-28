package mainmenu.aboutparish;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"O parafii\" dropdown list")
public class ContentsTest extends BaseTest {
    private AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod(onlyForGroups = "withoutExpandedList")
    public void prepareWithoutExpandedList() {

        initialize();
    }

    @BeforeMethod(onlyForGroups = "withExpandedList")
    public void prepareWithExpandedList() {

        initialize();
        aboutParishDropdownList.touchTriggerElement();
    }

    private void initialize() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
    }

    @Test(priority = 1, groups = "withoutExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(11)
    @QaseTitle("Expanding the \"O Parafii\" drop-down list")
    @Description("Expanding the menu dropdown list")
    public void expandingDropdownList() {

        aboutParishDropdownList.touchTriggerElement();
        checkContentsVisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not expanded");
    }

    @Test(priority = 2, groups = "withExpandedList")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(12)
    @QaseTitle("Collapsing the \"O Parafii\" drop-down list")
    @Description("Collapsing the menu dropdown list")
    public void collapsingDropdownList() {

        aboutParishDropdownList.touchTriggerElement();
        checkContentsInvisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not collapsed");
    }
}
