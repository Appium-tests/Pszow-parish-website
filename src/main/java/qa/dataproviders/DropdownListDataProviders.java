package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;


public class DropdownListDataProviders {

    @DataProvider(name = DataProviderNames.MAIN_DROPDOWN_LIST)
    public Object[] mainDropdownList() {

        return TestDataProvider.getLinksData(DataProviderNames.MAIN_DROPDOWN_LIST);
    }

    @DataProvider(name = DataProviderNames.ABOUT_PARISH)
    public Object[] aboutParish() {

        return TestDataProvider.getLinksData(DataProviderNames.ABOUT_PARISH);
    }

    @DataProvider(name = DataProviderNames.SACRAMENTS)
    public Object[] sacraments() {

        return TestDataProvider.getLinksData(DataProviderNames.SACRAMENTS);
    }

    @DataProvider(name = DataProviderNames.PRIESTHOOD)
    public Object[] priesthood() {

        return TestDataProvider.getLinksData(DataProviderNames.PRIESTHOOD);
    }

    @DataProvider(name = DataProviderNames.WORTH_SEEING)
    public Object[] worthSeeing() {

        return TestDataProvider.getLinksData(DataProviderNames.WORTH_SEEING);
    }
}
