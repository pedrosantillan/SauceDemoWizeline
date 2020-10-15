Feature: sauce demo 2
  Background:
    Given the user was logged in correctly "standard_user" "secret_sauce"

  Scenario: 3-Logout from products page
    When the user clicks on logout
    Then the user validate that was logout correctly

  Scenario: 4-navigate to the shopping cart
    When the user clicks on shopping cart icon
    Then the user Validates that navigate to the shopping cart page

  Scenario: 5-add a single item to the shopping cart
    And the user adds a single item to the shopping cart
    When the user clicks on shopping cart icon
    Then the user Validates that the item has been added to the shopping cart

  Scenario: 6-add multiple items to the shopping cart
    And the user adds multiple items to the shopping cart
    When the user clicks on shopping cart icon
    Then the user Validates that the items have been added to the shopping cart

  Scenario Outline: 7-missing zip code information
    And the user adds multiple items to the shopping cart
    When the user clicks on shopping cart icon
    And the user clicks on checkout button
    And the user fills the information except zip postal code "<firstName>" "<lastName>"
    Then the user validates that error message is displayed on the users information page
    Examples:
      | firstName     | lastName       |
      | Pedro         | Santillan |

  Scenario: 8-fill users information
    And the user adds multiple items to the shopping cart
    When the user clicks on shopping cart icon
    And the user clicks on checkout button
    And the user fills the information "pedro" "santillan" "44360"
    Then the user validates that navigate to the checkout overview

  Scenario: 9-final order items
    And the user adds multiple items to the shopping cart
    When the user clicks on shopping cart icon
    And the user clicks on checkout button
    And the user fills the information "pedro" "santillan" "44360"
    Then the user Validates items in the overview page match with the added items

  Scenario: 10-complete a purchase
    And the user adds multiple items to the shopping cart
    When the user clicks on shopping cart icon
    And the user clicks on checkout button
    And the user fills the information "pedro" "santillan" "44360"
    And the user clicks on finish button
    Then the user Validates that navigate to the confirmation page