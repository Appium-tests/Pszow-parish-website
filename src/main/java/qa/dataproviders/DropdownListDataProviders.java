package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.base.BaseDataProviders;
import qa.dataprovidernames.DataProviderNames;
import qa.testdataprovider.TestDataProvider;


public class DropdownListDataProviders extends BaseDataProviders {

    @DataProvider(name = DataProviderNames.MAIN_DROPDOWN_LIST)
    public Object[] mainDropdownList() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.MAIN_DROPDOWN_LIST);
    }

    @DataProvider(name = DataProviderNames.ABOUT_PARISH)
    public Object[] aboutParish() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.ABOUT_PARISH);
    }

    @DataProvider(name = DataProviderNames.SACRAMENTS)
    public Object[] sacraments() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.SACRAMENTS);
    }

    @DataProvider(name = DataProviderNames.PRIESTHOOD)
    public Object[] priesthood() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.PRIESTHOOD);
    }

    @DataProvider(name = DataProviderNames.WORTH_SEEING)
    public Object[] worthSeeing() {

        return TestDataProvider.getLinksData(getSource(), DataProviderNames.WORTH_SEEING);
    }
}
