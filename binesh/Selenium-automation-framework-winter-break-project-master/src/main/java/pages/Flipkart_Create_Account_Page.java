package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class Flipkart_Create_Account_Page {


    public WebDriver driver;

//
//    public WebElement loginButton;
//    public WebElement createAnAccount;
//    public WebElement enterMobileNumber;
//    public WebElement continueButton;
//    public WebElement enterValidMobileNumber;


    public Flipkart_Create_Account_Page (WebDriver driver) {
        this.driver = driver;
//        this.loginButton = driver.findElement(By.xpath("//a[text() ='Login']"));
//        this.createAnAccount = driver.findElement(By.xpath("//a[contains(text(), 'New to Flipkart? Create')]"));
//        this.enterMobileNumber = driver.findElement(By.xpath("//input[@value ='5302449972']"));
//        this.continueButton = driver.findElement(By.xpath("//input[@value ='5302449972']"));

    }

//
//    public void clickOnLoginButton () {
//        WaitUtils.applyWait(driver,loginButton, WaitStrategy.CLICKABLE);
//        loginButton.click();
//    }
//
//    public void clickOnCreateAnAccount () {
//        WaitUtils.applyWait(driver,createAnAccount, WaitStrategy.CLICKABLE);
//        createAnAccount.click();
//    }
//
//    public void enterMobileNumber(String mobileNumber) {
//       enterMobileNumber.sendKeys(mobileNumber);
//    }
//
//    public void clickOnContinueButton() {
//        WaitUtils.applyWait(driver,continueButton,WaitStrategy.CLICKABLE);
//        continueButton.click();
//    }
//    public void enterValidMobileNumber(String getText) {
//        enterValidMobileNumber.getText();
//    }
//

}
