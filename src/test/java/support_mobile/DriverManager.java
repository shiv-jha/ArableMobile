package support_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

import static support_mobile.World.*;

public class DriverManager {

    public static AppiumDriver appiumDriver;
    final PropertiesReader propertiesReader = new PropertiesReader();
    final DesiredCapabilities caps = new DesiredCapabilities();

    public void initializeDriver() throws IOException {
        propertiesReader.loadProperties();
        USERNAME = PropertiesReader.browserStack_userName;
        AUTOMATE_KEY = PropertiesReader.browserStack_key;
        URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

        switch (PropertiesReader.device_type) {
            case "android":
                caps.setCapability("os_version", PropertiesReader.android_version);
                caps.setCapability("device", PropertiesReader.android_mobile);
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("autoGrantPermissions", "true");
                caps.setCapability("locale", PropertiesReader.country_code);
                caps.setCapability("language", PropertiesReader.language);
                caps.setCapability("app", appURL);
                //caps.setCapability("app", PropertiesReader.android_app);
                appiumDriver = new AndroidDriver(new URL(URL), caps);
                break;
            case "ios":
                caps.setCapability("os_version", PropertiesReader.iOS_version);
                caps.setCapability("device", PropertiesReader.iOS_mobile);
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("autoDismissAlerts", "true");
                caps.setCapability("fullReset", "true");
                caps.setCapability("locale", PropertiesReader.country_code);
                caps.setCapability("language", PropertiesReader.language);
                caps.setCapability("app", appURL);
                //caps.setCapability("app", PropertiesReader.iOS_app);
                appiumDriver = new IOSDriver(new URL(URL), caps);
                break;
            case "realAndroid":
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformName", "Android");
                caps.setCapability("platformVersion", "11.0");
                caps.setCapability("deviceName", "d204876d");
                caps.setCapability("app", "C:\\Users\\divya\\Desktop\\Mobile_BDD\\poc\\apps\\app-release-1.apk");
                caps.setCapability("app", appURL);
                // caps.setCapability("app", System.getProperty("user.dir") + "apps\\app-release-1.apk");
                appiumDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
                break;
            case "realIOS":
                break;
        }
        new World().driverClass();
    }

}
