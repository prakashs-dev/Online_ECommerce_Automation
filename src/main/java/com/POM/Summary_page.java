package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
	
public WebDriver driver;
	
	public Summary_page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;
	
	public WebElement proceed2() {
		return proceed2;

	}

}
