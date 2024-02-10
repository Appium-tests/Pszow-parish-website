package qa.io;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class MockarooTestDataLoader {

    private static final String URL = "https://my.api.mockaroo.com/";
    private static final String API_KEY = "df87e700";

    private static String getString(InputStream inputStream) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(new InputStreamReader(inputStream)).toString();
    }

    public static String fetch(String filename) {

        try {
            URI uri = new URI(URL + filename + ".json?key=" + API_KEY);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
            return getString(httpURLConnection.getInputStream());
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
