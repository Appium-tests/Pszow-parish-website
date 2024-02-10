package qa.pageobject.searchresultspage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.base.BasePage;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(AndroidDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']")
    WebElement primary;

    public int getNumberOfArticles() {

        return primary.findElements(By.xpath("//article[starts-with(@id, 'post-')]")).size();
    }
}
