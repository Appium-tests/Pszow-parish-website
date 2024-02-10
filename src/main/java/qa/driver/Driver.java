package qa.driver;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URI;

public class Driver {

    private static final URI uri = URI.create("http://127.0.0.1:4724/");

    public static AndroidDriver create() throws MalformedURLException {

        return new AndroidDriver(uri.toURL(), Capabilities.getCapabilities());
    }
}
