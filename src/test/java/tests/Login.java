package tests;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;


public class Login {


    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        System.out.println(">> User got navigated to login page");
    }
/* these are old methods that does not support TDD
    @When("User enters valid email address {string}")
    public void user_enters_valid_email_address(String string) {
        System.out.println(">> User Enters valid email address "+string);
    }

    @When("Enters valid password {string}")
    public void enters_valid_password(String string) {
        System.out.println(">> User Enters passwords "+ string);
    }
*/
    @When("Clicks on Login button")
    public void clicks_on_login_button() {
        System.out.println(">> User click on Login");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println(">> User gets logged in successfully");
    }

    @Then("User should get a proper warning message")
    public void user_should_get_a_proper_warning_message() {
        System.out.println(">> User gets a warning message");
    }


    @When("^User enters valid email address (.+)$")
    public void userEntersValidEmailAddressEmail(String email) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User has Entered valid email address "+email);
    }

    @And("^Enters valid password (.+)$")
    public void entersValidPasswordPwd(String pwd) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User has Entered valid email address "+pwd);
    }
}
