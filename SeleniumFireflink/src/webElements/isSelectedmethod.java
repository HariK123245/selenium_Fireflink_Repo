package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedmethod {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://demoapp.skillrary.com/");
	    Thread.sleep(5000);
	    WebElement price = driver.findElement(By.xpath("//option[@value='199']"));
	    System.out.println("Before Clicking: "+price.isSelected());  //Before Clicking: false
	    price.click();
	    System.out.println("After Clicking: "+price.isSelected());  //After Clicking: true
}
}