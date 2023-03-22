package stepDefinitions_mobile;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class LoginSteps {

    @When("user on login page")
    public void userOnLoginPage() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        getStartedPage.clickOnGettingStartedBtn();
    }

    @Then("login application with {string} credentials")
    public void loginApplicationWithCredentials(String role) {
        loginPage.enterEmailId(role);
        loginPage.selectEnvDropDown();
        loginPage.enterPassword();
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.clickSignIn();
        } else {
            loginPage.clickPasswordHideBtn();
        }
        arableTourPage.verifyStartTourBtn();
    }

    @Then("click on back arrow and verify user landed on get started page")
    public void clickOnBackArrowAndVerifyUserLandedOnGetStartedPage() {
        loginPage.clickArrowBtn();
       // getStartedPage.verifyGettingStartedBtn();
    }

    @Then("verify the title on the login page")
    public void verifyTheTitleOnTheLoginPage() {
        loginPage.verifyBackArrow();
        loginPage.verifySignInTitleText(jsonPayload);
        loginPage.verifySignInDescription(jsonPayload);
        loginPage.verifyEmailText(jsonPayload);
        loginPage.verifyPasswordText(jsonPayload);
        loginPage.verifyForgotPasswordText(jsonPayload);
        loginPage.verifySignInButtonText(jsonPayload);
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.verifyLogo();
            loginPage.verifyAccText(jsonPayload);
            loginPage.verifySupportText(jsonPayload);
        }
    }

    @Then("login application with invalid {string} credentials")
    public void loginApplicationWithInvalidCredentials(String email) {
        loginPage.enterEmailId(email);
        loginPage.selectEnvDropDown();
        loginPage.enterPassword();
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.clickSignIn();
        } else {
            loginPage.clickPasswordHideBtn();
        }
    }

    @Then("verify the error message displayed")
    public void verifyTheErrorMessageDisplayed() {
        loginPage.verifyErrorMessage();
        loginPage.verifyErrorMessageText(jsonPayload);
    }

    @Then("verify the error and login with {string} credentials")
    public void verifyTheErrorAndLoginWithCredentials(String role) {
        loginPage.verifyErrorMessage();
        loginPage.enterEmailId(role);
        loginPage.enterPassword();
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.clickSignIn();
        } else {
            loginPage.clickPasswordHideBtn();
        }
        arableTourPage.verifyStartTourBtn();
    }

    @When("click on forgot password field")
    public void clickOnForgotPasswordField() {
        loginPage.verifySignInTitle();
        loginPage.verifyForgotPasswordField();
        loginPage.clickForgotPasswordLink();
    }

    @Then("verify forgot password page navigation")
    public void verifyForgotPasswordPageNavigation() {
        loginPage.verifyForgotPasswordTitle();
    }

    @When("click on support emailId field")
    public void clickOnSupportEmailIdField() {
        loginPage.verifySignInTitle();
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.verifySupportEmailLink();
            loginPage.clickSupportEmail();
        }
    }

    @Then("verify gmail page navigation")
    public void verifyGmailPageNavigation() {
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.verifyGmailField();
        }
    }

    @Then("verify the error message text")
    public void verifyTheErrorMessageText() {
    }
}
