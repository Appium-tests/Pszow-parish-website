package socialmedia;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.SocialMediaDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.pageobject.socialmedia.SocialMedia;

public class SocialMediaIconsTest extends BaseTest {

    private SocialMedia socialMedia;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        socialMedia = new SocialMedia(getDriver());
    }

    private void checkIfUrlContains(String url) {

        try {
            getWebDriverWait().until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            Assert.fail("The url \"" + getDriver().getCurrentUrl() + "\" does not contain \"" + url + "\"");
        }
    }

    @Test(dataProvider = DataProviderNames.SOCIAL_MEDIA, dataProviderClass = SocialMediaDataProviders.class)
    public void links(LinkData data) {

        socialMedia.clickIcon(data.getValue());
        checkIfUrlContains(data.getUrl());
    }
}
