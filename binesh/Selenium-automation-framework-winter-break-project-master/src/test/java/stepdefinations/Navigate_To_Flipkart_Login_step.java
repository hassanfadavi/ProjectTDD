package stepdefinations;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Flipkart_LoginPage;
import utils.WaitUtils;

import java.time.Duration;

public class Navigate_To_Flipkart_Login_step extends BaseTest {

//    WebDriver driver = new ChromeDriver();
     Flipkart_LoginPage LoginPage;
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Before
    public void setup() {
        super.setup();
    }

    @Given("I am on the login page")
    public void I_am_on_the_login_page() {

        this.LoginPage = new Flipkart_LoginPage(driver);
           LoginPage.clickOnLogin();

    }
//
    @When("I will enter my valid email or password")
    public void I_will_enter_my_valid_email_or_password(){
        WaitUtils.applyGlobalWait();
//        LoginPage = new Flipkart_LoginPage(driver);
        LoginPage.enterEmailAddress("benish.ranna@gmail.com");
        WaitUtils.applyGlobalWait();
    }
//
    @And("I will click on Request OTP button")
    public void I_will_click_on_Request_OTP_button(){
        LoginPage.clickOnRequestedOPTButton();
        WaitUtils.applyGlobalWait();
    }

    @And("I will enter mobile number as valid mobile number")
    public void I_will_enter_mobile_number_as_valid_mobile_number() {
        LoginPage.enterMobileNumber("398-850-7191");
        WaitUtils.applyGlobalWait();
    }

    @And ("I will click on Continue button")
    public void I_will_click_on_Continue_button() {
        LoginPage.clickOnContinueButton();
        WaitUtils.applyGlobalWait();
    }

    @Then ("I should be asked to enter a valid Mobile number")
    public void I_should_face_with_Please_enter_a_valid_Mobile_number(){
        String actualtext=LoginPage.enterValidMobileNumber();
        String expectedText="Please enter a valid Mobile number";
        Assert.assertEquals(actualtext,expectedText,"not match");


    }


}
