package mainmenu.main;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.base.DropdownListTest;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the main menu dropdown list")
public class ContentsTest extends DropdownListTest {

    private MainDropdownList mainDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        mainDropdownList = new MainDropdownList(getDriver());
    }

    @Test(priority = 1)
    @Description("Expanding the main menu dropdown list")
    public void expandingDropdownList() {

        mainDropdownList.tapTriggerElement();
        checkContentsVisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Description("Collapsing the main menu dropdown list")
    public void collapsingDropdownList() {

        mainDropdownList.tapTriggerElement();
        mainDropdownList.tapTriggerElement();
        checkContentsInvisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not collapsed");
    }
}
