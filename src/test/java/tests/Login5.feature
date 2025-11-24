@all
Feature: User Login
  Registered User should be able to login to access account details
#UserDefined Tags
  Background:
    Given User navigates to login page4

    @login @validCreds @smoke  @regression
  Scenario Outline: Login with valid credentials
    When User enters valid email address4 <email>
    And Enters valid password4 <pwd>
    And Clicks on Login button4
    Then User should login successfully4
    Examples:
    | email                | pwd   |
    | dhaval1BDD@gmail.com | 12345 |
    | dhaval2BDD@gmail.com | 12345 |
    | dhaval3BDD@gmail.com | 12345 |


  @login @regression @invalids
  Scenario: Login with invalid credentials
    When User enters valid email address4 "dhavalBDDFaaaaaaaaaaaake@gmail.com"
    And Enters valid password4 "1111"
    And Clicks on Login button4
    Then User should get a proper warning message4

  @login @regression @invalids
  Scenario: Login with valid email address and invalid password
    When User enters valid email address4 "dhavalBDD@gmail.com"
    And Enters valid password4 "1111"
    And Clicks on Login button4
    Then User should get a proper warning message4

  @login @smoke @invalids @casesIlike
  Scenario: Login with invalid email address and valid password
    When User enters valid email address4 "dhavalBDDFaaaaaaaaaaaaake@gmail.com"
    And Enters valid password4 "12345"
    And Clicks on Login button4
    Then User should get a proper warning message4

  @login @smoke @invalids
  Scenario: Login without any creds
    When User enters valid email address4 ""
    And Enters valid password4 ""
    And Clicks on Login button4
    Then User should get a proper warning message4

