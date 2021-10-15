package org.step_definition;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.test_runner.Test_Runner;

import com.Base.Class.Base_Class;
import com.SDP.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	
	String path = "E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Shopping site.xlsx";
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public static void Beforehooks(Scenario s) throws Throwable {
		
		System.out.println("Before Hooks");
		
		String status = s.getStatus();
		
		System.out.println("BH :"+status);
		
		if (s.isFailed()) {
			screenshort("E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Error-Pic\\pic1.png");
		}

	}
	
	@After
	public static void AfterHooks(Scenario s) throws Throwable {
		
		System.out.println("After Hooks");
		
		String status = s.getStatus();
		
		System.out.println("AH :"+status);
		
		if (s.isFailed()) {
			screenshort("E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Error-Pic\\pic2.png");
		}
	}
	
	@Given("^user Launch The Appliction$")
	public void user_Launch_The_Appliction() throws Throwable {
		
		String url = Particular_data(path, 0, 1, 1);
		getUrls(url);
	}

	@When("^user Move to Cursor Women Section$")
	public void user_Move_to_Cursor_Women_Section() throws Throwable {
		
		MoveAction(pom.getInstanceHP().women(), "moveElement");
	}

	@Then("^user Under Click Evening Dress and Navigate to dress page$")
	public void user_Click_Evening_Dress_and_Navigate_to_dress_page() throws Throwable {
		
		MoveAction(pom.getInstanceHP().dress(), "moveToElementclick");
		WaitTime(2);
	}

	@When("^user Move to Cursor Dress Item$")
	public void user_Move_to_Cursor_Dress_Item() throws Throwable {
		
		MoveAction(pom.getInstanceDP().preview(), "moveElement");
		WaitTime(3);
	}

	@Then("^user Click On More Button and Navigate to Printed dress page$")
	public void user_Click_On_More_Button_and_Navigate_to_Printed_dress_page() throws Throwable {
		
		MoveAction(pom.getInstanceDP().more(), "moveToElementclick");
		WaitTime(3);
	}

	@When("^user Enter a Quantity Value$")
	public void user_Enter_a_Quantity_Value() throws Throwable {
	
		clear(pom.getInstancePD().qunatity());
		String quantity = Particular_data(path, 0, 5, 1);
		inputs(pom.getInstancePD().qunatity(), quantity);
		
	}

	@When("^user Select a \"([^\"]*)\"$")
	public void user_Select_a(String size) throws Throwable {
		
		select(pom.getInstancePD().size(), "index", size);
	}

	@When("^user Change the Color Item$")
	public void user_Change_the_Color_Item() throws Throwable {
		
		clickElement(pom.getInstancePD().color());
	}

	@Then("^user Click Add to Card Button and Click to Proceed to checkout Button$")
	public void user_Click_Add_to_Card_Button_and_Click_to_Proceed_to_checkout_Button() throws Throwable {
		
		clickElement(pom.getInstancePD().AddtoCard());
		WaitTime(30);
		clickElement(pom.getInstancePD().getProceed1());
	}

	@Then("^user Click to Proceed to checkout Button$")
	public void user_Click_to_Proceed_to_checkout_Button() throws Throwable {
		
		clickElement(pom.getInstanceSP().proceed2());
	}

	@When("^user Enter a \"([^\"]*)\" in Username Field$")
	public void user_Enter_a_in_Username_Field(String username) throws Throwable {
		
//		String username = Particular_data(path, 0, 2, 1);
		inputs(pom.getInstanceSignP().email(), username);
	}

	@When("^user Enter a \"([^\"]*)\" in Password Field$")
	public void user_Enter_a_in_Password_Field(String password) throws Throwable {
		
//		String password = Particular_data(path, 0, 3, 1);
		inputs(pom.getInstanceSignP().password(), password);
	}

	@Then("^user Click to Sign in Button and Navigate to Order Page$")
	public void user_Click_to_Sign_in_Button_and_Navigate_to_Order_Page() throws Throwable {
		
		clickElement(pom.getInstanceSignP().login());
	}

	@When("^user Enter a Commends$")
	public void user_Enter_a_Commends() throws Throwable {
		
		String commends = Particular_data(path, 0, 4, 1);
		inputs(pom.getInstanceAP().comments(), commends);
	}

	@Then("^user Click Proceed to checkout Button$")
	public void user_Click_Proceed_to_checkout_Button() throws Throwable {
		
		clickElement(pom.getInstanceAP().proceed_Adres());
	}

	@When("^user Click a checkbox$")
	public void user_Click_a_checkbox() throws Throwable {
		
		clickElement(pom.getInstanceShipP().checkbox());
	}

	@Then("^user Click a Proceed to checkout Button$")
	public void user_Click_a_Proceed_to_checkout_Button() throws Throwable {
		
		clickElement(pom.getInstanceShipP().proceed3());
	}

	@When("^user Click a Pay by bank wire Button$")
	public void user_Click_a_Pay_by_bank_wire_Button() throws Throwable {
		
		clickElement(pom.getInstancePP().bank());
		
	}

	@Then("^user Click to I confirm to my order Button$")
	public void user_Click_to_I_confirm_to_my_order_Button() throws Throwable {
		
		clickElement(pom.getInstancePP().confirm_order());
		
	}

	
}
