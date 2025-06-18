Feature: Login Page

  Background:
    Given the user is on Login Page

  @smoke
  Scenario: Login successful

    When the user enters valid username and password
    And the user clicks login
    Then the user should be logged in successfully

  @wip
  Scenario: Unsuccessful login with invalid credentials

    When the user enters invalid username and password
    And the user clicks the login button
    Then the user should not be logged in succesfully

