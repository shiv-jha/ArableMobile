package support_mobile;

import org.json.JSONObject;
import org.testng.Assert;

import java.util.ArrayList;

import static support_mobile.World.*;

public class SitesApiHelper {

    private String contentType = "application/json";
    final PropertiesReader propertiesReader = new PropertiesReader();

    public void enterEmailId(String userRole) {
        emailId = propertiesReader.loadProperties(userRole + ".email");
    }

    public void enterPassword() {
        userPassword = PropertiesReader.app_password;
    }

    public JSONObject buildAuthRequest() {
        return new JSONObject()
                .put("email", emailId)
                .put("password", userPassword);
    }

    public void getAuthToken(String role) {
        sitesApiHelper.enterEmailId(role);
        sitesApiHelper.enterPassword();
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setContentType(contentType);
        String authPayload = new SitesApiHelper()
                .buildAuthRequest()
                .toString();
        restAssuredHelper.setRequestBody(authPayload);
        response = restAssuredHelper.postRequest(PropertiesReader.apiVersion + "/auth/token");
        System.out.println("Response is --> " + response.asString());
        restAssuredHelper.verifyStatusCode(200);
        token = restAssuredHelper.getValueFromResponse(response, "token");
        userID = restAssuredHelper.getValueFromResponse(response, "user_id");
        Assert.assertNotNull(token, "Token value is null");
        Assert.assertNotNull(userID, "Userid value is null");
    }

    public void verifyFeatureFlag() {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setContentType(contentType);
        restAssuredHelper.setToken(token);
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/feature_flags");
        System.out.println("Response is --> " + response.asString());
        restAssuredHelper.verifyStatusCode(200);
        sitesFeature = restAssuredHelper.getValueFromResponse(response, "key[0]");
        waterFeature = restAssuredHelper.getValueFromResponse(response, "key[1]");
        Assert.assertEquals(sitesFeature, "sites", "Sites feature value is not displayed");
        Assert.assertEquals(waterFeature, "water", "Water feature value is not displayed");
    }

    public void getUserMeasurementUnits() {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setContentType(contentType);
        restAssuredHelper.setToken(token);
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/users/" + userID);
        System.out.println("Response is --> " + response.asString());
        restAssuredHelper.verifyStatusCode(200);
        Assert.assertEquals(response.path("email"), emailId);
        distanceUnit = restAssuredHelper.getValueFromResponse(response, "distance_unit");
        tempUnit = restAssuredHelper.getValueFromResponse(response, "temperature_unit");
        pressureUnit = restAssuredHelper.getValueFromResponse(response, "pressure_unit");
        speedUnit = restAssuredHelper.getValueFromResponse(response, "speed_unit");
        volumeUnit = restAssuredHelper.getValueFromResponse(response, "volume_unit");
        Assert.assertNotNull(distanceUnit, "Distance units value is null");
        Assert.assertNotNull(tempUnit, "Temperature units value is null");
        Assert.assertNotNull(pressureUnit, "Pressure units is null");
        Assert.assertNotNull(speedUnit, "Speed units is null");
        Assert.assertNotNull(volumeUnit, "Volume units is null");
    }

    public void getOrgID(String org) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setContentType(contentType);
        restAssuredHelper.setToken(token);
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/users/" + userID + "/orgs");
        System.out.println("Response is --> " + response.asString());
        restAssuredHelper.verifyStatusCode(200);
        ArrayList<String> nameSize = restAssuredHelper.getListValueFromResponse(response, "name");
        for (int i = 0; i < nameSize.size(); i++) {
            String orgName = restAssuredHelper.getValueFromResponse(response, "name[" + i + "]");
            Assert.assertNotNull(orgName, "Name value is null");
            if (orgName.equalsIgnoreCase(org)) {
                orgID = restAssuredHelper.getValueFromResponse(response, "id[" + i + "]");
                Assert.assertNotNull(response.path("id[" + i + "]"), "Org id value is null");
                break;
            }
        }
    }
}