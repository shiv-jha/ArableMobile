package stepDefinitions_mobile;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class GetStartedSteps {

    @When("user on getStarted page")
    public void userOnGetStartedPage() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        getStartedPage.verifyLogo();
    }

    @Then("verify the titles on the page")
    public void verifyTheTitlesOnThePage() {
        getStartedPage.verifyGsTitleText(jsonPayload);
        getStartedPage.verifyGsDescriptionText(jsonPayload);
        getStartedPage.verifyGsGetStartedText(jsonPayload);
    }

    @Then("click on the get started button and verify login page")
    public void clickOnTheGetStartedButtonAndVerifyLoginPage() {
        getStartedPage.clickOnGettingStartedBtn();
        loginPage.verifySignInTitle();
    }
}
