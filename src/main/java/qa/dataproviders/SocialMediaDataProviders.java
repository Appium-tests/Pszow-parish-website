package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;

public class SocialMediaDataProviders {

    @DataProvider(name = DataProviderNames.SOCIAL_MEDIA)
    public Object[] socialMedia() {

        return TestDataProvider.getLinksData(DataProviderNames.SOCIAL_MEDIA);
    }
}
