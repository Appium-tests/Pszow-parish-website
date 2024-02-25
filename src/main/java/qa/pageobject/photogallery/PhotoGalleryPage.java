package qa.pageobject.photogallery;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class PhotoGalleryPage extends BasePage {

    private List<WebElement> items = new ArrayList<>();

    public PhotoGalleryPage(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(className = "elementor-accordion")
    WebElement elementorAccordion;

    public void findItems() {

        getWebDriverWait().until(ExpectedConditions.visibilityOf(elementorAccordion));
        items = elementorAccordion.findElements(By.cssSelector("div.elementor-accordion-item"));
    }

    public int getItemsCount() {

        return items.size();
    }

    public Item getItem(int index) {

        return new Item(getDriver(), items.get(index));
    }
}
