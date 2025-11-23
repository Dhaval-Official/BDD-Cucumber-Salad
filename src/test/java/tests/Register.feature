 Feature: User Registration

   Scenario: Register with mandatory fields
     Given User navigates to register page
     When User enters Fname "Dhaval"
     And Enters Lname "Lakhani"
     And Enters email address "dha@gmail.com"
     And Enters mobile "1234567890"
     And Enters pwd "12345"
     And Enters confirmpwd "12345"
     And Selects Privacy field
     And Clicks on continue
     Then Account should be created successfully

   Scenario: Register with all fields
     Given User navigates to register page
     When User enters Fname "Dhaval"
     And Enters Lname "Lakhani"
     And Enters email address "dha1@gmail.com"
     And Enters mobile "1234567890"
     And Enters pwd "12345"
     And Enters confirmpwd "12345"
     And Selects Newsletter field
     And Selects Privacy field
     And Clicks on continue
     Then Account should be created successfully

   Scenario: Register with no fields
     Given User navigates to register page
     When User does not enter any fields
     And Clicks on continue
     Then Warning messages should be displayed

   Scenario: Register with duplicate fields
     Given User navigates to register page
     When User enters Fname "Dhaval"
     And Enters Lname "Lakhani"
     And Enters email address "dha@gmail.com"
     And Enters mobile "1234567890"
     And Enters pwd "12345"
     And Enters confirmpwd "12345"
     And Selects Privacy field
     And Clicks on continue
     Then Warning for duplicate should appear

   Scenario: Trial
     Given User navigates to register page
