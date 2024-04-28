package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import qa.driver.Driver;
import qa.interactions.Interactions;
import qa.pageobject.menu.MainDropdownList;
import qa.servermanager.ServerManager;
import qa.support.byfinder.AdbUninstallUIautomator;
import qa.testdataloader.TestDataLoader;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {

    private AndroidDriver driver;
    private WebDriverWait webDriverWait;
    private Interactions interactions;

    @BeforeSuite
    public void startServer() {

        AdbUninstallUIautomator.uninstall();
        ServerManager.setup();
        ServerManager.start();
    }

    @AfterSuite
    public void stopServer() {

        ServerManager.stop();
    }

    @Parameters({"filename"})
    @BeforeClass
    public void fetchTestData(@Optional("noFilename") String filename) {

        if (!filename.equals("noFilename")){
            TestDataLoader.fetch(filename);
        }
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {

        driver = Driver.create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        interactions = new Interactions(driver);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    protected void goToUrl(String url) {

        driver.get(url);
    }

    protected void expandMainDropdownList() {

        MainDropdownList mainDropdownList = new MainDropdownList(getDriver());
        mainDropdownList.touchTriggerElement();
    }

    protected void waitForUrl(String url, String assertionMessage) {

        try {
            webDriverWait.until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            Assert.fail(assertionMessage);
        }
    }

    protected void checkIfUrlContains(String url) {

        try {
            getWebDriverWait().until(ExpectedConditions.urlContains(url));
        } catch (Exception e) {
            Assert.fail("The url \"" + getDriver().getCurrentUrl() + "\" does not contain \"" + url + "\"");
        }
    }

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

    protected AndroidDriver getDriver() {

        return driver;
    }

    protected WebDriverWait getWebDriverWait() {

        return webDriverWait;
    }

    protected Interactions getInteractions() {

        return interactions;
    }
}
