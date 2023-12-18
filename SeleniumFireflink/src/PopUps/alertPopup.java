package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get( "https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    Alert alertPopup = driver.switchTo().alert();
	    System.out.println(alertPopup.getText());  //Please enter some search keyword
	    Thread.sleep(2000);
	    //alertPopup.accept();
	    alertPopup.dismiss();
	    

}
	}
