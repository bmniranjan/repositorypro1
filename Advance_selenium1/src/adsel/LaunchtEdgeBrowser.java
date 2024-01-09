package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchtEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.quit();

	}

}
 