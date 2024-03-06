package qa.models;

import lombok.Getter;

@Getter
public class Item {

    private final String tabTitle;
    private final String tabContent;

    public Item(String tabTitle, String tabContent) {

        this.tabTitle = tabTitle;
        this.tabContent = tabContent;
    }
}
