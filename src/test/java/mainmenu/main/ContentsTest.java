package mainmenu.main;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the main menu dropdown list")
public class ContentsTest extends DropdownListTest {

    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        steps = new DropdownListSteps(new MainDropdownList(getDriver()));
    }

    @Test(priority = 1)
    @QaseId(2)
    @QaseTitle("Expanding the main drop-down list")
    @Description("Expanding the main drop-down list")
    public void expandingDropdownList() {

        steps.touchTriggerElement();
        checkContentsVisibility(steps.getDropdownList().getContentsLocator(), "The main dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Description("Collapsing the main menu dropdown list")
    public void collapsingDropdownList() {

        steps.touchTriggerElement();
        steps.touchTriggerElement();
        checkContentsInvisibility(steps.getDropdownList().getContentsLocator(), "The main dropdown list is not collapsed");
    }
}
