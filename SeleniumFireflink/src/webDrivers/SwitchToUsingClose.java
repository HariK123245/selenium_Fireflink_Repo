package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToUsingClose {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(1000);

	}

}
