package qa.steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import lombok.Getter;
import qa.pageobject.photogallery.PhotoGalleryPage;

@Getter
public class PhotoGalleryPageSteps {

    private final PhotoGalleryPage photoGalleryPage;

    public PhotoGalleryPageSteps(AndroidDriver driver) {

        this.photoGalleryPage = new PhotoGalleryPage(driver);
    }

    @io.qase.api.annotation.Step("Touch a icon \"closed\"")
    public void touchIconClosed(int index) {

        Allure.step("Touch the icon closed of the \"" + photoGalleryPage.getItem(index).getTitle() + "\" gallery");
        photoGalleryPage.getItem(index).touchIconClosed();
    }

    @io.qase.api.annotation.Step("Touch a icon \"opened\"")
    public void touchIconOpened(int index) {

        Allure.step("Touch the icon opened of the \"" + photoGalleryPage.getItem(index).getTitle() + "\" gallery");
        photoGalleryPage.getItem(index).touchIconOpened();
    }

}
