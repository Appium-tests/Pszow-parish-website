package photogallery;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.CookiesMessageBox;
import qa.pageobject.photogallery.PhotoGalleryPage;

public class PhotoGalleryPageTest extends BaseTest {

    private PhotoGalleryPage photoGalleryPage;

    @BeforeMethod
    public void init() throws IllegalAccessException {

        goToUrl(URLs.PHOTO_GALLERY_PAGE.getName());

        CookiesMessageBox cookiesMessageBox = new CookiesMessageBox(getDriver());
        cookiesMessageBox.tapAcceptButton();

        photoGalleryPage = new PhotoGalleryPage(getDriver());
        photoGalleryPage.findItems();
    }


    @Test
    public void expandingGallery() {

        SoftAssert softAssert = new SoftAssert();

        for (int i = 1; i < photoGalleryPage.getItemsCount(); i++) {

            getInteractions().scroll(photoGalleryPage.getItem(i).getIconClosedLocator());
            photoGalleryPage.getItem(i).tapIconClosed();

            softAssert.assertFalse(photoGalleryPage.getItem(i).getGalleryContentLocator().isEmpty(),
                    "The photo gallery \"" + photoGalleryPage.getItem(i).getTitle() + "\" is not expanded");
        }

        softAssert.assertAll();
    }

    @Test
    public void collapsingGallery() {

        SoftAssert softAssert = new SoftAssert();

        for (int i = 1; i < photoGalleryPage.getItemsCount(); i++) {

           getInteractions().scroll(photoGalleryPage.getItem(i).getIconClosedLocator());
           photoGalleryPage.getItem(i).tapIconClosed();
           photoGalleryPage.getItem(i).tapIconOpened();

           softAssert.assertTrue(photoGalleryPage.getItem(i).getGalleryContentLocator().isEmpty(),
                    "The photo gallery \"" + photoGalleryPage.getItem(i).getTitle() + "\" is not collapsed");
        }

        softAssert.assertAll();
   }
}
