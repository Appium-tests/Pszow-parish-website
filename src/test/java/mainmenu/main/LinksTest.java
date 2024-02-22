package mainmenu.main;

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
import qa.pageobject.menu.MainDropdownList;

@Epic("E2E")
@Feature("Main menu links")
public class LinksTest extends DropdownListTest {

    private MainDropdownList mainDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        mainDropdownList = new MainDropdownList(getDriver());
    }

    @Test(dataProvider = DataProviderNames.MAIN_DROPDOWN_LIST, dataProviderClass = DropdownListDataProviders.class)
    public void linksTest(LinkData linkData) {

        Allure.description("Tapping the " + linkData.getValue() + " link");
        mainDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
