package pages_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static support_mobile.World.*;

public class GetStartedPage extends PageBase {

    @AndroidFindBy(accessibility = "GS-Logo")
    @iOSXCUITFindBy(accessibility = "GS-Logo")
    private MobileElement gsLogoF;

    @AndroidFindBy(accessibility = "GS-Title")
    @iOSXCUITFindBy(accessibility = "GS-Title")
    private MobileElement gsTitleF;

    @AndroidFindBy(accessibility = "GS-Description")
    @iOSXCUITFindBy(accessibility = "GS-Description")
    private MobileElement gsDescriptionF;

    @AndroidFindBy(accessibility = "GS-GettingStartedBtnText")
    @iOSXCUITFindBy(accessibility = "gettingStartedButton")
    private MobileElement gettingStartedBtnF;

    public GetStartedPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void verifyLogo() {
        Assert.assertTrue(isDisplayed(gsLogoF), "Arable logo is not displayed");
    }

    public void verifyGsTitleText(JSONObject jsonData) {
        System.out.println(getText(gsTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "GetStarted_heading"));
        boolean text = getText(gsTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "GetStarted_heading"));
        Assert.assertTrue(text, "Get started page title text didn't match");
    }

    public void verifyGsDescriptionText(JSONObject jsonData) {
        System.out.println(getText(gsDescriptionF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "GetStarted_descText"));
        boolean text = getText(gsDescriptionF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "GetStarted_descText"));
        Assert.assertTrue(text, "Get started page description text didn't match");
    }

    public void verifyGsGetStartedText(JSONObject jsonData) {
        System.out.println(getText(gettingStartedBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "GetStarted"));
        boolean text = getText(gettingStartedBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "GetStarted"));
        Assert.assertTrue(text, "Get started button text didn't match");
    }

    public void verifyGettingStartedBtn(){
        Assert.assertTrue(isDisplayed(gettingStartedBtnF), "Arable logo is not displayed");
    }

    public void clickOnGettingStartedBtn() {
        click(gettingStartedBtnF);
    }
}
