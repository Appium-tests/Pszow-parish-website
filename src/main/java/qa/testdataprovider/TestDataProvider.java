package qa.testdataprovider;

import org.json.JSONArray;
import org.json.JSONObject;
import qa.models.LinkData;

import java.util.stream.IntStream;

public class TestDataProvider {

    public static LinkData[] getLinksData(String source, String key) {

        JSONObject jsonObject = new JSONObject(source);
        JSONArray jsonArray = jsonObject.getJSONArray(key);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(i -> new LinkData(

                        jsonArray.getJSONObject(i).getString("value"),
                        jsonArray.getJSONObject(i).getString("url")
                ))
                .toArray(LinkData[]::new);
    }

    public static String[] getStrings(String source, String key) {

        JSONObject jsonObject = new JSONObject(source);
        JSONArray jsonArray = jsonObject.getJSONArray(key);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(jsonArray::getString)
                .toArray(String[]::new);
    }
}
