package base.extraFolders.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations"

)

public class FlipkartLogin_TestRunner extends AbstractTestNGCucumberTests {
}