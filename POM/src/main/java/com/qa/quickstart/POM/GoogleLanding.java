package com.qa.quickstart.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLanding {
	
	@FindBy(id = "lst-ib") private WebElement searchbox;
	@FindBy(name = "btnI") private WebElement lucky;
	
	
	public void searchFor(String text) {
		searchbox.sendKeys(text);
		searchbox.submit();
		
	}
	
	public void luckyTest() {
		lucky.click();
	}

}
