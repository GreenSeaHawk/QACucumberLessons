Feature: Login Page

  @smoke
  Scenario: Login successful

    Given the user is on Login Page
    When the user enters valid username and password
    And the user clicks login
    Then the user should be logged in successfully

  @wip
  Scenario: Login with invalid credentials

    Given the user is on Login Page
    When the user enters invalid username and password
    And the user clicks login
    Then the user should not be logged in
    And receive an error message