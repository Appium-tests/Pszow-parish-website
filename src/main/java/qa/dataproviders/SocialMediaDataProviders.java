package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.modelsbuilder.ModelsBuilder;

public class SocialMediaDataProviders {

    @DataProvider(name = DataProviderNames.SOCIAL_MEDIA)
    public Object[] socialMedia() {

        return ModelsBuilder.getLinksData(DataProviderNames.SOCIAL_MEDIA);
    }
}
