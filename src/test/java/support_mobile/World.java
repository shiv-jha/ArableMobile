package support_mobile;

import io.appium.java_client.AppiumDriver;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import pages_mobile.*;

public class World {

    public static GetStartedPage getStartedPage;
    public static LoginPage loginPage;
    public static ArableTourPage arableTourPage;
    public static TermsPage termsPage;
    public static MapPage mapPage;
    public static AlertPage alertPage;
    public static ListWeatherPage listWeatherPage;
    public static SettingsPage settingsPage;
    public static SummaryPage summaryPage;
    public static CropGrowthPage cropGrowthPage;
    public static ForgotPasswordPage forgotPasswordPage;
    public static SitesApiHelper sitesApiHelper;
    public static Response response;
    public static JsonReader jsonReader;
    public static JSONObject jsonPayload;
    public static String token;
    public static String userID;
    public static String userPassword;
    public static String sitesFeature;
    public static String waterFeature;
    public static String distanceUnit;
    public static String tempUnit;
    public static String pressureUnit;
    public static String speedUnit;
    public static String volumeUnit;
    public static String emailId;
    public static String appURL;
    public static long timeMilli;
    public static float timeSeconds;
    public static String USERNAME;
    public static String AUTOMATE_KEY;
    public static String URL;
    public static String initialUnits;
    public static String updatedUnits;
    public static RestAssuredHelper restAssuredHelper;
    public static SummaryApiHelper summaryApiHelper;
    public static MapApiHelper mapApiHelper;
    public static StringHelper stringHelper;
    public static String siteName;
    public static String siteID;
    public static String orgID;
    public static String siteOrgID;
    public static String uiSiteName;
    public static int tAir;
    public static int rh;
    public static String siteZone;
    public static float precipValue;
    public static float minTemp;
    public static float maxTemp;
    public static int nextRainfall;
    public static float etc;
    public static float ndvi;
    public static float avgWind;
    final AppiumDriver appiumDriver = new TestBase().getDriver();

    public void driverClass() {
        World.getStartedPage = new GetStartedPage(appiumDriver);
        World.loginPage = new LoginPage(appiumDriver);
        World.arableTourPage = new ArableTourPage(appiumDriver);
        World.mapPage = new MapPage(appiumDriver);
        World.alertPage = new AlertPage(appiumDriver);
        World.termsPage = new TermsPage(appiumDriver);
        World.listWeatherPage = new ListWeatherPage(appiumDriver);
        World.settingsPage = new SettingsPage(appiumDriver);
        World.summaryPage = new SummaryPage(appiumDriver);
        World.cropGrowthPage = new CropGrowthPage(appiumDriver);
        World.forgotPasswordPage = new ForgotPasswordPage(appiumDriver);
        World.jsonReader = new JsonReader();
        World.restAssuredHelper = new RestAssuredHelper();
        World.stringHelper = new StringHelper();
        World.sitesApiHelper = new SitesApiHelper();
        World.summaryApiHelper = new SummaryApiHelper();
        World.mapApiHelper = new MapApiHelper();
    }
}
