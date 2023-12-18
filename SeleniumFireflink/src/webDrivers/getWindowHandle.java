package webDrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/");
		String windowId= driver.getWindowHandle();
		System.out.println(windowId); //08047E6C3CDA5E5CBFB6C9AEDDD86EC2


	}

}
