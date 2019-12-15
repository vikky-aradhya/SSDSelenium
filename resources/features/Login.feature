Feature: Login into an application

  Background: User Navigates to application
    When User opens browser

  @Login_user
  Scenario: Login
    Given test data is read from excel "Login1" under "Sheet1"
    And user enters the username
    And user enters the password
    Then user clicks on Login
    And verify the Login Page title
    And fill in the flight details
    Then choose the preferences
