package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import qa.pageobject.socialmedia.SocialMedia;

public class SocialMediaSteps {

    private final SocialMedia socialMedia;

    public SocialMediaSteps(AndroidDriver driver) {

        this.socialMedia = new SocialMedia(driver);
    }

    @io.qase.api.annotation.Step("Touch a icon")
    public void touchIcon(String value) {

        Allure.step("Touch the \"" + value + "\" icon");
        socialMedia.touchIcon(value);
    }
}
