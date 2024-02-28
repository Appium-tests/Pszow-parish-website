package socialmedia;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseTest;
import qa.dataprovidernames.DataProviderNames;
import qa.dataproviders.SocialMediaDataProviders;
import qa.enums.URLs;
import qa.models.LinkData;
import qa.steps.SocialMediaSteps;

@Epic("E@E")
@Feature("Social media icons")
public class SocialMediaIconsTest extends BaseTest {
    private SocialMediaSteps steps;

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
        steps = new SocialMediaSteps(getDriver());
    }

    private void checkIfUrlContains(String url) {

        try {
            getWebDriverWait().until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            Assert.fail("The url \"" + getDriver().getCurrentUrl() + "\" does not contain \"" + url + "\"");
        }
    }

    @Test(dataProvider = DataProviderNames.SOCIAL_MEDIA, dataProviderClass = SocialMediaDataProviders.class)
    public void links(LinkData data) {

        Allure.description("Tapping the \"" + data.getValue() + "\" icon");
        steps.touchIcon(data.getValue());
        checkIfUrlContains(data.getUrl());
    }
}
