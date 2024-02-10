package mainmenu.worthseeing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.WorthSeeingDropdownList;

public class ContentsTest extends DropdownListTest {

    private WorthSeeingDropdownList worthSeeingDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        worthSeeingDropdownList = new WorthSeeingDropdownList(getDriver());
    }

    @Test(priority = 1)
    public void expandingDropdownList() {

        worthSeeingDropdownList.tapTriggerElement();
        checkContentsVisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    public void collapsingDropdownList() {

        worthSeeingDropdownList.tapTriggerElement();
        worthSeeingDropdownList.tapTriggerElement();
        checkContentsInvisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not collapsed");
    }
}
