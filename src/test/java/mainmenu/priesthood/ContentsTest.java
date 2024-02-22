package mainmenu.priesthood;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.PriesthoodDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Duszpasterstwo\" dropdown list")
public class ContentsTest extends DropdownListTest {

    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
    }

    @Test(priority = 1)
    @Description("Expanding the \"Duszpasterstwo\" dropdown list")
    public void expandingDropdownList() {

        priesthoodDropdownList.tapTriggerElement();
        checkContentsVisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Description("Collapsing the \"Duszpasterstwo\" dropdown list")
    public void collapsingDropdownList() {

        priesthoodDropdownList.tapTriggerElement();
        priesthoodDropdownList.tapTriggerElement();
        checkContentsInvisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not collapsed");
    }
}
