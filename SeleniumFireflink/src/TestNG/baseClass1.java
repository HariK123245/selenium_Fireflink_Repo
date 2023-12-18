package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass1 {
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		 driver= new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Open browser and Navigate URL",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logout",true);
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		Reporter.log("Close Browser",true);
	}

}


