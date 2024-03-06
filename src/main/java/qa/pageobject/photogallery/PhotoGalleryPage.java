package qa.pageobject.photogallery;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

public class PhotoGalleryPage extends BasePage {

    public PhotoGalleryPage(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(className = "elementor-accordion")
    WebElement elementorAccordion;

    public void touchTriggerElement(String id) {

        WebElement element = getWebDriverWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id(id))));
        getInteractions().scroll(element);
        element.click();
        //getWebDriverWait().until(ExpectedConditions.elementToBeClickable(elementorAccordion.findElement(By.id(id)))).click();
    }
}
