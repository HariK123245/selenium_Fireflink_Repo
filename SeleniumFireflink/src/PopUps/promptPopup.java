package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get( "https://w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	   Alert promptPopup = driver.switchTo().alert();
	   promptPopup.sendKeys("Harry Potter");
	   //Thread.sleep(2000);
	   promptPopup.accept();
	   String msg = driver.findElement(By.id("demo")).getText();
	   System.out.println(msg);  //
	    
	}

}
