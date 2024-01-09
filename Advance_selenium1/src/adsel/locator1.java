package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/dummy.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("omg");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("abckk");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
