package base.Examstepdefinations;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Flipkart_Create_Account_Page;


public class Create_An_Account_On_Flipkart_Step extends BaseTest {


    Flipkart_Create_Account_Page flipkartCreateAccountPage= new Flipkart_Create_Account_Page(driver);

    @Before
    public void setup(){
        super.setup();

    }

    @Given("The user is on the Flipkart main web page")
    public void The_user_is_on_the_Flipkart_main_web_page() {

    }

//    @When("The user click on Login button")
//    public void The_user_click_on_Login_button () {
//        flipkartCreateAccountPage.clickOnLoginButton();
//    }
//
//    @And("The user click on Create an account button")
//    public void The_user_click_on_Create_an_account_button () {
//        flipkartCreateAccountPage.clickOnCreateAnAccount();
//    }
//
//    @And("The user enter Mobile number as valid value on Enter Mobile number input field")
//    public void The_user_enter_Mobile_number_as_valid_value_on_Enter_Mobile_number_input_field() {
//       flipkartCreateAccountPage.enterMobileNumber.sendKeys("5302449972");
//    }
//
//    @And("The user click on CONTINUE button")
//    public void The_user_click_on_CONTINUE_button() {
//        flipkartCreateAccountPage.clickOnContinueButton();
//    }
//
//    @Then("The user will see this message, Please enter a valid Mobile number")
//    public void The_user_will_see_this_message_Please_enter_a_valid_Mobile_number(){
//        flipkartCreateAccountPage.enterValidMobileNumber("Please enter a valid Mobile number");
//    }
//





}
