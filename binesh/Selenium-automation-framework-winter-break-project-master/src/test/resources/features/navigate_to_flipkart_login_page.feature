Feature: Login Functionality

  Scenario: Login using valid credentials id
    Given I am on the login page
    When I will enter my valid email or password
    And  I will click on Request OTP button
    And I will enter mobile number as valid mobile number
    And I will click on Continue button
    Then I should be asked to enter a valid Mobile number
