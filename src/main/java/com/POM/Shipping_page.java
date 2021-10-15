package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
	
	public WebDriver driver;
	public Shipping_page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceed3;
	
	public WebElement checkbox() {
		return checkbox;
		
	}
	public WebElement proceed3() {
		return proceed3;
		
	}

}
