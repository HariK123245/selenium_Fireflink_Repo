package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/login");
	    WebElement emailTextfield = driver.findElement(By.xpath("//input[@id='Email']"));
	    emailTextfield.sendKeys("adi@gmail.com");
	    WebElement passTextfield = driver.findElement(By.xpath("//input[@id='Password']"));
	    passTextfield.sendKeys("123abc");
	    WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	    loginButton.submit();
	    Thread.sleep(5000);
	    WebElement invalidMsg = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	    System.out.println(invalidMsg.getText());  //Login was unsuccessful. Please correct the errors and try again.
	   
	    

	}

}
