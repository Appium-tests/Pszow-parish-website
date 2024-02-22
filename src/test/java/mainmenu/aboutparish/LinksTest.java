package mainmenu.aboutparish;

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
import qa.pageobject.menu.AboutParishDropdownList;

@Epic("E2E")
@Feature("The \"O parafii\" menu links")
public class LinksTest extends DropdownListTest {

    private AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
        aboutParishDropdownList.tapTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.ABOUT_PARISH, dataProviderClass = DropdownListDataProviders.class)
    public void linksTest(LinkData linkData) {

        Allure.description("Tapping the " + linkData.getValue() + " link");
        aboutParishDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
