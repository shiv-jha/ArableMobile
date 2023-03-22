Feature: List-Weather Current

  #https://arabletestrail.testrail.io/index.php?/cases/view/53095
  #https://arabletestrail.testrail.io/index.php?/cases/view/64396
  Scenario Outline: List | Weather | Current | Verify the page UI load time for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page
    Then calculate weather current UI data load time

    @listWeatherC @TestRail(64396) @orgAdmin @performance @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(64396) @member @performance @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(64396) @teamAdmin @performance @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(64396) @orgReader @performance @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(64396) @sysReader @performance @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(64396) @sysAdmin @performance @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

   #https://arabletestrail.testrail.io/index.php?/cases/view/64400
   #https://arabletestrail.testrail.io/index.php?/cases/view/64397
  Scenario Outline: List | Weather | Current | Verify the page UI load time after manual refresh for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page
    Then refresh the page manually and calculate weather current UI data load time

    @listWeatherC @TestRail(64397) @orgAdmin @performance @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(64397) @member @performance @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(64397) @teamAdmin @performance @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(64397) @orgReader @performance @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(64397) @sysReader @performance @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(64397) @sysAdmin @performance @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

  #https://arabletestrail.testrail.io/index.php?/cases/view/59844
  #https://arabletestrail.testrail.io/index.php?/cases/view/59876
  Scenario Outline: List | Weather | Current | Navigate to list and verify the weather landing page for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page
    Then verify all the fields on list "current" landing page for "<role>"

    @listWeatherC @TestRail(59876) @orgAdmin @sanity @language
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(59876) @member @sanity @language
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(59876) @teamAdmin @sanity @language
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(59876) @orgReader @sanity @language
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(59876) @sysReader @sanity @language
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(59876) @sysAdmin @sanity @language
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/58003
    #https://arabletestrail.testrail.io/index.php?/cases/view/59874
  Scenario Outline: List | Weather | Current | Click on a site for <role> user and verify summary page navigation
    Given login to application with "<role>" credentials
    When navigate to list page
    Then click on a site in current tab and verify summary page navigation

    @listWeatherC @TestRail(59874) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(59874) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(59874) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(59874) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(59874) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(59874) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/54053
    #https://arabletestrail.testrail.io/index.php?/cases/view/59875
  Scenario Outline: List | Weather | Current | Click on sort for <role> user and verify the list sorted
    Given login to application with "<role>" credentials
    When navigate to list page
    Then click on sort for "current" and verify the site name change

    @listWeatherC @TestRail(59875) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(59875) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(59875) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(59875) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(59875) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(59875) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

  #https://arabletestrail.testrail.io/index.php?/cases/view/54970
  #https://arabletestrail.testrail.io/index.php?/cases/view/60668
  Scenario Outline: List | Weather | Search | Navigate to search and verify the landing page fields for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page and navigate to search
    Then verify all the fields on the search landing page

    @listWeatherC @TestRail(60668) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(60668) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(60668) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(60668) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(60668) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(60668) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

  #https://arabletestrail.testrail.io/index.php?/cases/view/54945
  #https://arabletestrail.testrail.io/index.php?/cases/view/60667
  Scenario Outline: List | Weather | Search | Navigate to search page then click on cancel and verify weather page navigation for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page and navigate to search
    Then click on cancel and verify the weather page navigation

    @listWeatherC @TestRail(60667) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(60667) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(60667) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(60667) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(60667) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(60667) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/54956
    #https://arabletestrail.testrail.io/index.php?/cases/view/60669
  Scenario Outline: List | Weather | Search | Search with site name and verify the result displayed for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page and navigate to search
    Then enter the value in search input field and verify the result

    @listWeatherC @TestRail(60669) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(60669) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(60669) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(60669) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(60669) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(60669) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/54959
    #https://arabletestrail.testrail.io/index.php?/cases/view/60670
  Scenario Outline: List | Weather | Search | From search result click on the site name and verify summary page navigation for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page and navigate to search
    And enter the value in search input field and click on the result site name
    Then verify the site summary page navigation

    @listWeatherC @TestRail(60670) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(60670) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(60670) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(60670) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(60670) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(60670) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/54960
    #https://arabletestrail.testrail.io/index.php?/cases/view/60671
  Scenario Outline: List | Weather | Search | From summary page click on back arrow button and verify search page navigation for <role> user
    Given login to application with "<role>" credentials
    When navigate to list page and navigate to search
    And from search result click on the site name and navigate to summary page
    Then click on back arrow button and verify search page navigation

    @listWeatherC @TestRail(60671) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @listWeatherC @TestRail(60671) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @listWeatherC @TestRails(60671) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @listWeatherC @TestRails(60671) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
#    @listWeatherC @TestRails(60671) @sysReader @sanity
#    Examples:
#      | role            |
#      | sysReaderMobile |
#    @listWeatherC @TestRails(60671) @sysAdmin @sanity
#    Examples:
#      | role           |
#      | sysAdminMobile |

