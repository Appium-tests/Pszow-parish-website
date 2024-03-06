package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.modelsbuilder.ModelsBuilder;

public class DataProviders {

    @DataProvider(name = DataProviderNames.CORRECT)
    public Object[] correct() {

        return ModelsBuilder.getStrings(DataProviderNames.CORRECT);
    }

    @DataProvider(name = DataProviderNames.INCORRECT)
    public Object[] incorrect() {

        return ModelsBuilder.getStrings(DataProviderNames.INCORRECT);
    }

    @DataProvider(name = DataProviderNames.NAUGHTY_STRINGS)
    public Object[] naughtyStrings() {

        return ModelsBuilder.getStrings(DataProviderNames.NAUGHTY_STRINGS);
    }

    @DataProvider(name = DataProviderNames.ITEMS)
    public Object[] items() {

        return ModelsBuilder.getItems();
    }
}
