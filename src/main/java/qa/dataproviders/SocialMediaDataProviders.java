package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.base.BaseDataProviders;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;

public class SocialMediaDataProviders extends BaseDataProviders {

    @DataProvider(name = DataProviderNames.SOCIAL_MEDIA)
    public Object[] socialMedia() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.SOCIAL_MEDIA);
    }
}
