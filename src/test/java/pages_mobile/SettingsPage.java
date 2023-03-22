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

import static pages_mobile.PageBase.Direction.DOWN;
import static support_mobile.World.*;

public class SettingsPage extends PageBase {

    private final PropertiesReader getPropertyValue = new PropertiesReader();

    public SettingsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void scrollPage() {
        mobileScroll();
    }

}
