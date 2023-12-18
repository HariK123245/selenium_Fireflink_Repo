package PageObjectModelPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
	    LoginPage lp = new LoginPage(driver);
	    lp.getEmailTextField().sendKeys("abc@gmail.com");
	    lp.getPasswordTextfield().sendKeys("Qwerty@123");
	    lp.getLoginButton().click();
		

	}

}
