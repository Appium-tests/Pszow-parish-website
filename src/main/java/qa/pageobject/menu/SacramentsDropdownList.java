package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SacramentsDropdownList extends DropdownList{

    public SacramentsDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24992']/a"), By.xpath("//li[@id='menu-item-24992']/ul"));
    }
}
