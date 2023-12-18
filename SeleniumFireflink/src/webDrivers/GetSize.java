package webDrivers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Dimension size= driver.manage().window().getSize();
		int height = size.getHeight();
		int width= size.getWidth();
		
		System.out.println(height);//700
		System.out.println(width);//1050
	}

}



