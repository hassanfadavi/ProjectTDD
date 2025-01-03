@Become_a_Seller
  Feature: Become_a_Seller


    Scenario: navigate to Become a Seller page
      Given The user is on the google web main page
      When The user click on Become a Seller button
      And The user click on Start Selling button
      And The user enter mobile number as valid value on Enter Mobile number input field
      And The user enter email id as valid value on Email ID input field
      And The user click on All Categories button
      And The user enter GSTIN
      Then The user click on Register & Continue button


#Feature: Navigate to flipkart
#
#
#  Scenario: Navigate to flipkart Become a Seller Page
#    Given I am on the flipkart web page seller
#    When I click on the become a seller button
#    Then I should see become a seller page