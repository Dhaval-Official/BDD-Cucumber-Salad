package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class Search {

    //this is called hook here
    @Before
    public void setup() {
        System.out.println("Browser got opened --- this is called from search.java file");
    }

    //this also is called hook here
    @After
    public void tearDown() {
        System.out.println("Browser got Closed --- this is called from search.java file");
    }

    @Given("User open app")
    public void User_open_app() {
        System.out.println(">> User opened the app");
    }

    @When("User enter valid product on search")
    public void userEnterValidProductOnSearch() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User Enters valid product");
    }

    @And("User click on Search")
    public void userClickOnSearch() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User Clicked on search");
    }

    @When("User enter invalid product on search")
    public void userEnterInvalidProductOnSearch() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User Enters Invalid product");
    }

    @Then("No Product should be displayed")
    public void noProductShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> No Product");
    }

    @Then("Valid product should appear")
    public void validProductShouldAppear() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> product searched successfully");
    }

    @When("User enter nothing")
    public void userEnterNothing() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> Entered Nothing");
    }

    @Then("Text should appear as nothing has searched")
    public void textShouldAppearAsNothingHasSearched() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(">> User Enter something");
    }

}
