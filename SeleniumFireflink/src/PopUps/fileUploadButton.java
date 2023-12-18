package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get( "https://www.naukri.com/registration/createAccount");
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("c:\\Users\\abhis\\OneDrive\\Sample.docx");
//Sample Example dont execute
	}

}
