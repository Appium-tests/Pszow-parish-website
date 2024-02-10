package qa.models;

import lombok.Getter;

@Getter
public class LinkData {

    private final String value;
    private final String url;

    public LinkData(String value, String url) {

        this.value = value;
        this.url = url;
    }
}
