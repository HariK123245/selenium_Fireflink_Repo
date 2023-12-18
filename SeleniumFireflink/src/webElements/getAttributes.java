package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demowebshop.tricentis.com/");
	    String classValue = driver.findElement(By.name("q")).getAttribute("class");
	    System.out.println(classValue);  //search-box-text ui-autocomplete-input

	}

}
