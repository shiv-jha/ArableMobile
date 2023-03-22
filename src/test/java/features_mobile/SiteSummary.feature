Feature: Site Summary

  #https://arabletestrail.testrail.io/index.php?/cases/view/54101
  #https://arabletestrail.testrail.io/index.php?/cases/view/64217
  #Scenario Outline: Summary | Verify the page UI load time for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to site summary page
    #Then calculate site summary UI data load time is less than 5sec
#
    #@summary @TestRail(64217) @orgAdmin @performance @sanity
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(64217) @member @performance @sanity
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(64217) @teamAdmin @performance @sanity
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(64217) @orgReader @performance @sanity
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(64217) @sysReader @performance @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(64217) @sysAdmin @performance @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
   #https://arabletestrail.testrail.io/index.php?/cases/view/64509
   #https://arabletestrail.testrail.io/index.php?/cases/view/64508
  #Scenario Outline: Summary |  Verify the page UI load time after manual refresh for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to site summary page
    #Then refresh the page manually and calculate site summary UI data load time is less than 5sec
#
    #@summary @TestRail(64508) @orgAdmin @performance @sanity
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(64508) @member @performance @sanity
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(64508) @teamAdmin @performance @sanity
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(64508) @orgReader @performance @sanity
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(64508) @sysReader @performance @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(64508) @sysAdmin @performance @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
  #https://arabletestrail.testrail.io/index.php?/cases/view/59960
  #https://arabletestrail.testrail.io/index.php?/cases/view/59977
  #Scenario Outline: Summary | Navigate to summary for <role> user and verify summary page fields
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify the arrow, burger button, geolocation, mark count and last sync label
#
    #@summary @TestRail(59977) @orgAdmin @sanity
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59977) @member @sanity
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59977) @teamAdmin @sanity
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59977) @orgReader @sanity
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59977) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59977) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/53134
    #https://arabletestrail.testrail.io/index.php?/cases/view/59973
  Scenario Outline: Summary | Click on geolocation name and verify map page navigation for <role> user
    Given login to application with "<role>" credentials
    When navigate to summary page
    Then click on geolocation name and verify map page navigation

    @summary @TestRail(59973) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @summary @TestRail(59973) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @summary @TestRails(59973) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @summary @TestRails(59973) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @summary @TestRails(59973) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59973) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59961
    #https://arabletestrail.testrail.io/index.php?/cases/view/59974
  #Scenario Outline: Summary | Close the more info modal by clicking on cross button for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then close the summary more info modal by clicking on cross button
#
    #@summary @TestRail(59974) @orgAdmin @sanity
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59974) @member @sanity
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59974) @teamAdmin @sanity
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59974) @orgReader @sanity
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59974) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59974) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/59962
    #https://arabletestrail.testrail.io/index.php?/cases/view/59975
  #Scenario Outline: Summary | More info modal shouldn't close by swipe down <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then the summary more info modal shouldn't get close by swipe down
#
    #@summary @TestRail(59975) @orgAdmin
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59975) @member
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59975) @teamAdmin
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59975) @orgReader
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59975) @sysReader
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59975) @sysAdmin
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/59963
    #https://arabletestrail.testrail.io/index.php?/cases/view/59967
  #Scenario Outline: Summary | Verify current conditions tiles, label and its values for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify current condition tiles and its text, values
#
    #@summary @TestRail(59967) @orgAdmin @sanity @language
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59967) @member @sanity @language
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59967) @teamAdmin @sanity @language
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59967) @orgReader @sanity @language
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59967) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59967) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/53926
    #https://arabletestrail.testrail.io/index.php?/cases/view/65337
  #Scenario Outline: Summary | Verify Current wind conditions tiles, label and its values for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify Current wind conditions tiles and its text, values
#
    #@summary @TestRail(65337) @orgAdmin @sanity @language
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(65337) @member @sanity @language
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(65337) @teamAdmin @sanity @language
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(65337) @orgReader @sanity @language
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(65337) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(65337) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/59964
    #https://arabletestrail.testrail.io/index.php?/cases/view/59969
  #Scenario Outline: Summary | Verify forecast tiles, label and its values for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify forecast tiles and its text, values
#
    #@summary @TestRail(59969) @orgAdmin @sanity @language
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59969) @member @sanity @language
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59969) @teamAdmin @sanity @language
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59969) @orgReader @sanity @language
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59969) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59969) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/59965
    #https://arabletestrail.testrail.io/index.php?/cases/view/59970
  #Scenario Outline: Summary | Verify crop activity tiles, label and its values for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify crop activity tiles and its text, values
#
    #@summary @TestRail(59970) @orgAdmin @sanity @language
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59970) @member @sanity @language
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59970) @teamAdmin @sanity @language
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59970) @orgReader @sanity @language
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59970) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59970) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/59966
    #https://arabletestrail.testrail.io/index.php?/cases/view/59971
  #Scenario Outline: Summary | Verify current season tiles, label and its values for <role> user
    #Given login to application with "<role>" credentials
    #When navigate to summary page
    #Then verify current season tiles and its text, values
#
    #@summary @TestRail(59971) @orgAdmin @sanity @language
    #Examples:
      #| role           |
      #| orgAdminMobile |
    #@summary @TestRail(59971) @member @sanity @language
    #Examples:
      #| role         |
      #| memberMobile |
    #@summary @TestRails(59971) @teamAdmin @sanity @language
    #Examples:
      #| role            |
      #| teamAdminMobile |
    #@summary @TestRails(59971) @orgReader @sanity @language
    #Examples:
      #| role            |
      #| orgReaderMobile |
#    @summary @TestRails(59971) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @summary @TestRails(59971) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64510
    #https://arabletestrail.testrail.io/index.php?/cases/view/64521
  #Scenario Outline: Summary | Current condition | Verify temperature value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific summary request is made with "<moistUnit>" soilMoistureUnits and get temperature value from response for "<org>" org
    #Then verify UI temperature value with API response under current condition
#
    #@summary @TestRail(64521) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64521) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64521) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64521) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64521) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64521) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64511
    #https://arabletestrail.testrail.io/index.php?/cases/view/64522
  #Scenario Outline: Summary | Current condition | Verify relative humidity value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific summary request is made with "<moistUnit>" soilMoistureUnits and get rh value from response for "<org>" org
    #Then verify UI rh value with API response under current condition
#
    #@summary @TestRail(64522) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64522) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64522) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64522) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64522) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64522) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64512
    #https://arabletestrail.testrail.io/index.php?/cases/view/64523
  #Scenario Outline: Summary | Current condition | Verify precipitation value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific local hourly request is made to get last 176400 seconds to 3600 seconds precipitation value
    #Then verify UI precipitation value with API response under current condition
#
    #@summary @TestRail(64523) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64523) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64523) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64523) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64523) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64523) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
#    #https://arabletestrail.testrail.io/index.php?/cases/view/
#    #https://arabletestrail.testrail.io/index.php?/cases/view/64523
#  Scenario Outline: Summary | Current wind condition | Verify Avg Wind and Max Wind values with API response along with local/remote data text for <role> user
#    Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
#    And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
#    And login to application with "<role>" credentials
#    When click on first site on weather and navigate to summary page
#    And a site specific local hourly request is made to get current 3600 seconds to 0 seconds wind value
#
##    Then verify UI precipitation value with API response under current condition
#
#    @summary @TestRail(64523) @orgAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64523) @member @sanity
#    Examples:
#      | role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64523) @teamAdmin @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64523) @orgReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
##    @summary @TestRail(64523) @sysReader @sanity
##    Examples:
##      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
##      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
##    @summary @TestRail(64523) @sysAdmin @sanity
##    Examples:
##      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
##      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/65340
    #https://arabletestrail.testrail.io/index.php?/cases/view/53930
  #Scenario Outline: Summary | Current wind condition | Forecast | Validate the average Wind of the 4 recent forecast hours for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific forecast request is made to calculate the Avg wind value from response
    #Then verify forecast avg wind value on UI and API response
#
    #@summary @TestRail(65340) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(65340) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(65340) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(65340) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(65340) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(65340) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64513
    #https://arabletestrail.testrail.io/index.php?/cases/view/64518
  #Scenario Outline: Summary | Forecast | Verify min temperature value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific forecast request is made to calculate the min temp value from response
    #Then verify UI min temperature value with API response under forecast
#
    #@summary @TestRail(64518) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64518) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64518) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64518) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64518) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64518) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64514
    #https://arabletestrail.testrail.io/index.php?/cases/view/64519
  #Scenario Outline: Summary | Forecast | Verify max temperature value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific forecast request is made to calculate the max temp value from response
    #Then verify UI max temperature value with API response under forecast
#
    #@summary @TestRail(64519) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64519) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64519) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64519) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64519) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64519) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64515
    #https://arabletestrail.testrail.io/index.php?/cases/view/64520
  #Scenario Outline: Summary | Forecast | Verify next rain value with API response for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #And login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific forecast request is made to calculate next rain value from response
    #Then verify UI next rain value with API response under forecast
#
    #@summary @TestRail(64520) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64520) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64520) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
    #@summary @TestRail(64520) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64520) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary @TestRail(64520) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
#    #https://arabletestrail.testrail.io/index.php?/cases/view/
#    #https://arabletestrail.testrail.io/index.php?/cases/view/
#  Scenario Outline: Summary | Verify recent crop activity tiles values matches with API for <role> user
#    Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
#    And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
#    And login to application with "<role>" credentials
#    And a site specific local hourly request is made to get last 90000 sec to 0 sec etc, leaf wetness value and last 604800 sec to 3600 sec hours etc value
#    When click on first site on weather and navigate to summary page
#    And verify recent crop activity tiles values with API response
#
#    @summary1 @TestRail(59971) @orgAdmin
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary1 @TestRail(59971) @member
#    Examples:
#      | role         | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary1 @TestRail(59971) @teamAdmin
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary1 @TestRail(59971) @orgReader
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary1 @TestRail(59971) @sysReader
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#    @summary1 @TestRail(59971) @sysAdmin
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64516
    #https://arabletestrail.testrail.io/index.php?/cases/view/64524
  #Scenario Outline: Summary | Current Season | Crop type, variety matches with API response value for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #Given login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific growing seasons request is made with <lValue> limit, "<active>" active list and get ETc value from response for site
    #Then verify Crop type, variety tile values with API response
#
    #@summary @TestRail(64524) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64524) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64524) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64524) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
#    @summary @TestRail(64524) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
#    @summary @TestRail(64524) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
#
    #https://arabletestrail.testrail.io/index.php?/cases/view/64517
    #https://arabletestrail.testrail.io/index.php?/cases/view/64525
  #Scenario Outline: Summary | Current Season | Season start and end date matches with API response value for <role> user
    #Given get token, userID, units for "<role>" user and verify the feature flag then get orgID for "<org>"
    #And a summary request is made with <pCount> page, <lValue> limit, "<order>" order, "<ordBy>" orderBy and "<moistUnit>" soilMoistureUnits and get response details
    #Given login to application with "<role>" credentials
    #When click on first site on weather and navigate to summary page
    #And a site specific growing seasons request is made with <lValue> limit, "<active>" active list and get ETc value from response for site
    #Then verify season start and end date tile values with API response
#
    #@summary @TestRail(64525) @orgAdmin @sanity
    #Examples:
      #| role           | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| orgAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64525) @member @sanity
    #Examples:
      #| role         | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| memberMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64525) @teamAdmin @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| teamAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
    #@summary @TestRail(64525) @orgReader @sanity
    #Examples:
      #| role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
      #| orgReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
#    @summary @TestRail(64525) @sysReader @sanity
#    Examples:
#      | role            | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
#      | sysReaderMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |
#    @summary @TestRail(64525) @sysAdmin @sanity
#    Examples:
#      | role           | org         | moistUnit       | pCount | lValue | order | ordBy    | active |
#      | sysAdminMobile | arable-team | inches_per_foot | 1      | 25     | asc   | location | true   |