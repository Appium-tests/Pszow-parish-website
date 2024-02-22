package mainmenu.priesthood;

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
import qa.pageobject.menu.PriesthoodDropdownList;

@Epic("E2E")
@Feature("The \"Duszpasterstwo\" links")
public class LinksTest extends DropdownListTest {

    private PriesthoodDropdownList priesthoodDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        priesthoodDropdownList = new PriesthoodDropdownList(getDriver());
        priesthoodDropdownList.tapTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.PRIESTHOOD, dataProviderClass = DropdownListDataProviders.class)
    public void linksTest(LinkData linkData) {

        Allure.description("Tapping the " + linkData.getValue() + " link");
        priesthoodDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
