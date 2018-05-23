package com.qa.quickstart.DemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectablePage {
	
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[1]") WebElement item1;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[2]") WebElement item2;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[3]") WebElement item3;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[4]") WebElement item4;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[5]") WebElement item5;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[6]") WebElement item6;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[7]") WebElement item7;

	
	public void defaultSelect(Actions action) {
		action.click(item1).perform();
		
	}

}
