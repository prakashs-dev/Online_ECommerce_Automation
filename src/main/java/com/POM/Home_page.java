package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
public WebDriver driver;
	
	public Home_page(WebDriver driver2){
		
	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[@title='Women']")
private WebElement women;

@FindBy(xpath="(//a[.='Evening Dresses'])[1]")
private WebElement dress;

public WebElement women() {
	return women;
}
	public WebElement dress() {
		return dress;
		
	}
}
