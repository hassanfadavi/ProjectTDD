package base.extraFolders.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@Become_a_Seller"

)

public class Flipkart_Become_a_Seller_TestRunner extends AbstractTestNGCucumberTests{


}
