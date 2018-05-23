package com.qa.quickstart.DemoQA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableTests {
	
	WebDriver driver;
	Actions action;
		
	
//	@BeforeClass
//	public void majorSetup() {
//		
//	}
	
	@Before
	public void setup() {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.get("http://demoqa.com/selectable/");
	}
	
	
	
	@Test
	public void defaultTest() {
		assertEquals("Selectable | Demoqa", driver.getTitle());
		
	}


	
	@After
	public void teardown() {
		driver.quit();
	}

}
