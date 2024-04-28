package qa.servermanager;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.time.Duration;

public class ServerManager {

    private static AppiumDriverLocalService appiumDriverLocalService;
    private static final String IP = "127.0.0.1";
    private static final String APPIUM_JS = "/home/pawelaksman/node_modules/appium/build/lib/main.js";
    private static final String DRIVER_EXECUTABLE_PATH = "/home/pawelaksman/.nvm/versions/node/v20.11.0/bin/node";
    private static final int PORT = 4724;
    private static final int DURATION = 200;

    public static void setup() {

        AppiumServiceBuilder builder = new AppiumServiceBuilder();

        builder
                .withIPAddress(IP)
                .withAppiumJS(new File(APPIUM_JS))
                .withTimeout(Duration.ofSeconds(DURATION))
                .withArgument(() -> "--allow-insecure", "chromedriver_autodownload")
                .usingDriverExecutable(new File(DRIVER_EXECUTABLE_PATH))
                .usingPort(PORT);

        appiumDriverLocalService = AppiumDriverLocalService.buildService(builder);
    }

    public static void start() {

        appiumDriverLocalService.start();
    }

    public static void stop() {

        appiumDriverLocalService.stop();
    }
}
