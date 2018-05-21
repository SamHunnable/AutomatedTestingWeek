package com.qa.quickstart.DemoSite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test() {
		driver.navigate().to("http://thedemosite.co.uk/addauser.php");
		WebElement element;
		driver.findElement(By.name("username")).sendKeys("user");
	
		driver.findElement(By.name("password")).sendKeys("password");

		driver.findElement(By.name("FormsButton2")).click();
		
		driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
		
		//driver.navigate().to("http://thedemosite.co.uk/login.php");
		
		driver.findElement(By.name("username")).sendKeys("user");
	
		driver.findElement(By.name("password")).sendKeys("password");		
		
		driver.findElement(By.name("FormsButton2")).click();
		
		element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", element.getText());
		
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}