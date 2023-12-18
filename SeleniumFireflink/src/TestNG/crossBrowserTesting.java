package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	public WebDriver driver;
    @Parameters("Browser")
	@Test
	public void demo(@Optional ("Chrome") String browserName) {
		if(browserName.equals("Chrome")) {
			driver= new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://demowebshop.tricentis.com/");
	}

}
