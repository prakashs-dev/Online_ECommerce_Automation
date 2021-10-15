package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_page {
	
	public WebDriver driver;
	public Dress_page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='product-container']")
	private WebElement preview;
	
	@FindBy(xpath="(//a[@itemprop='url'])[3]")
	private WebElement more;
	
	public WebElement preview() {
		return preview;
	}
	
	public WebElement more() {
		return more;
	}

}
