package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		
		String title = driver.getTitle();
		System.out.println(title);     //ShoppersStack
		if (title.equals("ShoppersStack")){
			System.out.println("User navigated");  //User navigated
		} 
		else {
			System.out.println("User failed to navigate");
		}
	}

}
