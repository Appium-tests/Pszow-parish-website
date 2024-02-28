package mainmenu.aboutparish;

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
import qa.pageobject.menu.AboutParishDropdownList;
import qa.steps.DropdownListSteps;

@Epic("E2E")
@Feature("The \"O parafii\" menu links")
public class LinksTest extends DropdownListTest {
    private DropdownListSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new DropdownListSteps(new AboutParishDropdownList(getDriver()));
    }

    @Test(dataProvider = DataProviderNames.ABOUT_PARISH, dataProviderClass = DropdownListDataProviders.class)
    @QaseId(7)
    @QaseTitle("The \"O Parafii\" dropdown list links")
    public void linksTest(LinkData linkData) {

        Allure.description("Touching the " + linkData.getValue() + " link");
        steps.touchLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
