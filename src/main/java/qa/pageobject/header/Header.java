package qa.pageobject.header;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class Header extends BasePage {


    public Header(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(className = "custom-logo")
    WebElement logo;

    @io.qameta.allure.Step("Touch the logo")
    @io.qase.api.annotation.Step("Touch the logo")
    public void touchLogo() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logo)).click();
    }

}
