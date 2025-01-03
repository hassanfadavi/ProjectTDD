package base.Examstepdefinations;

import config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Flipkart_Become_a_Seller_page;
import tests.browser.Base;
import utils.WaitUtils;

public class Navigate_to_Become_a_Seller_step extends Base {

    Flipkart_Become_a_Seller_page flipkart_become_a_seller_page;
    public WebDriver driver;


    @Before
    public void setup() {
        this.driver = DriverFactory.initializeWebDriver();
        this.flipkart_become_a_seller_page = new Flipkart_Become_a_Seller_page(driver);
    }

    @Given("The user is on the google web main page")
    public void The_user_is_on_the_google_web_main_page() {
        System.out.println("please print the bug in the console");
    }

    @When("The user click on Become a Seller button")
    public void The_user_click_on_Become_a_Seller_button() {
        flipkart_become_a_seller_page.clickOnBecomeASellerButton();
        WaitUtils.applyGlobalWait();
    }

    @And("The user click on Start Selling button")
    public void The_user_click_on_Start_Selling_button () {
        flipkart_become_a_seller_page.clickOnStartSellingButton();
        WaitUtils.applyGlobalWait();
    }

    @And("The user enter mobile number as valid value on Enter Mobile number input field")
    public void The_user_enter_mobile_number_as_valid_value_on_Enter_Mobile_number_input_field () {
        flipkart_become_a_seller_page.enterMobileNumber(510222222);
        WaitUtils.applyGlobalWait();
    }

    @And("The user enter email id as valid value on Email ID input field")
    public void The_user_enter_email_id_as_valid_value_on_Email_ID_input_field () {
        flipkart_become_a_seller_page.enterEmailID("benish.ranna@gmai.com");
        WaitUtils.applyGlobalWait();
    }

    @And("The user click on All Categories button")
    public void The_user_click_on_All_Categories_button() {
        flipkart_become_a_seller_page.clickOnAllCategories();
        WaitUtils.applyGlobalWait();
    }

    @And("The user enter GSTIN")
    public void The_user_enter_GSTIN() {
        flipkart_become_a_seller_page.enterGSTIN(3122);
        WaitUtils.applyGlobalWait();
    }

    @Then("The user click on Register & Continue button")
    public void The_user_click_on_Register_Continue_button() {
        flipkart_become_a_seller_page.registerAndContinueButton();
        WaitUtils.applyGlobalWait();
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}
