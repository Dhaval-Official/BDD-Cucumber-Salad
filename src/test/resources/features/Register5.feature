Feature: User Registration
#used in Register5
  Background:
    Given User navigates to register page3

  Scenario: Register with mandatory fields at once
    When User enters below details into fields at once
    |fName  | Dhaval    |
    |lName  | Lakhani   |
    |email  | dha@g.com |
    |mobile | 123456789 |
    |pass   | aasdfghhj |
    And Selects Privacy field3
    And Clicks on continue3
    Then Account should be created successfully3


