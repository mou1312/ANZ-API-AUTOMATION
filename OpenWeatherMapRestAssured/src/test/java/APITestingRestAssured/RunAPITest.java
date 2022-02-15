package APITestingRestAssured;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featuresFiles",
        glue = {"APITestingRestAssured/stepDefinitions"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                   "junit:target/cucumber-reports/Cucumber.xml",
                   "html:target/cucumber-reports/html"},
        monochrome = true,
        tags = "@RegressionTest"
)

public class RunAPITest {
   // Runner


}
