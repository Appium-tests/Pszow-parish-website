package mainmenu.sacraments;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.SacramentsDropdownList;

public class ContentsTest extends DropdownListTest {

    private SacramentsDropdownList sacramentsDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        sacramentsDropdownList = new SacramentsDropdownList(getDriver());
    }

    @Test(priority = 1)
    public void expandingDropdownList() {

        sacramentsDropdownList.tapTriggerElement();
        checkContentsVisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    public void collapsingDropdownList() {

        sacramentsDropdownList.tapTriggerElement();
        sacramentsDropdownList.tapTriggerElement();
        checkContentsInvisibility(sacramentsDropdownList.getContentsLocator(), "The \"Sakramenty Święte\" dropdown list is not collapsed");
    }
}
