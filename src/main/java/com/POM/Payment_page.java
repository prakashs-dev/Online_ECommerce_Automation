package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	public WebDriver driver ;
	public Payment_page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm_order;
	
	public WebElement bank() {
		return bank;
	}
	
	public WebElement confirm_order() {
		return confirm_order;
	}

}
