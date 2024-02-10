package qa.support.byfinder;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ByFinder {

    private static final String BY = "by";
    private static final String LOCATOR = "locator";
    private static final String FOUND_BY = "foundBy";

    public static By get(WebElement element) throws IllegalAccessException {

        if (element instanceof Proxy) {

            InvocationHandler invocationHandler = Proxy.getInvocationHandler(element);
            Object field = FieldUtils.readField(invocationHandler, LOCATOR, true);
            Object locator = FieldUtils.readField(field, BY, true);

            return FromString.get(locator.toString());

        } else if (element instanceof RemoteWebElement) {

            Object field = FieldUtils.readField(element, FOUND_BY, true);
            String[] split = field.toString().split("-> ");

            return FromString.get(split[1]);

        } else {

            return (By) FieldUtils.readField(element, BY, true);
        }
    }
}
