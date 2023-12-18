package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	@DataProvider
	public String[][] dataSender() {                                //Initialization of 2D array
		String[][]data= {                                           //Declaration of 2D array
				          {"abhis1234@gmail.com","abhis@1234"},
				          {"Testing@gmail.com","test@1234"}
				        };
		return data;
		
	}
	
	@Test (dataProvider = "dataSender")                             //Calling of 2D array
	public void login(String[] cred) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
