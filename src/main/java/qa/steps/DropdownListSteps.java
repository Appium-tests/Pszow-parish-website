package qa.steps;

import io.qameta.allure.Allure;
import lombok.Getter;
import qa.pageobject.menu.DropdownList;

@Getter
public class DropdownListSteps {

    private final DropdownList dropdownList;

    public DropdownListSteps(DropdownList dropdownList) {

        this.dropdownList = dropdownList;
    }

    @io.qameta.allure.Step("Touch the trigger element")
    @io.qase.api.annotation.Step("Touch the trigger element")
    public void touchTriggerElement() {

        dropdownList.touchTriggerElement();
    }

    @io.qase.api.annotation.Step("Touch a link from the dropdown list")
    public void touchLink(String value) {

        Allure.step("Touch the \"" + value + "\" link");

        dropdownList.touchLink(value);
    }

}
