package com.qa.quickstart.POM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.PageFactory;

public class GoogleTests {

	
	WebDriver driver;
	WebDriver fireDriver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Admin\\WebDrivers\\geckodriver.exe");
		driver = new ChromeDriver();
		//fireDriver = new FirefoxDriver();
		
		
	}
	
	@Ignore
	@Test
	public void searchTest() {	
		driver.get("https://www.google.co.uk/");
		GoogleLanding page = PageFactory.initElements(driver, GoogleLanding.class);
		page.searchFor("Wikipedia");
		assertEquals("Wikipedia - Google Search", driver.getTitle());
	
	}
	
	@Ignore
	@Test
	public void luckyTest() {
		driver.get("https://www.google.co.uk/");
		GoogleLanding page = PageFactory.initElements(driver, GoogleLanding.class);
		page.luckyTest();
		assertEquals("Google Doodles", driver.getTitle());	
	}
	
	@Test
	public void firefoxTest() {
		fireDriver.get("https://www.google.co.uk/");
	}
	
	
	@After
	public void teardown() {
		driver.quit();
	}

}
