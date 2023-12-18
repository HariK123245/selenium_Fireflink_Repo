package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionOnHiddenElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("argument[0].value='have a nice dat!!!'", hiddenElement);

	}

}
