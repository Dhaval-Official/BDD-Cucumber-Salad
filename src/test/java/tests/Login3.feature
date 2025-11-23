Feature: User Login
  Registered User should be able to login to access account details

  Background:
    Given User navigates to login page

  Scenario Outline: Login with valid credentials
    When User enters valid email address <email>
    And Enters valid password <pwd>
    And Clicks on Login button
    Then User should login successfully
    Examples:
    | email                | pwd   |
    | dhaval1BDD@gmail.com | 12345 |
    | dhaval2BDD@gmail.com | 12345 |
    | dhaval3BDD@gmail.com | 12345 |


  Scenario: Login with invalid credentials
    When User enters valid email address "dhavalBDDFaaaaaaaaaaaake@gmail.com"
    And Enters valid password "1111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with valid email address and invalid password
    When User enters valid email address "dhavalBDD@gmail.com"
    And Enters valid password "1111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with invalid email address and valid password
    When User enters valid email address "dhavalBDDFaaaaaaaaaaaaake@gmail.com"
    And Enters valid password "12345"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login without any creds
    When User enters valid email address ""
    And Enters valid password ""
    And Clicks on Login button
    Then User should get a proper warning message

