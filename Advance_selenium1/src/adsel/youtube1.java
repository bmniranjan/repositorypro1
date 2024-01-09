package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.youtube.com/");
		Thread.sleep(1000);
		d.findElement(By.name("search_query")).sendKeys("ghost trailer");
		Thread.sleep(1000);
		d.findElement(By.className("style-scope ytd-searchbox")).click();
		Thread.sleep(3000);
		d.quit();
	}

}
