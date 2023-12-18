package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(Links.size()); //353
		System.out.println(images.size()); //98

	}

}
