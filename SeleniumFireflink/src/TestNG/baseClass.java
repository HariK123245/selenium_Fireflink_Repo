package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseClass {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Establish DB Connection and Report Config",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close DB Connection and Flush all reports",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Open browser and Navigate URL",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("Close browser",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout",true);
	}

}
