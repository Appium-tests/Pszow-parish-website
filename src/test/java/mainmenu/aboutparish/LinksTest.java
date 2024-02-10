package mainmenu.aboutparish;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.AboutParishDropdownList;

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

        aboutParishDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
