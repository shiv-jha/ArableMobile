package stepDefinitions_mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class ArableTourSteps {

    @Given("login to {string} credentials with applications")
    public void loginToCredentialsWithApplications(String role) throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        getStartedPage.clickOnGettingStartedBtn();
        loginPage.enterEmailId(role);
        loginPage.selectEnvDropDown();
        loginPage.enterPassword();
        if (PropertiesReader.device_type.equalsIgnoreCase("Android")) {
            loginPage.clickSignIn();
        } else {
            loginPage.clickPasswordHideBtn();
        }
    }

    @Given("user on arable tour page")
    public void userOnArableTourPage() {
        arableTourPage.verifyStartTourBtn();
    }

    @Then("click tour skip button and verify T&C page")
    public void clickTourSkipButtonAndVerifyTCPage() {
        arableTourPage.clickOnSkip();
        termsPage.verifyTermsTitleDisplayed();
    }

    @Then("start tour and verify T&C page after completing")
    public void startTourAndVerifyTCPageAfterCompleting() {
        arableTourPage.clickOnStartTour();
        arableTourPage.completeTour();
        termsPage.verifyTermsTitleDisplayed();
    }

    @Then("verify the titles on the arable tour page")
    public void verifyTheTitlesOnTheArableTourPage() {
        arableTourPage.verifySkipBtnField();
        arableTourPage.verifySkipText(jsonPayload);
        arableTourPage.verifyTourTitleText(jsonPayload);
        arableTourPage.verifyStartButtonText(jsonPayload);
        arableTourPage.verifyTourDescriptionText(jsonPayload);
    }

    @Then("start tour and verify view map fields")
    public void startTourAndVerifyViewMapFields() {
        arableTourPage.clickOnStartTour();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_map");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_mapDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
    }

    @And("click on skip and verify T&C page")
    public void clickOnSkipAndVerifyTCPage() {
        arableTourPage.clickPageSkipBtn();
        termsPage.verifyTermsTitleDisplayed();
    }

    @Then("start tour and verify map more info fields")
    public void startTourAndVerifyMapMoreInfoFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 1; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_mapInfo");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_mapInfoDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount2");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on prev and verify view map page")
    public void clickOnPrevAndVerifyViewMapPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_map");
    }

    @Then("start tour and verify manage sites fields")
    public void startTourAndVerifyManageSitesFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 2; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_manageSites");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_manageSitesDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount3");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on prev and verify map more info page")
    public void clickOnPrevAndVerifyMapMoreInfoPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_mapInfo");
    }

    @Then("start tour and verify view activity fields")
    public void startTourAndVerifyViewActivityFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 3; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewActivity");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_viewActivityDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount4");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on prev and verify manage sites page")
    public void clickOnPrevAndVerifyManageSitesPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_manageSites");
    }

    @Then("start tour and verify view site details fields")
    public void startTourAndVerifyViewSiteDetailsFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 4; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewSiteDetails");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_viewSiteDetailsDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount5");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on prev and verify view activity page")
    public void clickOnPrevAndVerifyViewActivityPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewActivity");
    }

    @Then("start tour and verify dropdown expansion fields")
    public void startTourAndVerifyDropdownExpansionFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 5; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_dropdownExpansion");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_dropdownExpansionDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount6");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on prev and verify view site details page")
    public void clickOnPrevAndVerifyViewSiteDetailsPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewSiteDetails");
    }

    @Then("start tour and verify send test alert fields")
    public void startTourAndVerifySendTestAlertFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 7; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_sentTestAlert");
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_sentTestAlertDesc");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_mapPageCount8");
        arableTourPage.verifyFinishButton();
        arableTourPage.verifyFinishButtonText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
    }

    @And("click on finish button and verify T&C page")
    public void clickOnFinishButtonAndVerifyTCPage() {
        arableTourPage.clickFinishButton();
        termsPage.verifyTermsTitleDisplayed();
    }

    @And("click on prev and verify view team data page")
    public void clickOnPrevAndVerifyViewTeamDataPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewTeam");
    }

    @Then("start tour and verify view team data fields")
    public void startTourAndVerifyViewTeamDataFields() {
        arableTourPage.clickOnStartTour();
        for (int i = 0; i < 6; i++) {
            arableTourPage.verifyNextBtnField();
            arableTourPage.clickNextButton();
            arableTourPage.verifyMapPageTitleField();
        }
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_viewTeam");
        arableTourPage.verifyMapPageCountField();
        arableTourPage.verifyMapPageCountText(jsonPayload, "Tour_viewTeamCount7");
        arableTourPage.verifyStepSkipBtnField();
        arableTourPage.verifyStepSkipText(jsonPayload);
        arableTourPage.verifyNextBtnField();
        arableTourPage.verifyNextText(jsonPayload);
        arableTourPage.verifyPrevBtnField();
        arableTourPage.verifyPrevText(jsonPayload);
        arableTourPage.verifyMapPageDescField();
        arableTourPage.verifyMapPageDescText(jsonPayload, "Tour_viewTeamDesc");
    }

    @And("click on prev and verify dropDown expansion page")
    public void clickOnPrevAndVerifyDropDownExpansionPage() {
        arableTourPage.clickPagePrevBtn();
        arableTourPage.verifyMapPageTitleField();
        arableTourPage.verifyMapPageTitleText(jsonPayload, "Tour_dropdownExpansion");
    }
}
