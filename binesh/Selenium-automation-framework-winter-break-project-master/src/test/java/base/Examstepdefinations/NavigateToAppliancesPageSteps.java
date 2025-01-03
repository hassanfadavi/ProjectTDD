package base.Examstepdefinations;

import enums.WaitStrategy;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import tests.browser.Base;
import tests.browser.DriverManager;
import utils.WaitUtils;

public class NavigateToAppliancesPageSteps extends Base {

    LandingPage flipKartLandingPage;


    @Before
    public void setup () {
        super.setup();
       // this.flipKartLandingPage = new LandingPage(driver);

    }

        @Given("I am on the flipkart web page appliances")
        public void i_am_on_the_flipkart_web_page_appliances() {
        }

        @When("I click on the appliances button")
        public void i_click_on_the_appliances_button() {
           this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
           WaitUtils.applyWait(driver,flipKartLandingPage.appliancesButton, WaitStrategy.VISIBLE);
            WaitUtils.applyGlobalWait();
           WaitUtils.applyWait(driver,flipKartLandingPage.appliancesButton, WaitStrategy.CLICKABLE);
            flipKartLandingPage.clickOnAppliancesButton();

        }

        @Then("I should see appliances page")
        public void i_should_see_appliances_page() throws InterruptedException {
            Thread.sleep(2000);
        }


//        @After
//    public void tearDown() {
//        super.tearDown();
//
//        }

    }

