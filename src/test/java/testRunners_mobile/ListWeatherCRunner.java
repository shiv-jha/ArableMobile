package testRunners_mobile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import support_mobile.DriverManager;
import support_mobile.RestAssuredHelper;

import java.io.IOException;

import static support_mobile.DriverManager.appiumDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features_mobile",
        glue = {
                "support_mobile",
                "stepDefinitions_mobile"
        },

        plugin = {
                "de.monochromata.cucumber.report.PrettyReports:reporting/pretty/ListWeatherC",
                "html:reporting/CucumberHTMLReports/ListWeatherC",
                "json:reporting/cucumberOtherreports/ListWeatherC.json",
                "junit:reporting/cucumber-reports/ListWeatherC.xml",
                "rerun:target/rerun.txt" //Creates a text file with failed scenarios
        },
        tags = "@listWeatherC",
        publish = true
)

public class ListWeatherCRunner {
    @BeforeClass
    public static void initialize() throws IOException {
        RestAssuredHelper restHelper = new RestAssuredHelper();
        restHelper.getBranchLatestBuild();
        restHelper.getRecentReleaseBuildID();
        restHelper.getBuildURL();
        restHelper.getBrowserStackURL();
        new DriverManager().initializeDriver();
    }

    @AfterClass
    public static void quit() {
        appiumDriver.quit();
    }
}
