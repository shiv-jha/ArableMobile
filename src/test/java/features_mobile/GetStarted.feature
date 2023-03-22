Feature: Get started

    #https://arabletestrail.testrail.io/index.php?/cases/view/135
    #https://arabletestrail.testrail.io/index.php?/cases/view/59702
  @getStarted @TestRail(59702) @language @regression @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin @sanity
  Scenario: GetStarted | Page text validation
    When user on getStarted page
    Then verify the titles on the page

    #https://arabletestrail.testrail.io/index.php?/cases/view/133
    #https://arabletestrail.testrail.io/index.php?/cases/view/59703
  @getStarted @TestRail(59703) @sanity @orgAdmin @member @teamAdmin @orgReader @sysReader @sysAdmin
  Scenario: GetStarted | Click on getStarted button and verify login page navigation
    When user on getStarted page
    Then click on the get started button and verify login page