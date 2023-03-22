Feature: Forgot password

    #https://arabletestrail.testrail.io/index.php?/cases/view/60084
    #https://arabletestrail.testrail.io/index.php?/cases/view/60088
  @forgotPassword @TestRail(60088) @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity
  Scenario: Forgot password | Click on back arrow button and verify signIn page navigation
    When user on forgot password
    Then click on back arrow and verify signIn landing page

    #https://arabletestrail.testrail.io/index.php?/cases/view/60085
    #https://arabletestrail.testrail.io/index.php?/cases/view/60089
  @forgotPassword @TestRail(60089) @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity @language
  Scenario: Forgot password | Fields and text validation
    When user on forgot password
    Then verify the title on the forgot password page

    #https://arabletestrail.testrail.io/index.php?/cases/view/211
    #https://arabletestrail.testrail.io/index.php?/cases/view/60090
    #https://arabletestrail.testrail.io/index.php?/cases/view/60091
  Scenario Outline: Forgot password | Click on continue by entering <incorrect> email and verify the error message
    Given user on forgot password
    When enter "<incorrect>" email Id
    Then verify the "<incorrect>" email error message

    @forgotPassword @TestRail(60090) @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity @language
    Examples:
      | incorrect |
      | invalid   |

    @forgotPassword @TestRail(60091) @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity @language
    Examples:
      | incorrect          |
      | invalidWithAddress |

    #https://arabletestrail.testrail.io/index.php?/cases/view/60086
    #https://arabletestrail.testrail.io/index.php?/cases/view/60092
  @forgotPassword @TestRail(60092) @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity
  Scenario Outline: Forgot password | Click on continue by entering valid email and verify the error message
    Given user on forgot password
    When enter valid "<role>" emailId
    Then verify the enter temporary password page navigation

    Examples:
      | role  |
      | valid |