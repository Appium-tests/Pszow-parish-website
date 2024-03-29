package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public abstract class DropdownList extends BasePage {

    private final By triggerElement;
    private final By contents;
    public DropdownList(AndroidDriver driver, By triggerElement, By contents) {

        super(driver);
        this.triggerElement = triggerElement;
        this.contents = contents;
    }

    public WebElement getContentsLocator() {

        return getDriver().findElement(contents);
    }

    @io.qameta.allure.Step("Touch the trigger element")
    @io.qase.api.annotation.Step("Touch the trigger element")
    public void touchTriggerElement() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerElement)).click();
    }

    public void touchLink(WebElement element) {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void touchLink(String value) {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(value))).click();
    }
}
