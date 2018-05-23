package com.qa.quickstart.CucumberLearning;

import java.util.Stack;
import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackTest {
	
	Object object = null;
	Object object2 = new Object();
	Object object3 = null;
	
	Stack<Object> stack = null;
	

	@Given("^an empty stack$")
	public void an_empty_stack() throws Throwable {
		stack = new Stack<Object>();
		assertEquals(0, stack.size());
	   
	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack() throws Throwable {
		object = new Object();
	   stack.push(object);
	 
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() throws Throwable {
		assertEquals(1, stack.size());
			
	
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() throws Throwable {
		
	    stack.push(object2);
	   
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() throws Throwable {
	    assertEquals(2, stack.size());
	  
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack() throws Throwable {
	    object3 = stack.pop();
	  
	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back() throws Throwable {
	    assertEquals(object2, object3);
	   
	}

	
	
	
}
