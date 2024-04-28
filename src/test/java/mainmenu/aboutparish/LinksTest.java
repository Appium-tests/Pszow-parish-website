package mainmenu.aboutparish;

import base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.pageobject.menu.AboutParishDropdownList;

@Epic("E2E")
@Feature("The \"O Parafii\" menu links")
public class LinksTest extends BaseTest {
    AboutParishDropdownList aboutParishDropdownList;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        aboutParishDropdownList = new AboutParishDropdownList(getDriver());
        aboutParishDropdownList.touchTriggerElement();
    }

    @Test(priority = 3)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(13)
    @QaseTitle("The \"Kontakt\" dropdown list links")
    @Description("The \"Kontakt\" dropdown list links")
    public void contact() {

        aboutParishDropdownList.touchContactLink();
        waitForUrl(URLs.CONTACT_PAGE.getName(), "The page \"" + URLs.CONTACT_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 6)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(14)
    @QaseTitle("The \"Historia Parafii\" dropdown list links")
    @Description("The \"Historia Parafii\" dropdown list links")
    public void historyLink() {

        aboutParishDropdownList.touchHistoryLink();
        waitForUrl(URLs.HISTORY_PAGE.getName(), "The page \"" + URLs.HISTORY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 7)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.MINOR)
    @QaseId(15)
    @QaseTitle("The \"Kalwaria Pszowska\" dropdown list links")
    @Description("The \"Kalwaria Pszowska\" dropdown list links")
    public void calvaryLink() {

        aboutParishDropdownList.touchCalvaryLink();
        waitForUrl(URLs.CALVARY_PAGE.getName(), "The page \"" + URLs.CALVARY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 8)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(16)
    @QaseTitle("The \"Pielgrzymki\" dropdown list links")
    @Description("The \"Pielgrzymki\" dropdown list links")
    public void pilgrimagesLink() {

        aboutParishDropdownList.touchPilgrimagesLink();
        waitForUrl(URLs.PILGRIMAGES_PAGE.getName(), "The page \"" + URLs.PILGRIMAGES_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 2)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(17)
    @QaseTitle("The \"Galeria zdjęć\" dropdown list links")
    @Description("The \"Galeria zdjęć\" dropdown list links")
    public void photoGalleryLink() {

        aboutParishDropdownList.touchPhotoGalleryLink();
        waitForUrl(URLs.PHOTO_GALLERY_PAGE.getName(), "The page \"" + URLs.PHOTO_GALLERY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 4)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(18)
    @QaseTitle("The \"Galeria filmów\" dropdown list links")
    @Description("The \"Galeria filmów\" dropdown list links")
    public void filmGalleryLink() {

        aboutParishDropdownList.touchFilmGalleryLink();
        waitForUrl(URLs.FILM_GALLERY_PAGE.getName(), "The page \"" + URLs.FILM_GALLERY_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 1)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.CRITICAL)
    @QaseId(17)
    @QaseTitle("The \"Transmisja Mszy św.\" dropdown list links")
    @Description("The \"Transmisja Mszy św.\" dropdown list links")
    public void youtubeLink() {

        aboutParishDropdownList.touchYoutubeLink();
        waitForUrl(URLs.YOUTUBE_PAGE.getName(), "The page \"" + URLs.YOUTUBE_PAGE.getName() + "\" has not been opened");
    }

    @Test(priority = 5)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Links")
    @Severity(SeverityLevel.NORMAL)
    @QaseId(17)
    @QaseTitle("The \"Wsparcie Parafii\" dropdown list links")
    @Description("The \"Wsparcie Parafii\" dropdown list links")
    public void supportyLink() {

        aboutParishDropdownList.touchSupportLink();
        waitForUrl(URLs.SUPPORT_PAGE.getName(), "The page \"" + URLs.SUPPORT_PAGE.getName() + "\" has not been opened");
    }
}
