package qa.modelsbuilder;

import org.json.JSONArray;
import org.json.JSONObject;
import qa.dataprovidernames.DataProviderNames;
import qa.models.Item;
import qa.testdataloader.TestDataLoader;

import java.util.stream.IntStream;

public class ModelsBuilder {

    public static String[] getStrings(String key) {

        JSONObject jsonObject = new JSONObject(TestDataLoader.getSource());
        JSONArray jsonArray = jsonObject.getJSONArray(key);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(jsonArray::getString)
                .toArray(String[]::new);
    }

    public static Item[] getItems() {

        JSONObject jsonObject = new JSONObject(TestDataLoader.getSource());
        JSONArray jsonArray = jsonObject.getJSONArray(DataProviderNames.ITEMS);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(i -> new Item(
                        jsonArray.getJSONObject(i).getString("tabTitle"),
                        jsonArray.getJSONObject(i).getString("tabContent")
                ))
                .toArray(Item[]::new);
    }
}
