package mainmenu.aboutparish;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;

public class ContentsTest extends DropdownListTest {

    private AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
    }

    @Test(priority = 1)
    public void expandingDropdownList() {

        aboutParishDropdownList.tapTriggerElement();
        checkContentsVisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    public void collapsingDropdownList() {

        aboutParishDropdownList.tapTriggerElement();
        aboutParishDropdownList.tapTriggerElement();
        checkContentsInvisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not collapsed");
    }
}
