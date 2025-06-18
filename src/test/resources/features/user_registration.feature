Feature: User Registration

  @wip
  Scenario: Successful Registration

    Given the user is on the Registration Page
    When the user enters valid name, email and password
    And the user clicks register
    Then the user should be registered successfully
    And the users details should be entered into the database

