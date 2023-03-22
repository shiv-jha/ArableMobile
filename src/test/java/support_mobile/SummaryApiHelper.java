package support_mobile;

import org.testng.Assert;

import static support_mobile.World.*;

public class SummaryApiHelper {
    public void siteSummary(String soilMoistureUnits, String orgName) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.soilMoistureUnitsPramWithQueryParam(soilMoistureUnits) + restAssuredHelper.userUnits() + restAssuredHelper.ratioPrams()
                + restAssuredHelper.selectPram() + restAssuredHelper.selectPram1();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/sites/" + siteID + "/summary" + params);
        System.out.println("Response is --> " + response.asString());
        restAssuredHelper.verifyStatusCode(200);
        Assert.assertEquals(siteID, restAssuredHelper.getValueFromResponse(response, "id"));
        Assert.assertEquals(siteName, restAssuredHelper.getValueFromResponse(response, "name"));
        Assert.assertEquals(orgName, restAssuredHelper.getValueFromResponse(response, "org_name"));
        Assert.assertEquals(siteOrgID, restAssuredHelper.getValueFromResponse(response, "org_id"));
    }

    public void sites() {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/sites/" + siteID);
        System.out.println("Response is --> " + response.asString());
        Assert.assertNotNull(restAssuredHelper.getValueFromResponse(response, "tz_name"), "Site zone");
        siteZone = restAssuredHelper.getValueFromResponse(response, "tz_name");
        System.out.println("site geo location is -> " + siteZone);
        System.out.println("site current timestamp is -> " + stringHelper.currentZoneValue(siteZone));
    }

    public void siteLocalHourly(long value, long value2) {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.siteID() + restAssuredHelper.startTime(value) + restAssuredHelper.endTime(value2) + restAssuredHelper.userUnits() + restAssuredHelper.ratioPrams() + restAssuredHelper.selectParameters()
                + restAssuredHelper.selectPramHourlyAPI() + restAssuredHelper.localTime();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/sites/data/local_hourly" + params);
        System.out.println("Response is --> " + response.asString());
    }

    public void siteForecast() {
        restAssuredHelper.setBaseURI(PropertiesReader.server);
        restAssuredHelper.setToken(token);
        String params = restAssuredHelper.fetchParam() + restAssuredHelper.userUnits() + restAssuredHelper.ratioPrams();
        response = restAssuredHelper.getRequest(PropertiesReader.apiVersion + "/sites/" + siteID + "/forecast" + params);
        System.out.println("Response is --> " + response.asString());
    }
}
