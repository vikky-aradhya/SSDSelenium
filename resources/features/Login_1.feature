Feature: Login into an application

  Background: User Navigates to application
    When User opens browser
    
  @Login_user_outline
  Scenario Outline: Login to app
    And user enters the username as "<username>"
    And user enters the password as "<password>"
    Then user clicks on Login
    And verify the Login Page title

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | java     | java     |