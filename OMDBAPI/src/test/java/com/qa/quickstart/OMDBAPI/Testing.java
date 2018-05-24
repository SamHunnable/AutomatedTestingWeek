package com.qa.quickstart.OMDBAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class Testing {
	
	
	Response response;
	ValidatableResponse validate;
	RequestSpecification request;
	
	@Given("^Dunkirk is on OMDB$")
	public void dunkirk_is_on_OMDB() throws Throwable {	    
		request = given().contentType(ContentType.JSON);
		
	
	}

	@When("^I retrieve the film$")
	public void i_retrieve_the_film() throws Throwable {
		response = request.when().get("http://www.omdbapi.com/?t=Dunkirk&y=2017&apikey=52109dca");
		
	  
	}

	@Then("^The year is (\\d+)$")
	public void the_year_is(int arg1) throws Throwable {
		validate = response.then().statusCode(200).body("Year", equalTo("2017"));
		
		
	
	}

}
