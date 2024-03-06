package qa.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    private static final String AUTOMATION_NAME = "uiautomator2";
    private static final String DEVICE_NAME = "emulator-5554";
    private static final String PLATFORM_NAME = "Android";
    private static final String PLATFORM_VERSION = "11";
    private static final String BROWSER_NAME = "Chrome";
    private static final String ANDROID_PACKAGE = "com.android.chrome";

    public static DesiredCapabilities getCapabilities() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:automationName", AUTOMATION_NAME);
        capabilities.setCapability("appium:deviceName", DEVICE_NAME);
        capabilities.setCapability("appium:platformName", PLATFORM_NAME);
        capabilities.setCapability("appium:platformVersion", PLATFORM_VERSION);
        capabilities.setCapability("appium:browserName", BROWSER_NAME);
        capabilities.setCapability("appium:androidPackage", ANDROID_PACKAGE);
        capabilities.setCapability("appium:autoGrantPermission", true);

        return capabilities;
    }
}
