Feature: Verify Map DropDown Options

	Scenario Outline: Map Drop Down Validations
    Given login to "<role>" credentials with applications
  #  When click tour skip button and verify T&C page
  #  Then click on agree for T&C
    Then Verify Map Drop Down Options

		@map @TestRail(65000) @orgAdmin @performance @sanity
    Examples:
      | role           |
      | orgAdminMobile |