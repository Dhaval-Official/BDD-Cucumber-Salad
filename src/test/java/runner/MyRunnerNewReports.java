package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Path to your .feature files
        glue = "stepdefinitions",                    // Step definition package
        plugin = {
                "pretty",
                "html:target/CucumberReport/CucumberReport.html",
                "json:target/CucumberReport/CucumberJson.json",
                "junit:target/CucumberReport/CucumberXml.xml"
        },
        tags="@all and not @dev and not @wip"

)

public class MyRunnerNewReports {
}
