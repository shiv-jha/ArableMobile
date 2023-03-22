Feature: Arable Tour

    #https://arabletestrail.testrail.io/index.php?/cases/view/57706
    #https://arabletestrail.testrail.io/index.php?/cases/view/59719
  Scenario Outline: ArableTour | Page text validation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then verify the titles on the arable tour page

    @tour @TestRail(59719) @orgAdmin @language @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59719) @member @language @sanity
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59719) @teamAdmin @language @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59719) @orgReader @language @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59719) @sysReader @language @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59719) @sysAdmin @language @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/57696
    #https://arabletestrail.testrail.io/index.php?/cases/view/59718
  Scenario Outline: ArableTour | Click tour skip button for <role> and verify T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then click tour skip button and verify T&C page

    @tour @TestRail(59718) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59718) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59718) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59718) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59718) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59718) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/58646
    #https://arabletestrail.testrail.io/index.php?/cases/view/59717
  Scenario Outline: ArableTour | Start and finish the tour by clicking on next for <role> then verify T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify T&C page after completing

    @tour @TestRail(59717) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59717) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59717) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59717) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59717) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59717) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59704
    #https://arabletestrail.testrail.io/index.php?/cases/view/59720
  Scenario Outline: ArableTour | Verify view map page for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view map fields
    And click on skip and verify T&C page

    @tour @TestRail(59720) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59720) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59720) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59720) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59720) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59720) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59705
    #https://arabletestrail.testrail.io/index.php?/cases/view/59721
  Scenario Outline: ArableTour | Verify map more info page for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify map more info fields
    And click on skip and verify T&C page

    @tour @TestRail(59721) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59721) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59721) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59721) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59721) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59721) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59706
    #https://arabletestrail.testrail.io/index.php?/cases/view/59722
  Scenario Outline: ArableTour | Verify map more info page for <role> then click on prev and verify view map page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify map more info fields
    And click on prev and verify view map page

    @tour @TestRail(59722) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59722) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59722) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59722) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59722) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59722) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59707
    #https://arabletestrail.testrail.io/index.php?/cases/view/59723
  Scenario Outline: ArableTour | Verify manage sites page for <role> then click on prev and verify map more info page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify manage sites fields
    And click on prev and verify map more info page

    @tour @TestRail(59723) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59723) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59723) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59723) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59723) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59723) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59708
    #https://arabletestrail.testrail.io/index.php?/cases/view/59724
  Scenario Outline: ArableTour | Verify manage sites for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify manage sites fields
    And click on skip and verify T&C page

    @tour @TestRail(59724) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59724) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59724) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59724) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59724) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59724) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59709
    #https://arabletestrail.testrail.io/index.php?/cases/view/59725
  Scenario Outline: ArableTour | Verify view activity page for <role> then click on prev and verify manage sites page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view activity fields
    And click on prev and verify manage sites page

    @tour @TestRail(59725) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59725) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59725) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59725) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59725) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59725) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59710
    #https://arabletestrail.testrail.io/index.php?/cases/view/59726
  Scenario Outline: ArableTour | Verify view activity page for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view activity fields
    And click on skip and verify T&C page

    @tour @TestRail(59726) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59726) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59726) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59726) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59726) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59726) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59711
    #https://arabletestrail.testrail.io/index.php?/cases/view/59727
  Scenario Outline: ArableTour | Verify view site details page for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view site details fields
    And click on skip and verify T&C page

    @tour @TestRail(59727) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59727) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59727) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59727) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59727) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59727) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59712
    #https://arabletestrail.testrail.io/index.php?/cases/view/59728
  Scenario Outline: ArableTour | Verify view site details page for <role> then click on prev and verify manage sites page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view site details fields
    And click on prev and verify view activity page

    @tour @TestRail(59728) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59728) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59728) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59728) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59728) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59728) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59713
    #https://arabletestrail.testrail.io/index.php?/cases/view/59729
  Scenario Outline: ArableTour | Verify dropdown expansion page for <role> then click on skip and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify dropdown expansion fields
    And click on skip and verify T&C page

    @tour @TestRail(59729) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59729) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59729) @teamAdmin @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59729) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59729) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59729) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59714
    #https://arabletestrail.testrail.io/index.php?/cases/view/59730
  Scenario Outline: ArableTour | Verify dropdown expansion page for <role> then click on prev and verify manage sites page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify dropdown expansion fields
    And click on prev and verify view site details page

    @tour @TestRail(59730) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59730) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59730) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59730) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59730) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59730) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/60641
    #https://arabletestrail.testrail.io/index.php?/cases/view/60643
  Scenario Outline: ArableTour | Verify view team data page for <role> then click on skip and verify dropDown expansion page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view team data fields
    And click on skip and verify T&C page

    @tour @TestRail(60643) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(60643) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(60643) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(60643) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(60643) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(60643) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/60642
    #https://arabletestrail.testrail.io/index.php?/cases/view/60644
  Scenario Outline: ArableTour | Verify view team data page for <role> then click on prev and verify dropDown expansion page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify view team data fields
    And click on prev and verify dropDown expansion page

    @tour @TestRail(60644) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(60644) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(60644) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(60644) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(60644) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(60644) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59715
    #https://arabletestrail.testrail.io/index.php?/cases/view/59731
  Scenario Outline: ArableTour | Verify send test alert page for <role> then click on finish and verify the T&C page navigation
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify send test alert fields
    And click on finish button and verify T&C page

    @tour @TestRail(59731) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59731) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59731) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59731) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59731) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59731) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59716
    #https://arabletestrail.testrail.io/index.php?/cases/view/59732
  Scenario Outline: ArableTour | Verify send test alert page for <role> then click on prev and verify manage sites page
    Given login to "<role>" credentials with applications
    When user on arable tour page
    Then start tour and verify send test alert fields
    And click on prev and verify view team data page

    @tour @TestRail(59732) @orgAdmin
    Examples:
      | role           |
      | orgAdminMobile |
    @tour @TestRail(59732) @member
    Examples:
      | role         |
      | memberMobile |
    @tour @TestRails(59732) @teamAdmin
    Examples:
      | role            |
      | teamAdminMobile |
    @tour @TestRails(59732) @orgReader
    Examples:
      | role            |
      | orgReaderMobile |
    @tour @TestRails(59732) @sysReader
    Examples:
      | role            |
      | sysReaderMobile |
    @tour @TestRails(59732) @sysAdmin
    Examples:
      | role           |
      | sysAdminMobile |

