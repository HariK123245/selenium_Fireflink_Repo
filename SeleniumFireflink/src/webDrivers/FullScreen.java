package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().fullscreen();
	}

}
