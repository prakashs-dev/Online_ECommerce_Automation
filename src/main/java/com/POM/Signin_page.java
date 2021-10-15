package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_page {
	
public WebDriver driver;
	
	public Signin_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	public WebElement email() {
		return email;
		
	}
	public WebElement password() {
		return password;
		
	}
	public WebElement login() {
		return login;
		
	}

}
