package com.qa.quickstart.Cucumber2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TeasTesting {
	
	System.setProperty( "webdriver.chrome.driver" , "C:\\Users\\Admin\\WebDrivers\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver;
	
	HomePage homepage = null;
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    driver.get(Constants.homePage);
	    homepage = pageFactory.initElements(driver, HomePage.class);
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	   
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    
	}

}
