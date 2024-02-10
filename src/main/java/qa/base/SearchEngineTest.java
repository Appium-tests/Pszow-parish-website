package qa.base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import qa.enums.URLs;

public class SearchEngineTest extends BaseTest {

    private final String urlFraction = "https://bazylika-pszow.pl/?s";

    @BeforeMethod
    public void init() {

        goToUrl(URLs.HOME_PAGE.getName());
        expandMainDropdownList();
    }

    protected void waitForSearchResultsPage() {

        getWebDriverWait().until(ExpectedConditions.urlContains(urlFraction));
    }
}
