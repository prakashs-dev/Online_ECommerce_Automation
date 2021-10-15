package org.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\org\\features_files\\shopping.feature",
		
		glue = "org.step_definition",
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
//		tags = ("~@regressiontest"),
		
		plugin = {"html:Reports/Cucumber-Report",
				
					"pretty",
					
					"json:Reports/JsonReport/JsonReport.json",
					
					//  if i hiding a extent report to run only maven classes
					
//					"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport/Extent.html"
				
				}
		)

public class Test_Runner extends Base_Class {

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() throws Throwable {
		
		String path = "E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Shopping site.xlsx";
		
		String browser = Particular_data(path, 0, 0, 1);
		driver = Base_Class.getBrowser(browser);
		
	}
	@AfterClass
	public static void tear_down() {
		
		driver.close();
	}
	
	
}
