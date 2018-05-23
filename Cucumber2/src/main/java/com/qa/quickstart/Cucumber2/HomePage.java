package com.qa.quickstart.Cucumber2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id = "00000000-0000-0000-0000-000009816342") private WebElement menuButton;
	
	public void clickMenu(WebDriver driver) {
		driver.menuButton.click();
	}

}
