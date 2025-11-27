package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Path to your .feature files
        glue = "stepdefinitions",                    // Step definition package
        publish = true,
//        monochrome = true,                        //monochrome is here uncomment it and comment "pretty to see it"
        plugin = {
                "pretty",
                "html:target/CucumberReport.html"
        },
        tags="@all and not @dev and not @wip"

)

public class MyRunnerNewCucumberCloudReport {

}
