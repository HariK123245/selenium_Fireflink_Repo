package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		driver.close();
		

	}
	

}
