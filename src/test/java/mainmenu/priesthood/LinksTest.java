package mainmenu.priesthood;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.PriesthoodDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("The \"Duszpasterstwo\" links")
public class LinksTest extends DropdownListTest {
    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new PriesthoodDropdownList(getDriver()));
        steps.tapTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.PRIESTHOOD, dataProviderClass = DropdownListDataProviders.class)
    public void linksTest(LinkData linkData) {

        Allure.description("Tapping the " + linkData.getValue() + " link");
        steps.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
