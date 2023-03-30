package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.hamcrest.CustomMatcher;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/reports.html" ,"pretty"},
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        monochrome = true,
        dryRun = true

)

public class ViewAllOrderRunner {
}
