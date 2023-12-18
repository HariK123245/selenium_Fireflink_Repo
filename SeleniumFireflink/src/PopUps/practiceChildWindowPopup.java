package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceChildWindowPopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.shoppersstack.com/products_page/3");
	    driver.findElement(By.id("compare")).click();
	    Set<String> allWindowIds = driver.getWindowHandles();
	    
	    for(String id:allWindowIds) {
	    	driver.switchTo().window(id);
	    	String url = driver.getCurrentUrl();
	    	if(url.contains("amazon")) {
	    		break;
	    	}
	    }
	    Dimension size = driver.manage().window().getSize();
	    System.out.println(size.getHeight());  //373
	    System.out.println(size.getWidth());  //316
	    Point position = driver.manage().window().getPosition();
	    System.out.println(position.getX());  //400
	    System.out.println(position.getY());  //400
	    driver.close();

	}

}
