package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleOfPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
	WebDriver	driver=new EdgeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(1000);
	String title = driver.getTitle();
	System.out.println(title);
		driver.quit();
	}

}
