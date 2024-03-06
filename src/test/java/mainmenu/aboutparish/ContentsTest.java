package mainmenu.aboutparish;

import base.BaseTest;
import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"O parafii\" dropdown list")
public class ContentsTest extends BaseTest {
    private AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(11)
    @QaseTitle("Expanding the \"O Parafii\" drop-down list")
    @Description("Expanding the menu dropdown list")
    public void expandingDropdownList() {

        aboutParishDropdownList.touchTriggerElement();
        checkContentsVisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(12)
    @QaseTitle("Collapsing the \"O Parafii\" drop-down list")
    @Description("Collapsing the menu dropdown list")
    public void collapsingDropdownList() {

        aboutParishDropdownList.touchTriggerElement();
        aboutParishDropdownList.touchTriggerElement();
        checkContentsInvisibility(aboutParishDropdownList.getContentsLocator(), "The \"O Parafii\" dropdown list is not collapsed");
    }
}
