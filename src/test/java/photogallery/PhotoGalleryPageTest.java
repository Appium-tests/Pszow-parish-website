package photogallery;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.CookiesMessageBox;
import qa.steps.PhotoGalleryPageSteps;

@Epic("E2E")
@Feature("Expanding and collapsing the photo gallery items")
public class PhotoGalleryPageTest extends BaseTest {
    private PhotoGalleryPageSteps steps;

    @BeforeMethod
    public void init() throws IllegalAccessException {

        goToUrl(URLs.PHOTO_GALLERY_PAGE.getName());

        CookiesMessageBox cookiesMessageBox = new CookiesMessageBox(getDriver());
        cookiesMessageBox.tapAcceptButton();
        steps = new PhotoGalleryPageSteps(getDriver());
        steps.getPhotoGalleryPage().findItems();
    }


    @Test
    @QaseId(18)
    @QaseTitle("Expanding photo gallery contents")
    public void expandingGallery() {

        SoftAssert softAssert = new SoftAssert();

        for (int i = 1; i < steps.getPhotoGalleryPage().getItemsCount(); i++) {

            Allure.description("Expanding the \"" + steps.getPhotoGalleryPage().getItem(i).getTitle() + "\" photo gallery");
            getInteractions().scroll(steps.getPhotoGalleryPage().getItem(i).getIconClosedLocator());
            steps.touchIconClosed(i);

            softAssert.assertFalse(steps.getPhotoGalleryPage().getItem(i).getGalleryContentLocator().isEmpty(),
                    "The photo gallery \"" + steps.getPhotoGalleryPage().getItem(i).getTitle() + "\" is not expanded");
        }

        softAssert.assertAll();
    }

    @Test
    @QaseId(19)
    @QaseTitle("Collapsing photo gallery contents")
    public void collapsingGallery() {

        SoftAssert softAssert = new SoftAssert();

        for (int i = 1; i < steps.getPhotoGalleryPage().getItemsCount(); i++) {

           Allure.description("Collapsing the \"" + steps.getPhotoGalleryPage().getItem(i).getTitle() + "\" photo gallery");
           getInteractions().scroll(steps.getPhotoGalleryPage().getItem(i).getIconClosedLocator());
           steps.touchIconClosed(i);
           steps.touchIconOpened(i);

           softAssert.assertTrue(steps.getPhotoGalleryPage().getItem(i).getGalleryContentLocator().isEmpty(),
                    "The photo gallery \"" + steps.getPhotoGalleryPage().getItem(i).getTitle() + "\" is not collapsed");
        }

        softAssert.assertAll();
   }
}
