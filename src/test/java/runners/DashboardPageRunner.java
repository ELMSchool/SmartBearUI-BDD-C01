package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty",
                "junit:target/cucumber-reports/report.xml",
                "html:target/cucumber-reports/reports.html"},
        features ="src/test/resources/features" ,
        glue = {"step_definitions"},
        dryRun = false,
        monochrome = true
)
public class DashboardPageRunner {

}
