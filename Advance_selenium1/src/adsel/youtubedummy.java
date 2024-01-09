package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class youtubedummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("heeriye song");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
