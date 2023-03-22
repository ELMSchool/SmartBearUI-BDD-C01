package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },

        features = {"src/test/resources/features"},
        glue = {"step_definitions"},
        dryRun = false
)
public class CukesRunner {

}
