package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wiproEX {
	@Test (groups = "system")    //for group execution 
	public void login() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wipro.com/");
	}

}
