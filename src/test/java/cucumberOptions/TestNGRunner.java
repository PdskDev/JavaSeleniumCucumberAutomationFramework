package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "not @SmokeTest",
        monochrome = true,
        plugin = {"html:target/cucumber-report/cucumber.html", "json:target/cucumber-report/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {}
