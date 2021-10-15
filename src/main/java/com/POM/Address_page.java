package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_page {
	
	public WebDriver driver;
	public Address_page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement comments;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proceed_Adres;
	
	public WebElement comments() {
		return comments;
		
	}
	
	public WebElement proceed_Adres() {
		return proceed_Adres;
		
	}

}
