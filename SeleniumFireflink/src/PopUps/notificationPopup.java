package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationPopup {

	public static void main(String[] args) {
		ChromeOptions setting = new ChromeOptions();  //Browser Setting
        // setting.addArguments("--disable-notifications");  //add chromium commands
		setting.addArguments("--incognito");   //open incognito mode
        
        WebDriver driver = new ChromeDriver(setting);  //pass setting to constructor
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
	    driver.get( "https://www.redbus.in/");

	}

}
