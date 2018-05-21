package com.qa.quickstart.DemoSite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingTest {

	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test() {
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.id("search_query_top")).submit();
		WebElement element = driver.findElement(By.className("product-count"));
		assertEquals("Showing 1 - 7 of 7 items", element.getText());
	}
	
	
	
	@After
	public void teardown() {
		driver.quit();
	}

}
