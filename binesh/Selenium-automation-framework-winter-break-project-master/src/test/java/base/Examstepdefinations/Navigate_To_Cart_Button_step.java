package base.Examstepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Flipkart_Shopping_Cart_Button_Page;

public class Navigate_To_Cart_Button_step extends BaseTest {

    Flipkart_Shopping_Cart_Button_Page flipkartShoppingCartButtonPage;

    @Before
    public void setup(){
        super.setup();
        this.flipkartShoppingCartButtonPage = new Flipkart_Shopping_Cart_Button_Page(driver);
    }

    @Given("I am on Flipkart web main page")
    public void I_am_on_Flipkart_Web_main_page() {
    }

    @When("I click on Cart button")
    public void I_click_on_Cart_button () {
        flipkartShoppingCartButtonPage.clickOnCartButton();
    }

    @Then("I should see Missing Cart items?")
    public void I_should_see_Missing_Cart_items() {
        flipkartShoppingCartButtonPage.missingCartItems("Missing Cart items?");
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}
