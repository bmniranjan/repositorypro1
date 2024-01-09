package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instalogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.instagram.com/");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("input[type='text']")).sendKeys("niru");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("input[type='password']")).sendKeys("niru@123");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		

	}

}
