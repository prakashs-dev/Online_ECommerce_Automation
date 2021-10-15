package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Print_dress {
	
	public WebDriver driver;

	public Print_dress(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='qty']")
	private WebElement qunatity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="color_24")
	private WebElement color;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement AddtoCard;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed1;
	
	public WebElement qunatity() {
		return qunatity;

	}
	public WebElement size() {
		return size;
		
	}
	public WebElement color() {
		return color;

	}
	public WebElement AddtoCard() {
		return AddtoCard;

	}

	public WebElement getProceed1() {
		return proceed1;
	}

}
