package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Become_a_Seller_page {

    public WebDriver driver;

    WebElement becomeASellerButton;
    WebElement startSellingButton;
    WebElement enterMobileNumber;
    WebElement emailID;
    WebElement allCategories;
    WebElement enterGSTIN;
    WebElement registerAndContinueButton;


    public Flipkart_Become_a_Seller_page(WebDriver driver) {
        this.driver = driver;
        this.becomeASellerButton= driver.findElement(By.xpath("//a[text() = 'Become a Seller']"));
        this.startSellingButton =driver.findElement(By.xpath("//button [text() ='Start Selling']"));
        this.enterMobileNumber =driver.findElement( By.xpath("//input[@placeholder ='Enter Mobile Number']"));
        this.emailID = driver.findElement(By.xpath("Email ID"));
        this.allCategories = driver.findElement(By.xpath("//div[text() ='All Categories']"));
        this.enterGSTIN = driver.findElement(By.xpath("//input[@placeholder ='Enter GSTIN']"));
        this.registerAndContinueButton =driver.findElement(By.xpath("Register & Continue"));

    }

    public void clickOnBecomeASellerButton () {
        becomeASellerButton.click();
    }

    public void clickOnStartSellingButton() {
        startSellingButton.click();
    }

    public void enterMobileNumber (int mobileNumber) {
        enterMobileNumber.sendKeys(Integer.toString(mobileNumber));
    }

    public void enterEmailID (String email) {
        emailID.sendKeys(email);
    }

    public void clickOnAllCategories() {
        allCategories.click();
    }

    public void enterGSTIN (int number) {
        enterGSTIN.sendKeys(Integer.toString(number));
    }

    public void registerAndContinueButton () {
        registerAndContinueButton.click();
    }


//    LandingPage flipKartLandingPage;
//
//    @Given("I am on the flipkart web page seller")
//    public void i_am_on_the_flipkart_web_page_seller() {
//    }
//
//    @When("I click on the become a seller button")
//    public void i_click_on_the_become_a_seller_button() {
//        this.flipKartLandingPage = new LandingPage(DriverManager.getDriver());
//        WaitUtils.applyWait(driver, flipKartLandingPage.becomeASellerButton, WaitStrategy.CLICKABLE);
//        flipKartLandingPage.clickOnBecomeASellerButton();
//        //        WaitUtils.applyGlobalWait();    }
//
//
//        @Then("I should see become a seller page")
//        public void i_should_see_become_a_seller_page () throws InterruptedException {
//            Thread.sleep(2000);
//        }
//
//    }


}