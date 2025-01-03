package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Navigate_To_Mobiles_page {

    WebDriver driver;

    WebElement mobilesButton;
    WebElement biggestNewYearDealsMessage;


    public Flipkart_Navigate_To_Mobiles_page( WebDriver driver) {
        this.driver = driver;
        this.mobilesButton = driver.findElement(By.xpath("//a[@aria-label ='Mobiles']"));
        this.biggestNewYearDealsMessage = driver.findElement(By.xpath("//img[@class ='xTaogf _3iTqAS']"));
    }

    public void clickOnMobilesButton() {
        mobilesButton.click();
    }

    public void messageOnThePage(String text) {
        biggestNewYearDealsMessage.getText();

    }
}
