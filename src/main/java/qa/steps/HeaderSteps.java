package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import qa.pageobject.header.Header;

public class HeaderSteps {

    private final Header header;

    public HeaderSteps(AndroidDriver driver) {

        this.header = new Header(driver);
    }

    @io.qameta.allure.Step("Touch the logo")
    @io.qase.api.annotation.Step("Touch the logo")
    public void touchLogo() {

        header.touchLogo();
    }
}
