package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class Navigate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.shoppersstack.com/");
		//driver.navigate().to("https://www.shoppersstack.com/");
		driver.navigate().to(new URL("https://www.shoppersstack.com/"));
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();

	}

}
