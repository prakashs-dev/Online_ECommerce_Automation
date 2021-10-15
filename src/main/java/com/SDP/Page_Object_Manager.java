package com.SDP;

import org.openqa.selenium.WebDriver;

import com.POM.Address_page;
import com.POM.Dress_page;
import com.POM.Home_page;
import com.POM.Payment_page;
import com.POM.Print_dress;
import com.POM.Shipping_page;
import com.POM.Signin_page;
import com.POM.Summary_page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Home_page hp;
	private Dress_page dp;
	private Print_dress pd;
	private Summary_page sp;
	private Signin_page signp;
	private Address_page ap;
	private Shipping_page Shipp;
	private Payment_page pp;
	
	public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	}
	public Home_page getInstanceHP() {
	hp = new Home_page(driver);
	return hp;
	}
	public Dress_page getInstanceDP() {
	dp = new Dress_page(driver);
	return dp;
	}
	public Print_dress getInstancePD() {
	pd = new Print_dress(driver);
	return pd;
	}
	public Summary_page getInstanceSP() {
	sp = new Summary_page(driver);
	return sp;
	}
	public Signin_page getInstanceSignP() {
	signp = new Signin_page(driver);
	return signp;
	}
	public  Address_page getInstanceAP() {
	ap = new Address_page(driver);
	return ap;
	}
	public Shipping_page getInstanceShipP() {
	Shipp = new Shipping_page(driver);
	return Shipp;
	}
	public Payment_page getInstancePP() {
	pp = new Payment_page(driver);
	return pp;
	}

}
