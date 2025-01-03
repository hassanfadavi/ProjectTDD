package base.extraFolders.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@shoppingCartButton"
)

public class Flipkart_Shopping_Cart_Button_TestRunner extends AbstractTestNGCucumberTests {
}
