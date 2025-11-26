Feature: User Registration
#Regular Expressions use in Register3.java file
  Background:
    Given User navigates to register page3

  @RegisterMe
  Scenario: Register with mandatory fields
    When User enters Fname3 "Dhaval" as Fname
    And Enters Lname "Lakhani" as Lname
    And Enters email address3 "dha@gmail.com"
    And Enters mobile3 "1234567890"
    And Enters pwd3 12345
    And Enters confirmpwd3 123
    And Selects Privacy field3
    And Clicks on continue3
    Then Account should be created successfully3

  @RegisterMe
  Scenario: Register with all fields
    When User enters Fname3 "Dhaval" as Fname
    And Enters Lname "Lakhani" as Lname
    And Enters email address3 "dha1@gmail.com"
    And Enters mobile3 "1234567890"
    And Enters pwd3 12345
    And Enters confirmpwd3 123
    And Selects Newsletter field3
    And Selects Privacy field3
    And Clicks on continue3
    Then Account should be created successfully3
