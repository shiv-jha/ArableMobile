package support_mobile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String environment;
    public static String language;
    public static String country_code;
    public static String app_dropdown;
    public static String app_password;
    public static String app_env;
    public static String device_type;
    public static String browserStack_userName;
    public static String browserStack_key;
    public static String appCenter_URL;
    public static String browserStack_URL;
    public static String appCenter_key;
    public static String android_app;
    public static String android_version;
    public static String android_mobile;
    public static String android_bsMobile;
    public static String iOS_app;
    public static String iOS_version;
    public static String iOS_mobile;
    public static String iOS_bsMobile;
    public static String base_url;
    public static String username_testRail;
    public static String password_testRail;
    public static String runId_testRail;
    public static String apiVersion;
    public static String server;

    public void loadProperties() throws IOException {
        Properties settings = new Properties();
        Properties env = new Properties();

        settings.load(new FileInputStream("config/settings.properties"));
        env.load(new FileInputStream("environment/env.properties"));

        environment = settings.getProperty("environment");
        device_type = settings.getProperty("device");
        language = settings.getProperty("language");
        country_code = settings.getProperty("countryCode");
        app_dropdown = env.getProperty(environment + ".dropdown");
        app_password = env.getProperty(environment + ".mobilePassword");
        app_env = env.getProperty(environment + ".env");
        browserStack_userName = env.getProperty("browserStackUserName");
        browserStack_key = env.getProperty("browserStackKey");
        appCenter_URL = env.getProperty("appCenterURL");
        browserStack_URL = env.getProperty("browserStackURL");
        appCenter_key = env.getProperty("appCenterAPIToken");
        android_app = env.getProperty(device_type + ".app");
        android_version = env.getProperty(device_type + ".version");
        android_mobile = env.getProperty(device_type + ".mobile");
        android_bsMobile = env.getProperty(device_type + ".bsMobile");
        iOS_app = env.getProperty(device_type + ".app");
        iOS_version = env.getProperty(device_type + ".version");
        iOS_mobile = env.getProperty(device_type + ".mobile");
        iOS_bsMobile = env.getProperty(device_type + ".bsMobile");
        base_url = env.getProperty("baseUrl");
        username_testRail = env.getProperty("usernameTestRail");
        password_testRail = env.getProperty("passwordTestRail");
        runId_testRail = env.getProperty(device_type + ".runIdTestRail");
        apiVersion = env.getProperty(environment + ".apiVersion");
        server = env.getProperty(environment + ".server");
    }

    public String loadProperties(String key) {
        Properties data = new Properties();
        try {
            data.load(new FileInputStream("data/commonData.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.getProperty(key);
    }
}
