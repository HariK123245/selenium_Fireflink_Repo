package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
driver.get("https://www.shoppersstack.com/");
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);         //https://www.shoppersstack.com/
		if (Url.equals("https://www.shoppersstack.com/")){
			System.out.println("User navigated");   //User navigated
		} 
		else {
			System.out.println("User failed to navigate");
		}
	}

}
