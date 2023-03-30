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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static support_mobile.World.*;

public class MapPage extends PageBase {

	private String welcomeSitesValue;
	private String actualValue;

	@AndroidFindBy(accessibility = "WELC-CloseBtnBottom")
	@iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private MobileElement welcomeCloseBthF;

	@AndroidFindBy(accessibility = "MAP-MeasuresDropdownText")
	@iOSXCUITFindBy(accessibility = "MAP-MeasuresDropdown")
	private MobileElement mapDropDownDefaultF;

	@AndroidFindBy(accessibility = "MAP-ShowAllMarkersBtn")
	@iOSXCUITFindBy(accessibility = "MAP-ShowAllMarkersBtn")
	private MobileElement mapShowMarkersF;

	@AndroidFindBy(accessibility = "MAP-CenterMapBtn")
	@iOSXCUITFindBy(accessibility = "MAP-CenterMapBtn")
	private MobileElement mapCenterBtnF;

	@AndroidFindBy(accessibility = "MAP-MeasuresColorBarUnits")
	// @iOSXCUITFindBy(accessibility = "MAP-MeasuresColorBarUnits")
	private MobileElement barMeasurementUnitF;

	@AndroidFindBy(accessibility = "MAP-MeasuresColorBarUnitsGDD")
	// @iOSXCUITFindBy(accessibility = "MAP-MeasuresColorBarUnitsGDD")
	private MobileElement barMeasurementUnitGDDF;

	@AndroidFindBy(accessibility = "MAP-MeasuresColorBar")
	// @iOSXCUITFindBy(accessibility = "MAP-MeasuresColorBar")
	private MobileElement measureColourBarF;

	@AndroidFindBy(accessibility = "MAP-MeasuresColorBarScaleLowerLimit")
	// @iOSXCUITFindBy(accessibility = "MAP-MeasuresColorBarScaleLowerLimit")
	private MobileElement barFirstValueF;

	@AndroidFindBy(accessibility = "MAP-MeasuresColorBarScaleUpperLimit")
	// @iOSXCUITFindBy(accessibility = "MAP-MeasuresColorBarScaleUpperLimit")
	private MobileElement barLastValueF;

	@AndroidFindBy(accessibility = "Google Map")
	@iOSXCUITFindBy(accessibility = "Google Maps")
	private MobileElement googleMapF;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='GEN-NavMapBtn']/android.widget.TextView")
	@iOSXCUITFindBy(accessibility = "GEN-NavMapBtn")
	private MobileElement mapNavigationBtnF;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'MAP-MeasuresDropdown')]/android.view.ViewGroup[2]/android.widget.TextView")
	@iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'MAP-MeasuresDropdown'")
	private List<MobileElement> mapDropdownListF;

	@AndroidFindBy(accessibility = "MAP-MeasuresDropdownHumidityOpt")
	@iOSXCUITFindBy(accessibility = "MAP-MeasuresDropdownHumidityOpt")
	private MobileElement mapDropdownHumidityF;

	ArrayList<String> mapOptions = new ArrayList<String>(Arrays.asList(
			"Temperature", "Humidity", "Solar Radiation", "GDD",
			"Chlorophyll Index", "NDVI", "Precipitation (Since 12AM)",
			"Precipitation (Last 10 Days)", "ET (Last 10 Days)",
			"Daily Evapotranspiration (ETc)", "Wind", "Soil Moisture",
			"Spray Window"));

	public MapPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void verifyWelcomeSitesPopup() {
		try {
			waitForVisibility(welcomeCloseBthF, 10, 1);
		} catch (Exception e) {
		}
		Assert.assertTrue(isDisplayed(welcomeCloseBthF),
				"Welcome to sites cancel button is not displayed");
	}

	public void closeWelcomePopup() {
		try {
			waitForVisibility(welcomeCloseBthF, 30, 1);
		} catch (Exception e) {
		}
		welcomeSitesValue = getText(welcomeCloseBthF);
		click(welcomeCloseBthF);
	}

	public void verifyWelcomeSitesCloseText(JSONObject jsonData) {
		if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
			System.out.println(welcomeSitesValue);
			System.out.println(jsonReader
					.getValueFromKey(jsonData, "WTS_close"));
			boolean text = welcomeSitesValue.contains(jsonReader
					.getValueFromKey(jsonData, "WTS_close"));
			Assert.assertTrue(text,
					"Welcome to sites cancel button text didn't match");
		}
	}

	public void verifyMapDropDown() {
		Assert.assertTrue(isDisplayed(mapDropDownDefaultF),
				"Welcome to sites cancel button is not displayed");
		clickMapDropDown();
		verifyListInMapDropDownAndPrint();
	}

	public void mapDefaultDropDownText(JSONObject jsonData) {
		System.out.println(getText(mapDropDownDefaultF));
		System.out.println(jsonReader.getValueFromKey(jsonData, "temperature"));
		boolean text = getText(mapDropDownDefaultF).equalsIgnoreCase(
				jsonReader.getValueFromKey(jsonData, "temperature"));
		Assert.assertTrue(text, "Map temperature title text didn't match");
	}

	public void verifyMapShowAllMarkersBtn() {
		Assert.assertTrue(isDisplayed(mapShowMarkersF),
				"Map all markers button is not displayed");
		Assert.assertTrue(isEnabled(mapShowMarkersF),
				"Map all markers button is not enabled");
	}

	public void verifyMapCenterBtn() {
		Assert.assertTrue(isDisplayed(mapCenterBtnF),
				"Map center button is not displayed");
		Assert.assertTrue(isEnabled(mapCenterBtnF),
				"Map center button is not enabled");
	}

	public void verifyMapMeasureUnits() {
		Assert.assertTrue(isDisplayed(barMeasurementUnitF),
				"Map measure unit value is not displayed");
	}

	public void verifyMeasuresColorBar() {
		Assert.assertTrue(isDisplayed(measureColourBarF),
				"measure Colour Bar is not displayed");
	}

	public void getInitialUnits(String var) {
		if (var.equals("gdd")) {
			initialUnits = barMeasurementUnitGDDF.getText();
		} else {
			initialUnits = barMeasurementUnitF.getText();
		}
	}

	public void getUpdatedUnits(String var) {
		if (var.equals("gdd")) {
			updatedUnits = barMeasurementUnitGDDF.getText();
		} else {
			updatedUnits = barMeasurementUnitF.getText();
		}
	}

	public void clickMapNavigation() {
		click(mapNavigationBtnF);
	}

	public void verifyUnitsOnMap(String var) {
		System.out.println(initialUnits);
		System.out.println(updatedUnits);
		if (var.equals("gdd")) {
			Assert.assertTrue(isDisplayed(barMeasurementUnitGDDF),
					"Measurement units is not displayed");
			Assert.assertNotEquals(initialUnits, updatedUnits,
					"Measurements are equal before and after");
		} else {
			Assert.assertTrue(isDisplayed(barMeasurementUnitF),
					"Measurement units is not displayed");
			Assert.assertNotEquals(initialUnits, updatedUnits,
					"Measurements are equal before and after");
		}
	}

	public void verifyBarUnits(String var, JSONObject jsonData) {
		if (var.equals("temperature")) {
			if (barMeasurementUnitF.getText()
					.equals(jsonReader.getValueFromKey(jsonData,
							"Settings_fahrenheit"))) {
				Assert.assertEquals(barFirstValueF.getText(), "-10");
				Assert.assertEquals(barLastValueF.getText(), "140");
			} else if (barMeasurementUnitF.getText().equalsIgnoreCase(
					jsonReader.getValueFromKey(jsonData, "Settings_celsius"))) {
				Assert.assertEquals(barFirstValueF.getText(), "-23");
				Assert.assertEquals(barLastValueF.getText(), "60");
			} else {
				Assert.fail("Temperature units didn't match");
			}
		} else if (var.equals("humidity")) {
			if (barMeasurementUnitF.getText().equals("%")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "100");
			} else {
				Assert.fail("Humidity units didn't match");
			}
		} else if (var.equals("solar")) {
			System.out.println("Solar ---> " + barMeasurementUnitF.getText());
			if (barMeasurementUnitF.getText().equals("W/mÂ²")) {
				System.out.println(barFirstValueF.getText());
				System.out.println(barLastValueF.getText());
				Assert.assertEquals(barFirstValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_dark"));
				Assert.assertEquals(barLastValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_bright"));
			} else if (barMeasurementUnitF.getText().equals("Ð’Ð°Ñ‚/Ð¼Â²")
					&& PropertiesReader.language.equalsIgnoreCase("uk")) {
				System.out.println(barFirstValueF.getText());
				System.out.println(barLastValueF.getText());
				Assert.assertEquals(barFirstValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_dark"));
				Assert.assertEquals(barLastValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_bright"));
			} else {
				Assert.fail("Solar radiation units didn't match");
			}
		} else if (var.equals("gdd")) {
			System.out.println("Gdd ---> "
					+ barMeasurementUnitGDDF.getText().trim());
			if (barMeasurementUnitGDDF.getText().trim()
					.equalsIgnoreCase("(ÂºC)")) {
				String[] splitStr = barMeasurementUnitF.getText().split("\\s+");
				System.out.println(splitStr[0]);
				Assert.assertEquals(splitStr[0],
						jsonReader.getValueFromKey(jsonData, "Map_gdd"));
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "5500");
			} else if (barMeasurementUnitGDDF.getText().trim()
					.equalsIgnoreCase("(ÂºF)")) {
				String[] splitStr = barMeasurementUnitF.getText().split("\\s+");
				System.out.println(splitStr[0]);
				System.out.println(jsonReader.getValueFromKey(jsonData,
						"Map_gdd"));
				Assert.assertEquals(splitStr[0],
						jsonReader.getValueFromKey(jsonData, "Map_gdd"));
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "5500");
			} else {
				Assert.fail("Gdd units didn't match");
			}
		} else if (var.equals("chlor")) {
			if (barMeasurementUnitF.getText().equals("CI")) {
				System.out.println(barFirstValueF.getText());
				System.out.println(barLastValueF.getText());
				Assert.assertEquals(barFirstValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_low"));
				Assert.assertEquals(barLastValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_high"));
			} else {
				Assert.fail("Chlorophyll Index units didn't match");
			}
		} else if (var.equals("ndvi")) {
			if (barMeasurementUnitF.getText().equals("NDVI")) {
				System.out.println(barFirstValueF.getText());
				System.out.println(barLastValueF.getText());
				Assert.assertEquals(barFirstValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_bareEarth"));
				Assert.assertEquals(barLastValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_fullCanopy"));
			} else if (barMeasurementUnitF
					.getText()
					.equals("Ð�Ð’Ð†Ð  (Ð�Ð¾Ñ€Ð¼Ð°Ð»Ñ–Ð·Ð¾Ð²Ð°Ð½Ð¸Ð¹ Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð½Ð¸Ð¹ Ñ–Ð½Ð´ÐµÐºÑ� Ñ€Ð¾Ñ�Ð»Ð¸Ð½Ð½Ð¾Ñ�Ñ‚Ñ–)")
					&& PropertiesReader.language.equalsIgnoreCase("uk")) {
				System.out.println(barFirstValueF.getText());
				System.out.println(barLastValueF.getText());
				Assert.assertEquals(barFirstValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_bareEarth"));
				Assert.assertEquals(barLastValueF.getText(),
						jsonReader.getValueFromKey(jsonData, "Map_fullCanopy"));
			} else {
				Assert.fail("NDVI units didn't match");
			}
		} else if (var.equals("preSince12") || var.equals("preSince10")) {
			if (barMeasurementUnitF.getText().equals("in")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "2.0+");
			} else if (barMeasurementUnitF.getText().equals("mm")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "51+");
			} else {
				Assert.fail("precipitation units didn't match");
			}
		} else if (var.equals("et")) {
			if (barMeasurementUnitF.getText().equals("in")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "8+");
			} else if (barMeasurementUnitF.getText().equals("mm")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "200+");
			} else {
				Assert.fail("et units didn't match");
			}
		} else if (var.equals("daily")) {
			if (barMeasurementUnitF.getText().equals("in")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "0.8+");
			} else if (barMeasurementUnitF.getText().equals("mm")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "20+");
			} else {
				Assert.fail("ETc units didn't match");
			}
		} else if (var.equals("wind")) {
			if (barMeasurementUnitF.getText().equals(
					jsonReader.getValueFromKey(jsonData, "Settings_mph"))) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "80");
			} else if (barMeasurementUnitF.getText().equals(
					jsonReader.getValueFromKey(jsonData, "Settings_kph"))) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "129");
			} else if (barMeasurementUnitF.getText().equals(
					jsonReader.getValueFromKey(jsonData, "Settings_mps"))) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "36");
			} else {
				Assert.fail("Wind units didn't match");
			}
		} else if (var.equals("soilMoisture")) {
			System.out.println("Soil moisture --- "
					+ barMeasurementUnitF.getText());
			if (barMeasurementUnitF.getText().equals("in/ft")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "14.4");
			} else if (barMeasurementUnitF.getText().equals("mm/dm")) {
				Assert.assertEquals(barFirstValueF.getText(), "0");
				Assert.assertEquals(barLastValueF.getText(), "120");
			} else {
				Assert.fail("Soil Moisture units didn't match");
			}
		}
	}

	public void verifyMapNavigationBtnText(JSONObject jsonData) {
		Assert.assertTrue(isDisplayed(mapNavigationBtnF),
				"Map navigation button is not displayed");
		Assert.assertTrue(isEnabled(mapNavigationBtnF),
				"Map navigation button is not enabled");
		System.out.println(getText(mapNavigationBtnF));
		System.out.println(jsonReader.getValueFromKey(jsonData, "Map_barText"));
		boolean text = getText(mapNavigationBtnF).equalsIgnoreCase(
				jsonReader.getValueFromKey(jsonData, "Map_barText"));
		Assert.assertTrue(text, "Map navigation bar title text didn't match");
	}

	public void clickShowMarkAllBtn() {
		Assert.assertTrue(isEnabled(mapShowMarkersF),
				"Show marks button is not enabled");
		click(mapShowMarkersF);
	}

	public void clickMapCenterBtn() {
		Assert.assertTrue(isEnabled(mapCenterBtnF),
				"Show map center button is not enabled");
		click(mapCenterBtnF);
	}

	public void verifyGoogleMap() {
		Assert.assertTrue(isDisplayed(googleMapF),
				"Google map is not displayed");
	}

	public void clickMapDropDown() {
		click(mapDropDownDefaultF);
	}

	public void verifyDropdownHumidityValue() {
		Assert.assertTrue(isDisplayed(mapDropdownHumidityF),
				"Map dropdown humidity field is displayed");
	}

	public void verifyListInMapDropDown(JSONObject jsonData) {
		System.out.println(mapDropdownListF.size());
		if (mapDropdownListF.size() == 0) {
			Assert.fail("Map dropdown options has incorrect value");
		} else {
			for (MobileElement value : mapDropdownListF) {
				if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "temperature"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"temperature"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "humidity"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"humidity"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "solar"))) {
					System.out.println(value.getText());
					Assert.assertTrue(true, "Map dropdown value didn't match");
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"solar"));
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "gdd"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"gdd"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "chlor"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"chlor"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "ndvi"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"ndvi"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "preSince12"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"preSince12"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "preSince10"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"preSince10"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "et"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"et"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "daily"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"daily"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "wind"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"wind"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "soilMoisture"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"soilMoisture"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else if (value.getText().equalsIgnoreCase(
						jsonReader.getValueFromKey(jsonData, "sprayWindow"))) {
					System.out.println(value.getText());
					System.out.println(jsonReader.getValueFromKey(jsonData,
							"sprayWindow"));
					Assert.assertTrue(true, "Map dropdown value didn't match");
				} else {
					Assert.fail("Map dropdown options has incorrect value");
				}
			}
		}
	}

	public void verifyListInMapDropDownAndPrint() {
		System.out.println("list box elements:" + mapDropdownListF.size());
		if (mapDropdownListF.size() == 0) {
			Assert.fail("Map dropdown options has incorrect value");
		} else {
			for (MobileElement dropDownEle : mapDropdownListF) {
				System.out.println("Drop down value: " + dropDownEle.getText());
				Assert.assertTrue(
						mapOptions.contains(dropDownEle.getText()),
						"Map dropdown does not contain-"
								+ dropDownEle.getText());
			}	
		}
	}

	public void getValueFromJson(JSONObject jsonData, String var1) {
		actualValue = jsonReader.getValueFromKey(jsonData, var1);
	}

	public void clickMapDropDownValue() {
		System.out.println(mapDropdownListF.size());
		if (mapDropdownListF.size() == 0) {
			Assert.fail("Map dropdown options has incorrect value");
		} else {
			for (MobileElement value : mapDropdownListF) {
				if (value.getText().equalsIgnoreCase(actualValue)) {
					value.click();
					break;
				}
			}
		}
	}
}
