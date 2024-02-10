package qa.pageobject;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class CookiesMessageBox extends BasePage {

    public CookiesMessageBox(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(id = "cn-accept-cookie")
    WebElement acceptButton;

    public void tapAcceptButton() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(acceptButton)).click();
    }
}
