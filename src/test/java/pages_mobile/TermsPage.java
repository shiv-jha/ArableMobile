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

public class TermsPage extends PageBase {

    @AndroidFindBy(accessibility = "TNC-GoBackArrowBtn")
    @iOSXCUITFindBy(accessibility = "TNC-GoBackArrowBtn")
    private MobileElement termsBackArrowF;

    @AndroidFindBy(accessibility = "TNC-Title")
    @iOSXCUITFindBy(accessibility = "TNC-Title")
    private MobileElement termsTitleF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TNC-SendByEmailLink']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TNC-SendByEmailLink")
    private MobileElement termsEmailLinkF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TNC-AgreeBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TNC-AgreeBtn")
    private MobileElement termsAgreeBtnF;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='TNC-DisagreeBtn']/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "TNC-DisagreeBtn")
    private MobileElement termsDisagreeBtnF;

    @AndroidFindBy(accessibility = "GEN-ToastMsgText")
    @iOSXCUITFindBy(accessibility = "GEN-ToastMsgText")
    private MobileElement termsPushToastMsgF;

    public TermsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void verifyTermsBackArrowBtn() {
        Assert.assertTrue(isDisplayed(termsBackArrowF), "Back button is not displayed");
    }

    public void clickTermsBackArrowBtn() {
        click(termsBackArrowF);
    }

    public void verifyTncTitle(JSONObject jsonData) {
        System.out.println(getText(termsTitleF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "TNC_heading"));
        boolean text = getText(termsTitleF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "TNC_heading"));
        Assert.assertTrue(text, "TNC title text didn't match");
    }

    public void verifyEmailTitle(JSONObject jsonData) {
        System.out.println(getText(termsEmailLinkF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "TNC_sendEmail"));
        boolean text = getText(termsEmailLinkF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "TNC_sendEmail"));
        Assert.assertTrue(text, "TNC email text didn't match");
    }

    public void verifyDisagreeTitle(JSONObject jsonData) {
        System.out.println(getText(termsDisagreeBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "TNC_disagree"));
        boolean text = getText(termsDisagreeBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "TNC_disagree"));
        Assert.assertTrue(text, "TNC disagree text didn't match");
    }

    public void verifyAgreeTitle(JSONObject jsonData) {
        System.out.println(getText(termsAgreeBtnF));
        System.out.println(jsonReader.getValueFromKey(jsonData, "TNC_agree"));
        boolean text = getText(termsAgreeBtnF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "TNC_agree"));
        Assert.assertTrue(text, "TNC agree text didn't match");
    }

    public void verifyTermsTitleDisplayed() {
        Assert.assertTrue(isDisplayed(termsTitleF), "Didn't skip the tour");
    }

    public void clickAgreeBtn() {
        click(termsAgreeBtnF);
    }

    public void clickDisagreeBtn() {
        click(termsDisagreeBtnF);
    }

    public void clickSendEmailBtn() {
        click(termsEmailLinkF);
    }

    public void verifyEmailToastMsg(JSONObject jsonData) {
        String text = termsPushToastMsgF.getText();
        System.out.println(" --> " + text);
        System.out.println(jsonReader.getValueFromKey(jsonData, "Terms_emailToastMessage"));
        boolean text1 = text.equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Terms_emailToastMessage"));
        Assert.assertTrue(text1, "Email toast message text didn't match");
    }
}
