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

import java.util.List;

import static support_mobile.World.*;

public class AlertPage extends PageBase {

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"GEN-NavAlertsBtn\"]")
	// @iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private MobileElement alertMenu;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ALERT-FilterBtn\"]")
	// @iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private MobileElement alertFilterBtn;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ALERT-FilterByWeatherOpt\"]")
	// @iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private MobileElement alertFilterByWeather;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ALERT-FilterCancelBtn\"]")
	// @iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private MobileElement alertFilterCancel;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	// @iOSXCUITFindBy(accessibility = "WELC-CloseButtonTop")
	private List<MobileElement> alertList;

	public AlertPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void verifyAlertFilterByWeather() {
		alertMenu.click();
		waitForVisibility(alertFilterBtn, 30, 1);
		alertFilterBtn.click();
		waitForVisibility(alertFilterByWeather, 30, 1);
		alertFilterByWeather.click();
		if (alertList.size() != 0) {
			Assert.assertTrue(isDisplayed(alertList.get(0)),
					"alert list is not displayed");
		}
		for (int i = 1; i < alertList.size(); i++) {
			String uiAlert = alertList.get(i).getText();
			Assert.assertTrue(
					uiAlert.startsWith("Heat")
							|| uiAlert.startsWith("Rainfall")
							|| uiAlert.startsWith("Frost"),
					"Alert filteration did not work for weather");
		}
	}
}
