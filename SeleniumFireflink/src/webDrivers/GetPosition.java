package webDrivers;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX()); //10
		System.out.println(position.getY()); //10

	}

	}
