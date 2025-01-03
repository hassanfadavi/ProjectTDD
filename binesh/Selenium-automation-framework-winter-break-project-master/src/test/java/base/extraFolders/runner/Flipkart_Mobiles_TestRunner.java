package base.extraFolders.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@navigation"

)

public class Flipkart_Mobiles_TestRunner extends AbstractTestNGCucumberTests {

}
