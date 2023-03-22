package stepDefinitions_mobile;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class ForgotPasswordSteps {

    @When("user on forgot password")
    public void userOnForgotPassword() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        getStartedPage.clickOnGettingStartedBtn();
        loginPage.verifySignInTitle();
        loginPage.verifyForgotPasswordField();
        loginPage.clickForgotPasswordLink();
        loginPage.verifyForgotPasswordTitle();
    }

    @Then("verify the title on the forgot password page")
    public void verifyTheTitleOnTheForgotPasswordPage() {
        loginPage.verifyForgotPasswordTitleText(jsonPayload);
        forgotPasswordPage.verifyBackArrowBtn();
        forgotPasswordPage.verifyForgotPasswordEmailText(jsonPayload);
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            forgotPasswordPage.verifyForgotPasswordContinueText(jsonPayload);
        }
        forgotPasswordPage.verifyForgotPasswordDescText(jsonPayload);
    }

    @Then("click on back arrow and verify signIn landing page")
    public void clickOnBackArrowAndVerifySignInLandingPage() {
        forgotPasswordPage.verifyBackArrowBtn();
        forgotPasswordPage.clickBackArrowBtn();
        loginPage.verifySignInTitle();
    }

    @When("enter valid {string} emailId")
    public void enterValidEmailId(String role) {
        forgotPasswordPage.enterEmail(role);
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            forgotPasswordPage.clickContinueBtn();
        } else {
            forgotPasswordPage.hideKeyBoard();
        }
    }

    @Then("verify the enter temporary password page navigation")
    public void verifyTheEnterTemporaryPasswordPageNavigation() {
        loginPage.verifyForgotPasswordPageNotDisplayed();
    }

    @When("enter {string} email Id")
    public void enterEmailId(String emailID) {
        forgotPasswordPage.enterEmail(emailID);
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            forgotPasswordPage.clickContinueBtn();
        } else {
            forgotPasswordPage.hideKeyBoard();
        }
    }

    @Then("verify the {string} email error message")
    public void verifyTheEmailErrorMessage(String emailID) {
        if(emailID.equalsIgnoreCase("invalid")) {
            forgotPasswordPage.verifyForgotPasswordErrorField();
            forgotPasswordPage.verifyForgotPasswordErrorText(jsonPayload, "ForgotPassword_errorMsg");
        } else if (emailID.equalsIgnoreCase("invalidWithAddress")){
            forgotPasswordPage.verifyForgotPasswordErrorField();
            forgotPasswordPage.verifyForgotPasswordErrorText(jsonPayload, "ForgotPassword_errorMsg1");
        }
    }
}
