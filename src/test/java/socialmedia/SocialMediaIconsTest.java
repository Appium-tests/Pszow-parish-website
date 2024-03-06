package socialmedia;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.socialmedia.SocialMedia;

@Epic("E2E")
@Feature("Social media icons")
public class SocialMediaIconsTest extends BaseTest {
    private SocialMedia socialMedia;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        socialMedia = new SocialMedia(getDriver());
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(48)
    @QaseTitle("The Facebook icon")
    @Description("The Facebook icon")
    public void facebookIcon() {

        socialMedia.touchFacebookIcon();
        checkIfUrlContains(URLs.FACEBOOK_PAGE.getName());
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(49)
    @QaseTitle("The Facebook icon")
    @Description("The Facebook icon")
    public void youtubeIcon() {

        socialMedia.touchYoutubeIcon();
        checkIfUrlContains(URLs.YOUTUBE_PAGE.getName());
    }
}
