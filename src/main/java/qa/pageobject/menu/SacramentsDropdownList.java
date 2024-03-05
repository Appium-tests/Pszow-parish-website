package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SacramentsDropdownList extends DropdownList{

    public SacramentsDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24992']/a"), By.xpath("//li[@id='menu-item-24992']/ul"));
    }

    @FindBy(xpath = "//li[@id='menu-item-24805']")
    WebElement christeningLink;

    @FindBy(xpath = "//li[@id='menu-item-25001']/a")
    WebElement firstCommunionLink;

    @FindBy(xpath = "//li[@id='menu-item-24807']/a")
    WebElement confirmationLink;

    @FindBy(xpath = "//li[@id='menu-item-24804']/a")
    WebElement marriageLink;

    @io.qameta.allure.Step("Touch the \"Chrzest\" link")
    @io.qase.api.annotation.Step("Touch the \"Chrzest\" link")
    public void touchChristeningLink() {

        touchLink(christeningLink);
    }

    @io.qameta.allure.Step("Touch the \"Pierwsza Komunia\" link")
    @io.qase.api.annotation.Step("Touch the \"Pierwsza Komunia\" link")
    public void touchFirstCommunionLink() {

        touchLink(firstCommunionLink);
    }

    @io.qameta.allure.Step("Touch the \"Bierzmowanie\" link")
    @io.qase.api.annotation.Step("Touch the \"Bierzmowanie\" link")
    public void touchConfirmationLink() {

        touchLink(confirmationLink);
    }

    @io.qameta.allure.Step("Touch the \"Małżeństwo\" link")
    @io.qase.api.annotation.Step("Touch the \"Małżeństwo\" link")
    public void touchMarriageLink() {

        touchLink(marriageLink);
    }
}
