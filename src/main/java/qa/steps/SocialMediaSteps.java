package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import qa.pageobject.socialmedia.SocialMedia;

public class SocialMediaSteps {

    private final SocialMedia socialMedia;

    public SocialMediaSteps(AndroidDriver driver) {

        this.socialMedia = new SocialMedia(driver);
    }

    public void tapIcon(String value) {

        Allure.step("Tap the \"" + value + "\" icon");
        socialMedia.tapIcon(value);
    }
}
