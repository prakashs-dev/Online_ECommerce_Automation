package org.Main.Class;

import org.openqa.selenium.WebDriver;

import com.Base.Class.Base_Class;
import com.SDP.Page_Object_Manager;

public class Main_Class extends Base_Class {
	
	public static WebDriver driver;
	
	public static Page_Object_Manager pom;

	public static void main(String[] args) throws Throwable {
		
		String path = "E:\\Eclipse\\Selenium-Java\\ShoppinG_Project\\Shopping site.xlsx";
		
		String browser = Particular_data(path, 0, 0, 1);
		driver = getBrowser(browser);
		pom = new Page_Object_Manager(driver);
		
		String url = Particular_data(path, 0, 1, 1);
		getUrls(url);
		
		//------->>Home page
		MoveAction(pom.getInstanceHP().women(), "moveElement");
		MoveAction(pom.getInstanceHP().dress(), "moveToElementclick");
		WaitTime(2);
		
		//-----Evening dress page
		MoveAction(pom.getInstanceDP().preview(), "moveElement");
		MoveAction(pom.getInstanceDP().more(), "moveToElementclick");
		WaitTime(3);
		//----->>Print dress page
		clear(pom.getInstancePD().qunatity());
		String quantity = Particular_data(path, 0, 5, 1);
		inputs(pom.getInstancePD().qunatity(), quantity);
		
		select(pom.getInstancePD().size(), "index", "2");
		clickElement(pom.getInstancePD().color());
		clickElement(pom.getInstancePD().AddtoCard());
		WaitTime(30);
		clickElement(pom.getInstancePD().getProceed1());
		
		//---->>Summary page
		clickElement(pom.getInstanceSP().proceed2());
		
		//------>>Sign in page
		String username = Particular_data(path, 0, 2, 1);
		inputs(pom.getInstanceSignP().email(), username);
		System.out.println("Username :" +username);
		
		String password = Particular_data(path, 0, 3, 1);
		inputs(pom.getInstanceSignP().password(), password);
		System.out.println("Password :"+password);
		
		clickElement(pom.getInstanceSignP().login());
		
		//------>>Address page
		String commends = Particular_data(path, 0, 4, 1);
		inputs(pom.getInstanceAP().comments(), commends);
		System.out.println("Commends :"+commends);
		
		clickElement(pom.getInstanceAP().proceed_Adres());
		
		//------->>Shipping page 
		clickElement(pom.getInstanceShipP().checkbox());
		clickElement(pom.getInstanceShipP().proceed3());
		
		//------->>maPayments and Confirmation page
		clickElement(pom.getInstancePP().bank());
		clickElement(pom.getInstancePP().confirm_order());

	}

}
