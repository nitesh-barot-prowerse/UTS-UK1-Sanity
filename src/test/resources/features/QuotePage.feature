Feature: Verify Quote Module Features


  Background:
    Given User should log in with username "kavyajakkula" and password "VLJakkkav$9" to the admin panel
    When User clicks on quote icon on left tool bar

  @Sanity
  Scenario: Manage Quote page displays with list of quotes.
    Then Manage quote page displays with list of quote

  @Sanity
  Scenario:To verify dates under Quote date and Expire date columns displays in dd-mm-yyyy format
    Then User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format


  @Sanity
  Scenario:Data under total and monthly premium column should prefixed by £ sign
    Then User will able to see  all data under total and monthly premium colum prefixed by £ sign

  @Sanity
  Scenario:On the Add Quote page, verify that the Product dropdown appears with list of products
    When User clicks on add quote button
    Then On add quote page product dropdown will appear with desired list

  @Sanity
  Scenario: Respected quote information page will be displayed upon clicking quote number on manage quote page
    When User clicks on quote number on manage quote page
    Then Quote Information page displays with details

  @Sanity
  Scenario: Fetch list of quote based on product option from product dropdown on manage quote page
    When User selects appropriate option from product dropdown on manage quote page
    And User clicks on search button on manage quote page
    Then Appropriate list of quote will display

  @Sanity
  Scenario: Fetch list of quote based on option from Is referred dropdown on manage quote page
    When User selects appropriate option from Is referred dropdown on manage quote page
    And User clicks on search button on manage quote page
    Then Appropriate list of quote will display upon drop down option








