package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test (dependsOnMethods = "register") 
	public void login() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("User logged in succesfully....",true);
	}
	@Test
	public void register(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("User registered successfully....",true);
		Assert.fail();  //to skip/fail any TestCase

}
}
