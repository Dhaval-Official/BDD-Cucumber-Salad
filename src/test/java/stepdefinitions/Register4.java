package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
/*
    @BeforeStep
    public void beforeEveryStep() {
        System.out.println("This will be executed before every Step --- this is called from Register4.java file");
    }

    @AfterStep
    public void afterEveryStep() {
        System.out.println("This will be executed after every Step --- this is called from Register4.java file");
    }

    @BeforeStep("@RegisterMe2")
    public void setupRegister42() {
        System.out.println("Browser got opened Again --- this is called from Register4.java file");
    }

    //this RegisterMe
    @BeforeStep("@RegisterMe2")
    public void tearDownRegister42() {
        System.out.println("Browser got Closed Again --- this is called from Register4.java file");
    }
*/

//  V31
/*
    @Before(order=0)
    public void setupRegisterA() {
        System.out.println("Browser got opened --- this is called from Register4.java file");
    }

     @Before(order=1)
    public void setupRegisterB() {
        System.out.println("Browser got opened --- this is called from Register4.java file");
    }

     @Before(order=2)
    public void setupRegisterC() {
        System.out.println("Browser got opened --- this is called from Register4.java file");
    }
 */


}
