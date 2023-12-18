package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends baseClass1 {
	@Test
	public void addProductyToCart() {
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../..//input")).click();
	Reporter.log("Product added succesfully....",true);

}
	}
