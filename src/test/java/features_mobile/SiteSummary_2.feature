Feature: Site Summary
	Scenario Outline: Summary | Verify the page UI load time for <role> user
	Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    And login to application with "<role>" credentials
    When click on first site on weather and navigate to summary page
    And a site specific forecast request is made to calculate next rain value from response
    Then verify UI next rain value with API response under forecast
    	@forecast @TestRail(65001) @orgAdmin @performance @sanity
    Examples:
      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      | orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
      
   Scenario Outline: Summary | Current wind condition | Forecast | Validate the average Wind of the 4 recent forecast hours for <role> user
    Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    And login to application with "<role>" credentials
   	When click on first site on weather and navigate to summary page
    And a site specific forecast request is made to calculate the Avg wind value from response
    Then verify forecast avg wind value on UI and API response
    
    	@forecast2 @TestRail(65340) @orgAdmin @sanity
    Examples:
      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      | orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |