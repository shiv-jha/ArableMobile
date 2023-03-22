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


public class LoginPage extends PageBase {

    private final PropertiesReader getPropertyValue = new PropertiesReader();

    @AndroidFindBy(accessibility = "SI-GoBackArrowBtn")
    @iOSXCUITFindBy(accessibility = "SI-GoBackArrowBtn")
    private MobileElement signInBackArrowF;

    //need to add accessibility id in code
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='SI-SignInScreen']/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//hhh")
    private MobileElement signInLogoF;

    @AndroidFindBy(accessibility = "SI-Title")
    @iOSXCUITFindBy(accessibility = "SI-Title")
    private MobileElement signInTitleF;

    @AndroidFindBy(accessibility = "SI-Description")
    @iOSXCUITFindBy(accessibility = "SI-Description")
    private MobileElement signInDescriptionF;

    @AndroidFindBy(accessibility = "SI-EmailInput")
    @iOSXCUITFindBy(accessibility = "SI-EmailInput")
    private MobileElement emailIdF;

    @AndroidFindBy(accessibility = "SI-PasswordInput")
    @iOSXCUITFindBy(accessibility = "SI-PasswordInput")
    private MobileElement passwordF;

    @AndroidFindBy(accessibility = "SI-HideShowPasswdBtn")
    @iOSXCUITFindBy(accessibility = "SI-HideShowPasswdBtn")
    private MobileElement passwordShowBtnF;

    @AndroidFindBy(accessibility = "SI-ForgotPwdLink")
    @iOSXCUITFindBy(accessibility = "SI-ForgotPwdLink")
    private MobileElement forgotPasswordF;

    @AndroidFindBy(accessibility = "SI-SignInBtnText")
    @iOSXCUITFindBy(accessibility = "SI-SignInBtn")
    private MobileElement signInBtnF;

    @AndroidFindBy(id = "android:id/text1")
    @iOSXCUITFindBy(accessibility = "SI-APIDropdown")
    private MobileElement envDropDownF;

    @AndroidFindBy(id = "android:id/text1")
    @iOSXCUITFindBy(accessibility = "api-user.stage.arable.cloud")
    private MobileElement apiStageOptionF;

    @AndroidFindBy(id = "android:id/text1")
    @iOSXCUITFindBy(accessibility = "SI-APIDropdown")
    private List<MobileElement> envDropdownListF;

    @AndroidFindBy(accessibility = "SI-DontHaveAccountLbl")
    private MobileElement haveAccountTextF;

    @AndroidFindBy(accessibility = "SI-SupportEmailLink")
    private MobileElement supportLinkTextF;

    @AndroidFindBy(accessibility = "SI-ErrMessageLbl")
    @iOSXCUITFindBy(accessibility = "SI-ErrMessageLbl")
    private MobileElement signInErrorMessageF;

    @AndroidFindBy(accessibility = "FP-Title")
    @iOSXCUITFindBy(accessibility = "FP-Title")
    private MobileElement FPTitleF;

    @AndroidFindBy(accessibility = "FP-Title")
    @iOSXCUITFindBy(accessibility = "FP-Title")
    private List<MobileElement> FPTitleListF;

    @AndroidFindBy(id = "com.google.android.gm:id/welcome_tour_title")
    private MobileElement gmailWelcomeF;

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void verifySignInTitle() {
        Assert.assertTrue(isDisplayed(signInTitleF), "Sign in page title didn't displayed");
    }

    public void verifyForgotPasswordTitle() {
        Assert.assertTrue(isDisplayed(FPTitleF), "Forgot password title didn't displayed");
    }

    public void verifyForgotPasswordTitleText(JSONObject jsonData) {
        System.out.println(getText(FPTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_forgotPassword"));
        boolean text = getText(FPTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_forgotPassword"));
        Assert.assertTrue(text, "Forgot password title text didn't match");
    }

    public void verifyForgotPasswordPageNotDisplayed() {
        try {
            waitOfTillInvisibilityOfElement(FPTitleF, 10, 1);
        } catch (Exception e) {
        }
        int size = FPTitleListF.size();
        Assert.assertEquals(size, 0);
    }

    public void verifySignInTitleText(JSONObject jsonData) {
        System.out.println(getText(signInTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_in"));
        boolean text = getText(signInTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_in"));
        Assert.assertTrue(text, "Sign in page title text didn't match");
    }

    public void verifySignInDescription(JSONObject jsonData) {
        System.out.println(getText(signInDescriptionF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_descText"));
        boolean text = getText(signInDescriptionF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_descText"));
        Assert.assertTrue(text, "Sign in page description text didn't match");
    }

    public void verifyEmailText(JSONObject jsonData) {
        System.out.println(getText(emailIdF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_email"));
        boolean text = getText(emailIdF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_email"));
        Assert.assertTrue(text, "Email id description text didn't match");
    }

    public void verifyPasswordText(JSONObject jsonData) {
        System.out.println(getText(passwordF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_password"));
        boolean text = getText(passwordF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_password"));
        Assert.assertTrue(text, "Password description text didn't match");
    }

    public void verifyForgotPasswordField() {
        Assert.assertTrue(isDisplayed(forgotPasswordF), "Sign in page title didn't displayed");
    }

    public void clickForgotPasswordLink() {
        click(forgotPasswordF);
    }

    public void verifyForgotPasswordText(JSONObject jsonData) {
        System.out.println(getText(forgotPasswordF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_forgotPassword"));
        boolean text = getText(forgotPasswordF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_forgotPassword"));
        Assert.assertTrue(text, "Forgot password description text didn't match");
    }

    public void verifySignInButtonText(JSONObject jsonData) {
        System.out.println(getText(signInBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_in"));
        boolean text = getText(signInBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_in"));
        Assert.assertTrue(text, "Sign in button text didn't match");
    }

    public void verifyAccText(JSONObject jsonData) {
        System.out.println(getText(haveAccountTextF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_noAccount"));
        boolean text = getText(haveAccountTextF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_noAccount"));
        Assert.assertTrue(text, "Don't have account text didn't match");
    }

    public void verifySupportEmailLink() {
        Assert.assertTrue(isDisplayed(supportLinkTextF), "Support email id didn't displayed");
    }

    public void clickSupportEmail() {
        click(supportLinkTextF);
    }

    public void verifySupportText(JSONObject jsonData) {
        System.out.println(getText(supportLinkTextF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "Sign_contact"));
        boolean text = getText(supportLinkTextF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sign_contact"));
        Assert.assertTrue(text, "contact text didn't match");
    }

    public void verifyGmailField() {
        Assert.assertTrue(isDisplayed(gmailWelcomeF), "Gmail page title didn't displayed");
    }

    public void enterEmailId(String userRole) {
        emailId = getPropertyValue.loadProperties(userRole + ".email");
        sendText(emailIdF, emailId);
    }

    public void clickPasswordHideBtn() {
        click(passwordShowBtnF);
    }

    public void enterPassword() {
        sendText(passwordF, PropertiesReader.app_password);
        summaryPage.swipe();
    }

    public void clickSignIn() {
        click(signInBtnF);
    }

    public void verifyBackArrow() {
        Assert.assertTrue(isDisplayed(signInBackArrowF), "Login page back arrow button is not displayed");
    }

    public void verifyLogo() {
        Assert.assertTrue(isDisplayed(signInLogoF), "Login page arable logo is not displayed");
    }

    public void clickArrowBtn() {
        click(signInBackArrowF);
    }

    public void selectEnvDropDown() {
        if (PropertiesReader.environment.equalsIgnoreCase("stage")) {
            click(envDropDownF);
            if (PropertiesReader.device_type.equalsIgnoreCase("ios")) {
                click(apiStageOptionF);
            } else {
                for (MobileElement env : envDropdownListF) {
                    if (env.getText().trim().equalsIgnoreCase("api-user.stage.arable.cloud")) {
                        env.click();
                        break;
                    }
                }
            }
        }
    }

    public void verifyErrorMessage() {
        Assert.assertTrue(isDisplayed(signInErrorMessageF), "Login error message is not displayed");
    }

    public void verifyErrorMessageText(JSONObject jsonData) {
        System.out.println(getText(signInErrorMessageF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "SignIn_error"));
        boolean text = getText(signInErrorMessageF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "SignIn_error"));
        Assert.assertTrue(text, "Don't have account text didn't match");
    }
}
