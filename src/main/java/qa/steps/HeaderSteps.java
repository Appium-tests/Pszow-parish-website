package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import qa.pageobject.header.Header;

public class HeaderSteps {

    private final Header header;

    public HeaderSteps(AndroidDriver driver) {

        this.header = new Header(driver);
    }

    @Step("Tap the logo")
    public void tapLogo() {

        header.tapLogo();
    }
}
