package pages_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static support_mobile.World.jsonReader;

public class ArableTourPage extends PageBase {

    @AndroidFindBy(accessibility = "TOUR-Title")
    @iOSXCUITFindBy(accessibility = "TOUR-Title")
    private MobileElement arableTourTitleF;

    @AndroidFindBy(accessibility = "TOUR-Description")
    @iOSXCUITFindBy(accessibility = "TOUR-Description")
    private MobileElement tourDescriptionF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-SkipBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-SkipBtn")
    private MobileElement tourSkipBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-StartBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-StartBtn")
    private MobileElement startTourBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-StepSkipBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-StepSkipBtn")
    private MobileElement tourStepSkipBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-StepNextBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-StepNextBtn")
    private MobileElement tourStepNextBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-StepPrevBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-StepPrevBtn")
    private MobileElement tourStepPrevBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TOUR-StepFinishBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TOUR-StepFinishBtn")
    private MobileElement tourStepFinishBtnF;

    @AndroidFindBy(accessibility = "TOUR-StepTitle")
    @iOSXCUITFindBy(accessibility = "TOUR-StepTitle")
    private MobileElement tourMapPageTitleF;

    @AndroidFindBy(accessibility = "TOUR-StepContent")
    @iOSXCUITFindBy(accessibility = "TOUR-StepContent")
    private MobileElement tourMapPageDescF;

    @AndroidFindBy(accessibility = "TOUR-StepCount")
    @iOSXCUITFindBy(accessibility = "TOUR-StepCount")
    private MobileElement tourMapPageCountF;

    public ArableTourPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void verifyStepSkipBtnField() {
        Assert.assertTrue(isDisplayed(tourStepSkipBtnF), "Skip button is not displayed");
    }

    public void verifyStepSkipText(JSONObject jsonData) {
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_skip"));
        System.out.println(getText(tourStepSkipBtnF));
        boolean text = getText(tourStepSkipBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_skip"));
        Assert.assertTrue(text, "Tour skip text didn't match");
    }

    public void verifyPrevBtnField() {
        Assert.assertTrue(isDisplayed(tourStepPrevBtnF), "Prev button is not displayed");
    }

    public void verifyPrevText(JSONObject jsonData) {
        System.out.println(getText(tourStepPrevBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_Prev"));
        boolean text = getText(tourStepPrevBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_Prev"));
        Assert.assertTrue(text, "Tour Prev text didn't match");
    }

    public void clickPageSkipBtn() {
        click(tourStepSkipBtnF);
    }

    public void clickPagePrevBtn() {
        click(tourStepPrevBtnF);
    }

    public void verifyNextBtnField() {
        Assert.assertTrue(isDisplayed(tourStepNextBtnF), "next button is not displayed");
    }

    public void verifyNextText(JSONObject jsonData) {
        System.out.println(getText(tourStepNextBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_next"));
        boolean text = getText(tourStepNextBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_next"));
        Assert.assertTrue(text, "Tour next text didn't match");
    }

    public void verifyTourTitleTextField() {
        Assert.assertTrue(isDisplayed(arableTourTitleF), "Tour field is not displayed");
    }

    public void verifyTourTitleText(JSONObject jsonData) {
        System.out.println(getText(arableTourTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_title"));
        boolean text = getText(arableTourTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_title"));
        Assert.assertTrue(text, "Tour title text didn't match");
    }

    public void verifyTourDescTextField() {
        Assert.assertTrue(isDisplayed(tourDescriptionF), "Tour description field is not displayed");
    }

    public void verifyTourDescriptionText(JSONObject jsonData) {
        System.out.println(getText(tourDescriptionF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_desc"));
        boolean text = getText(tourDescriptionF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_desc"));
        Assert.assertTrue(text, "Tour description text didn't match");
    }

    public void verifyStartButtonText(JSONObject jsonData) {
        System.out.println(getText(startTourBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_startTour"));
        boolean text = getText(startTourBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_startTour"));
        Assert.assertTrue(text, "Tour start button text didn't match");
    }

    public void verifyStartTourBtn() {
        Assert.assertTrue(isDisplayed(arableTourTitleF), "Login failed");
    }

    public void verifySkipBtnField() {
        Assert.assertTrue(isDisplayed(tourSkipBtnF), "Skip button is not displayed");
    }

    public void verifySkipText(JSONObject jsonData) {
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_skip"));
        System.out.println(getText(tourSkipBtnF));
        boolean text = getText(tourSkipBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_skip"));
        Assert.assertTrue(text, "Tour skip text didn't match");
    }

    public void clickOnSkip() {
        click(tourSkipBtnF);
    }

    public void clickOnStartTour() {
        click(startTourBtnF);
    }

    public void completeTour() {
        for (int i = 0; i < 7; i++) {
            click(tourStepNextBtnF);
        }
        click(tourStepFinishBtnF);
    }

    public void clickFinishButton() {
        click(tourStepFinishBtnF);
    }

    public void verifyFinishButton() {
        Assert.assertTrue(isDisplayed(tourStepFinishBtnF), "Finish button is not displayed");
    }

    public void verifyFinishButtonText(JSONObject jsonData) {
        System.out.println(getText(tourStepFinishBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Tour_finish"));
        boolean text = getText(tourStepFinishBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Tour_finish"));
        Assert.assertTrue(text, "Finish text didn't match");
    }

    public void clickNextButton() {
        click(tourStepNextBtnF);
    }

    public void verifyMapPageTitleField() {
        Assert.assertTrue(isDisplayed(tourMapPageTitleF), "Tour map page title is not displayed");
    }

    public void verifyMapPageTitleText(JSONObject jsonData, String value) {
        System.out.println(getText(tourMapPageTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, value));
        boolean text = getText(tourMapPageTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, value));
        Assert.assertTrue(text, "Tour map page title text didn't match");
    }

    public void verifyMapPageDescField() {
        Assert.assertTrue(isDisplayed(tourMapPageDescF), "Tour map page description is not displayed");
    }

    public void verifyMapPageDescText(JSONObject jsonData, String value) {
        System.out.println(getText(tourMapPageDescF));
        System.out.println(jsonReader.getValueFromKey(jsonData, value));
        boolean text = getText(tourMapPageDescF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, value));
        Assert.assertTrue(text, "Tour map page description text didn't match");
    }

    public void verifyMapPageCountField() {
        Assert.assertTrue(isDisplayed(tourMapPageCountF), "Tour map page count is not displayed");
    }

    public void verifyMapPageCountText(JSONObject jsonData, String value) {
        System.out.println(getText(tourMapPageCountF));
        System.out.println(jsonReader.getValueFromKey(jsonData, value));
        boolean text = getText(tourMapPageCountF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, value));
        Assert.assertTrue(text, "Tour map page count text didn't match");
    }
}
