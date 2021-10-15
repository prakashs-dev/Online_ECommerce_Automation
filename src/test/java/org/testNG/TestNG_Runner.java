package org.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.Class.Base_Class;
import com.SDP.Page_Object_Manager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestNG_Runner extends Base_Class{
	
	public static WebDriver driver;
	
	public static Page_Object_Manager pom;
	
	String path = "E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Shopping site.xlsx";
	
	ExtentTest test;
	
	ExtentReports report;
	
	ExtentSparkReporter spark;
	
	@BeforeTest
	private void configuration() {
		
		spark = new ExtentSparkReporter(".//Reports//TestNG Report//Extent.html");
		
		report = new ExtentReports();
		
		report.attachReporter(spark);
	}
	
	@Test
	private void browser_lanuch() throws Throwable {
		
		String browser = Particular_data(path, 0, 0, 1);
		driver = getBrowser(browser);
		pom = new Page_Object_Manager(driver);
		
		String url = Particular_data(path, 0, 1, 1);
		getUrls(url);
		
		test = report.createTest("Browser Lanuch");
	}

	@Test(priority = 0)
	private void home_page() {
		
		MoveAction(pom.getInstanceHP().women(), "moveElement");
		MoveAction(pom.getInstanceHP().dress(), "moveToElementclick");
		WaitTime(2);
		
		test = report.createTest("Home Page");
	}
	
	@Test(priority = 1)
	private void evening_dress() {
		
		MoveAction(pom.getInstanceDP().preview(), "moveElement");
		MoveAction(pom.getInstanceDP().more(), "moveToElementclick");
		WaitTime(3);
		
		test = report.createTest("Evening Dress Page");

	}
	
	@Test(priority = 2)
	private void printed_dress() throws Throwable {
		
		clear(pom.getInstancePD().qunatity());
		String quantity = Particular_data(path, 0, 5, 1);
		inputs(pom.getInstancePD().qunatity(), quantity);
		
		select(pom.getInstancePD().size(), "index", "2");
		clickElement(pom.getInstancePD().color());
		clickElement(pom.getInstancePD().AddtoCard());
		WaitTime(30);
		clickElement(pom.getInstancePD().getProceed1());
		
		test = report.createTest("Print Dress Page");
	}
	
	@Test(priority = 3)
	private void summary() {
		
		clickElement(pom.getInstanceSP().proceed2());
		
		test = report.createTest("Summary Page");

	}
	
	@Test(priority = 4)
	private void sign_in() throws Throwable {
		
		String username = Particular_data(path, 0, 2, 1);
		inputs(pom.getInstanceSignP().email(), username);
		System.out.println("Username :" +username);
		
		String password = Particular_data(path, 0, 3, 1);
		inputs(pom.getInstanceSignP().password(), password);
		System.out.println("Password :"+password);
		
		clickElement(pom.getInstanceSignP().login());
		
		test = report.createTest("Sign In Page");
	}
	
	@Test(priority = 5)
	private void address() throws Throwable {
		
		String commends = Particular_data(path, 0, 4, 1);
		inputs(pom.getInstanceAP().comments(), commends);
		System.out.println("Commends :"+commends);
		
		clickElement(pom.getInstanceAP().proceed_Adres());
		
		test = report.createTest("Address Page");

	}
	
	@Test(priority = 6)
	private void shipping() {
		
		clickElement(pom.getInstanceShipP().checkbox());
		clickElement(pom.getInstanceShipP().proceed3());
		
		
		test = report.createTest("Shipping Page");

	}
	
	@Test(priority = 7)
	private void payment() throws Throwable {
		
		clickElement(pom.getInstancePP().bank());
		clickElement(pom.getInstancePP().confirm_order());
		
		jsexecuter("window.scrollBy(0,420)");
		
		screenshort("E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\ScreenShorts\\pic1.png");
		sleep(2);
				
		test = report.createTest("Payement Page");

	}
	
	@Test(priority = 8)
	private void browser_close() {
		
		driver.close();
		
		test = report.createTest("Successfully Browser Close");
	}
	
	@AfterTest
	private void write_test() {
		
		report.flush();
		
	}
	
}
