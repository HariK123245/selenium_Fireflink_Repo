package webDrivers;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().setPosition(new Point(250,250));

	}

}
