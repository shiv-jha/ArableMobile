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
import java.util.Objects;

import static pages_mobile.PageBase.Direction.DOWN;
import static support_mobile.World.*;

public class ListWeatherPage extends PageBase {

    private String siteNameAfterSort;

    public ListWeatherPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='GEN-NavListBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "GEN-NavListBtn")
    private MobileElement listNavigationBtnF;

    @AndroidFindBy(accessibility = "LWE-WeatherAndWaterDropdownOptSelected")
    @iOSXCUITFindBy(accessibility = "LWE-WeatherAndWaterDropdown")
    private MobileElement listDropdownF;

    @AndroidFindBy(accessibility = "LCI-LocationSortBtn")
    @iOSXCUITFindBy(accessibility = "LCI-LocationSortBtn")
    private MobileElement weatherSiteSortF;

    @AndroidFindBy(accessibility = "LWE-SearchBtn")
    @iOSXCUITFindBy(accessibility = "LWE-SearchBtn")
    private MobileElement weatherSearchF;

    @AndroidFindBy(accessibility = "LWE-HamburgerBtn")
    @iOSXCUITFindBy(accessibility = "LWE-HamburgerBtn")
    private MobileElement weatherBurgerBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='LWE-CurrentTabBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "LWE-CurrentTabBtn")
    private MobileElement weatherCurrentBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='LWE-DailyTabBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "LWE-DailyTabBtn")
    private MobileElement weatherDailyBtnF;

    @AndroidFindBy(accessibility = "LCI-LocationName")
    @iOSXCUITFindBy(accessibility = "LCI-LocationDetailsBtn")
    private MobileElement weatherCurrentSiteF;

    @AndroidFindBy(accessibility = "LCI-LocationName")
    @iOSXCUITFindBy(accessibility = "LCI-LocationDetailsBtn")
    private List<MobileElement> weatherSiteListF;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='LCI-LocationName'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private List<MobileElement> weatherFirstSiteF;

    @AndroidFindBy(accessibility = "SMRY-CurrentConditionsLbl")
    @iOSXCUITFindBy(accessibility = "SMRY-CurrentConditionsLbl")
    private MobileElement smCurrentConditionHeaderF;

    @AndroidFindBy(accessibility = "LCI-LocationTodayTotalPrecipValue")
    private MobileElement dailySiteScrollBarF;

    @AndroidFindBy(accessibility = "LDI-LocationName")
    @iOSXCUITFindBy(accessibility = "LDI-LocationDetailsBtn")
    private MobileElement weatherDailySiteF;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='LDI-LocationName'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private List<MobileElement> weatherDailyFirstSiteListF;

    @AndroidFindBy(accessibility = "SRCH-SearchInputTxt")
    @iOSXCUITFindBy(accessibility = "SRCH-SearchInputTxt")
    private MobileElement searchInputTxtF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='SRCH-CancelSearchBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "SRCH-CancelSearchBtn")
    private MobileElement searchCancelF;

    @AndroidFindBy(accessibility = "SRCH-TextMsg")
    @iOSXCUITFindBy(accessibility = "SRCH-TextMsg")
    private MobileElement searchMsgF;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='SRCH-LocationName']")
    @iOSXCUITFindBy(accessibility = "SRCH-LocationName")
    private MobileElement searchResultF;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='SRCH-LocationName']")
    @iOSXCUITFindBy(accessibility = "SRCH-LocationDetailsBtn")
    private MobileElement searchResultClickableF;

    public void navigateToList() {
        click(listNavigationBtnF);
    }

    public void verifyNavigationListText(JSONObject jsonData) {
        System.out.println(listNavigationBtnF.getText());
        System.out.println(jsonReader.getValueFromKey(jsonData, "List"));
        boolean text = getText(listNavigationBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "List"));
        Assert.assertTrue(text, "List text didn't match");
    }

    public void verifyListDropdown() {
        //Assert.assertTrue(isDisplayed(listDropdownF), "Dropdown list is not displayed");
        Assert.assertTrue(isEnabled(listDropdownF), "Dropdown list is not enabled");
    }

    public void verifyListDropdownText(JSONObject jsonData) {
        System.out.println(listDropdownF.getText());
        System.out.println(jsonReader.getValueFromKey(jsonData, "List_weather"));
        boolean text = getText(listDropdownF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "List_weather"));
        Assert.assertTrue(text, "List dropdown text didn't match");
    }

    public void verifyListSort() {
        Assert.assertTrue(isDisplayed(weatherSiteSortF), "Site sort is not displayed");
        Assert.assertTrue(isEnabled(weatherSiteSortF), "Site sort is not enabled");
    }

    public void verifyListSearch() {
        Assert.assertTrue(isDisplayed(weatherSearchF), "Search is not displayed");
        Assert.assertTrue(isEnabled(weatherSearchF), "Search is not enabled");
    }

    public void verifyListHamBurger() {
        Assert.assertTrue(isDisplayed(weatherBurgerBtnF), "HamBurger is not displayed");
        Assert.assertTrue(isEnabled(weatherBurgerBtnF), "HamBurger is not enabled");
    }

    public void verifyWeatherCurrentTabText(JSONObject jsonData) {
        System.out.println(weatherCurrentBtnF.getText());
        System.out.println(jsonReader.getValueFromKey(jsonData, "List_now"));
        boolean text = getText(weatherCurrentBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "List_now"));
        Assert.assertTrue(text, "List current text didn't match");
    }

    public void verifyWeatherCurrentTab() {
        Assert.assertTrue(isDisplayed(weatherCurrentBtnF), "Current is not displayed");
        Assert.assertTrue(isEnabled(weatherCurrentBtnF), "Current is not enabled");
    }

    public void verifyWeatherDailyTabText(JSONObject jsonData) {
        System.out.println(weatherDailyBtnF.getText());
        System.out.println(jsonReader.getValueFromKey(jsonData, "List_timeline"));
        boolean text = getText(weatherDailyBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "List_timeline"));
        Assert.assertTrue(text, "List daily text didn't match");
    }

    public void verifyWeatherDailyTab() {
        Assert.assertTrue(isDisplayed(weatherDailyBtnF), "Daily is not displayed");
        Assert.assertTrue(isEnabled(weatherDailyBtnF), "Daily is not enabled");
    }

    public void verifyWeatherCurrentSiteList(String role) {
        if (weatherFirstSiteF.size() != 0) {
            Assert.assertTrue(isDisplayed(weatherCurrentSiteF), "Site list is not displayed");
            Assert.assertTrue(isEnabled(weatherCurrentSiteF), "Site list is not enabled");
        }
    }

    public void clickFirstSiteOnCurrentList() {
        uiSiteName = getText(weatherCurrentSiteF);
        click(weatherCurrentSiteF);
    }

    public void clickOnSiteFromCurrentList() {
        uiSiteName = getText(weatherCurrentSiteF);
        for (MobileElement mobileElement : weatherSiteListF) {
            if (Objects.equals(mobileElement.getText(), siteName)) {
                click(mobileElement);
                break;
            }
        }
    }

    public void verifySiteSummaryPage() {
        Assert.assertTrue(isDisplayed(smCurrentConditionHeaderF), "Site summary current conditions field is not displayed");
    }

    public void refreshCurrentWeatherPageManually() {
        waitForVisibility(weatherCurrentSiteF, 6, 1);
        swipeScreen(DOWN);
    }

    public void verifySiteListLoadTimeWeatherCurrentTab() {
        long endTime = 0;
        long startTime = stringHelper.getTimeInMilliSeconds();
        if (weatherFirstSiteF.size() != 0) {
            endTime = stringHelper.getTimeInMilliSeconds();
            System.out.println("Found the weather site list --->");
        } else {
            //Assert.assertTrue(alertsNoAlertsMsgF.isDisplayed(), "No alerts msg text didn't match");
            endTime = stringHelper.getTimeInMilliSeconds();
            System.out.println("Didn't Found the weather site list ---> ");
        }
        float value = (float) (endTime - startTime);
        float actualValue = stringHelper.convertTimeInSeconds(value);
        System.out.println("Actual value is -> " + actualValue);
        Assert.assertTrue(actualValue < 5, "List Weather page loading time is equal or more than 5 sec ");
    }

    public void refreshDailyWeatherPageManually() {
        waitForVisibility(weatherDailySiteF, 6, 1);
        swipeScreen(DOWN);
    }

    public void verifySiteListOnWeatherDailyTab() {
        long endTime = 0;
        long startTime = stringHelper.getTimeInMilliSeconds();
       if (weatherDailyFirstSiteListF.size() != 0) {
            endTime = stringHelper.getTimeInMilliSeconds();
            System.out.println("Found the weather site list --->");
        } else {
            //Assert.assertTrue(alertsNoAlertsMsgF.isDisplayed(), "No alerts msg text didn't match");
            endTime = stringHelper.getTimeInMilliSeconds();
            System.out.println("Didn't Found the weather site list ---> ");
        }
        float value = (float) (endTime - startTime);
        float actualValue = stringHelper.convertTimeInSeconds(value);
        System.out.println("Actual value is -> " + actualValue);
        Assert.assertTrue(actualValue < 5, "List Weather daily page loading time is equal or more than 5 sec ");
    }

    public void clickDailyTab() {
        click(weatherDailyBtnF);
        Assert.assertTrue(isDisplayed(weatherDailySiteF), "Daily site list is not displayed");
        if (PropertiesReader.device_type.equalsIgnoreCase("android")) {
            Assert.assertTrue(isDisplayed(dailySiteScrollBarF), "Daily site scroll bar is not displayed");
        }
    }

    public void verifyDailySite() {
        if (weatherDailyFirstSiteListF.size() != 0) {
            System.out.println(weatherDailyFirstSiteListF.size());
            Assert.assertTrue(isDisplayed(weatherDailySiteF), "Daily site list is not displayed");
            Assert.assertTrue(isEnabled(weatherDailySiteF), "Daily site list is not enabled");
        }
    }

    public void clickDailySite() {
        click(weatherDailySiteF);
        Assert.assertTrue(isDisplayed(smCurrentConditionHeaderF), "Site summary current conditions field is not displayed");
    }

    public void getSiteName(String tab) {
        if (tab.equalsIgnoreCase("current")) {
            waitForVisibility(weatherCurrentSiteF, 6, 1);
            siteName = getText(weatherCurrentSiteF);
        } else {
            waitForVisibility(weatherDailySiteF, 6, 1);
            siteName = getText(weatherDailySiteF);
        }
        System.out.println("Site name is ---> " + siteName);
    }

    public void clickSortBtn() {
        click(weatherSiteSortF);
    }

    public void getSiteNameAfterSort(String tab) {
        if (tab.equalsIgnoreCase("current")) {
            if (PropertiesReader.device_type.equalsIgnoreCase("android")) {
                waitOfTillInvisibilityOfText("LCI-LocationName", siteName, 10, 1);
            } else {
                waitOfTillInvisibilityOfText("LCI-LocationDetailsBtn", siteName, 10, 1);
            }
            siteNameAfterSort = getText(weatherCurrentSiteF);
            Assert.assertNotEquals(siteName, siteNameAfterSort, "Site name is same after sorting the site");
        } else {
            if (PropertiesReader.device_type.equalsIgnoreCase("android")) {
                waitOfTillInvisibilityOfText("LDI-LocationName", siteName, 10, 1);
            } else {
                waitOfTillInvisibilityOfText("LDI-LocationDetailsBtn", siteName, 10, 1);
            }
            siteNameAfterSort = getText(weatherDailySiteF);
            Assert.assertNotEquals(siteName, siteNameAfterSort, "Site name is same after sorting the site");
        }
        System.out.println("Site name1 is ---> " + siteNameAfterSort);
    }

    public void clickSearchButton() {
        weatherSearchF.click();
    }

    public void verifySearchPageFields(JSONObject jsonData) {
        Assert.assertTrue(searchInputTxtF.isDisplayed(), "Search input text is not displayed");
        System.out.println(searchInputTxtF.getText());
        boolean text = getText(searchInputTxtF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Search-InputBoxTxt"));
        Assert.assertTrue(text, "Search input text is not displayed");
        System.out.println(searchCancelF.getText());
        boolean text1 = getText(searchCancelF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Settings_Cancel"));
        Assert.assertTrue(text1, "Search cancel text is not displayed");
        System.out.println(searchMsgF.getText());
        boolean text2 = getText(searchMsgF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Search-searchText"));
        Assert.assertTrue(text2, "Search message text is not displayed");
    }

    public void clickSearchCancelButton() {
        Assert.assertTrue(searchCancelF.isDisplayed(), "Search cancel text is not displayed");
        searchCancelF.click();
        Assert.assertTrue(isDisplayed(weatherSiteSortF), "Site sort is not displayed");
        Assert.assertTrue(isDisplayed(weatherCurrentBtnF), "Current is not displayed");
    }

    public void getFirstSiteName() {
        siteName = getText(weatherCurrentSiteF);
    }

    public void searchByEnteringSiteName() {
        Assert.assertTrue(searchInputTxtF.isDisplayed(), "Search input text is not displayed");
        searchInputTxtF.sendKeys(siteName);
    }

    public void verifySearchResult() {
        Assert.assertTrue(searchResultF.isDisplayed(), "Search result is not displayed");
        Assert.assertEquals(searchInputTxtF.getText(), searchResultF.getText(), "Search result site name is not correct");
    }

    public void clickOnSearchResult() {
        Assert.assertTrue(searchInputTxtF.isDisplayed(), "Search input text is not displayed");
        searchInputTxtF.sendKeys(siteName);
        waitForVisibility(searchResultF, 10, 1);
        Assert.assertTrue(searchResultF.isDisplayed(), "Search result is not displayed");
        searchResultClickableF.click();
        if (PropertiesReader.device_type.equalsIgnoreCase("ios")) {
            searchResultClickableF.click();
        }
    }
}
