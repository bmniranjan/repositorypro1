package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class partiallydinamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("file:///C:/Users/LENOVO/Desktop/dummy2.html");
		Thread.sleep(1000);
		d.findElement(By.partialLinkText("google 2023")).click();
		d.findElement(By.partialLinkText("తెలుగు")).click();
		Thread.sleep(1000);
		
		
		
		
	}

}
