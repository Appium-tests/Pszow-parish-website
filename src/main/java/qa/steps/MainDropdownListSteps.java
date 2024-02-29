package qa.steps;

import qa.pageobject.menu.MainDropdownList;

public class MainDropdownListSteps extends DropdownListSteps {

    private final MainDropdownList mainDropdownList;
    public MainDropdownListSteps(MainDropdownList mainDropdownList) {

        super(mainDropdownList);
        this.mainDropdownList = mainDropdownList;
    }

    @io.qameta.allure.Step("Touch the \"Ogłoszenia duszpasterskie\" link")
    @io.qase.api.annotation.Step("Touch the \"Ogłoszenia duszpasterskie\" link")
    public void touchAnnouncementsLink() {

        mainDropdownList.touchAnnouncementsLink();
    }

    @io.qameta.allure.Step("Touch the \"Intencje mszalne\" link")
    @io.qase.api.annotation.Step("Touch the \"Intencje mszalne\" link")
    public void touchIntentionsLink() {

        mainDropdownList.touchIntentionsLink();
    }

    @io.qameta.allure.Step("Touch the \"Pogrzeby\" link")
    @io.qase.api.annotation.Step("Touch the \"Pogrzeby\" link")
    public void touchFuneralsLink() {

        mainDropdownList.touchFuneralsLink();
    }

    @io.qameta.allure.Step("Touch the \"Szafarze\" link")
    @io.qase.api.annotation.Step("Touch the \"Szafarze\" link")
    public void touchStewardsLink() {

        mainDropdownList.touchStewardsLink();
    }

    @io.qameta.allure.Step("Touch the \"Duszpasterze\" link")
    @io.qase.api.annotation.Step("Touch the \"Duszpasterze\" link")
    public void touchPriestsLink() {

        mainDropdownList.touchPriestsLink();
    }

    @io.qameta.allure.Step("Touch the \"Spowiedź\" link")
    @io.qase.api.annotation.Step("Touch the \"Spowiedź\" link")
    public void touchConfessionLink() {

        mainDropdownList.touchConfessionLink();
    }

    @io.qameta.allure.Step("Touch the \"Kancelaria\" link")
    @io.qase.api.annotation.Step("Touch the \"Kancelaria\" link")
    public void touchOfficeLink() {

        mainDropdownList.touchOfficeLink();
    }
}
