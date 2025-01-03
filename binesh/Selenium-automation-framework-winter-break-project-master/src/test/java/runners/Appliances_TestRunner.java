package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (

        features = "src/test/resources/features/navigate_to_flipkart_login_page.feature",
        glue = "stepdefinations"
//        tags = "@smoke"
)

public class Appliances_TestRunner extends AbstractTestNGCucumberTests {



}
