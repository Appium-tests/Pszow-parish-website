package qa.pageobject.socialmedia;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class SocialMedia extends BasePage {

    public SocialMedia(AndroidDriver driver) {

        super(driver);
    }

    public void touchIcon(WebElement element) {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    @FindBy(xpath = "//div[@id='mobile-dropdown']/nav/div[2]/div/ul/li[1]/a")
    WebElement facebookLink;

    @FindBy(xpath = "//div[@id='mobile-dropdown']/nav/div[2]/div/ul/li[2]/a")
    WebElement youtubeLink;

    @io.qameta.allure.Step("Touch the Facebook link")
    @io.qase.api.annotation.Step("Touch the Facebook link")
    public void touchFacebookIcon() {

        touchIcon(facebookLink);
    }

    @io.qameta.allure.Step("Touch the Facebook link")
    @io.qase.api.annotation.Step("Touch the Facebook link")
    public void touchYoutubeIcon() {

        touchIcon(youtubeLink);
    }
}
