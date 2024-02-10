package mainmenu.priesthood;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.PriesthoodDropdownList;

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

        priesthoodDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
