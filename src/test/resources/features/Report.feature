Feature: Verify Report Module Features

  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on reports icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on setting page should work
    Then User will able to see total six section of report category
#
  @Sanity
  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
    When User clicks on reports icon
    Then Respected report page displays






