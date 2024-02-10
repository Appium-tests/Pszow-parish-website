package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AboutParishDropdownList extends DropdownList {

    public AboutParishDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24991']/a"), By.xpath("//li[@id='menu-item-24991']/ul"));
    }
}
