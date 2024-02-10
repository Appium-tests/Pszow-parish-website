package qa.dataproviders;

import org.testng.annotations.DataProvider;
import qa.dataprovidernames.DataProviderNames;
import qa.modelsbuilder.ModelsBuilder;


public class DropdownListDataProviders {

    @DataProvider(name = DataProviderNames.MAIN_DROPDOWN_LIST)
    public Object[] mainDropdownList() {

        return ModelsBuilder.getLinksData(DataProviderNames.MAIN_DROPDOWN_LIST);
    }

    @DataProvider(name = DataProviderNames.ABOUT_PARISH)
    public Object[] aboutParish() {

        return ModelsBuilder.getLinksData(DataProviderNames.ABOUT_PARISH);
    }

    @DataProvider(name = DataProviderNames.SACRAMENTS)
    public Object[] sacraments() {

        return ModelsBuilder.getLinksData(DataProviderNames.SACRAMENTS);
    }

    @DataProvider(name = DataProviderNames.PRIESTHOOD)
    public Object[] priesthood() {

        return ModelsBuilder.getLinksData(DataProviderNames.PRIESTHOOD);
    }

    @DataProvider(name = DataProviderNames.WORTH_SEEING)
    public Object[] worthSeeing() {

        return ModelsBuilder.getLinksData(DataProviderNames.WORTH_SEEING);
    }
}
