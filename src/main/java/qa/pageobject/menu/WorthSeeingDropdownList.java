package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class WorthSeeingDropdownList extends DropdownList {

    public WorthSeeingDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24994']/a"), By.xpath("//li[@id='menu-item-24994']/ul"));
    }
}
