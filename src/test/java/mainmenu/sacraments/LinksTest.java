package mainmenu.sacraments;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.SacramentsDropdownList;

public class LinksTest extends DropdownListTest {

    private SacramentsDropdownList sacramentsDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        sacramentsDropdownList = new SacramentsDropdownList(getDriver());
        sacramentsDropdownList.tapTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.SACRAMENTS, dataProviderClass = DropdownListDataProviders.class)
    public void links(LinkData linkData) {

        sacramentsDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
