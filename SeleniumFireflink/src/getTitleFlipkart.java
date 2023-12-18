import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleFlipkart {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.manage().window().fullscreen();
			

	}

}
