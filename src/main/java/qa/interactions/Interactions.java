package qa.interactions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;

public class Interactions {

    private final JavascriptExecutor executor;

    public Interactions(AndroidDriver driver) {

        executor = driver;
    }

    public void scroll(WebElement element) {

        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
}
