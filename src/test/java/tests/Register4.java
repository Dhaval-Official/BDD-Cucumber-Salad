package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register4 {

    //Tagged Hooks are called here
    @Before("@RegisterMe")
    public void setupRegister4() {
        System.out.println("Browser got opened --- this is called from Register4.java file");
    }

    //this RegisterMe
    @After("@RegisterMe")
    public void tearDownRegister4() {
        System.out.println("Browser got Closed --- this is called from Register4.java file");
    }

}
