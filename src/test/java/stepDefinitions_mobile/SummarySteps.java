package stepDefinitions_mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import support_mobile.PropertiesReader;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import static support_mobile.World.*;

public class SummarySteps {

    private float etc24Hours;
    private float lfw24Hours;

    @When("navigate to summary page")
    public void navigateToSummaryPage() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        arableTourPage.clickOnSkip();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        listWeatherPage.navigateToList();
        listWeatherPage.clickFirstSiteOnCurrentList();
        summaryPage.verifyCurrentConditionsLabel();
    }

    @Then("verify the arrow, burger button, geolocation, mark count and last sync label")
    public void verifyTheArrowBurgerButtonGeolocationMarkCountAndLastSyncLabel() {
        summaryPage.verifyGeolocationName();
        summaryPage.verifyBackArrowBtn();
        summaryPage.verifyBurgerBtn();
        summaryPage.verifyLastSyncLabel(jsonPayload);
        summaryPage.verifyMarkNumber();
    }

    @Then("click on geolocation name and verify map page navigation")
    public void clickOnGeolocationNameAndVerifyMapPageNavigation() {
        summaryPage.clickGeolocationName();
        mapPage.verifyMapDropDown();
    }

    @Then("close the summary more info modal by clicking on cross button")
    public void closeTheSummaryMoreInfoModalByClickingOnCrossButton() {
        cropGrowthPage.verifyBurgerButton();
        cropGrowthPage.clickOnBurgerButton();
        cropGrowthPage.verifyMoreInfoButtonText(jsonPayload);
        cropGrowthPage.clickMoreInfoButton();
        cropGrowthPage.clickOnMoreInfoCloseButton();
        summaryPage.verifyCurrentConditionsLabel();
    }

    @Then("the summary more info modal shouldn't get close by swipe down")
    public void theSummaryMoreInfoModalShouldnTGetCloseBySwipeDown() {
        cropGrowthPage.verifyBurgerButton();
        cropGrowthPage.clickOnBurgerButton();
        cropGrowthPage.verifyMoreInfoButton();
        cropGrowthPage.clickMoreInfoButton();
        cropGrowthPage.verifyMoreInfoCloseButton();
        summaryPage.swipe();
        cropGrowthPage.verifyDropDownFieldIsNotDisplayed();
        //summaryPage.verifyCurrentConditionsLabel();
    }

    @Then("verify current condition tiles and its text, values")
    public void verifyCurrentConditionTilesAndItsTextValues() {
        summaryPage.verifyDefaultDropdownText(jsonPayload);
        summaryPage.verifyCurrentConditionsLabel();
        summaryPage.verifyCurrentConditionsText(jsonPayload);
        summaryPage.verifyCurrentTemperatureTile();
        summaryPage.verifyCurrentTemperatureTileValue();
        summaryPage.verifyCurrentTemperatureTitleLabel();
        summaryPage.verifyCurrentTemperatureTitleLabelText(jsonPayload);
        summaryPage.verifyCurrentHumidityTile();
        summaryPage.verifyCurrentHumidityTileValue();
        summaryPage.verifyCurrentHumidityTitleLabel();
        summaryPage.verifyCurrentHumidityTitleLabelText(jsonPayload);
        summaryPage.verifyCurrentPrecipTile();
        summaryPage.verifyCurrentPrecipTileValue();
        summaryPage.verifyCurrentPrecipTitleLabel();
        summaryPage.verifyCurrentPrecipTitleLabelText(jsonPayload);
    }

    @Then("verify forecast tiles and its text, values")
    public void verifyForecastTilesAndItsTextValues() {
        summaryPage.verifyDefaultDropdownText(jsonPayload);
        summaryPage.verifySummaryForecastLabel();
        summaryPage.verifySummaryForecastText(jsonPayload);
        summaryPage.verifyForecastMaxTemperatureTile();
        summaryPage.verifyForecastMaxTemperatureTileValue();
        summaryPage.verifyForecastMaxTemperatureTitleLabel();
        summaryPage.verifyForecastMaxTemperatureTitleLabelText(jsonPayload);
        summaryPage.verifyForecastMinTemperatureTile();
        summaryPage.verifyForecastMinTemperatureTileValue();
        summaryPage.verifyForecastMinTemperatureTitleLabel();
        summaryPage.verifyForecastMinTemperatureTitleLabelText(jsonPayload);
        summaryPage.verifyForecastNxtRainTile();
        if (summaryPage.nxtRainTitleValueCount() != 0) {
            summaryPage.verifyForecastNxtRainTileValue();
            summaryPage.verifyForecastNxtRainTitleLabel();
            summaryPage.verifyForecastNxtRainTitleLabelText(jsonPayload);
        } else {
            summaryPage.verifyForecastNoRainTitleLabel();
            summaryPage.verifyForecastNoRainTitleLabelText(jsonPayload);
        }
    }

    @Then("verify crop activity tiles and its text, values")
    public void verifyCropActivityTilesAndItsTextValues() {
        settingsPage.scrollPage();
        summaryPage.verifySummaryCropActivityLabel();
        summaryPage.verifySummaryCropActivityText(jsonPayload);
        summaryPage.verifyCropActivity24HrsTile();
        summaryPage.verifyCropActivity24HrsTileValue();
        summaryPage.verifyCropActivity24HrsTitleLabel();
        summaryPage.verifyCropActivity24HrsTitleLabelText(jsonPayload);
        summaryPage.verifyCropActivity7HrsTile();
        summaryPage.verifyCropActivity7HrsTileValue();
        summaryPage.verifyCropActivity7HrsTitleLabel();
        summaryPage.verifyCropActivity7HrsTitleLabelText(jsonPayload);
        summaryPage.verifyCropActivityLeafWetnessTile();
        summaryPage.verifyCropActivityLeafWetnessTileValue();
        summaryPage.verifyCropActivityLeafWetnessTitleLabel();
        summaryPage.verifyCropActivityLeafWetnessTitleLabelText(jsonPayload);
    }

    @Then("verify current season tiles and its text, values")
    public void verifyCurrentSeasonTilesAndItsTextValues() {
        settingsPage.scrollPage();
        summaryPage.verifySummaryCurrentSeasonLabel();
        summaryPage.verifySummaryCurrentSeasonText(jsonPayload);
        summaryPage.verifyCurrentSeasonCropTypeTile();
        summaryPage.verifyCurrentSeasonCropTypeTileValue();
        summaryPage.verifyCurrentSeasonCropTypeTileLabel();
        summaryPage.verifyCurrentSeasonCropTypeTitleLabelText(jsonPayload);
        summaryPage.verifyCurrentSeasonSeasonTile();
        summaryPage.verifyCurrentSeasonSeasonTileValue();
        summaryPage.verifyCurrentSeasonSeasonTitleLabel();
        summaryPage.verifyCurrentSeasonSeasonTitleLabelText(jsonPayload);
        summaryPage.verifyCurrentSeasonGrowthStageTile();
        summaryPage.verifyCurrentSeasonGrowthStageTileValue();
        summaryPage.verifyCurrentSeasonGrowthStageTitleLabel();
        summaryPage.verifyCurrentSeasonGrowthStageTitleLabelText(jsonPayload);
    }

    @When("navigate to site summary page")
    public void navigateToSiteSummaryPage() {
        arableTourPage.clickOnSkip();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        listWeatherPage.navigateToList();
        listWeatherPage.clickFirstSiteOnCurrentList();
    }

    @Given("get token, userID, units for {string} user and verify the feature flag then get orgID for {string}")
    public void get_token_user_id_units_for_user_and_verify_the_feature_flag_then_get_org_id_for(String role, String org) {
        sitesApiHelper.getAuthToken(role);
        sitesApiHelper.verifyFeatureFlag();
        sitesApiHelper.getUserMeasurementUnits();
        sitesApiHelper.getOrgID(org);
    }

    @When("a summary request is made with {int} page, {int} limit, {string} order, {string} orderBy and {string} soilMoistureUnits and get response details")
    public void a_summary_request_is_made_with_page_limit_order_order_by_and_soil_moisture_units_and_get_response_details(int int1, int int2, String string, String string2, String string3) {
        mapApiHelper.mapSummary(int1, int2, string, string2, string3);
        restAssuredHelper.verifyStatusCode(200);
        Assert.assertNotNull(restAssuredHelper.getValueFromResponse(response, "items.id[0]"), "Site id value is not null");
        Assert.assertNotNull(restAssuredHelper.getValueFromResponse(response, "items.name[0]"), "Site name value is not null");
        Assert.assertNotNull(restAssuredHelper.getValueFromResponse(response, "items.org_id[0]"), "Org id value is not null");
        siteID = restAssuredHelper.getValueFromResponse(response, "items.id[0]");
        siteName = restAssuredHelper.getValueFromResponse(response, "items.name[0]");
        siteOrgID = restAssuredHelper.getValueFromResponse(response, "items.org_id[0]");
    }

    @And("a site specific summary request is made with {string} soilMoistureUnits and get temperature value from response for {string} org")
    public void aSiteSpecificSummaryRequestIsMadeWithSoilMoistureUnitsAndGetTemperatureValueFromResponseForOrg(String string, String string2) {
        summaryApiHelper.siteSummary(string, string2);
        Float value = restAssuredHelper.getFloatValueFromResponse(response, "summary.measurements.tair");
        System.out.println("Temp value from API response -> " + value);
        if (value != null) {
            tAir = Math.round(value);
        } else {
            tAir = 0;
        }
        System.out.println("Final Temp value from API response -> " + tAir);
    }

    @And("a site specific summary request is made with {string} soilMoistureUnits and get rh value from response for {string} org")
    public void aSiteSpecificSummaryRequestIsMadeWithSoilMoistureUnitsAndGetRhValueFromResponseForOrg(String string, String string2) {
        summaryApiHelper.siteSummary(string, string2);
        Float value1 = restAssuredHelper.getFloatValueFromResponse(response, "summary.measurements.rh");
        System.out.println("RH value from API response -> " + value1);
        if (value1 != null) {
            rh = Math.round(value1 * 100);
        } else {
            rh = 0;
        }
        System.out.println("Final RH value from API response -> " + rh);
    }

    @And("a site specific summary request is made with {string} soilMoistureUnits and get NDVI value from response for {string} org")
    public void aSiteSpecificSummaryRequestIsMadeWithSoilMoistureUnitsAndGetNDVIValueFromResponseForOrg(String string, String string2) {
        summaryApiHelper.siteSummary(string, string2);
        Float value2 = restAssuredHelper.getFloatValueFromResponse(response, "summary.measurements.ndvi");
        System.out.println("NDVI value from API response -> " + value2);
        if (value2 != null) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            ndvi = Float.parseFloat(decimalFormat.format(value2));
        } else {
            ndvi = 0;
        }
        System.out.println("Final NDVI value from API response -> " + ndvi);
    }

    @And("a site specific local hourly request is made to get last {int} seconds to {int} seconds precipitation value")
    public void aSiteSpecificLocalHourlyRequestIsMadeToGetLastSecondsToSecondsPrecipitationValue(int start, int end) {
        summaryApiHelper.sites();
        summaryApiHelper.siteLocalHourly(start, end);
        ArrayList<Float> total = restAssuredHelper.getFloatListValueFromResponse(response, "precip");
        System.out.println("Hourly API response count is -> " + total.size());
        if (total.size() == 49) {
            float temp = 0;
            for (int i = 0; i < total.size() - 1; i++) {
                Float value2 = restAssuredHelper.getFloatValueFromResponse(response, "precip[" + i + "]");
                if (value2 == null) {
                    value2 = (float) 0;
                }
                temp = value2 + temp;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                precipValue = Float.parseFloat(decimalFormat.format(temp));
            }
        } else if (total.size() == 48) {
            float temp = 0;
            for (int i = 0; i < total.size(); i++) {
                Float value2 = restAssuredHelper.getFloatValueFromResponse(response, "precip[" + i + "]");
                if (value2 == null) {
                    value2 = (float) 0;
                }
                temp = value2 + temp;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                precipValue = Float.parseFloat(decimalFormat.format(temp));
            }
        } else if (total.size() == 0) {
            precipValue = -2;
        }
        System.out.println("Final Precip value from API response -> " + precipValue);
    }

    @When("click on first site on weather and navigate to summary page")
    public void clickOnFirstSiteOnWeatherAndNavigateToSummaryPage() {
        arableTourPage.clickOnSkip();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        listWeatherPage.navigateToList();
        listWeatherPage.clickOnSiteFromCurrentList();
        summaryPage.verifyCurrentConditionsLabel();
    }

    @Then("verify UI temperature value with API response under current condition")
    public void verifyUITemperatureValueWithAPIResponseUnderCurrentCondition() {
        summaryPage.verifyCurrentTemperatureTileValueAgainstAPI();
    }

    @Then("verify UI rh value with API response under current condition")
    public void verifyUIRhValueWithAPIResponseUnderCurrentCondition() {
        summaryPage.verifyCurrentHumidityTileValueAgainstAPI();
    }

    @Then("verify UI precipitation value with API response under current condition")
    public void verifyUIPrecipitationValueWithAPIResponseUnderCurrentCondition() {
        summaryPage.verifyCurrentPrecipTileValueAgainstAPI();
    }

    @And("a site specific forecast request is made to calculate the min temp value from response")
    public void aSiteSpecificForecastRequestIsMadeToCalculateTheMinTempValueFromResponse() {
        summaryApiHelper.sites();
        summaryApiHelper.siteForecast();
        ArrayList<Float> total = restAssuredHelper.getFloatListValueFromResponse(response, "hourly");
        System.out.println("Hourly API response count is -> " + total.size());
        if (total.size() != 0) {
            minTemp = restAssuredHelper.getFloatValueFromResponse(response, "hourly.tair[1]");
            System.out.println("Min Temp value from API response -> " + minTemp);
            for (int i = 1; i <= 24; i++) {
                float value = restAssuredHelper.getFloatValueFromResponse(response, "hourly.tair[" + i + " ]");
                if (minTemp > value) {
                    minTemp = value;
                }
            }
        } else {
            minTemp = 0;
        }
        System.out.println("Final Min Tem value from API response -> " + minTemp);
    }

    @And("a site specific forecast request is made to calculate the Avg wind value from response")
    public void aSiteSpecificForecastRequestIsMadeToCalculateTheAvgWindValueFromResponse() {
        float temp = 0;
        summaryApiHelper.sites();
        summaryApiHelper.siteForecast();
        ArrayList<Float> total = restAssuredHelper.getFloatListValueFromResponse(response, "hourly");
        //System.out.println("Hourly API response count is -> " + total.size());
        if (total.size() != 0) {
            for (int i = 1; i <= 4; i++) {
                float value = restAssuredHelper.getFloatValueFromResponse(response, "hourly.wind_speed[" + i + " ]");
                temp = value + temp;
            }
        } else {
            temp = 1000;
        }
        avgWind = temp / 4;
        System.out.println("Final API speed value is --> " + avgWind);
    }

    @Then("verify forecast avg wind value on UI and API response")
    public void verifyForecastAvgWindValueOnUIAndAPIResponse() {
        summaryPage.getForecastAverageWindTileValue();
    }

    @Then("verify UI min temperature value with API response under forecast")
    public void verifyUIMinTemperatureValueWithAPIResponseUnderForecast() {
        summaryPage.verifyForecastMinTemperatureTileValueAgainstAPI();
    }

    @And("a site specific forecast request is made to calculate the max temp value from response")
    public void aSiteSpecificForecastRequestIsMadeToCalculateTheMaxTempValueFromResponse() {
        summaryApiHelper.sites();
        summaryApiHelper.siteForecast();
        ArrayList<Float> total = restAssuredHelper.getFloatListValueFromResponse(response, "hourly");
        System.out.println("Hourly API response count is -> " + total.size());
        if (total.size() != 0) {
            maxTemp = restAssuredHelper.getFloatValueFromResponse(response, "hourly.tair[1]");
            System.out.println("Max Temp value from API response -> " + maxTemp);
            for (int i = 1; i <= 24; i++) {
                float value = restAssuredHelper.getFloatValueFromResponse(response, "hourly.tair[" + i + " ]");
                if (maxTemp < value) {
                    maxTemp = value;
                }
            }
        } else {
            maxTemp = 0;
        }
        System.out.println("Final Max Tem value from API response -> " + maxTemp);
    }

    @Then("verify UI max temperature value with API response under forecast")
    public void verifyUIMaxTemperatureValueWithAPIResponseUnderForecast() {
        summaryPage.verifyForecastMaxTemperatureTileValueAgainstAPI();
    }

    @And("a site specific forecast request is made to calculate next rain value from response")
    public void aSiteSpecificForecastRequestIsMadeToCalculateNextRainValueFromResponse() {
        summaryApiHelper.sites();
        summaryApiHelper.siteForecast();
        ArrayList<Integer> v = restAssuredHelper.getIntegerListValueFromResponse(response, "hourly");
        ArrayList<Integer> total = restAssuredHelper.getIntegerListValueFromResponse(response, "hourly");
        for (int i = 1; i < total.size(); i++) {
            float value = restAssuredHelper.getFloatValueFromResponse(response, "hourly.precip[" + i + " ]");
            if (value == 0) {
                nextRainfall = 0;
            } else {
                nextRainfall = i;
                break;
            }
        }
        System.out.println("Final next rainfall value is -> " + nextRainfall);
    }

    @Then("verify UI next rain value with API response under forecast")
    public void verifyUINextRainValueWithAPIResponseUnderForecast() {
        if (nextRainfall != 0) {
            summaryPage.verifyForecastNxtRainTileValueAgainstAPI();
        } else {
            summaryPage.verifyForecastNoRainTitleLabelText(jsonPayload);
        }
    }

    @And("a site specific local hourly request is made to get last {int} sec to {int} sec etc, leaf wetness value and last {int} sec to {int} sec hours etc value")
    public void aSiteSpecificLocalHourlyRequestIsMadeToGetLastSecToSecEtcLeafWetnessValueAndLastSecToSecHoursEtcValue(int start, int end, int start1, int end1) {
        summaryApiHelper.sites();
        Assert.assertNotNull(restAssuredHelper.getValueFromResponse(response, "tz_name"), "Site zone");
        siteZone = restAssuredHelper.getValueFromResponse(response, "tz_name");
        System.out.println(stringHelper.currentZoneValue(siteZone));
        summaryApiHelper.siteLocalHourly(start, end);
        ArrayList<Integer> total = restAssuredHelper.getIntegerListValueFromResponse(response, "hourly");
        System.out.println(total.size());

        for (int i = 0; i < total.size(); i++) {
            if (response.path("etc[" + i + "]") != null) {
                float value = restAssuredHelper.getFloatValueFromResponse(response, "etc[" + i + " ]");
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                etc24Hours = value + etc24Hours;
                System.out.println("    " + value);
                System.out.println("    " + Float.parseFloat(decimalFormat.format(value)));
            }
            if (response.path("lfw[" + i + "]") != null) {
                float value = restAssuredHelper.getFloatValueFromResponse(response, "lfw[" + i + " ]");
                System.out.println(value);
                lfw24Hours = value + lfw24Hours;
            }
        }
        System.out.println("etc 24 hours value ---> " + etc24Hours);
        System.out.println("lfw 2h hours value ---> " + lfw24Hours);
    }

    @And("verify recent crop activity tiles values with API response")
    public void verifyRecentCropActivityTilesValuesWithAPIResponse() {
    }

    @And("a site specific summary request is made with {string} soilMoistureUnits and get ETc value from response for {string} org")
    public void aSiteSpecificSummaryRequestIsMadeWithSoilMoistureUnitsAndGetETcValueFromResponseForOrg(String string, String string2) {
        summaryApiHelper.siteSummary(string, string2);
        Float value2 = restAssuredHelper.getFloatValueFromResponse(response, "summary.measurements.etc");
        System.out.println("ETc value from API response -> " + value2);
        if (value2 != null) {
            //DecimalFormat decimalFormat = new DecimalFormat("#.##");
            //etc = Float.parseFloat(decimalFormat.format(value2));
            etc = value2;
        } else {
            etc = 0;
        }
        System.out.println("Final ETc value from API response -> " + etc);
    }

    @Then("verify Crop type, variety tile values with API response")
    public void verifyCropTypeVarietyTileValuesWithAPIResponse() {
        settingsPage.scrollPage();
        summaryPage.verifySummaryCurrentSeasonLabel();
        ArrayList<Integer> value1 = restAssuredHelper.getIntegerListValueFromResponse(response, "items");
        System.out.println("API size is --> " + value1.size());
        if (value1.size() == 1) {
            summaryPage.verifyCurrentSeasonCropTypeTileValueWithAPI();
        } else if (value1.size() == 0) {
            summaryPage.verifyCurrentSeasonCropTypeTileValueWithAPI();
        } else {
            Assert.fail("Growing seasons response neither 1 or 0 ");
        }
    }

    @Then("verify season start and end date tile values with API response")
    public void verifySeasonStartAndEndDateTileValuesWithAPIResponse() throws ParseException {
        settingsPage.scrollPage();
        summaryPage.verifySummaryCurrentSeasonLabel();
        ArrayList<Integer> value1 = restAssuredHelper.getIntegerListValueFromResponse(response, "items");
        System.out.println("API size is --> " + value1.size());
        if (value1.size() == 1) {
            String startValue = restAssuredHelper.getValueFromResponse(response, "items[0].start_date");
            String endValue = restAssuredHelper.getValueFromResponse(response, "items[0].stop_date");
            String value = stringHelper.convertDateFromString(startValue) + "\n" + stringHelper.convertDateFromString(endValue);
            String uiValue = summaryPage.verifyCurrentSeasonSeasonTileValue();
            System.out.println("UI value is --> " + uiValue);
            System.out.println("API value is --> " + value);
            Assert.assertEquals(value, uiValue, "season UI and API value don't match");
        } else if (value1.size() == 0) {
            String uiValue = summaryPage.verifyCurrentSeasonSeasonTileValue();
            System.out.println("UI value is --> " + uiValue);
            Assert.assertEquals("--", uiValue, "season UI and API value don't match");
        } else {
            Assert.fail("Growing seasons response neither 1 or 0 ");
        }
    }

    @Then("calculate site summary UI data load time is less than 5sec")
    public void calculateSiteSummaryUIDataLoadTimeIsLessThanSec() {
        summaryPage.verifyCurrentConditionsLabel();
        summaryPage.getSummaryPageLoadTime();
    }

    @Then("refresh the page manually and calculate site summary UI data load time is less than 5sec")
    public void refreshThePageManuallyAndCalculateSiteSummaryUIDataLoadTimeIsLessThanSec() {
        summaryPage.verifyCurrentConditionsLabel();
        cropGrowthPage.swipeDown();
        summaryPage.getSummaryPageLoadTime();
    }

    @Then("verify Current wind conditions tiles and its text, values")
    public void verifyCurrentWindConditionsTilesAndItsTextValues() {
        summaryPage.verifyCurrentWindConditionsTextField();
        summaryPage.verifyCurrentWindConditionsText(jsonPayload);
        summaryPage.verifyCurrentWindForecastTextField();
        summaryPage.verifyCurrentWindForecastText(jsonPayload);
        summaryPage.verifyCurrentAverageWindTile();
        summaryPage.verifyCurrentAverageWindTileValue();
        summaryPage.verifyCurrentAverageWindTileLbl();
        summaryPage.verifyCurrentAverageWindTileLblText(jsonPayload);
        summaryPage.verifyCurrentMaxWindTile();
        summaryPage.verifyCurrentMaxWindTileValue();
        summaryPage.verifyCurrentMaxWindTileLbl();
        summaryPage.verifyCurrentMaxWindTileLblText(jsonPayload);
        summaryPage.verifyForecastAverageWindTile();
        summaryPage.verifyForecastAverageWindTileValue();
        summaryPage.verifyForecastAverageWindTileLbl();
        summaryPage.verifyForecastAverageWindTileLblText(jsonPayload);
        summaryPage.verifyCurrentAverageWindTileRemoteOrLocalLbl();
        summaryPage.verifyCurrentMaxWindTileRemoteOrLocalLbl();
        summaryPage.verifyForecastAverageWindTileNext4HoursLbl();
        summaryPage.verifyForecastAverageWindTileNext4HoursLblText(jsonPayload);
        summaryPage.verifyCurrentAverageWindTileRemoteOrLocalLblText(jsonPayload);
        summaryPage.verifyCurrentMaxWindTileRemoteOrLocalLblText(jsonPayload);
    }

    @And("a site specific local hourly request is made to get current {int} seconds to {int} seconds wind value")
    public void aSiteSpecificLocalHourlyRequestIsMadeToGetCurrentSecondsToSecondsWindValue(int start, int end) {
        summaryApiHelper.sites();
        summaryApiHelper.siteLocalHourly(start, end);
        ArrayList<Float> total = restAssuredHelper.getFloatListValueFromResponse(response, "precip");
        System.out.println("Hourly API response count is -> " + total.size());
    }
}
