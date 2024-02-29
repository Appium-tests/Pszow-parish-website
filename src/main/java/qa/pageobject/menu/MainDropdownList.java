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

    @FindBy(xpath = "//li[@id='menu-item-24730']/a")
    WebElement announcementsLink;

    @FindBy(xpath = "//li[@id='menu-item-24731']/a")
    WebElement intentionsLink;

    @FindBy(xpath = "//li[@id='menu-item-24732']/a")
    WebElement funeralsLink;

    @FindBy(xpath = "//li[@id=\"menu-item-24733\"]/a")
    WebElement stewardsLink;

    @FindBy(xpath = "//li[@id='menu-item-24734']/a")
    WebElement priestsLink;

    @FindBy(xpath = "//li[@id='menu-item-24736']/a")
    WebElement confessionLink;

    @FindBy(xpath = "//li[@id='menu-item-24702']/a")
    WebElement officeLink;

    public void touchAnnouncementsLink() {

        touchLink(announcementsLink);
    }

    public void touchIntentionsLink() {

        touchLink(intentionsLink);
    }

    public void touchFuneralsLink() {

        touchLink(funeralsLink);
    }

    public void touchStewardsLink() {

        touchLink(stewardsLink);
    }

    public void touchPriestsLink() {

        touchLink(priestsLink);
    }

    public void touchConfessionLink() {

        touchLink(confessionLink);
    }

    public void touchOfficeLink() {

        touchLink(officeLink);
    }
}
