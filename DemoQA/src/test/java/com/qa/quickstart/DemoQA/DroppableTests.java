package com.qa.quickstart.DemoQA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DroppableTests {

	
	WebDriver driver;
	Actions action;	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static  void initialise() {
		report = new ExtentReports("C:\\Users\\Admin\\AutomatedReports\\Report.html", true);
		//test = report.startTest("Testing has started");
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/droppable/");
		action = new Actions(driver);
		
	}
	
	//@Ignore
	@Test
	public void dragBoxTest() {	
		test = report.startTest("Test dragbox");		
		DroppablePage page = PageFactory.initElements(driver, DroppablePage.class);				
		if (driver.findElement(By.id("droppableview")).getText().equals("Drop here")) {
			test.log(LogStatus.PASS, "Page test success");
		}
		else {
			test.log(LogStatus.FAIL, "Page test failure");
		}
		
		assertEquals("Drop here", driver.findElement(By.id("droppableview")).getText());	
		page.dragBox(action);
		if (driver.findElement(By.id("droppableview")).getText().equals("Dropped!")) {
			test.log(LogStatus.PASS, "Drop box success");
		}
		else {
			test.log(LogStatus.FAIL, "Drop box failure");
		}
		
		assertEquals("Dropped!", driver.findElement(By.id("droppableview")).getText());
	}
	
	
	@Ignore
	@Test
	public void acceptTest() {
		test = report.startTest("Test dragbox");
		DroppablePage page = PageFactory.initElements(driver, DroppablePage.class);
		driver.findElement(By.id("ui-id-2")).click();
		if (driver.findElement(By.id("droppableaccept")).getText().equals("accept: ‘#draggableaccept’")) {
			test.log(LogStatus.PASS, "Page test success");
		}
		else {
			test.log(LogStatus.FAIL, "Page test failure");
		}
		
		assertEquals("accept: ‘#draggableaccept’", driver.findElement(By.id("droppableaccept")).getText());
		page.noDrop(action);
		
		assertEquals("accept: ‘#draggableaccept’", driver.findElement(By.id("droppableaccept")).getText());
		page.drop(action);
		
		assertEquals("Dropped!", driver.findElement(By.id("droppableaccept")).getText());
		
	}
	
	
	
	@After
	public void teardown() {
		driver.quit();
		report.endTest(test);
	}
	
	@AfterClass
	public static void shutdown() {
		report.flush();
	}

}
