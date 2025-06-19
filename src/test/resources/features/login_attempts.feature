Feature: Login Functionality

  @regression
  Scenario Outline: Login with valid credentials

    Given the user is on the Login Page
    When the user enters <username> and <password>
    And the user clicks on login
    Then the user should be logged in succesfully
    And the page should navigate to the users profile

    Examples:
      | username  | Password    |
      | invalid1  | wrongPass   |
      | validUser | wrongPass   |
      | invalid2  | correctPass |