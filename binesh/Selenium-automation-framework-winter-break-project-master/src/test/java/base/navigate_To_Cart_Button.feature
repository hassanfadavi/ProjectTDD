@shoppingCartButton
  Feature: Cart Functionality

    Scenario: navigate to shopping cart button
      Given I am on Flipkart web main page
      When I click on Cart button
      Then I should see Missing Cart items?
