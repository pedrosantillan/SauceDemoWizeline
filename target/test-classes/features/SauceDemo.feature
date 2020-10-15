Feature: sauce demo 1

  Scenario Outline: 1-login with a valid user
    Given the user goes to login page
    When the user enters valid credentials "<userName>" "<passWord>"
    Then the user validates that was logged  in correctly
    Examples:
      | userName     | passWord       |
      | standard_user | secret_sauce |

  Scenario Outline: 2-login with an invalid user
    Given the user goes to login page
    When the user enters invalid credentials "<userName>" "<passWord>"
    Then the user Validates that error message is displayed
    Examples:
      | userName     | passWord       |
      | invalid_user | secret_sauce |