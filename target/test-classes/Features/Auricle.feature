Feature: Verify auricle home page

  Scenario: Validate Home Page Video Section
    Given User is on auricle application
    When User click next button and done button and click on start now button
    Then User verify "Join Auricle Now!" message is displayed
    And User enters Phone number click on send otp button and enter otp click on Verify button
    And User click on vidoes option from navigation bar
    Then User verify videos page is displayed
    
    Scenario: Validate Home Page Image Section
    Given User is on auricle application
    When User click next button and done button and click on start now button
    Then User verify "Join Auricle Now!" message is displayed
    And User enters Phone number click on send otp button and enter otp click on Verify button
    And User click on image option from navigation bar
    Then User verify image page is displayed
  