package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
	    System.out.println("height:"+rect.getHeight()); //height:22
	    System.out.println("width:"+rect.getWidth());  //width:56
	    System.out.println("X:"+rect.getX());         //X:1074
	    System.out.println("Y:"+rect.getY());        //Y:106

	}
}
