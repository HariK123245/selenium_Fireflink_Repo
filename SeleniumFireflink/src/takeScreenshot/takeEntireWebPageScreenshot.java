package takeScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeEntireWebPageScreenshot {

	public static void main(String[] args) throws IOException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://demoapp.skillrary.com/");
    TakesScreenshot ss= (TakesScreenshot)driver;
    File temp = ss.getScreenshotAs(OutputType.FILE);
    File dest = new File("./screenshot/image1.png");
    FileHandler.copy(temp, dest);
    

	}

}
