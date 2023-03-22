package support_mobile;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static support_mobile.DriverManager.appiumDriver;


public class TestBase {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp(Scenario scenario) {
        System.out.println(scenario.toString());
        appiumDriver.resetApp();
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.attach(screenshot, "image/png", testName);
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }

    public AppiumDriver getDriver() {
        return appiumDriver;
    }
}
