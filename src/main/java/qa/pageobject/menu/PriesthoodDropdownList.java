package qa.pageobject.menu;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriesthoodDropdownList extends DropdownList {

    public PriesthoodDropdownList(AndroidDriver driver) {

        super(driver, By.xpath("//li[@id='menu-item-24993']/a"), By.xpath("//li[@id='menu-item-24993']/ul"));
    }

    @FindBy(xpath = "//li[@id='menu-item-17470']/a")
    WebElement caritasLink;

    @FindBy(xpath = "//li[@id='menu-item-25004']/a")
    WebElement councilLink;

    @FindBy(xpath = "//li[@id='menu-item-25005']/a")
    WebElement altarBoysLink;

    @FindBy(xpath = "//li[@id='menu-item-25006']/a")
    WebElement marysChildrenLink;

    @FindBy(xpath = "//li[@id='menu-item-25007']/a")
    WebElement oasisLink;

    @FindBy(xpath = "//li[@id='menu-item-25008']/a")
    WebElement homeChurchLink;

    @FindBy(xpath = "//li[@id='menu-item-25009']/a")
    WebElement catechesisLink;

    @FindBy(xpath = "//li[@id='menu-item-25010']/a")
    WebElement pocoLink;

    @FindBy(xpath = "//li[@id='menu-item-25011']/a")
    WebElement legionOfMaryLink;

    @FindBy(xpath = "//li[@id='menu-item-25012']/a")
    WebElement livingRosaryLink;

    @FindBy(xpath = "//li[@id='menu-item-8090']/a")
    WebElement mothersCommunity;

    @io.qameta.allure.Step("Touch the \"Caritas i działalność charytatywna\" link")
    @io.qase.api.annotation.Step("Touch the \"Caritas i działalność charytatywna\" link")
    public void touchCaritasLink() {

        touchLink(caritasLink);
    }

    @io.qameta.allure.Step("Touch the \"Parafialna Rada Duszpasterska\" link")
    @io.qase.api.annotation.Step("Touch the \"Parafialna Rada Duszpasterska\" link")
    public void touchCouncilLink() {

        touchLink(councilLink);
    }

    @io.qameta.allure.Step("Touch the \"Ministranci i LSO\" link")
    @io.qase.api.annotation.Step("Touch the \"Ministranci i LSO\" link")
    public void touchAltarBoysLink() {

        touchLink(altarBoysLink);
    }

    @io.qameta.allure.Step("Touch the \"Dzieci Maryi\" link")
    @io.qase.api.annotation.Step("Touch the \"Dzieci Maryi\" link")
    public void touchMarysChildrenLink() {

        touchLink(marysChildrenLink);
    }

    @io.qameta.allure.Step("Touch the \"Oaza młodzieżowa\" link")
    @io.qase.api.annotation.Step("Touch the \"Oaza młodzieżowa\" link")
    public void touchOasisLink() {

        touchLink(oasisLink);
    }

    @io.qameta.allure.Step("Touch the \"Domowy Kościół\" link")
    @io.qase.api.annotation.Step("Touch the \"Domowy Kościół\" link")
    public void touchHomeChurchLink() {

        touchLink(homeChurchLink);
    }

    @io.qameta.allure.Step("Touch the \"Katecheza dorosłych\" link")
    @io.qase.api.annotation.Step("Touch the \"Katecheza dorosłych\" link")
    public void touchCatechesisLink() {

        touchLink(catechesisLink);
    }

    @io.qameta.allure.Step("Touch the \"PoCo\" link")
    @io.qase.api.annotation.Step("Touch the \"PoCo\" link")
    public void touchPocoLink() {

        touchLink(pocoLink);
    }

    @io.qameta.allure.Step("Touch the \"Legion Maryi\" link")
    @io.qase.api.annotation.Step("Touch the \"Legion Maryi\" link")
    public void touchLegionOfMaryLink() {

        touchLink(legionOfMaryLink);
    }

    @io.qameta.allure.Step("Touch the \"Żywy Różaniec\" link")
    @io.qase.api.annotation.Step("Touch the \"Żywy Różaniec\" link")
    public void touchLivingRosaryLink() {

        touchLink(livingRosaryLink);
    }

    @io.qameta.allure.Step("Touch the \"Wspólnota Matki Miłosiernego\" link")
    @io.qase.api.annotation.Step("Touch the \"Wspólnota Matki Miłosiernego\" link")
    public void touchMothersCommunityLink() {

        touchLink(mothersCommunity);
    }
}
