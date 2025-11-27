package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    @Before
    public void setupHook() {
        System.out.println("++++ called from Before Hook");
    }

    @After
    public void tearDownHook() {
        System.out.println("++++ called from After Hook");
    }

}
