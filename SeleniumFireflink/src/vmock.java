import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class vmock {
	public WebDriver driver;
	@Parameters ("Browser")
	@Test
	public void demo(@Optional ("Chrome")String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"));
		{
			driver= new EdgeDriver();
		}
		driver.get("https://www.amazon.in/");
	}

}
