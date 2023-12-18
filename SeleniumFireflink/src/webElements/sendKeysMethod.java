package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysMethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    WebElement searchTextfield = driver.findElement(By.xpath("//input[@value='Search store']"));
	    //WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
	    searchTextfield.sendKeys("Men",Keys.ENTER);
	    //searchButton.click();

	}

}
