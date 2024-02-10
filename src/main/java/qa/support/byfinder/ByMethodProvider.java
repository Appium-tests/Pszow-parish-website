package qa.support.byfinder;

import org.openqa.selenium.By;
import qa.enums.Locator;

public class ByMethodProvider {

    public static By get(Locator locator, String value) {

        return switch (locator) {

            case ID -> By.id(value);
            case CLASS_NAME -> By.className(value);
            case XPATH -> By.xpath(value);
        };
    }
}
