package qa.testdataloader;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestDataLoader {

    private static final String PATH = "./src/test/resources/testdata/";

    public static String fetch(String filename) {

        try {
            Reader reader = new FileReader(PATH + filename + ".json");
            JSONParser jsonParser = new JSONParser();
            Object object = jsonParser.parse(reader);
            return object.toString();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
