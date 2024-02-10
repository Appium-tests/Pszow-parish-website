package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.base.BaseDataProviders;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;

public class PhrasesDataProviders extends BaseDataProviders {

    @DataProvider(name = DataProviderNames.CORRECT)
    public Object[] correct() {

        return TestDataProvider.getStrings(getSource(), DataProviderNames.CORRECT);
    }

    @DataProvider(name = DataProviderNames.INCORRECT)
    public Object[] incorrect() {

        return TestDataProvider.getStrings(getSource(), DataProviderNames.INCORRECT);
    }

    @DataProvider(name = DataProviderNames.NAUGHTY_STRINGS)
    public Object[] naughtyStrings() {

        return TestDataProvider.getStrings(getSource(), DataProviderNames.NAUGHTY_STRINGS);
    }
}
