package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxes {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///C:/Users/User/Documents/movieList.html");
		    String a = driver.findElement(By.xpath("//td[text()=' KGF ']/following-sibling::td")).getText();
		    String b = driver.findElement(By.xpath("//td[text()=' Baahubali ']/following-sibling::td")).getText();
		    System.out.println(a); //1200
		    System.out.println(b); //1500
	}

}
