package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
	    driver.get( "https://www.makemytrip.com/");
	    WebElement overlayFrame = driver.findElement(By.xpath("//iframe[contains(@name,'notification-frame')]"));
	    driver.switchTo().frame(overlayFrame);
	    driver.findElement(By.xpath("//a[@class='close']"));
	    driver.switchTo().defaultContent();
	    //driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	    //driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	}

}
