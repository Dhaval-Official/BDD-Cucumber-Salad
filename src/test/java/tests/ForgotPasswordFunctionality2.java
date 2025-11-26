package tests;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ForgotPasswordFunctionality2 {

    @Before(order = 7, value = "@F2 and @F3")
    public void onlyForForgotPassword2() {
        System.out.println("Only hook for F2 & F3 specific");
    }
}
