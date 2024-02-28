package mainmenu.priesthood;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.PriesthoodDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Duszpasterstwo\" dropdown list")
public class ContentsTest extends DropdownListTest {
    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new PriesthoodDropdownList(getDriver()));
    }

    @Test(priority = 1)
    @QaseId(11)
    @QaseTitle("Expanding the \"Duszpasterstwo\" dropdown list")
    @Description("Expanding the \"Duszpasterstwo\" dropdown list")
    public void expandingDropdownList() {

        steps.touchTriggerElement();
        checkContentsVisibility(steps.getDropdownList().getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(12)
    @QaseTitle("Collapsing the \"Duszpasterstwo\" dropdown list")
    @Description("Collapsing the \"Duszpasterstwo\" dropdown list")
    public void collapsingDropdownList() {

        steps.touchTriggerElement();
        steps.touchTriggerElement();
        checkContentsInvisibility(steps.getDropdownList().getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not collapsed");
    }
}
