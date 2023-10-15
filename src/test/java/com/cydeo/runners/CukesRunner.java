package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.cydeo.step_definitions",
        dryRun = false,
        tags = "@EtsyAppLogin", // Change this tag based on your actual tag for Appium mobile tests
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml"
        },
        publish = true
)
public class CukesRunner {
        // Add any specific configuration or before/after methods if needed
}
