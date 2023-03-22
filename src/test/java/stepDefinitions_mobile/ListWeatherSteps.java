package stepDefinitions_mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support_mobile.PropertiesReader;

import static support_mobile.World.*;

public class ListWeatherSteps {

    @When("navigate to list page")
    public void navigateToListPage() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        arableTourPage.clickOnSkip();
        termsPage.verifyTermsTitleDisplayed();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        mapPage.verifyMapDropDown();
        listWeatherPage.navigateToList();
        listWeatherPage.verifyListDropdown();
    }

    @Then("verify all the fields on list {string} landing page for {string}")
    public void verifyAllTheFieldsOnListLandingPageFor(String tab, String role) {
        listWeatherPage.verifyNavigationListText(jsonPayload);
        listWeatherPage.verifyListDropdownText(jsonPayload);
        listWeatherPage.verifyListSort();
        listWeatherPage.verifyListSearch();
        listWeatherPage.verifyListHamBurger();
        listWeatherPage.verifyWeatherCurrentTabText(jsonPayload);
        listWeatherPage.verifyWeatherDailyTabText(jsonPayload);
        listWeatherPage.verifyWeatherCurrentSiteList(role);
        listWeatherPage.getSiteName(tab);
    }

    @Then("click on a site in current tab and verify summary page navigation")
    public void clickOnASiteInCurrentTabAndVerifySummaryPageNavigation() {
        listWeatherPage.verifyWeatherCurrentTab();
        listWeatherPage.clickFirstSiteOnCurrentList();
        listWeatherPage.verifySiteSummaryPage();
    }

    @Then("click on sort for {string} and verify the site name change")
    public void clickOnSortForAndVerifyTheSiteNameChange(String tab) {
        listWeatherPage.getSiteName(tab);
        listWeatherPage.clickSortBtn();
        listWeatherPage.getSiteNameAfterSort(tab);
    }

    @Then("calculate weather current UI data load time")
    public void calculateWeatherCurrentUIDataLoadTime() {
        listWeatherPage.verifySiteListLoadTimeWeatherCurrentTab();
    }

    @Then("refresh the page manually and calculate weather current UI data load time")
    public void refreshThePageManuallyAndCalculateWeatherCurrentUIDataLoadTime() {
        listWeatherPage.refreshCurrentWeatherPageManually();
        listWeatherPage.verifySiteListLoadTimeWeatherCurrentTab();
    }

    @When("navigate to list and click on daily tab")
    public void navigateToListAndClickOnDailyTab() {
        arableTourPage.clickOnSkip();
        termsPage.verifyTermsTitleDisplayed();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        mapPage.verifyMapDropDown();
        listWeatherPage.navigateToList();
        listWeatherPage.clickDailyTab();
    }

    @When("navigate to list page and navigate to search")
    public void navigateToListPageAndNavigateToSearch() throws Exception {
        jsonPayload = jsonReader.getMobileJsonPayload(PropertiesReader.language);
        arableTourPage.clickOnSkip();
        termsPage.verifyTermsTitleDisplayed();
        termsPage.clickAgreeBtn();
        mapPage.closeWelcomePopup();
        mapPage.verifyMapDropDown();
        listWeatherPage.navigateToList();
        listWeatherPage.verifyListDropdown();
        listWeatherPage.getFirstSiteName();
        listWeatherPage.verifyListSearch();
        listWeatherPage.clickSearchButton();
    }

    @Then("verify all the fields on the search landing page")
    public void verifyAllTheFieldsOnTheSearchLandingPageFor() {
        listWeatherPage.verifySearchPageFields(jsonPayload);
    }

    @Then("click on cancel and verify the weather page navigation")
    public void clickOnCancelAndVerifyTheWeatherPageNavigation() {
        listWeatherPage.clickSearchCancelButton();
    }

    @Then("enter the value in search input field and verify the result")
    public void enterTheValueInSearchInputFieldAndVerifyTheResult() {
        listWeatherPage.searchByEnteringSiteName();
        listWeatherPage.verifySearchResult();
    }

    @And("enter the value in search input field and click on the result site name")
    public void enterTheValueInSearchInputFieldAndClickOnTheResultSiteName() {
        listWeatherPage.clickOnSearchResult();
    }

    @Then("verify the site summary page navigation")
    public void verifyTheSiteSummaryPageNavigation() {
        listWeatherPage.verifySiteSummaryPage();
    }

    @And("from search result click on the site name and navigate to summary page")
    public void fromSearchResultClickOnTheSiteNameAndNavigateToSummaryPage() {
        listWeatherPage.clickOnSearchResult();
        listWeatherPage.verifySiteSummaryPage();
    }

    @Then("click on back arrow button and verify search page navigation")
    public void clickOnBackArrowButtonAndVerifySearchPageNavigation() {
        summaryPage.verifyBackArrowBtn();
        summaryPage.clickBackArrow();
        listWeatherPage.verifySearchResult();
    }
}
