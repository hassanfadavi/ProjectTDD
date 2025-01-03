@flipkartCreateAccount
Feature: Create flipkart account

  Scenario: create an account with valid credentials
    Given  The user is on the Flipkart main web page
    When The user click on Login button
    And The user click on Create an account button
    And The user enter Mobile number as valid value on Enter Mobile number input field
    And The user click on CONTINUE button
    Then The user will see this message, Please enter a valid Mobile number




