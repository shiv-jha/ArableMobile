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

import static support_mobile.World.emailId;
import static support_mobile.World.jsonReader;

public class ForgotPasswordPage extends PageBase {

    private final PropertiesReader getPropertyValue = new PropertiesReader();

    public ForgotPasswordPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "FP-GoBackArrowBtn")
    @iOSXCUITFindBy(accessibility = "FP-GoBackArrowBtn")
    private MobileElement forgotPasswordBackArrowF;

    @AndroidFindBy(accessibility = "FP-Description")
    @iOSXCUITFindBy(accessibility = "FP-Description")
    private MobileElement forgotPasswordDescF;

    @AndroidFindBy(accessibility = "FP-EmailInput")
    @iOSXCUITFindBy(accessibility = "FP-EmailInput")
    private MobileElement forgotPasswordEmailF;

    @AndroidFindBy(accessibility = "FP-ContinueBtn")
    @iOSXCUITFindBy(accessibility = "FP-ContinueBtn")
    private MobileElement forgotPasswordContinueF;

    @AndroidFindBy(accessibility = "FP-ErrorMsgsLbl")
    @iOSXCUITFindBy(accessibility = "FP-ErrorMsgsLbl")
    private MobileElement forgotPasswordErrorF;

    public void verifyBackArrowBtn() {
        Assert.assertTrue(isDisplayed(forgotPasswordBackArrowF), "Forgot password page back arrow btn didn't displayed");
    }

    public void verifyForgotPasswordDescText(JSONObject jsonData) {
        System.out.println(getText(forgotPasswordDescF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "ForgotPassword_desText"));
        boolean text = getText(forgotPasswordDescF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "ForgotPassword_desText"));
        Assert.assertTrue(text, "Forgot password desc text didn't match");
    }

    public void verifyForgotPasswordEmailText(JSONObject jsonData) {
        System.out.println(getText(forgotPasswordEmailF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "ForgotPassword_emailPlaceHolder"));
        boolean text = getText(forgotPasswordEmailF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "ForgotPassword_emailPlaceHolder"));
        Assert.assertTrue(text, "Forgot password email desc text didn't match");
    }

    public void verifyForgotPasswordContinueText(JSONObject jsonData) {
        System.out.println(getText(forgotPasswordContinueF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "ForgotPassword_continue"));
        boolean text = getText(forgotPasswordContinueF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "ForgotPassword_continue"));
        Assert.assertTrue(text, "Forgot password continue text didn't match");
    }

    public void clickBackArrowBtn() {
        click(forgotPasswordBackArrowF);
    }

    public void enterEmail(String userRole) {
        emailId = getPropertyValue.loadProperties(userRole + ".email");
        sendText(forgotPasswordEmailF, emailId);
    }

    public void clickContinueBtn() {
        Assert.assertTrue(isDisplayed(forgotPasswordContinueF), "Forgot password continue btn didn't displayed");
        click(forgotPasswordContinueF);
    }

    public void verifyForgotPasswordErrorField() {
        Assert.assertTrue(isDisplayed(forgotPasswordErrorF), "Forgot password error message didn't displayed");
    }

    public void verifyForgotPasswordErrorText(JSONObject jsonData, String value) {
        System.out.println(jsonReader.getValueFromKey(jsonData, value));
        System.out.println(getText(forgotPasswordErrorF));
        boolean text = getText(forgotPasswordErrorF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, value));
        Assert.assertTrue(text, "Forgot password error text didn't match");
    }

    public void hideKeyBoard() {
        hideKeypad();
    }
}
