package stepDefinitions_mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class TermsAndConditionsSteps {

    @Given("login to application with {string} credentials")
    public void loginToApplicationWithCredentials(String role) throws Exception {
        System.out.println("started");
    	//jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        getStartedPage.clickOnGettingStartedBtn();
        loginPage.enterEmailId(role);
        loginPage.selectEnvDropDown();
        loginPage.clickPasswordHideBtn();
        loginPage.enterPassword();
        loginPage.clickSignIn();
        arableTourPage.verifyStartTourBtn();
    }

    @Then("click on agree for T&C")
    public void clickOnAgreeForTC() {
        termsPage.clickAgreeBtn();
        mapPage.verifyWelcomeSitesPopup();
    }

    @Then("click on disagree for T&C")
    public void clickOnDisagreeForTC() {
        termsPage.clickDisagreeBtn();
        arableTourPage.verifyStartTourBtn();
    }

    @Then("verify the titles on the t&c page")
    public void verifyTheTitlesOnTheTCPage() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        termsPage.verifyTermsBackArrowBtn();
        termsPage.verifyTncTitle(jsonPayload);
        termsPage.verifyDisagreeTitle(jsonPayload);
        termsPage.verifyAgreeTitle(jsonPayload);
        termsPage.verifyEmailTitle(jsonPayload);
    }

    @Then("click back arrow for T&C and verify arable tour navigation")
    public void clickBackArrowForTCAndVerifyArableTourNavigation() {
        termsPage.clickTermsBackArrowBtn();
        arableTourPage.verifyStartTourBtn();
        arableTourPage.verifySkipBtnField();
        arableTourPage.verifyTourTitleTextField();
        arableTourPage.verifyTourDescTextField();
    }

    @Then("click Send By Email and verify the toast message")
    public void clickSendByEmailAndVerifyTheToastMessage() {
        termsPage.clickSendEmailBtn();
        termsPage.verifyEmailToastMsg(jsonPayload);
    }
}
