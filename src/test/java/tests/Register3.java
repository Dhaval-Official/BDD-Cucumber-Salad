package tests;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register3 {

    //here only cucumber expressions are used

    @Given("User navigates to register page3")
    public void user_navigates_to_register_page() {
        System.out.println(">> Navigating");
    }

    @When("User enters Fname3 {word} as Fname")
    public void entersFname(String fName) {
        System.out.println(">> Entering fName "+fName);
    }

    @And("Enters Lname {string} as Lname")
    public void entersLnameAsLname(String lName) {
        System.out.println(">> Entering fName "+lName);
    }

    @And("Enters email address3 {string}")
    public void entersEmailAddress(String arg0) {
        System.out.println(">> Entering email "+arg0);
    }

    @And("Enters mobile3 {string}")
    public void entersMobile(String arg0) {
        System.out.println(">> Entering number "+arg0);
    }

    @And("Enters pwd3 {int}")
    public void entersPwd3(int a) {
        System.out.println(">> Entering pwd "+a);
    }

    @And("Enters confirmpwd3 {int}")
    public void entersConfirmpwd(int a) {
        System.out.println(">> Entering confirmpwd " + a);
    }

    @And("Selects Newsletter field3")
    public void selectsNewsletterField() {
        System.out.println(">> Selecting News letter option");
    }

    @And("Selects Privacy field3")
    public void selectsPrivacyField() {
        System.out.println(">> Select privacy");
    }

    @And("Clicks on continue3")
    public void clicksOnContinue() {
        System.out.println(">> Click on continue");
    }

    @Then("Account should be created successfully3")
    public void accountShouldBeCreatedSuccessfully() {
        System.out.println(">> Verify successful");
    }

    @When("User does not enter any fields3")
    public void userDoesNotEnterAnyFields() {
        System.out.println(">> Nothing entered");
    }

    @Then("Warning messages should be displayed3")
    public void warningMessagesShouldBeDisplayed() {
        System.out.println(">> Verify Unsuccessful");
    }

    @Then("Warning for duplicate should appear3")
    public void warningForDuplicateShouldAppear() {
        System.out.println(">> Verify Duplicate found");
    }

}
