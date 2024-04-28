package mainmenu.main;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.MainDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the main menu dropdown list")
public class ContentsTest extends BaseTest {

    private MainDropdownList mainDropdownList;

    @BeforeMethod(onlyForGroups = "withoutExpandedList")
    public void prepareWithoutExpandedList() {

        initialize();
    }

    @BeforeMethod(onlyForGroups = "withExpandedList")
    public void prepareWithExpandedList() {

        initialize();
        mainDropdownList.touchTriggerElement();

    }

    private void initialize() {

        goToUrl(URLs.HOME_PAGE.getName());
        mainDropdownList = new MainDropdownList(getDriver());
    }

    @Test(priority = 2, groups = "withoutExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Main menu")
    @Tag("Dropdown list")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(2)
    @QaseTitle("Expanding the main dropdown list")
    @Description("Expanding the main dropdown list")
    public void expandingDropdownList() {

        mainDropdownList.touchTriggerElement();
        checkContentsVisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not expanded");
    }

    @Test(priority = 3, groups = "withExpandedList")
    @Owner("Paweł Aksman")
    @Tag("Main menu")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(3)
    @QaseTitle("Collapsing the main dropdown list")
    @Description("Collapsing the main menu dropdown list")
    public void collapsingDropdownList() {

        mainDropdownList.touchTriggerElement();
        checkContentsInvisibility(mainDropdownList.getContentsLocator(), "The main dropdown list is not collapsed");
    }
}
