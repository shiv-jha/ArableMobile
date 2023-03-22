Feature: Login

    #https://arabletestrail.testrail.io/index.php?/cases/view/189
    #https://arabletestrail.testrail.io/index.php?/cases/view/59698
  @login @TestRail(59698) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
  Scenario: Login | Back arrow functionality and verify getStarted page navigation
    When user on login page
    Then click on back arrow and verify user landed on get started page

    #https://arabletestrail.testrail.io/index.php?/cases/view/197
    #https://arabletestrail.testrail.io/index.php?/cases/view/59699
  @login @TestRail(59699) @language @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
  Scenario: Login | Fields and text validation
    When user on login page
    Then verify the title on the login page

    #https://arabletestrail.testrail.io/index.php?/cases/view/144
    #https://arabletestrail.testrail.io/index.php?/cases/view/59696
  @login @TestRail(59696) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
  Scenario: Login | Click on forgot password and verify navigation
    Given user on login page
    When click on forgot password field
    Then verify forgot password page navigation

    #https://arabletestrail.testrail.io/index.php?/cases/view/145
    #https://arabletestrail.testrail.io/index.php?/cases/view/59697
  @login @TestRail(59697) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
  Scenario: Login | Click on contact support email and verify gmail navigation
    Given user on login page
    When click on support emailId field
    Then verify gmail page navigation

    #https://arabletestrail.testrail.io/index.php?/cases/view/210
    #https://arabletestrail.testrail.io/index.php?/cases/view/59694
  Scenario Outline: Invalid login | Login to app with invalid credentials and verify the error field displayed
    Given user on login page
    When login application with invalid "<role>" credentials
    Then verify the error message displayed

    @login @TestRail(59694) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
    Examples:
      | role    |
      | invalid |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59692
    #https://arabletestrail.testrail.io/index.php?/cases/view/59701
  Scenario Outline: Invalid login | Login to app with invalid credentials and verify the error message text
    Given user on login page
    When login application with invalid "<role>" credentials
    Then verify the error message text

    @login @TestRail(59701) @language @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
    Examples:
      | role    |
      | invalid |

    #https://arabletestrail.testrail.io/index.php?/cases/view/59691
    #https://arabletestrail.testrail.io/index.php?/cases/view/59700
  Scenario Outline: Login | Login to app with invalid and then with valid credentials
    Given user on login page
    When login application with invalid "<invalid_role>" credentials
    Then verify the error and login with "<valid_role>" credentials

    @login @TestRail(59700) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
    Examples:
      | invalid_role | valid_role     |
      | invalid      | orgAdminMobile |

    #https://arabletestrail.testrail.io/index.php?/cases/view/141
    #https://arabletestrail.testrail.io/index.php?/cases/view/143
    #https://arabletestrail.testrail.io/index.php?/cases/view/59693
    #https://arabletestrail.testrail.io/index.php?/cases/view/59695
  Scenario Outline: Login | Login to app with <role> credentials
    When user on login page
    Then login application with "<role>" credentials

    @login @TestRail(59693) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @login @TestRails(59695) @orgAdmin @sanity
    Examples:
      | role           |
      | orgAdminMobile |
    @login @TestRail(59693) @member @sanity
    Examples:
      | role         |
      | memberMobile |
    @login @TestRails(59693) @teamMember @sanity
    Examples:
      | role            |
      | teamAdminMobile |
    @login @TestRails(59693) @orgReader @sanity
    Examples:
      | role            |
      | orgReaderMobile |
    @login @TestRails(59693) @sysReader @sanity
    Examples:
      | role            |
      | sysReaderMobile |
    @login @TestRails(59693) @sysAdmin @sanity
    Examples:
      | role           |
      | sysAdminMobile |
