package com.qa.quickstart.DemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage {
	
	@FindBy(id = "draggableview") private WebElement dragbox;
	@FindBy(id = "droppableview") private WebElement target;
	@FindBy(id = "droppableaccept") private WebElement target2;
	@FindBy(id = "draggable-nonvalid") private WebElement nondrop;
	@FindBy(id = "draggableaccept") private WebElement drop;

	
	
	
	public void dragBox(Actions action) {
		action.dragAndDrop(dragbox, target).perform();
	}
	
	
	
	public void noDrop(Actions action) {
		action.dragAndDrop(nondrop, target2).perform();		
	}
	
	public void drop(Actions action) {
		action.dragAndDrop(drop, target2).perform();	
	}
	

}
