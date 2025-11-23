package tests;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class Register{

    @Given("^User navigates to register page$")
    public void user_navigates_to_register_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Navigating");
    }


    @When("User enters Fname {string}")
    public void entersFname(String fName) {
        System.out.println(">> Entering fName "+fName);
    }

    @And("Enters Lname {string}")
    public void entersLname(String lName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Entering fName "+lName);
    }

    @And("Enters email address {string}")
    public void entersEmailAddress(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Entering email "+arg0);
    }

    @And("Enters mobile {string}")
    public void entersMobile(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Entering number "+arg0);
    }

    @And("Enters pwd {string}")
    public void entersPwd(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Entering pwd "+arg0);
    }

    @And("Selects Newsletter field")
    public void selectsNewsletterField() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Selecting News letter option");
    }

    @And("Enters confirmpwd {string}")
    public void entersConfirmpwd(String confirmPwd) {
        System.out.println(">> Entering confirmpwd " + confirmPwd);
    }

    @And("Selects Privacy field")
    public void selectsPrivacyField() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Select privacy");
    }

    @And("Clicks on continue")
    public void clicksOnContinue() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Click on continue");
    }

    @Then("Account should be created successfully")
    public void accountShouldBeCreatedSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Verify successful");
    }

    @When("User does not enter any fields")
    public void userDoesNotEnterAnyFields() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Nothing entered");
    }

    @Then("Warning messages should be displayed")
    public void warningMessagesShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Verify Unsuccessful");
    }

    @Then("Warning for duplicate should appear")
    public void warningForDuplicateShouldAppear() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Verify Duplicate found");
    }
}
