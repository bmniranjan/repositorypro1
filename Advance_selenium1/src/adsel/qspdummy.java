package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspdummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("hi");
		driver.findElement(By.id("email")).sendKeys("niranjan@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hey@132");
		Thread.sleep(1000);
	driver.quit();
	}

}
