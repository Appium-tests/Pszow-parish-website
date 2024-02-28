package mainmenu.sacraments;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.SacramentsDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Sakramenty Święte\" dropdown list")
public class ContentsTest extends DropdownListTest {

    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new SacramentsDropdownList(getDriver()));
    }

    @Test(priority = 1)
    @QaseId(8)
    @QaseTitle("Expanding the \"Sakramenty Święte\" dropdown list")
    @Description("Expanding the \"Sakramenty Święte\" dropdown list")
    public void expandingDropdownList() {

        steps.touchTriggerElement();
        checkContentsVisibility(steps.getDropdownList().getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(9)
    @QaseTitle("Collapsing the \"Sakramenty Święte\" dropdown list")
    @Description("Collapsing the \"Sakramenty Święte\" dropdown list")
    public void collapsingDropdownList() {

        steps.touchTriggerElement();
        steps.touchTriggerElement();
        checkContentsInvisibility(steps.getDropdownList().getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not collapsed");
    }
}
