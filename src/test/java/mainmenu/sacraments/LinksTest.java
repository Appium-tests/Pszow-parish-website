package mainmenu.sacraments;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.SacramentsDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("The \"Sakramenty\" dropdown list links")
public class LinksTest extends DropdownListTest {

    DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new SacramentsDropdownList(getDriver()));
        steps.touchTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.SACRAMENTS, dataProviderClass = DropdownListDataProviders.class)
    @QaseId(10)
    @QaseTitle("The \"Sakramenty Święte\" dropdown list links")
    public void links(LinkData linkData) {

        Allure.description("Touching the " + linkData.getValue() + " link");
        steps.touchLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
