package qa.pageobject.socialmedia;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class SocialMedia extends BasePage {

    public SocialMedia(AndroidDriver driver) {

        super(driver);
    }

    public void touchIcon(String selector) {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(selector))).click();
    }
}
