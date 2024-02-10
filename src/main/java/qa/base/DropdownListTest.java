package qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import qa.dataproviders.DropdownListDataProviders;

import java.io.FileNotFoundException;

public class DropdownListTest extends BaseTest {

    protected void checkContentsVisibility(WebElement element, String assertionMessage) {

        try {
            getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            Assert.fail(assertionMessage);
        }
    }

    protected void checkContentsInvisibility(WebElement element, String assertionMessage) {

        try {
            getWebDriverWait().until(ExpectedConditions.invisibilityOf(element));
        } catch (Exception e) {
            Assert.fail(assertionMessage);
        }
    }
}
