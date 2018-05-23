package com.qa.quickstart.DemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public void login(WebDriver driver, String username, String password) {
			
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);		
		driver.findElement(By.name("FormsButton2")).click();
			
	}
	
	public void navigateCreate (WebDriver driver) {
		driver.navigate().to(Constants.addaccount);
	}

}
