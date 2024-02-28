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

    public void tapIconClosed(int index) {

        Allure.step("Tap the icon closed of the \"" + photoGalleryPage.getItem(index).getTitle() + "\" gallery");
        photoGalleryPage.getItem(index).tapIconClosed();
    }

    public void tapIconOpened(int index) {

        Allure.step("Tap the icon opened of the \"" + photoGalleryPage.getItem(index).getTitle() + "\" gallery");
        photoGalleryPage.getItem(index).tapIconOpened();
    }

}
