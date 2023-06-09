package stepDefinitions_mobile;

import java.util.ArrayList;
import java.util.Arrays;

import io.cucumber.java.en.Then;
import support_mobile.PropertiesReader;
import static support_mobile.World.*;

public class MapSteps {
	 
    @Then("Verify Map Drop Down Options")
    public void clickOnGeolocationNameAndVerifyMapPageNavigation() throws Exception {
    	jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        arableTourPage.clickOnSkip();
        termsPage.verifyTermsTitleDisplayed();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        mapPage.verifyMapDropDown();
    }
}
