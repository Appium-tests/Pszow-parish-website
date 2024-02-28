package mainmenu.aboutparish;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the \"O parafii\" dropdown list")
public class ContentsTest extends DropdownListTest {
    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new AboutParishDropdownList(getDriver()));
    }

    @Test(priority = 1)
    @QaseId(5)
    @QaseTitle("Expanding the \"O Parafii\" drop-down list")
    @Description("Expanding the menu dropdown list")
    public void expandingDropdownList() {

        steps.touchTriggerElement();
        checkContentsVisibility(steps.getDropdownList().getContentsLocator(), "The \"O Parafii\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(6)
    @QaseTitle("Collapsing the \"O Parafii\" drop-down list")
    @Description("Collapsing the menu dropdown list")
    public void collapsingDropdownList() {

        steps.touchTriggerElement();
        steps.touchTriggerElement();
        checkContentsInvisibility(steps.getDropdownList().getContentsLocator(), "The \"O Parafii\" dropdown list is not collapsed");
    }
}
