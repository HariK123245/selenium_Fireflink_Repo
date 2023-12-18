package webElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
        Point location = driver.findElement(By.name("q")).getLocation();
        System.out.println("x:"+location.getX());  //x:759

	}

}
