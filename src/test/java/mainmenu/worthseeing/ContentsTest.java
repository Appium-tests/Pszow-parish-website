package mainmenu.worthseeing;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.WorthSeeingDropdownList;

@Epic("E2E")
@Feature("Expanding and collapsing the \"Warto zobaczyć\" dropdown list")
public class ContentsTest extends BaseTest {
    private WorthSeeingDropdownList worthSeeingDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        worthSeeingDropdownList = new WorthSeeingDropdownList(getDriver());
    }

    @Test(priority = 1)
    @QaseId(41)
    @QaseTitle("Expanding the \"Warto zobaczyć\" dropdown list")
    @Description("Expanding the \"Warto zobaczyć\" dropdown list")
    public void expandingDropdownList() {

        worthSeeingDropdownList.touchTriggerElement();
        checkContentsVisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not expanded");
    }

    @Test(priority = 2)
    @QaseId(42)
    @QaseTitle("Collapsing the \"Warto zobaczyć\" dropdown list")
    @Description("Collapsing the \"Warto zobaczyć\" dropdown list")
    public void collapsingDropdownList() {

        worthSeeingDropdownList.touchTriggerElement();
        worthSeeingDropdownList.touchTriggerElement();
        checkContentsInvisibility(worthSeeingDropdownList.getContentsLocator(), "The \"Warto zobaczyć\" dropdown list is not collapsed");
    }
}
