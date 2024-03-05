package mainmenu.main;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
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
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(2)
    @QaseTitle("Expanding the main dropdown list")
    @Description("Expanding the main dropdown list")
    public void expandingDropdownList() {

        mainDropdownList.touchTriggerElement();
        checkContentsVisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(3)
    @QaseTitle("Collapsing the main dropdown list")
    @Description("Collapsing the main menu dropdown list")
    public void collapsingDropdownList() {

        mainDropdownList.touchTriggerElement();
        mainDropdownList.touchTriggerElement();
        checkContentsInvisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not collapsed");
    }
}
