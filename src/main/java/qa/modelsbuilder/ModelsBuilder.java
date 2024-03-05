package qa.modelsbuilder;

import org.json.JSONArray;
import org.json.JSONObject;
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
}
