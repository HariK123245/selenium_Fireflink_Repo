package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSvalue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.vtiger.com/vtigercrm");
	    WebElement usernameTextfield = driver.findElement(By.id("username"));
	    usernameTextfield.clear();
	    usernameTextfield.sendKeys("testing");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    WebElement errorMsg = driver.findElement(By.id("validationMessage"));
	    System.out.println(errorMsg.getCssValue("color"));  //rgba(255, 0, 0, 1)
	    

	}

}
