Feature: ForgotPasswordFunctionality

  Scenario: Reset password on forgetting it
    #Same method was created in Search.feature file but it is considered unknown as of now
    Given User open app
    When User click on MyAccount
    And Selects LoginOption
    And Clicks on Forgot password
    #Same method was created in login.feature file but it has different Annotation(And/When) is it will not be a problem
    And User enters valid email address ""
    Then Confirmation message should be displayed