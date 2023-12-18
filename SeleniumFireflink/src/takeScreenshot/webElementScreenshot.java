package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.shoppersstack.com/user-signin");
	    Thread.sleep(10000);
	    File temp = driver.findElement(By.xpath("//div[@class='navbar_logoBlock__Z94Xi']")).getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshot/image2.png");
	    FileHandler.copy(temp, dest);
	    

	}

}
