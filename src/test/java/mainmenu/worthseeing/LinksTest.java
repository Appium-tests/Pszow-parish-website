package mainmenu.worthseeing;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.WorthSeeingDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("The \"Warto zobaczyć\" dropdown list links")
public class LinksTest extends DropdownListTest {

    DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new WorthSeeingDropdownList(getDriver()));
    }

    @Test(dataProvider = DataProviderNames.WORTH_SEEING, dataProviderClass = DropdownListDataProviders.class)
    public void links(LinkData linkData) {

        Allure.description("Tapping the " + linkData.getValue() + " link");
        steps.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
