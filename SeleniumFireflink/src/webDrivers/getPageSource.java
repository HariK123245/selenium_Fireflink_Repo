package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		String source =driver.getPageSource();
		System.out.println(source);
		

	}

}
