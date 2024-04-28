package photogallery;

import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.DataProviders;
import qa.enums.URLs;
import qa.models.Item;
import qa.pageobject.photogallery.PhotoGalleryPage;

@Epic("E2E")
@Feature("Expanding and collapsing the photo gallery items")
public class PhotoGalleryPageTest extends BaseTest {

    private PhotoGalleryPage photoGalleryPage;

    @BeforeMethod
    public void init() throws IllegalAccessException {

        goToUrl(URLs.PHOTO_GALLERY_PAGE.getName());
        photoGalleryPage = new PhotoGalleryPage(getDriver());
    }


    @Test(dataProvider = DataProviderNames.ITEMS, dataProviderClass = DataProviders.class)
    @Owner("Paweł Aksman")
    @Tag("Views")
    @Tag("Photo gallery")
    @QaseId(54)
    @QaseTitle("Expanding and collapsing the content of the photo gallery")
    @Description("Expanding and collapsing the content of the photo gallery")
    public void contentVisibility(Item item) {

        Allure.parameter("Tab content", item.getTabContent());
        Allure.parameter("Tab title", item.getTabTitle());

        photoGalleryPage.touchTriggerElement(item.getTabTitle());
        checkContentsVisibility(getDriver().findElement(By.id(item.getTabContent())), "The \"" + item.getTabContent() + "\" is not visible");
        photoGalleryPage.touchTriggerElement(item.getTabTitle());
        checkContentsInvisibility(getDriver().findElement(By.id(item.getTabContent())), "The \"" + item.getTabContent() + "\" is not hidden");
    }
}
