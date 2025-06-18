Feature: Login Page

  @regression
  Scenario Outline: Login with valid credentials

    Given the user is on Login Page
    When the user enters <username> and <password>
    And the user clicks login
    Then the user should be logged in succesfully

    Examples:
      | username | password      |
      | april    | 123456        |
      | chay     | coolpassword! |
      | andrew   | myPWORD       |

