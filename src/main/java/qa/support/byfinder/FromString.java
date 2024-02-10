package qa.support.byfinder;

import org.openqa.selenium.By;

public class FromString {

    public static By get(String locator) {

        String[] split = locator.split(": ");

        String using = split[0];
        String value = split[1];

        if (using.equals("xpath")) {

            String replacement = "";

            value = value.substring(0, value.length() - 3) + replacement;
        }

        switch (using) {
            case "By.cssSelector", "css selector" -> {
                return By.cssSelector(value);
            }
            case "By.id", "id" -> {
                return By.id(value);
            }
            case "By.linkText", "link text" -> {
                return By.linkText(value);
            }
            case "By.partialLinkText", "partial link text" -> {
                return By.partialLinkText(value);
            }
            case "By.tagName", "tag name" -> {
                return By.tagName(value);
            }
            case "By.name", "name" -> {
                return By.name(value);
            }
            case "By.className", "class name" -> {
                return By.className(value);
            }
            case "By.xpath", "xpath" -> {
                return By.xpath(value);
            }
            default -> {
                throw new IllegalStateException("Cannot define locator for WebElement definition " + locator);
            }
        }
    }
}
