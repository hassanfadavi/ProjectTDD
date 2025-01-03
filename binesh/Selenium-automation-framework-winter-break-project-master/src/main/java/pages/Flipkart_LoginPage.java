package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_LoginPage {

    public WebDriver driver;


    @FindBy (css ="a[title='Login'] span" )
    public WebElement clickOnLoginButton;

    @FindBy (xpath = "//input[@class ='r4vIwl BV+Dqf']")
    public WebElement emailInputField;

    @FindBy (xpath = "//button[text() ='Request OTP']")
    public WebElement requestOTPButton;

    @FindBy (xpath = "//input[@type='text' and @class='r4vIwl BV+Dqf']")
    public WebElement enterMobileNumber;

    @FindBy (xpath = "//span[text() = 'CONTINUE']")
    public WebElement continueButton;

    @FindBy(xpath = "//span[contains(text(), 'Please enter a valid')]")
    public WebElement alertMessage;
    //span[@class='llBOFA']//span
    public Flipkart_LoginPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    //Actions

    public void enterEmailAddress (String email) {

        this.emailInputField.sendKeys("benish.ranna@gmail.com");
    }

    public void clickOnRequestedOPTButton () {

        this.requestOTPButton.click();
    }

    public void enterMobileNumber(String mobileNumber) {

        this.enterMobileNumber.sendKeys(mobileNumber);
    }

    public void clickOnContinueButton() {

        this.continueButton.click();
    }

    public String   enterValidMobileNumber() {
       return alertMessage.getText();
    }

    public void clickOnLogin(){
        clickOnLoginButton.click();
    }







}
