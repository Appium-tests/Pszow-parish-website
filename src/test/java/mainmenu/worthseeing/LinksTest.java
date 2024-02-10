package mainmenu.worthseeing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.DropdownListTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DropdownListDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.menu.WorthSeeingDropdownList;

public class LinksTest extends DropdownListTest {

    private WorthSeeingDropdownList worthSeeingDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        worthSeeingDropdownList = new WorthSeeingDropdownList(getDriver());
        worthSeeingDropdownList.tapTriggerElement();
    }

    @Test(dataProvider = DataProviderNames.WORTH_SEEING, dataProviderClass = DropdownListDataProviders.class)
    public void links(LinkData linkData) {

        worthSeeingDropdownList.tapLink(linkData.getValue());
        waitForUrl(linkData.getUrl(), "Incorrect url");
    }
}
