package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PriesthoodDropdownList extends DropdownList {

    public PriesthoodDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24993']/a"), By.xpath("//li[@id='menu-item-24993']/ul"));
    }
}
