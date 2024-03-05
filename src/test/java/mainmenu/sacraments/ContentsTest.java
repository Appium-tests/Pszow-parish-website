package mainmenu.sacraments;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
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

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        sacramentsDropdownList = new SacramentsDropdownList(getDriver());
    }

    @Test(priority = 1)
    @QaseId(22)
    @QaseTitle("Expanding the \"Sakramenty Święte\" dropdown list")
    @Description("Expanding the \"Sakramenty Święte\" dropdown list")
    public void expandingDropdownList() {

        sacramentsDropdownList.touchTriggerElement();
        checkContentsVisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(23)
    @QaseTitle("Collapsing the \"Sakramenty Święte\" dropdown list")
    @Description("Collapsing the \"Sakramenty Święte\" dropdown list")
    public void collapsingDropdownList() {

        sacramentsDropdownList.touchTriggerElement();
        sacramentsDropdownList.touchTriggerElement();
        checkContentsInvisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not collapsed");
    }
}
