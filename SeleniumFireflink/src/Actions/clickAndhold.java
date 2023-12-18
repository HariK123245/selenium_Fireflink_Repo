package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndhold {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		    driver.findElement(By.id("password")).sendKeys("tsting@123");
		    Thread.sleep(2000);
		    WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='']"));
		    Actions act = new Actions(driver);
		    act.clickAndHold(eyeIcon).perform();
	}

}
