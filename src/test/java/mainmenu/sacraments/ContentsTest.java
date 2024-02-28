package mainmenu.sacraments;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.SacramentsDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Sakramenty\" dropdown list")
public class ContentsTest extends DropdownListTest {

    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new SacramentsDropdownList(getDriver()));
    }

    @Test(priority = 1)
    @Description("Expanding the \"Sakramenty\" dropdown list")
    public void expandingDropdownList() {

        steps.tapTriggerElement();
        checkContentsVisibility(steps.getDropdownList().getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Description("Collapsing the \"Sakramenty\" dropdown list")
    public void collapsingDropdownList() {

        steps.tapTriggerElement();
        steps.tapTriggerElement();
        checkContentsInvisibility(steps.getDropdownList().getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not collapsed");
    }
}
