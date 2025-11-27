package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*This Runnner will not work after whole Project has been Organized in V36*/
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tests",  // Path to your .feature files
        glue = "tests",                    // Step definition package
        plugin = {
                "pretty",
                "html:target/CucumberReport.html"
        },
        //will only run features with @casesIlike tag
        tags="@casesIlike"

)
public class MyRunnerWithTags {

}
