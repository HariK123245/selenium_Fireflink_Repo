package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDependentandIndependent {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.myntra.com/mobiles?rawQuery=mobiles");
		    driver.findElement(By.xpath("//span[@class='categories-num']/../..//label[@class='common-customCheckbox vertical-filters-label']")).click();

	}

}
