package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SoftAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SoftAssert softassert = new SoftAssert();
		
		driver.get("https://demowebshop.tricentis.com/login");
		softassert.assertEquals(driver.getTitle(),"Demo Web Shop.","Failed to log in");
		Reporter.log("User navigated to Login Page",true);
		
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		softassert.assertEquals(driver.getTitle(),"Demo Web","User Failed To Log In");
		Reporter.log("User Logged in Succesfully",true);
	    softassert.assertAll();

}

}