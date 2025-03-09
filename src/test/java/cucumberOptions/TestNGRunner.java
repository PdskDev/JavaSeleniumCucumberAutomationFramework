package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        dryRun = true,
        glue = "stepDefinitions",
        tags = "@SmokeTest or @MultipleUsers or @NetBanking",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html", "json:target/cucumber-report/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {}
