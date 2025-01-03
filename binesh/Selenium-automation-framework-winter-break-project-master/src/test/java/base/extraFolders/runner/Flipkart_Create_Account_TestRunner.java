package base.extraFolders.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@flipkartCreateAccount"
)

public class Flipkart_Create_Account_TestRunner extends AbstractTestNGCucumberTests {
}
