Feature: Verify Alert features Options

	Scenario Outline: Alert Filtration Validations
    Given login to "<role>" credentials with applications
    Then Verify Alert Filtration Options

		@alert @TestRail(65000) @orgAdmin @performance @sanity
    Examples:
      | role           |
      | orgAdminMobile |