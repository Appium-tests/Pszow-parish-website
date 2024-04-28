package mainmenu.worthseeing;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.WorthSeeingDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Warto zobaczyć\" dropdown list")
public class ContentsTest extends BaseTest {
    private WorthSeeingDropdownList worthSeeingDropdownList;

    @BeforeMethod(onlyForGroups = "withoutExpandedList")
    public void prepareWithoutExpandedList() {

        initialize();
    }

    @BeforeMethod(onlyForGroups = "withExpandedList")
    public void prepareWithExpandedList() {

        initialize();
        worthSeeingDropdownList.touchTriggerElement();
    }

    private void initialize() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        worthSeeingDropdownList = new WorthSeeingDropdownList(getDriver());
    }

    @Test(priority = 1, groups = "withoutExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @QaseId(41)
    @QaseTitle("Expanding the \"Warto zobaczyć\" dropdown list")
    @Description("Expanding the \"Warto zobaczyć\" dropdown list")
    public void expandingDropdownList() {

        worthSeeingDropdownList.touchTriggerElement();
        checkContentsVisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not expanded");
    }

    @Test(priority = 2, groups = "withExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @QaseId(42)
    @QaseTitle("Collapsing the \"Warto zobaczyć\" dropdown list")
    @Description("Collapsing the \"Warto zobaczyć\" dropdown list")
    public void collapsingDropdownList() {

        worthSeeingDropdownList.touchTriggerElement();
        checkContentsInvisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not collapsed");
    }
}
