package qa.pageobject.photogallery;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

import java.util.List;

public class Item extends BasePage {

    private final WebElement parent;
    private final String iconClosedSelector = "span.elementor-accordion-icon-closed";
    private final String iconOpenedSelector = "span.elementor-accordion-icon-opened";

    public Item(AndroidDriver driver, WebElement parent) {

        super(driver);
        this.parent = parent;
    }

    public void tapIconClosed() {

        parent.findElement(By.cssSelector(iconClosedSelector)).click();
    }

    public void tapIconOpened() {

        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(parent.findElement(By.cssSelector(iconOpenedSelector)))).click();
    }

    public String getTitle() {

        return parent.findElement(By.cssSelector("a.elementor-accordion-title")).getText();
    }

    public WebElement getIconClosedLocator() {

        return parent.findElement(By.cssSelector(iconClosedSelector));
    }

    public List<WebElement> getGalleryContentLocator() {

        return parent.findElements(By.cssSelector("div.elementor-tab-content.elementor-clearfix.elementor-active"));
    }
}
