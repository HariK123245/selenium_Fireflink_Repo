package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByMultipleAtt {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Search']")).click();

	}

}
