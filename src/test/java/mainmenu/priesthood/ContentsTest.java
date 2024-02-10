package mainmenu.priesthood;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.PriesthoodDropdownList;

public class ContentsTest extends DropdownListTest {

    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
    }

    @Test(priority = 1)
    public void expandingDropdownList() {

        priesthoodDropdownList.tapTriggerElement();
        checkContentsVisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    public void collapsingDropdownList() {

        priesthoodDropdownList.tapTriggerElement();
        priesthoodDropdownList.tapTriggerElement();
        checkContentsInvisibility(priesthoodDropdownList.getContentsLocator(), "The \"Duszpasterstwo\" dropdown list is not collapsed");
    }
}
