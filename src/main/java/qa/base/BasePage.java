package qa.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.interactions.Interactions;

import java.time.Duration;
import java.util.Collections;

public class BasePage {

    @Getter
    private final AndroidDriver driver;
    @Getter
    private final WebDriverWait webDriverWait;
    @Getter
    private final Interactions interactions;

    public BasePage(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.driver = driver;
        interactions = new Interactions(driver);
    }


}
