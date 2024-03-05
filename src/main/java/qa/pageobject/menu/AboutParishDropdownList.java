package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutParishDropdownList extends DropdownList {

    public AboutParishDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24991']/a"), By.xpath("//li[@id='menu-item-24991']/ul"));
    }

    @FindBy(xpath = "//li[@id='menu-item-24703']/a")
    WebElement contactLink;

    @FindBy(xpath = "//li[@id='menu-item-1318']/a")
    WebElement historyLink;

    @FindBy(xpath = "//li[@id='menu-item-1297']/a")
    WebElement calvaryLink;

    @FindBy(xpath = "//li[@id='menu-item-24996']/a")
    WebElement pilgrimagesLink;

    @FindBy(xpath = "//li[@id='menu-item-24999']/a")
    WebElement photoGalleryLink;

    @FindBy(xpath = "//li[@id='menu-item-25000']/a")
    WebElement filmGalleryLink;

    @FindBy(xpath = "//li[@id='menu-item-24997']/a")
    WebElement youtubeLink;

    @FindBy(xpath = "//li[@id='menu-item-24998']/a")
    WebElement supportLink;

    @io.qameta.allure.Step("Touch the \"Kontakt\" link")
    @io.qase.api.annotation.Step("Touch the \"Kontakt\" link")
    public void touchContactLink() {

        touchLink(contactLink);
    }

    @io.qameta.allure.Step("Touch the \"Historia parafii\" link")
    @io.qase.api.annotation.Step("Touch the \"Historia parafii\" link")
    public void touchHistoryLink() {

        touchLink(historyLink);
    }

    @io.qameta.allure.Step("Touch the \"Kalwaria Pszowska\" link")
    @io.qase.api.annotation.Step("Touch the \"Kalwaria Pszowska\" link")
    public void touchCalvaryLink() {

        touchLink(calvaryLink);
    }

    @io.qameta.allure.Step("Touch the \"Pielgrzymki\" link")
    @io.qase.api.annotation.Step("Touch the \"Pielgrzymki\" link")
    public void touchPilgrimagesLink() {

        touchLink(pilgrimagesLink);
    }

    @io.qameta.allure.Step("Touch the \"Galeria filmów\" link")
    @io.qase.api.annotation.Step("Touch the \"Galeria filmów\" link")
    public void touchPhotoGalleryLink() {

        touchLink(photoGalleryLink);
    }

    @io.qameta.allure.Step("Touch the \"Galeria filmów\" link")
    @io.qase.api.annotation.Step("Touch the \"Galeria filmów\" link")
    public void touchFilmGalleryLink() {

        touchLink(filmGalleryLink);
    }

    @io.qameta.allure.Step("Touch the \"Transmisja Mszy św.\" link")
    @io.qase.api.annotation.Step("Touch the \"Transmisja Mszy św.\" link")
    public void touchYoutubeLink() {

        touchLink(youtubeLink);
    }

    @io.qameta.allure.Step("Touch the \"Wsparcie Parafii\" link")
    @io.qase.api.annotation.Step("Touch the \"Wsparcie Parafii\" link")
    public void touchSupportLink() {

        touchLink(supportLink);
    }
}
