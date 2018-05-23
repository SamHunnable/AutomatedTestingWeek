package com.qa.quickstart.DemoSite;

import static org.junit.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginTest {
	
	WebDriver driver;
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test() throws IOException {
		
		WebElement element;
		FileInputStream file;
		file = new FileInputStream(Constants.loginData);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		driver.navigate().to(Constants.addaccount);
		CreateAccount createPage = PageFactory.initElements(driver, CreateAccount.class);	
		Login loginPage = null;
		
		
		for (int i=1; i<sheet.getPhysicalNumberOfRows(); i++) {
			
			Cell username = sheet.getRow(i).getCell(0);
			Cell password = sheet.getRow(i).getCell(1);
			
			String user = username.getStringCellValue();
			String pass = password.getStringCellValue();
			
			createPage.makeAccount(driver, user, pass);
			if (loginPage == null) {
				loginPage = PageFactory.initElements(driver , Login.class);
			}
			loginPage.login(driver, user, pass);

			element = driver.findElement(By.xpath(Constants.success));
			assertEquals("**Successful Login**", element.getText());
			loginPage.navigateCreate(driver);
			
		}
		
		workbook.close();
	}
	
	@After
	public void teardown() {
		driver.quit();
	
	}

}