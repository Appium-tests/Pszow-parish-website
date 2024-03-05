package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorthSeeingDropdownList extends DropdownList {

    public WorthSeeingDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24994']/a"), By.xpath("//li[@id='menu-item-24994']/ul"));
    }

    @FindBy(xpath = "//li[@id='menu-item-13895']/a")
    WebElement litanyLink;

    @FindBy(xpath = "//li[@id='menu-item-1864']/a")
    WebElement cementeryRegulationLink;

    @FindBy(xpath = "//li[@id='menu-item-16783']/a")
    WebElement delegatelink;

    @FindBy(xpath = "//li[@id='menu-item-25002']/a")
    WebElement archdioceseLink;

    @FindBy(xpath = "//li[@id='menu-item-25003']/a")
    WebElement readingLink;

    @io.qameta.allure.Step("Touch the \"Litania do Pani Uśmiechniętej\" link")
    @io.qase.api.annotation.Step("Touch the \"Litania do Pani Usmiechniętej\" link")
    public void touchLitanyLink() {

        touchLink(litanyLink);
    }

    @io.qameta.allure.Step("Touch the \"Regulamin cmentarza\" link")
    @io.qase.api.annotation.Step("Touch the \"Regulamin cmentarza\" link")
    public void touchCementeryRegulationLink() {

        touchLink(cementeryRegulationLink);
    }

    @io.qameta.allure.Step("Touch the \"Delegat ds. ochrony dzieci i młodzieży\" link")
    @io.qase.api.annotation.Step("Touch the \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void touchDelegateLink() {

        touchLink(delegatelink);
    }

    @io.qameta.allure.Step("Touch the \"Archidiecezja Katowicka\" link")
    @io.qase.api.annotation.Step("Touch the \"Archidiecezja Katowicka\" link")
    public void touchArchdioceseLink() {

        touchLink(archdioceseLink);
    }

    @io.qameta.allure.Step("Touch the \"Czytania liturgiczne\" link")
    @io.qase.api.annotation.Step("Touch the \"Czytania liturgiczne\" link")
    public void touchReadingLink() {

        touchLink(readingLink);
    }
}
