package stepDefinitions_mobile;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import support_mobile.PropertiesReader;

import java.util.ArrayList;

import static support_mobile.World.*;

public class CropGrowthSteps {

    @When("a site specific growing seasons request is made with {int} limit, {string} active list and get ETc value from response for site")
    public void a_site_specific_growing_seasons_request_is_made_with_limit_active_list_and_get_e_tc_value_from_response_for_site(int value, String string) {
        mapApiHelper.mapGrowingSeasonsSiteSpecific(string);
    }
}
