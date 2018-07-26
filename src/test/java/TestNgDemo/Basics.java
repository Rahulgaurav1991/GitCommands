package TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	@BeforeSuite
	public void SetPropert() {
		System.out.println("Set the property of suit");
	
	}
	@BeforeTest
	public void startchrome() {
		System.out.println("Set the property for testtt");
	}
	@BeforeClass
	public void Login() {
		System.out.println("Set the property classss");
		
	}
	@BeforeGroups
	public void grou() {
		System.out.println("before group");
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("enter the url");
	}
	@Test
	public void test() {
		System.out.println("write test cases here");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from application");
	}
	@AfterClass
	public void Deletecokie() {
		System.out.println("delete cokies");
		
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("close the browser");
		
	}
	@AfterSuite
	public void run() {
		System.out.println("After suite");
	}
	@AfterGroups
	public void method() {
		System.out.println("After groups run this");
	}
	


}
