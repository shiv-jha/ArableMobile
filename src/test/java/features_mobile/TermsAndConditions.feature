Feature: Terms and conditions

    #https://arabletestrail.testrail.io/index.php?/cases/view/58645
    #https://arabletestrail.testrail.io/index.php?/cases/view/59737
  Scenario Outline: T&C | Fields and text validation
    Given login to application with "<role>" credentials
    When click tour skip button and verify T&C page
    Then verify the titles on the t&c page

    @T&C @TestRail(59737) @orgAdmin @sanity @language
    Examples:
      | role           |
      | orgAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/625
    #https://arabletestrail.testrail.io/index.php?/cases/view/59734
  Scenario Outline: T&C | Click on agree button for <role> user
    Given login to application with "<role>" credentials
    When click tour skip button and verify T&C page
    Then click on agree for T&C

    @T&C @TestRail(59734) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @T&C @TestRail(59734) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @T&C @TestRails(59734) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @T&C @TestRails(59734) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @T&C @TestRails(59734) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @T&C @TestRails(59734) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/22687
    #https://arabletestrail.testrail.io/index.php?/cases/view/59735
  Scenario Outline: T&C | Click on Disagree button for <role> user and verify arable tour navigation
    Given login to application with "<role>" credentials
    When click tour skip button and verify T&C page
    Then click on disagree for T&C

    @T&C @TestRail(59735) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @T&C @TestRail(59735) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @T&C @TestRails(59735) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @T&C @TestRails(59735) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @T&C @TestRails(59735) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @T&C @TestRails(59735) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/626
    #https://arabletestrail.testrail.io/index.php?/cases/view/59736
  Scenario Outline: T&C | Click back arrow for <role> user and verify arable tour navigation
    Given login to application with "<role>" credentials
    When click tour skip button and verify T&C page
    Then click back arrow for T&C and verify arable tour navigation

    @T&C @TestRail(59736) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @T&C @TestRail(59736) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @T&C @TestRails(59736) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @T&C @TestRails(59736) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @T&C @TestRails(59736) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @T&C @TestRails(59736) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/623
    #https://arabletestrail.testrail.io/index.php?/cases/view/59733
  Scenario Outline: T&C | Click Send By Email for <role> user and verify the toast message
    Given login to application with "<role>" credentials
    When click tour skip button and verify T&C page
    Then click Send By Email and verify the toast message

    @T&C @TestRail(59733) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @T&C @TestRail(59733) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @T&C @TestRails(59733) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @T&C @TestRails(59733) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @T&C @TestRails(59733) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @T&C @TestRails(59733) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |