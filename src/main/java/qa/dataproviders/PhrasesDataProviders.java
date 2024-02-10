package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;

public class PhrasesDataProviders {

    @DataProvider(name = DataProviderNames.CORRECT)
    public Object[] correct() {

        return TestDataProvider.getStrings(DataProviderNames.CORRECT);
    }

    @DataProvider(name = DataProviderNames.INCORRECT)
    public Object[] incorrect() {

        return TestDataProvider.getStrings(DataProviderNames.INCORRECT);
    }

    @DataProvider(name = DataProviderNames.NAUGHTY_STRINGS)
    public Object[] naughtyStrings() {

        return TestDataProvider.getStrings(DataProviderNames.NAUGHTY_STRINGS);
    }
}
