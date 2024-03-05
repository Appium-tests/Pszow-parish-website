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

    @io.qameta.allure.Step("Touch the \"Ogłoszenia duszpasterskie\" link")
    @io.qase.api.annotation.Step("Touch the \"Ogłoszenia duszpasterskie\" link")
    public void touchAnnouncementsLink() {

        touchLink(announcementsLink);
    }

    @io.qameta.allure.Step("Touch the \"Intencje mszalne\" link")
    @io.qase.api.annotation.Step("Touch the \"Intencje mszalne\" link")
    public void touchIntentionsLink() {

        touchLink(intentionsLink);
    }

    @io.qameta.allure.Step("Touch the \"Pogrzeby\" link")
    @io.qase.api.annotation.Step("Touch the \"Pogrzeby\" link")
    public void touchFuneralsLink() {

        touchLink(funeralsLink);
    }

    @io.qameta.allure.Step("Touch the \"Szafarze\" link")
    @io.qase.api.annotation.Step("Touch the \"Szafarze\" link")
    public void touchStewardsLink() {

        touchLink(stewardsLink);
    }

    @io.qameta.allure.Step("Touch the \"Duszpasterze\" link")
    @io.qase.api.annotation.Step("Touch the \"Duszpasterze\" link")
    public void touchPriestsLink() {

        touchLink(priestsLink);
    }

    @io.qameta.allure.Step("Touch the \"Spowiedź\" link")
    @io.qase.api.annotation.Step("Touch the \"Spowiedź\" link")
    public void touchConfessionLink() {

        touchLink(confessionLink);
    }

    @io.qameta.allure.Step("Touch the \"Kancelaria\" link")
    @io.qase.api.annotation.Step("Touch the \"Kancelaria\" link")
    public void touchOfficeLink() {

        touchLink(officeLink);
    }
}
