package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    WebElement searchTextfield = driver.findElement(By.xpath("//input[@value='Search store']"));
	    searchTextfield.sendKeys("Men");
	    Thread.sleep(5000);
	    searchTextfield.clear();

	}

}
