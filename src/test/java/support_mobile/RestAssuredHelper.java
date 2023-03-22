package support_mobile;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static support_mobile.World.*;

public class RestAssuredHelper {

    final PropertiesReader propertiesReader = new PropertiesReader();
    public static RequestSpecification httpRequest;
    RestAssuredHelper helper;
    String build;
    int actualID;
    String downloadURL;
    String appCenterMobile;

    public void setBaseURI(String url) {
        RestAssured.baseURI = url;
        httpRequest = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .urlEncodingEnabled(false)
                .log().all();
    }

    public void setBasicAuth(String url, String username, String password) {
        RestAssured.baseURI = url;
        httpRequest = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .urlEncodingEnabled(false)
                .auth()
                .preemptive()
                .basic(username, password)
                .log().all();
    }

    public void setBSToken(String token) {
        httpRequest.header("X-Api-Token", token);
    }

    public void setToken(String token) {
        httpRequest.header("Authorization", "Bearer " + token);
    }

    public Response getRequest(String endpoint) {
        response = httpRequest.get(endpoint);
        return response;
    }

    public Response postRequest(String endpoint) {
        response = httpRequest.post(endpoint);
        return response;
    }

    public String getValueFromResponse(Response responses, String path) {
        String value = responses.path(path);
        return value;
    }

    public void setRequestBody(String requestBody) {
        httpRequest.body(requestBody);
    }

    public void setContentType(String contentType) {
        httpRequest.header("Content-Type", contentType);
    }

    public String mobile() throws IOException {
        propertiesReader.loadProperties();
        if (PropertiesReader.device_type.equalsIgnoreCase("android")) {
            appCenterMobile = PropertiesReader.android_bsMobile;
        } else if (PropertiesReader.device_type.equalsIgnoreCase("ios")) {
            appCenterMobile = PropertiesReader.iOS_bsMobile;
        }
        return appCenterMobile;
    }

    public String getBranchLatestBuild() throws IOException {
        propertiesReader.loadProperties();
        helper = new RestAssuredHelper();
        helper.setBaseURI(PropertiesReader.appCenter_URL + helper.mobile() + "/branches/" + PropertiesReader.app_env + "/builds");
        helper.setBSToken(PropertiesReader.appCenter_key);
        response = helper.getRequest("");
        Assert.assertEquals(response.statusCode(), 200);
        //String id = response.path("buildNumber[0]");
        List<String> ids = response.path("buildNumber");
        int i = 0;
        for (String value : ids) {
            if (response.path("result[" + i + "]").equals("succeeded")) {
                build = value;
                System.out.println(value);
                break;
            } else {
                Assert.fail("The app center build is either failed or cancelled");
            }
        }
        // build = helper.getValueFromResponse(response, "buildNumber[0]");
        return build;
    }

    public int getRecentReleaseBuildID() throws IOException {
        propertiesReader.loadProperties();
        helper = new RestAssuredHelper();
        helper.setBaseURI(PropertiesReader.appCenter_URL + helper.mobile() + "/recent_releases");
        helper.setBSToken(PropertiesReader.appCenter_key);
        response = helper.getRequest("");
        Assert.assertEquals(response.statusCode(), 200);
        //List<String> buildID = response.path("id");
        List<String> version = response.path("version");
        int i = 0;
        for (String versionID : version) {
            if (build.equalsIgnoreCase(versionID)) {
                actualID = response.path("id[" + i + "]");
            } else {
                i++;
            }
        }
        return actualID;
    }

    public String getBuildURL() throws IOException {
        propertiesReader.loadProperties();
        helper = new RestAssuredHelper();
        helper.setBaseURI(PropertiesReader.appCenter_URL + helper.mobile() + "/releases/" + actualID);
        helper.setBSToken(PropertiesReader.appCenter_key);
        response = helper.getRequest("");
        Assert.assertEquals(response.statusCode(), 200);
        downloadURL = helper.getValueFromResponse(response, "download_url");
        return downloadURL;
    }

    public String getBrowserStackURL() throws IOException {
        propertiesReader.loadProperties();
        USERNAME = PropertiesReader.browserStack_userName;
        AUTOMATE_KEY = PropertiesReader.browserStack_key;
        helper = new RestAssuredHelper();
        helper.setBasicAuth(PropertiesReader.browserStack_URL, USERNAME, AUTOMATE_KEY);
        helper.setContentType("application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("url", downloadURL);
        helper.setRequestBody(requestParams.toString());
        response = helper.postRequest("");
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.statusCode(), 200);
        appURL = response.path("app_url");
        return appURL;
    }

    public Float getFloatValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public Double getDoubleValueFromResponse(Response responses, String path) {
        Double value = responses.path(path);
        return value;
    }

    public Boolean getBooleanValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public ArrayList<String> getListValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public ArrayList<Float> getFloatListValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public ArrayList<Integer> getIntegerListValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public ArrayList<ArrayList<Float>> getListOfListValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public LinkedHashMap<String, Float> getHashValueFromResponse(Response responses, String path) {
        return responses.path(path);
    }

    public Integer getIntegerValueFromResponse(Response responses, String path) {
        int value = responses.path(path);
        return value;
    }

    public void verifyStatusCode(int code) {
        Assert.assertEquals(response.getStatusCode(), code, "Response code is not " + code);
    }

    public String userUnits() {
        return "&temp=" + tempUnit + "&size=" + distanceUnit + "&pres=" + pressureUnit + "&speed=" + speedUnit;
    }

    public String orgPram() {
        return "&org_id=" + orgID;
    }

    public String limitPram(int limit) {
        return "?limit=" + limit;
    }

    public String pagePram(int pageCount) {
        return "&page=" + pageCount;
    }

    public String orderPram(String order) {
        return "&order=" + order;
    }

    public String ratioPrams() {
        return "&ratio=" + "dec";
    }

    public String operationalPrams() {
        return "&is_operational=" + "true";
    }

    public String otherPrams() {
        return "&days=" + 7 + "&overlap=true";
    }

    public String orderByPram(String orderBy) {
        return "&order_by=" + orderBy;
    }

    public String soilMoistureUnitsPram(String units) {
        return "&volumetric_soil_moisture_unit=" + units;
    }

    public String soilMoistureUnitsPramWithQueryParam(String units) {
        return "?volumetric_soil_moisture_unit=" + units;
    }

    public String activeParam(String active) {
        return "&active=" + active;
    }

    public String gddUnitsParam() {
        String pram = null;
        if (tempUnit.equalsIgnoreCase("F")) {
            pram = "&gdd_unit=" + "fahrenheit-day";
        } else if (tempUnit.equalsIgnoreCase("C")) {
            pram = "&gdd_unit=" + "celsius-day";
        }
        return pram;
    }

    public String fieldsParam() {
        return "&fields=" + "last_gdd_metric";
    }

    public String selectPram() {
        return "&select=et_10d,et,etc,ndvi,cl,rh,tair,sun,precip,precip_10d,wind_speed,wind_direction,soil_moisture,device_name,last_sync,has_bridge,sun";
    }

    public String selectPramHourlyAPI() {
        return "rh_at_maxt,tair,tdew,time,lfw,precip,maxt,wind_speed,wind_direction,wind_speed_max,mint,etc,vpd,swdw,rh";
    }

    public String selectPram1() {
        return ",cst_max,fcst_min,fcst_precip,fcst_wind_speed,fcst_et,fcst_etc";
    }

    public String selectParameters() {
        return "&select=";
    }

    public String unreadParameters(String value) {
        return "&unread=" + "true";
    }

    public String siteID() {
        return "?site_id=" + siteID;
    }

    public String localTime() {
        return "&local_time=" + siteZone;
    }

    public String startTime(long value) {
        return "&start_time=" + stringHelper.pastUTCValue(value);
    }

    public String endTime(long value) {
        return "&end_time=" + stringHelper.currentUTCValue(value);
    }

    public String fetchParam() {
        return "?fec=true";
    }
}
