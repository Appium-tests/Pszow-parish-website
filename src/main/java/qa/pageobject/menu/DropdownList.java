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

    public WebElement getTriggerElementLocator() {

        return getDriver().findElement(triggerElement);
    }

    public WebElement getContentsLocator() {

        return getDriver().findElement(contents);
    }

    public void tapTriggerElement() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerElement)).click();
    }

    public void tapLink(String value) {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(value))).click();
    }
}
