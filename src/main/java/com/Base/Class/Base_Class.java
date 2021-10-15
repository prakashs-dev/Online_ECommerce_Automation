package com.Base.Class;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; //null driver

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + 
					"\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} 
		
		return driver;
	}
	//---get Urls
	public static void getUrls(String Url) {
		driver.get(Url);
	}
	
	public static void WaitTime(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void clear(WebElement clr) {
		clr.clear();
	}
	public static void clickElement(WebElement ele) {
		ele.click();
	}
	
	public static void inputs(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public static void MoveAction(WebElement ele , String type) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("moveToElementclick")) {
			a.moveToElement(ele);
			a.click().perform();
		}else if (type.equalsIgnoreCase("moveElement")) {
			a.moveToElement(ele).perform();
		}else if (type.equalsIgnoreCase("click")) {
			a.click(ele).perform();
		}
	}
	
	public static void sleep(int sec) throws Throwable {
		Thread.sleep(sec);
	}
	
	public static void select(WebElement ele, String type, String value) {
		
		Select s = new Select(ele);
		if (type.equalsIgnoreCase("index")) {
			int val = Integer.parseInt(value);
			s.selectByIndex(val);
		}else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (type.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
		}
		
	}
	
	public static void screenshort(String uri) throws Throwable {
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File(uri);
		FileUtils.copyFile(s, d);
	}
	
	public static String value;
	public static String Particular_data(String path, int s, int r, int c) throws Throwable {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);	//upcasting
		Sheet sheetAt = w.getSheetAt(s);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			 value = cell.getStringCellValue();
			
		}else if (cellType.equals(cellType.NUMERIC)) {
			double CellValue = cell.getNumericCellValue();
			value = Double.toString(CellValue);
		}
		return value;
	}
	
	public static void jsexecuter(String jsscroll) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsscroll);
	}
	
	

}
