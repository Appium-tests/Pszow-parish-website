package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainDropdownList extends DropdownList {
    public MainDropdownList(AndroidDriver driver) {

        super(driver, By.className("mobile-menu"), By.xpath("//div[@id='mobile-dropdown']"));
    }

    @FindBy(css = ".mobile-menu.opened")
    WebElement closeButton;

    public WebElement getCloseButtonLocator() {

        return closeButton;
    }
}
