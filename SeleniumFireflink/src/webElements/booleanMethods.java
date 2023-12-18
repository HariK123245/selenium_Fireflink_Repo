package webElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class booleanMethods {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.shoppersstack.com/user-signin");
	    Thread.sleep(5000);
 
  }
	 }
