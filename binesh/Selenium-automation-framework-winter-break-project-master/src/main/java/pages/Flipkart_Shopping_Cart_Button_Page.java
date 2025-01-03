package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Shopping_Cart_Button_Page {

    WebDriver driver;

    WebElement cartButton;
    WebElement missingCartItems;


    public Flipkart_Shopping_Cart_Button_Page(WebDriver driver) {
        this.driver = driver;
        this.cartButton = driver.findElement(By.xpath("//a[text() = 'Cart']"));
        this.missingCartItems = driver.findElement(By.xpath("//div[text() ='Missing Cart items?']"));

    }

    public void clickOnCartButton () {
        cartButton.click();
    }

    public void missingCartItems(String getText) {
        missingCartItems.isDisplayed();
        System.out.println("Missing Cart items?");

    }


}
