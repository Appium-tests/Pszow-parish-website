package qa.steps;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import lombok.Getter;
import qa.pageobject.menu.DropdownList;

@Getter
public class DropdownListSteps {

    private final DropdownList dropdownList;

    public DropdownListSteps(DropdownList dropdownList) {

        this.dropdownList = dropdownList;
    }

    @Step("Tap the trigger element")
    public void tapTriggerElement() {

        dropdownList.tapTriggerElement();
    }

    public void tapLink(String value) {

        Allure.step("Tap the \"" + value + "\" link");
        dropdownList.tapLink(value);
    }

}
