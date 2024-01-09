package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklaunch extends youtubedummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("bmniranjan99@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("n,n,@");
		driver.findElement(By.className("login")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
