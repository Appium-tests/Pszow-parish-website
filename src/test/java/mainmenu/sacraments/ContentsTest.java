package mainmenu.sacraments;

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
import qa.pageobject.menu.SacramentsDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Sakramenty Święte\" dropdown list")
public class ContentsTest extends BaseTest {

    private SacramentsDropdownList sacramentsDropdownList;

    @BeforeMethod(onlyForGroups = "withoutExpandedList")
    public void prepareWithoutExpandedList() {

        initialize();
    }

    @BeforeMethod(onlyForGroups = "withExpandedList")
    public void prepareWithExpandedList() {

        initialize();
        sacramentsDropdownList.touchTriggerElement();
    }

    private void initialize() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        sacramentsDropdownList = new SacramentsDropdownList(getDriver());
    }

    @Test(priority = 1, groups = "withoutExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @QaseId(22)
    @QaseTitle("Expanding the \"Sakramenty Święte\" dropdown list")
    @Description("Expanding the \"Sakramenty Święte\" dropdown list")
    public void expandingDropdownList() {

        sacramentsDropdownList.touchTriggerElement();
        checkContentsVisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not expanded");
    }

    @Test(priority = 2, groups = "withExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Dropdown list")
    @QaseId(23)
    @QaseTitle("Collapsing the \"Sakramenty Święte\" dropdown list")
    @Description("Collapsing the \"Sakramenty Święte\" dropdown list")
    public void collapsingDropdownList() {

        sacramentsDropdownList.touchTriggerElement();
        checkContentsInvisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not collapsed");
    }
}
