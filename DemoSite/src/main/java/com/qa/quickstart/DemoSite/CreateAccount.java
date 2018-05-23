package com.qa.quickstart.DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {

	
	
	public void makeAccount(WebDriver driver, String username, String password) {
		
		driver.findElement(By.name("username")).sendKeys(username);	
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("FormsButton2")).click();	
		driver.findElement(By.xpath(Constants.clickToLogin)).click();
		//driver.navigate().to("http://thedemosite.co.uk/login.php");
	}
	
}
