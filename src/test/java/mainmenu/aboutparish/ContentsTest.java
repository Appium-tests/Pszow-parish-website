package mainmenu.aboutparish;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"O parafii\" dropdown list")
public class ContentsTest extends DropdownListTest {

    private AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
    }

    @Test(priority = 1)
    @Description("Expanding the menu dropdown list")
    public void expandingDropdownList() {

        aboutParishDropdownList.tapTriggerElement();
        checkContentsVisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Description("Collapsing the menu dropdown list")
    public void collapsingDropdownList() {

        aboutParishDropdownList.tapTriggerElement();
        aboutParishDropdownList.tapTriggerElement();
        checkContentsInvisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not collapsed");
    }
}
