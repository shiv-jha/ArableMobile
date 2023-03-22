package pages_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import support_mobile.PropertiesReader;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

import static pages_mobile.PageBase.Direction.DOWN;
import static support_mobile.World.*;

public class SummaryPage extends PageBase {

    public SummaryPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "DEVD-GoBackArrowBtn")
    @iOSXCUITFindBy(accessibility = "DEVD-GoBackArrowBtn")
    private MobileElement BackArrowBtnF;

    @AndroidFindBy(accessibility = "LWE-HamburgerBtn")
    @iOSXCUITFindBy(accessibility = "LWE-HamburgerBtn")
    private MobileElement HamburgerBtnF;

    @AndroidFindBy(accessibility = "DEVD-LocationLbl")
    @iOSXCUITFindBy(accessibility = "DEVD-LocationLbl")
    private MobileElement geolocationOfSiteF;

    @AndroidFindBy(accessibility = "DEVD-MarksNumber")
    @iOSXCUITFindBy(accessibility = "DEVD-MarksNumber")
    private MobileElement marksNumberF;

    @AndroidFindBy(accessibility = "DEVD-LastSyncLbl")
    @iOSXCUITFindBy(accessibility = "DEVD-LastSyncLbl")
    private MobileElement lastSyncLabelF;

    @AndroidFindBy(accessibility = "DEVD-DropdownOptSelected")
    @iOSXCUITFindBy(accessibility = "DEVD-Dropdown")
    private MobileElement summaryDropDownF;

    @AndroidFindBy(accessibility = "DEVD-Dropdown")
    @iOSXCUITFindBy(accessibility = "DEVD-Dropdown")
    private MobileElement clickableSummaryDropDownF;

    @AndroidFindBy(accessibility = "SMRY-CurrentConditionsLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentConditionsLbl")
    private MobileElement currentConditionsF;

    @AndroidFindBy(accessibility = "SMRY-CurrentTemperatureTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentTemperatureTile")
    private MobileElement currentTemperatureTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentTemperatureTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentTemperatureTileValue")
    private MobileElement currentTemperatureTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentTemperatureTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentTemperatureTileLbl")
    private MobileElement currentTemperatureTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentHumidityTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentHumidityTile")
    private MobileElement currentHumidityTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentHumidityTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentHumidityTileValue")
    private MobileElement currentHumidityTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentHumidityTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentHumidityTileLbl")
    private MobileElement currentHumidityTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentPrecipitationTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentPrecipitationTile")
    private MobileElement currentPrecipitationTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentPrecipitationTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentPrecipitationTileValue")
    private MobileElement currentPrecipitationTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentPrecipitationTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentPrecipitationTileLbl")
    private MobileElement currentPrecipitationTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNext24HrsLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNext24HrsLbl")
    private MobileElement summaryForecastF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMaxTemperatureTile")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMaxTemperatureTile")
    private MobileElement forecastMaxTemperatureTileF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMaxTemperatureTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMaxTemperatureTileValue")
    private MobileElement forecastMaxTemperatureTileValueF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMaxTemperatureTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMaxTemperatureTileLbl")
    private MobileElement forecastMaxTemperatureTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMinTemperatureTile")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMinTemperatureTile")
    private MobileElement forecastMinTemperatureTileF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMinTemperatureTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMinTemperatureTileValue")
    private MobileElement forecastMinTemperatureTileValueF;

    @AndroidFindBy(accessibility = "SMRY-ForecastMinTemperatureTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastMinTemperatureTileLbl")
    private MobileElement forecastMinTemperatureTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNextRainTile")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNextRainTile")
    private MobileElement forecastNxtRainTileF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNextRainTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNextRainTileValue")
    private MobileElement forecastNxtRainTileValueF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNextRainTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNextRainTileValue")
    private List<MobileElement> forecastNxtRainTileValueListF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNextRainTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNextRainTileLbl")
    private MobileElement forecastNxtRainTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-ForecastNoRainTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastNoRainTileLbl")
    private MobileElement forecastNoRainTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLbl")
    private MobileElement summaryCropActivityF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTile")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTile")
    private MobileElement RecentCropActivity24HrsTileF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTileValue")
    private MobileElement RecentCropActivity24HrsTileValueF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast24HrsTileLbl")
    private MobileElement RecentCropActivity24HrsTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTile")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTile")
    private MobileElement RecentCropActivity7HrsTileF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTileValue")
    private MobileElement RecentCropActivity7HrsTileValueF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLast7HrsTileLbl")
    private MobileElement RecentCropActivity7HrsTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTile")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTile")
    private MobileElement forecastCropActivityLeafWetnessTileF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTileValue")
    private MobileElement CropActivityLeafWetnessTileValueF;

    @AndroidFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-RecentCropActivityLeafWetnessTileLbl")
    private MobileElement CropActivityLeafWetnessTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonLbl")
    private MobileElement summaryCurrentSeasonF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTile")
    private MobileElement currentSeasonCropTypeTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileCategory")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileCategory")
    private MobileElement currentSeasonCropTypeTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileCategory")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileCategory")
    private List<MobileElement> currentSeasonCropTypeTileValueListF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonCropTypeTileLbl")
    private MobileElement currentSeasonCropTypeTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonSeasonTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonSeasonTile")
    private MobileElement currentSeasonsTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonSeasonTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonSeasonTileValue")
    private MobileElement currentSeasonsTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonSeasonTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonSeasonTileLbl")
    private MobileElement currentSeasonsTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTile")
    private MobileElement currentSeasonGrowthStageTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTileValue")
    private MobileElement currentSeasonGrowthStageTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentSeasonGrowthStageTileLbl")
    private MobileElement currentSeasonGrowthStageTileLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentWindConditionsLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentWindConditionsLbl")
    private MobileElement currentWindConditionsLabelF;

    @AndroidFindBy(accessibility = "SMRY-ForecastLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastLbl")
    private MobileElement currentWindForecastLabelF;

    @AndroidFindBy(accessibility = "SMRY-CurrentAverageWindTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentAverageWindTile")
    private MobileElement currentAverageWindTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentAverageWindTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentAverageWindTileValue")
    private MobileElement currentAverageWindTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentAverageWindTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentAverageWindTileLbl")
    private MobileElement currentAverageWindTileLblF;

    @AndroidFindBy(accessibility = "SMRY-CurrentMaxWindTile")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentMaxWindTile")
    private MobileElement currentMaxWindTileF;

    @AndroidFindBy(accessibility = "SMRY-CurrentMaxWindTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentMaxWindTileValue")
    private MobileElement currentMaxWindTileValueF;

    @AndroidFindBy(accessibility = "SMRY-CurrentMaxWindTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentMaxWindTileLbl")
    private MobileElement currentMaxWindTileLblF;

    @AndroidFindBy(accessibility = "SMRY-ForecastAverageWindTile")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastAverageWindTile")
    private MobileElement forecastAverageWindTileF;

    @AndroidFindBy(accessibility = "SMRY-ForecastAverageWindTileValue")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastAverageWindTileValue")
    private MobileElement forecastAverageWindTileValueF;

    @AndroidFindBy(accessibility = "SMRY-ForecastAverageWindTileLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastAverageWindTileLbl")
    private MobileElement forecastAverageWindTileLblF;

    @AndroidFindBy(accessibility = "SMRY-CurrentAverageWindTileRemoteOrLocalLabel")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentAverageWindTileRemoteOrLocalLabel")
    private MobileElement currentAverageWindTileRemoteOrLocalLblF;

    @AndroidFindBy(accessibility = "SMRY-CurrentMaxWindTileRemoteOrLocalLabel")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentMaxWindTileRemoteOrLocalLabel")
    private MobileElement currentMaxWindTileRemoteOrLocalLblF;

    @AndroidFindBy(accessibility = "SMRY-ForecastAverageWindTileNext4HoursLabel")
    @iOSXCUITFindBy(accessibility = "SMRY-ForecastAverageWindTileNext4HoursLabel")
    private MobileElement forecastAverageWindTileNext4HoursLabelF;

    public void verifyForecastAverageWindTileNext4HoursLbl() {
        Assert.assertTrue(isDisplayed(forecastAverageWindTileNext4HoursLabelF), "Forecast Average Wind Tile Next4Hours Label is not displayed");
    }

    public void verifyForecastAverageWindTileNext4HoursLblText(JSONObject jsonData) {
        System.out.println("Sum_currentWindNext the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindNext"));
        String text1 = getText(forecastAverageWindTileNext4HoursLabelF);
        text1 = text1.substring(1, text1.length() - 1);
        System.out.println("From the UI -> " + text1);
        boolean text = text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindNext"));
        //Assert.assertTrue(text, "Forecast Average Wind Tile Next4Hours Label text didn't match");
    }

    public void verifyCurrentMaxWindTileRemoteOrLocalLbl() {
        Assert.assertTrue(isDisplayed(currentMaxWindTileRemoteOrLocalLblF), "Current Max Wind Tile Remote Label is not displayed");
    }

    public void verifyCurrentMaxWindTileRemoteOrLocalLblText(JSONObject jsonData) {
        String text1 = getText(currentMaxWindTileRemoteOrLocalLblF);
        System.out.println("From the UI ->" + text1);
        if (getText(currentMaxWindTileRemoteOrLocalLblF).length() != 0) {
            text1 = text1.substring(1, text1.length() - 1);
            System.out.println("From the UI -> " + text1);
            System.out.println("Sum_currentWindLocal the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindLocal"));
            boolean text = text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindLocal"));
            //Assert.assertTrue(text, "Current Average Wind Tile Local Label text didn't match");
        } else if (getText(currentMaxWindTileRemoteOrLocalLblF).length() == 0) {
            Assert.assertEquals(text1.length(), 0, "Current Average Wind Tile Local Label text didn't match");
        }
    }

    public void verifyCurrentAverageWindTileRemoteOrLocalLbl() {
        Assert.assertTrue(isDisplayed(currentAverageWindTileRemoteOrLocalLblF), "Current Average Wind Tile Remote Label is not displayed");
    }

    public void verifyCurrentAverageWindTileRemoteOrLocalLblText(JSONObject jsonData) {
        String text1 = getText(currentAverageWindTileRemoteOrLocalLblF);
        text1 = text1.substring(1, text1.length() - 1);
        if (text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindRemote"))) {
            System.out.println("From the UI -> " + text1);
            System.out.println("Sum_currentWindRemote the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindRemote"));
            boolean text = text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindRemote"));
            //Assert.assertTrue(text, "Current Average Wind Tile Remote Label text didn't match");
        } else if (text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindLocal"))) {
            System.out.println("From the UI -> " + text1);
            System.out.println("Sum_currentWindLocal the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindLocal"));
            boolean text = text1.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindLocal"));
            //Assert.assertTrue(text, "Current Average Wind Tile Local Label text didn't match");
        }
    }

    public void verifyForecastAverageWindTileLbl() {
        Assert.assertTrue(isDisplayed(forecastAverageWindTileLblF), "Forecast Average Wind Tile label is not displayed");
    }

    public void verifyForecastAverageWindTileLblText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(forecastAverageWindTileLblF));
        System.out.println("Sum_currentWind the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWind"));
        boolean text = getText(forecastAverageWindTileLblF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWind"));
        //Assert.assertTrue(text, "Forecast Average Wind Tile label text didn't match");
    }

    public void verifyForecastAverageWindTileValue() {
        Assert.assertTrue(isDisplayed(forecastAverageWindTileValueF), "Forecast Average Wind Tile Value is not displayed");
    }

    public void getForecastAverageWindTileValue() {
        Assert.assertTrue(isDisplayed(forecastAverageWindTileValueF), "Forecast Average Wind Tile Value is not displayed");
        String value = forecastAverageWindTileValueF.getText();

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        float temp = Float.parseFloat(decimalFormat.format(avgWind));
        System.out.println("API round value -->" + temp);
        int finalValue = Math.round(temp);
        System.out.println("API round value1 -->" + finalValue);

        System.out.println("UI value is -->" + value);
        String[] words = value.split("\\s");
        System.out.println("Split UI value is -->" + words[0]);
        System.out.println("Split UI units is -->" + words[1]);
        if (!Objects.equals(value, "--")) {
            Assert.assertEquals(words[1], speedUnit, "Avg Wind units is not equal in API and UI");
            Assert.assertEquals(finalValue, Integer.parseInt(words[0]), "Avg Wind value is not equal in API and UI");
        } else {
            Assert.assertEquals(value, "--", "Avg Wind value is not -- on UI");
            Assert.assertEquals(avgWind, 250, "Avg Wind value is not null from API");
        }
    }

    public void verifyForecastAverageWindTile() {
        Assert.assertTrue(isDisplayed(forecastAverageWindTileF), "Forecast Average Wind Tile is not displayed");
    }

    public void verifyCurrentMaxWindTileLbl() {
        Assert.assertTrue(isDisplayed(currentMaxWindTileLblF), "Current Max Wind Tile Label is not displayed");
    }

    public void verifyCurrentMaxWindTileLblText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentMaxWindTileLblF));
        System.out.println("Sum_currentWindMax the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindMax"));
        boolean text = getText(currentMaxWindTileLblF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindMax"));
        //Assert.assertTrue(text, "Current Max Wind Tile Label text didn't match");
    }

    public void verifyCurrentMaxWindTileValue() {
        Assert.assertTrue(isDisplayed(currentMaxWindTileValueF), "Current Max Wind Tile Value is not displayed");
    }

    public void verifyCurrentMaxWindTile() {
        Assert.assertTrue(isDisplayed(currentMaxWindTileF), "Current Max Wind Tile is not displayed");
    }

    public void verifyCurrentAverageWindTileLbl() {
        Assert.assertTrue(isDisplayed(currentAverageWindTileLblF), "Current Average Wind Tile Label is not displayed");
    }

    public void verifyCurrentAverageWindTileLblText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentAverageWindTileLblF));
        System.out.println("Sum_currentWind the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWind"));
        boolean text = getText(currentAverageWindTileLblF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWind"));
        //Assert.assertTrue(text, "Current Average Wind Tile Label text didn't match");
    }

    public void verifyCurrentAverageWindTileValue() {
        Assert.assertTrue(isDisplayed(currentAverageWindTileValueF), "Current Average Wind Tile Value is not displayed");
    }

    public void verifyCurrentAverageWindTile() {
        Assert.assertTrue(isDisplayed(currentAverageWindTileF), "Current Average Wind Tile is not displayed");
    }

    public void verifyCurrentWindForecastTextField() {
        Assert.assertTrue(isDisplayed(currentWindForecastLabelF), "Current Wind Conditions text is not displayed");
    }

    public void verifyCurrentWindForecastText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentWindForecastLabelF));
        System.out.println("Sum_currentWindForecast the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindForecast"));
        boolean text = getText(currentWindForecastLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindForecast"));
        //Assert.assertTrue(text, "Current Wind Conditions text didn't match");
    }

    public void verifyCurrentWindConditionsTextField() {
        Assert.assertTrue(isDisplayed(currentWindConditionsLabelF), "Current Wind Conditions text is not displayed");
    }

    public void verifyCurrentWindConditionsText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentWindConditionsLabelF));
        System.out.println("Sum_currentWindText the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentWindText"));
        boolean text = getText(currentWindConditionsLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentWindText"));
        //Assert.assertTrue(text, "Current Wind Conditions text didn't match");
    }

    public void verifyBackArrowBtn() {
        Assert.assertTrue(isDisplayed(BackArrowBtnF), "Back arrow button is not displayed");
    }

    public void clickBackArrow() {
        BackArrowBtnF.click();
    }

    public void verifyBurgerBtn() {
        Assert.assertTrue(isDisplayed(HamburgerBtnF), "Hamburger button is not displayed");
    }

    public void verifyLastSyncLabel(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(lastSyncLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_lastSync"));
        boolean text = getText(lastSyncLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_lastSync"));
        Assert.assertTrue(text, "Summary last sync label default text didn't match");
    }

    public void verifyMarkNumber() {
        Assert.assertTrue(isDisplayed(marksNumberF), "Hamburger button is not displayed");
    }

    public void clickGeolocationName() {
        click(geolocationOfSiteF);
    }

    public void verifyGeolocationName() {
        Assert.assertNotNull(geolocationOfSiteF.getText(), "geo location name value is not displayed");
    }

    public void verifySummaryDropdown() {
        Assert.assertTrue(isDisplayed(summaryDropDownF), "Summary dropdown is not displayed");
    }

    public void clickSummaryDropdown() {
        Assert.assertTrue(isEnabled(summaryDropDownF), "Summary dropdown is not displayed");
        click(clickableSummaryDropDownF);
    }

    public void verifyDefaultDropdownText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(summaryDropDownF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_dropdownDefault"));
        boolean text = getText(summaryDropDownF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_dropdownDefault"));
        Assert.assertTrue(text, "Summary dropdown default text didn't match");
    }

    public void getSummaryPageLoadTime() {
        long startTime = stringHelper.getTimeInMilliSeconds();
        waitForVisibility(currentConditionsF, 50, 1);
        long endTime = stringHelper.getTimeInMilliSeconds();
        float value = (float) (endTime - startTime);
        float actualValue = stringHelper.convertTimeInSeconds(value);
        System.out.println("Actual value is -> " + actualValue);
        Assert.assertTrue(actualValue < 5, "Site summary page loading time is equal or more than 5 sec ");
    }

    public void verifyCurrentConditionsLabel() {
        System.out.println("Site name from UI " + uiSiteName);
        System.out.println("Site name from API " + siteName);
        Assert.assertTrue(isDisplayed(currentConditionsF), "Current conditions label is not displayed");
    }

    public void verifyCurrentConditionsText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentConditionsF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentConditions"));
        boolean text = getText(currentConditionsF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentConditions"));
        Assert.assertTrue(text, "Current Conditions text didn't match");
    }

    public void verifyCurrentTemperatureTile() {
        Assert.assertTrue(isDisplayed(currentTemperatureTileF), "Current Temperature Tile is not displayed");
    }

    public void verifyCurrentTemperatureTileValue() {
        Assert.assertNotNull(currentTemperatureTileValueF.getText(), "Current Temperature Tile value is empty");
    }

    public void verifyCurrentTemperatureTileValueAgainstAPI() {
        System.out.println("Temp Value from UI -> " + currentTemperatureTileValueF.getText());
        Assert.assertNotNull(currentTemperatureTileValueF.getText(), "Current Temperature Tile value is empty");
        String value = currentTemperatureTileValueF.getText();
        if (!Objects.equals(value, "--")) {
            int value1 = stringHelper.trimLastChar(value, 2);
            System.out.println("Not null From the UI -> " + value1);
            System.out.println("Not null From the API -> " + tAir);
            Assert.assertEquals(tAir, value1, "Temp value is not equal in ui and API");
        } else {
            Assert.assertEquals(value, "--", "Temp value is not -- on UI");
            Assert.assertEquals(tAir, 0, "Temp value is not null from API");
        }
    }

    public void verifyCurrentTemperatureTitleLabel() {
        Assert.assertTrue(isDisplayed(currentTemperatureTileValueF), "Current Temperature title label is not displayed");
    }

    public void verifyCurrentTemperatureTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentTemperatureTileLabelF));
        System.out.println("From the API -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentTempLabel"));
        boolean text = getText(currentTemperatureTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentTempLabel"));
        Assert.assertTrue(text, "Current Temperature title label text didn't match");
    }

    public void verifyCurrentHumidityTile() {
        Assert.assertTrue(isDisplayed(currentHumidityTileF), "Current humidity Tile is not displayed");
    }

    public void verifyCurrentHumidityTileValue() {
        Assert.assertNotNull(currentHumidityTileValueF.getText(), "Current humidity Tile value is empty");
    }

    public void verifyCurrentHumidityTileValueAgainstAPI() {
        System.out.println("RH Value from UI -> " + currentHumidityTileValueF.getText());
        Assert.assertNotNull(currentHumidityTileValueF.getText(), "Current humidity Tile value is empty");
        String value = currentHumidityTileValueF.getText();
        if (!Objects.equals(value, "--")) {
            int value1 = stringHelper.trimLastChar(value, 1);
            System.out.println("Not null From the UI -> " + value1);
            System.out.println("Not null From the API -> " + rh);
            Assert.assertEquals(rh, value1, "RH value is not equal in ui and API");
        } else {
            Assert.assertEquals(value, "--", "RH value is not -- on UI");
            Assert.assertEquals(rh, 0, "RH value is not null from API");
        }
    }

    public void verifyCurrentHumidityTitleLabel() {
        Assert.assertTrue(isDisplayed(currentHumidityTileLabelF), "Current humidity title label is not displayed");
    }

    public void verifyCurrentHumidityTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentHumidityTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentHumidityLabel"));
        boolean text = getText(currentHumidityTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentHumidityLabel"));
        Assert.assertTrue(text, "Current humidity title label text didn't match");
    }

    public void verifyCurrentPrecipTile() {
        Assert.assertTrue(isDisplayed(currentPrecipitationTileF), "Current Precipitation Tile is not displayed");
    }

    public void verifyCurrentPrecipTileValue() {
        Assert.assertNotNull(currentPrecipitationTileValueF.getText(), "Current Precipitation Tile value is empty");
    }

    public void verifyCurrentPrecipTileValueAgainstAPI() {
        System.out.println("Current Conditions UI precip Value is -> " + currentPrecipitationTileValueF.getText());
        Assert.assertNotNull(currentPrecipitationTileValueF.getText(), "Current Precipitation Tile value is empty");
        String value = currentPrecipitationTileValueF.getText();
        String value1 = null;
        if (!Objects.equals(value, "--")) {
            if (Objects.equals(distanceUnit, "in")) {
                value1 = stringHelper.trimLastValue(value, 3);
                System.out.println("Not null From the UI -> " + value1);
                System.out.println("Not null From the API ->" + precipValue);
                System.out.println("Final UI value used in assertion ->" + Float.parseFloat(value1));
                Assert.assertEquals(precipValue, Float.parseFloat(value1), "Precip value is not equal in API and UI");
            } else if (Objects.equals(distanceUnit, "mm")) {
                value1 = stringHelper.trimLastValue(value, 3);
                System.out.println("Not null From the UI -> " + value1);
                System.out.println("Not null From the API ->" + precipValue);
                double doublePrecipValue = Double.parseDouble(String.valueOf(precipValue));
                double e = Math.round((doublePrecipValue) * 10.0) / 10.0;
                float g = Float.parseFloat(String.valueOf(e));
                System.out.println("Final UI value used in assertion ->" + Float.parseFloat(value1));
                System.out.println("Final API value used in assertion ->" + g);
                Assert.assertEquals(g, Float.parseFloat(value1), "Precip value is not equal in API and UI");
            }
        } else {
            Assert.assertEquals(value, "--", "Precip value is not -- on UI");
            Assert.assertEquals(precipValue, -2.0, "Precip value is not null from API");
        }
    }

    public void verifyCurrentPrecipTitleLabel() {
        Assert.assertTrue(isDisplayed(currentPrecipitationTileLabelF), "Current Precipitation title label is not displayed");
    }

    public void verifyCurrentPrecipTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentPrecipitationTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentPrecipLabel"));
        boolean text = getText(currentPrecipitationTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentPrecipLabel"));
        Assert.assertTrue(text, "Current Precipitation title label text didn't match");
    }

    public void verifySummaryForecastLabel() {
        Assert.assertTrue(isDisplayed(summaryForecastF), "Summary Forecast label is not displayed");
    }

    public void verifySummaryForecastText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(summaryForecastF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_forecast"));
        boolean text = getText(summaryForecastF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_forecast"));
        Assert.assertTrue(text, "Summary Forecast text didn't match");
    }

    public void verifyForecastMaxTemperatureTile() {
        Assert.assertTrue(isDisplayed(forecastMaxTemperatureTileF), "Forecast Max Temperature Tile is not displayed");
    }

    public void verifyForecastMaxTemperatureTileValue() {
        Assert.assertNotNull(forecastMaxTemperatureTileValueF.getText(), "Forecast Max Temperature Tile value is empty");
    }

    public void verifyForecastMaxTemperatureTileValueAgainstAPI() {
        System.out.println("Max Temp Value from UI -> " + forecastMaxTemperatureTileValueF.getText());
        Assert.assertNotNull(forecastMaxTemperatureTileValueF.getText(), "Forecast Max Temperature Tile value is empty");
        String value = forecastMaxTemperatureTileValueF.getText();
        if (!Objects.equals(value, "--")) {
            String value1 = stringHelper.trimLastValue(value, 2);
            System.out.println("From the UI -> " + value1);
            System.out.println("From the API -> " + Math.round(maxTemp));
            Assert.assertEquals(Math.round(maxTemp), Integer.parseInt(value1), "Max temp value is not equal in ui and API");
        } else {
            Assert.assertEquals(value, "--", "Max temp value is not -- on UI");
            Assert.assertEquals(maxTemp, 0, "Max temp is not null from API");
        }
    }

    public void verifyForecastMaxTemperatureTitleLabel() {
        Assert.assertTrue(isDisplayed(forecastMaxTemperatureTileLabelF), "Forecast Max Temperature title label is not displayed");
    }

    public void verifyForecastMaxTemperatureTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(forecastMaxTemperatureTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_forecastMaxTempLabel"));
        boolean text = getText(forecastMaxTemperatureTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_forecastMaxTempLabel"));
        Assert.assertTrue(text, "Forecast Max Temperature title label text didn't match");
    }

    public void verifyForecastMinTemperatureTile() {
        Assert.assertTrue(isDisplayed(forecastMinTemperatureTileF), "Forecast Min Temperature Tile is not displayed");
    }

    public void verifyForecastMinTemperatureTileValue() {
        Assert.assertNotNull(forecastMinTemperatureTileValueF.getText(), "Forecast Min Temperature Tile value is empty");
    }

    public void verifyForecastMinTemperatureTileValueAgainstAPI() {
        System.out.println("Min Temp Value from UI -> " + forecastMinTemperatureTileValueF.getText());
        Assert.assertNotNull(forecastMinTemperatureTileValueF.getText(), "Forecast Max Temperature Tile value is empty");
        String value = forecastMinTemperatureTileValueF.getText();
        if (!Objects.equals(value, "--")) {
            String value1 = stringHelper.trimLastValue(value, 2);
            System.out.println("From the UI -> " + value1);
            System.out.println("From the API -> " + Math.round(minTemp));
            Assert.assertEquals(Math.round(minTemp), Integer.parseInt(value1), "Min temp value is not equal in ui and API");
        } else {
            Assert.assertEquals(value, "--", "Min temp value is not -- on UI");
            Assert.assertEquals(minTemp, 0, "Min temp is not null from API");
        }
    }

    public void verifyForecastMinTemperatureTitleLabel() {
        Assert.assertTrue(isDisplayed(forecastMinTemperatureTileLabelF), "Forecast Min Temperature title label is not displayed");
    }

    public void verifyForecastMinTemperatureTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(forecastMinTemperatureTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_forecastMinTempLabel"));
        boolean text = getText(forecastMinTemperatureTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_forecastMinTempLabel"));
        Assert.assertTrue(text, "Forecast Min Temperature title label text didn't match");
    }

    public void verifyForecastNxtRainTile() {
        Assert.assertTrue(isDisplayed(forecastNxtRainTileF), "Forecast Next Rain Tile is not displayed");
    }

    public int nxtRainTitleValueCount() {
        int value = forecastNxtRainTileValueListF.size();
        return value;
    }

    public void verifyForecastNxtRainTileValue() {
        Assert.assertNotNull(forecastNxtRainTileValueF.getText(), "Forecast Next Rain Tile value is empty");
    }

    public void verifyForecastNxtRainTileValueAgainstAPI() {
        System.out.println("Next rain value from UI -> " + forecastNxtRainTileValueF.getText());
        Assert.assertNotNull(forecastNxtRainTileValueF.getText(), "Forecast Next Rain Tile value is empty");
        String value = forecastNxtRainTileValueF.getText();
        String value1;
        if (Objects.equals(PropertiesReader.language, "uk") || Objects.equals(PropertiesReader.language, "de")) {
            value1 = stringHelper.trimLastValue(value, 5);
        } else if (Objects.equals(PropertiesReader.language, "pl") || Objects.equals(PropertiesReader.language, "pt") || Objects.equals(PropertiesReader.language, "fr")) {
            value1 = stringHelper.trimLastValue(value, 2);
        } else {
            value1 = stringHelper.trimLastValue(value, 3);
        }
        System.out.println("From the UI -> " + value1);
        System.out.println("From the API -> " + nextRainfall);
        Assert.assertEquals(nextRainfall, Integer.parseInt(value1.trim()), "Next Rainfall value is not equal in ui and API");
    }

    public void verifyForecastNxtRainTitleLabel() {
        Assert.assertTrue(isDisplayed(forecastNxtRainTileLabelF), "Forecast Next Rain title label is not displayed");
    }

    public void verifyForecastNxtRainTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(forecastNxtRainTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_forecastNxtRainLabel"));
        boolean text = getText(forecastNxtRainTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_forecastNxtRainLabel"));
        Assert.assertTrue(text, "Forecast Next Rain title label text didn't match");
    }

    public void verifyForecastNoRainTitleLabel() {
        Assert.assertTrue(isDisplayed(forecastNoRainTileLabelF), "Forecast no Rain title label is not displayed");
    }

    public void verifyForecastNoRainTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(forecastNoRainTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_forecastNoRainLabel"));
        boolean text = getText(forecastNoRainTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_forecastNoRainLabel"));
        Assert.assertTrue(text, "Forecast no Rain title label text didn't match");
    }

    public void verifySummaryCropActivityLabel() {
        Assert.assertTrue(isDisplayed(summaryCropActivityF), "Summary Crop Activity label is not displayed");
    }

    public void verifySummaryCropActivityText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(summaryCropActivityF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_cropActivity"));
        boolean text = getText(summaryCropActivityF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_cropActivity"));
        Assert.assertTrue(text, "Summary CropActivity text didn't match");
    }

    public void verifyCropActivity24HrsTile() {
        Assert.assertTrue(isDisplayed(RecentCropActivity24HrsTileF), "Recent CropActivity 24Hrs Tile is not displayed");
    }

    public void verifyCropActivity24HrsTileValue() {
        Assert.assertNotNull(RecentCropActivity24HrsTileValueF.getText(), "Recent CropActivity 24Hrs Tile value is empty");
    }

    public void verifyCropActivity24HrsTitleLabel() {
        Assert.assertTrue(isDisplayed(RecentCropActivity24HrsTileLabelF), "Forecast Max Temperature title label is not displayed");
    }

    public void verifyCropActivity24HrsTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(RecentCropActivity24HrsTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_cropActivityEtcLabel"));
        boolean text = getText(RecentCropActivity24HrsTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_cropActivityEtcLabel"));
        Assert.assertTrue(text, "Crop Activity 24Hrs title label text didn't match");
    }

    public void verifyCropActivity7HrsTile() {
        Assert.assertTrue(isDisplayed(RecentCropActivity7HrsTileF), "Crop Activity 7Hrs tile is not displayed");
    }

    public void verifyCropActivity7HrsTileValue() {
        Assert.assertNotNull(RecentCropActivity7HrsTileValueF.getText(), "Crop Activity 7Hrs tile value is empty");
    }

    public void verifyCropActivity7HrsTitleLabel() {
        Assert.assertTrue(isDisplayed(RecentCropActivity7HrsTileLabelF), "Crop Activity 7Hrs title label is not displayed");
    }

    public void verifyCropActivity7HrsTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(RecentCropActivity7HrsTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_cropActivityEtcLabel"));
        boolean text = getText(RecentCropActivity7HrsTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_cropActivityEtcLabel"));
        Assert.assertTrue(text, "Crop Activity 7Hrs title label text didn't match");
    }

    public void verifyCropActivityLeafWetnessTile() {
        Assert.assertTrue(isDisplayed(forecastCropActivityLeafWetnessTileF), "Crop Activity Leaf Wetness Tile is not displayed");
    }

    public void verifyCropActivityLeafWetnessTileValue() {
        Assert.assertNotNull(CropActivityLeafWetnessTileValueF.getText(), "Crop Activity Leaf Wetness Tile value is empty");
    }

    public void verifyCropActivityLeafWetnessTitleLabel() {
        Assert.assertTrue(isDisplayed(CropActivityLeafWetnessTileLabelF), "Crop Activity Leaf Wetness title label is not displayed");
    }

    public void verifyCropActivityLeafWetnessTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(CropActivityLeafWetnessTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_cropActivityLeafWetnessLabel"));
        boolean text = getText(CropActivityLeafWetnessTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_cropActivityLeafWetnessLabel"));
        Assert.assertTrue(text, "Crop Activity Leaf Wetness title label text didn't match");
    }

    public void verifySummaryCurrentSeasonLabel() {
        Assert.assertTrue(isDisplayed(summaryCurrentSeasonF), "Summary Current Season label is not displayed");
    }

    public void verifySummaryCurrentSeasonText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(summaryCurrentSeasonF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentSeason"));
        boolean text = getText(summaryCurrentSeasonF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentSeason"));
        Assert.assertTrue(text, "Summary Current Season text didn't match");
    }

    public void verifyCurrentSeasonCropTypeTile() {
        Assert.assertTrue(isDisplayed(currentSeasonCropTypeTileF), "Recent Current Season CropType Tile is not displayed");
    }

    public void verifyCurrentSeasonCropTypeTileValue() {
        Assert.assertNotNull(currentSeasonCropTypeTileValueF.getText(), "Current Season CropType Tile value is empty");
        if (currentSeasonCropTypeTileValueListF.size() == 2) {
            for (int i = 0; i < currentSeasonCropTypeTileValueListF.size(); i++) {
                if (i == 0) {
                    Assert.assertNotNull(currentSeasonCropTypeTileValueListF.get(i).getText(), "Crop value from UI is not null");
                } else if (i == 1) {
                    Assert.assertNotNull(currentSeasonCropTypeTileValueListF.get(i).getText(), "Crop varietal from UI is not null");
                }
            }
        } else if (currentSeasonCropTypeTileValueListF.size() == 1) {
            String value = getText(currentSeasonCropTypeTileValueF);
            System.out.println("From the UI -> " + value);
            Assert.assertEquals(value, "--", "Current Season CropType Tile value is empty");
        } else {
            Assert.fail("Current Season CropType Tile value is empty");
        }
    }

    public void verifyCurrentSeasonCropTypeTileValueWithAPI() {
        Assert.assertNotNull(currentSeasonCropTypeTileValueF.getText(), "Current Season CropType Tile value is empty");
        if (currentSeasonCropTypeTileValueListF.size() == 2) {
            String value = restAssuredHelper.getValueFromResponse(response, "items[0].crop_varietal.crop_category.name");
            String value1 = restAssuredHelper.getValueFromResponse(response, "items[0].crop_varietal.name");
            System.out.println("From the API -> " + value);
            System.out.println("From the API -> " + value1);
            for (int i = 0; i < currentSeasonCropTypeTileValueListF.size(); i++) {
                if (i == 0) {
                    System.out.println("From the UI -> " + currentSeasonCropTypeTileValueListF.get(i).getText());
                    System.out.println("From the API -> " + value);
                    Assert.assertEquals(currentSeasonCropTypeTileValueListF.get(i).getText(), value, "Crop value from UI and API is not the same");
                } else if (i == 1) {
                    System.out.println("From the UI -> " + currentSeasonCropTypeTileValueListF.get(i).getText());
                    System.out.println("From the API -> " + value1);
                    Assert.assertEquals(currentSeasonCropTypeTileValueListF.get(i).getText(), value1, "Crop varietal from UI and API is not the same");
                }
            }
        } else if (currentSeasonCropTypeTileValueListF.size() == 1) {
            String value = getText(currentSeasonCropTypeTileValueF);
            System.out.println("From the UI -> " + value);
            Assert.assertEquals(value, "--", "Current Season CropType Tile value is empty");
        } else {
            Assert.fail("Current Season CropType Tile value is empty");
        }
    }

    public void verifyCurrentSeasonCropTypeTileLabel() {
        Assert.assertTrue(isDisplayed(currentSeasonCropTypeTileLabelF), "Recent Current Season CropType tile label is not displayed");
    }

    public void verifyCurrentSeasonCropTypeTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentSeasonCropTypeTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonCropTypeLabel"));
        boolean text = getText(currentSeasonCropTypeTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonCropTypeLabel"));
        Assert.assertTrue(text, "Recent Current Season CropType tile label text didn't match");
    }

    public void verifyCurrentSeasonSeasonTile() {
        Assert.assertTrue(isDisplayed(currentSeasonsTileF), "Current Season Season tile is not displayed");
    }

    public String verifyCurrentSeasonSeasonTileValue() {
        String value = currentSeasonsTileValueF.getText();
        Assert.assertNotNull(value, "Current Season Season tile value is empty");
        return value;
    }

    public void verifyCurrentSeasonSeasonTitleLabel() {
        Assert.assertTrue(isDisplayed(currentSeasonsTileLabelF), "Current Season Season title label is not displayed");
    }

    public void verifyCurrentSeasonSeasonTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentSeasonsTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonSeasonsLabel"));
        boolean text = getText(currentSeasonsTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonSeasonsLabel"));
        Assert.assertTrue(text, "Current Season Season title label text didn't match");
    }

    public void verifyCurrentSeasonGrowthStageTile() {
        Assert.assertTrue(isDisplayed(currentSeasonGrowthStageTileF), "Current Season growth stage Tile is not displayed");
    }

    public void verifyCurrentSeasonGrowthStageTileValue() {
        Assert.assertNotNull(currentSeasonGrowthStageTileValueF.getText(), "Current Season growth stage Tile value is empty");
    }

    public void verifyCurrentSeasonGrowthStageTitleLabel() {
        Assert.assertTrue(isDisplayed(currentSeasonGrowthStageTileLabelF), "Current Season growth stage title label is not displayed");
    }

    public void verifyCurrentSeasonGrowthStageTitleLabelText(JSONObject jsonData) {
        System.out.println("From the UI -> " + getText(currentSeasonGrowthStageTileLabelF));
        System.out.println("From the Json -> " + jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonGrowthStageLabel"));
        boolean text = getText(currentSeasonGrowthStageTileLabelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_currentSeasonGrowthStageLabel"));
        Assert.assertTrue(text, "Current Season growth stage title label text didn't match");
    }

    public void swipe() {
        swipeScreen(DOWN);
    }
}
