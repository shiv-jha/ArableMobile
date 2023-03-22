package pages_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.util.Objects;

import static pages_mobile.PageBase.Direction.DOWN;
import static pages_mobile.PageBase.Direction.UP;
import static support_mobile.World.*;

public class CropGrowthPage extends PageBase {

    public CropGrowthPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(accessibility = "LWE-HamburgerBtn")
    @iOSXCUITFindBy(accessibility = "LWE-HamburgerBtn")
    private MobileElement hamburgerButtonF;

    @AndroidFindBy(accessibility = "DEVD-SideMenuListItemMoreInfoTextLable")
    @iOSXCUITFindBy(accessibility = "DEVD-SideMenuListItemMoreInfoTextLable")
    private MobileElement moreInfoButtonF;

    @AndroidFindBy(accessibility = "SMRY-ModalInfoCloseBtn")
    @iOSXCUITFindBy(accessibility = "SMRY-ModalInfoCloseBtn")
    private MobileElement moreInfoCloseButtonF;

    public void verifyBurgerButton() {
        Assert.assertTrue(isDisplayed(hamburgerButtonF), "Hamburger button is not displayed");
    }

    public void clickOnBurgerButton() {
        click(hamburgerButtonF);
    }

    public void verifyMoreInfoButton() {
        Assert.assertTrue(isDisplayed(moreInfoButtonF), "More info field is not displayed on the page");
    }

    public void verifyMoreInfoButtonText(JSONObject jsonData) {
        System.out.println("UI value -->" + getText(moreInfoButtonF));
        System.out.println("Json value -->" + jsonReader.getValueFromKey(jsonData, "Sum_moreInfo"));
        boolean text = getText(moreInfoButtonF).equalsIgnoreCase(jsonReader.getValueFromKey(jsonData, "Sum_moreInfo"));
        Assert.assertTrue(text, "More info text is incorrect");
    }

    public void clickMoreInfoButton() {
        click(moreInfoButtonF);
    }

    public void verifyMoreInfoCloseButton() {
        Assert.assertTrue(isDisplayed(moreInfoCloseButtonF), "Hamburger button is not displayed");
    }

    public void clickOnMoreInfoCloseButton() {
        click(moreInfoCloseButtonF);
    }

    public void swipeDown() {
        swipeScreen(DOWN);
    }

    public void verifyDropDownFieldIsNotDisplayed() {
        Assert.assertTrue(isDisplayed(moreInfoCloseButtonF), "More info model closed by swipe");
    }
}
