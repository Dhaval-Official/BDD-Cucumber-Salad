package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login4 {

    //here only regular expressions are used

    @Given("^User navigates to login page4$")
    public void user_navigates_to_login_page() {
        System.out.println(">> User got navigated to login page");
    }


/*  these are old methods that does not support TDD
    @When("User enters valid email address {string}")
    public void user_enters_valid_email_address(String string) {
        System.out.println(">> User Enters valid email address "+string);
    }

    @When("Enters valid password {string}")
    public void enters_valid_password(String string) {
        System.out.println(">> User Enters passwords "+ string);
    }
*/
    @When("^Clicks on Login button4")
    public void clicks_on_login_button() {
        System.out.println(">> User click on Login");
    }

    @Then("^User should login successfully4")
    public void user_should_login_successfully() {
        System.out.println(">> User gets logged in successfully");
    }

    @Then("^User should get a proper warning message4")
    public void user_should_get_a_proper_warning_message() {
        System.out.println(">> User gets a warning message");
    }


    @When("^User enters valid email address4 (.+)$")
    public void userEntersValidEmailAddressEmail(String email) {
        System.out.println(">> User has Entered valid email address "+email);
    }

    @And("^Enters valid password4 (.+)$")
    public void entersValidPasswordPwd(String pwd) {
        System.out.println(">> User has Entered valid email address "+pwd);
    }
}
