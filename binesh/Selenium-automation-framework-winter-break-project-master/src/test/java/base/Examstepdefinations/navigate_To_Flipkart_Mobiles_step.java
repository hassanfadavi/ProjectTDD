package base.Examstepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.Flipkart_Navigate_To_Mobiles_page;
import tests.browser.Base;
import utils.WaitUtils;

import java.time.Duration;

public class navigate_To_Flipkart_Mobiles_step extends Base {

    Flipkart_Navigate_To_Mobiles_page flipkartNavigateToMobilesPage;
    public WebDriver driver;

    @Given("The user is on the Flipkart web main page")
    public void The_user_is_on_the_Flipkart_web_main_page() {

    }

    @When("The user click on Mobiles button")
    public void The_user_click_on_Mobiles_button() {
        flipkartNavigateToMobilesPage.clickOnMobilesButton();
        WaitUtils.applyGlobalWait();
    }

    @Then("The user will see Biggest New Year Deals on middle of the page")
    public void The_user_will_see_Biggest_New_Year_Deals_on_middle_of_the_page() {
        flipkartNavigateToMobilesPage.messageOnThePage("Biggest New Year Deals");
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(StaleElementReferenceException.class);
    }


}
