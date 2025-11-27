Feature: User Login
  Registered User should be able to login to access account details

  Scenario: Login with valid credentials
    Given User navigates to login page
    When User enters valid email address "dhavalBDD@gmail.com"
    And Enters valid password "12345"
    And Clicks on Login button
    Then User should login successfully

  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters valid email address "dhavalBDDFaaaaaaaaaaaake@gmail.com"
    And Enters valid password "1111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with valid email address and invalid password
    Given User navigates to login page
    When User enters valid email address "dhavalBDD@gmail.com"
    And Enters valid password "1111"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with invalid email address and valid password
    Given User navigates to login page
    When User enters valid email address "dhavalBDDFaaaaaaaaaaaaake@gmail.com"
    And Enters valid password "12345"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login without any creds
    Given User navigates to login page
    When User enters valid email address ""
    And Enters valid password ""
    And Clicks on Login button
    Then User should get a proper warning message

