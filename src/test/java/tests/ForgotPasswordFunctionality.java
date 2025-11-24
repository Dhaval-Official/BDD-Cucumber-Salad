package tests;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordFunctionality {

    //this will give error as same @Given is used in Search.java file------------------------------------------------------------------
/*    @Given("User open app")
    public void User_open_app() {
        System.out.println(">> Application url opened [opening comments will give DuplicateStepDefinition Exception]");
    }

*/
/*
    @When("^User enters valid email address (.+)$")
    public void userEntersValidEmailAddressEmail(String email) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User has Entered valid email address "+email);
    }
*/
    @Given("User click on MyAccount")
    public void User_click_on_MyAccount() {
        System.out.println(">> User clicked on My Account");
    }

    @And("Selects LoginOption")
    public void selectsLoginOption() {
        System.out.println(">> Select login option");
    }

    @And("Clicks on Forgot password")
    public void clicksOnForgotPassword() {
        System.out.println(">> User clicked on forgot pwd");
    }

    @Then("Confirmation message should be displayed")
    public void confirmationMessageShouldBeDisplayed() {
        System.out.println(">> Confirmation message should be displayed");
    }
}
