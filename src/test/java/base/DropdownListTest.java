package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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
