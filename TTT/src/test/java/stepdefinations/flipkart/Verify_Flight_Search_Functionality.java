package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.flipKart.FlightPage;
import pages.flipKart.FlightSearchPage;
import pages.flipKart.LandingPage;
import pages.flipKart.SearchPage;

public class Verify_Flight_Search_Functionality extends BaseTest {


    LandingPage landingPage;
    FlightSearchPage  flightSearchPage;
    FlightPage flightPag;


    @Before
    public void prepareed(){
        setUp();

    }

    @When("I click on Flights bookings")
    public void i_click_on_flights_bookings() {
        this.landingPage=new LandingPage(driver);
        WaitUtils.applyGlobalWait();
        landingPage.clickOnFlightButton();



    }
    @Then("I should be navigated to flight search page")
    public void i_should_be_navigated_to_flight_search_page() {
        WaitUtils.applyGlobalWait();

    }

    @And("I select departure date {string}")
    public void i_select_departure_date(String departure_date) {
        this.flightSearchPage=new FlightSearchPage(driver);
        flightSearchPage.departureDate(departure_date);


    }


    @And("I select return date {string}")
    public void i_select_return_date(String return_date) {
        flightSearchPage.returnDate(return_date);
        WaitUtils.applyGlobalWait();
    }

    @And("I select the departure city {string}")
    public void i_select_the_departure_city(String departure_city) {

        flightSearchPage.departureCity(departure_city);



    }
    @And("I select the destination city {string}")
    public void i_select_the_destination_city(String destination_city) {
        WaitUtils.applyGlobalWait();
        flightSearchPage.destinationCity(destination_city);

    }


    @Then("I click the Search flight button")
    public void i_click_the_button() {
        WaitUtils.applyGlobalWait();
        flightSearchPage.clickOnSearchButton();

    }
    @Then("I should be navigated to flight page")
    public void I_should_be_navigated_to_flight_page() throws InterruptedException {
        Thread.sleep(15000);
        this.flightPag=new FlightPage(driver);
      String actualText=flightPag.filterBy.getText();
      String expectedText="Filter By";
        Assert.assertEquals(actualText,expectedText,"not match");

    }







    @After
    public void tear(){
        tearDown();
    }

}
