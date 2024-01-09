package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='gender-male']")).click();
		d.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("bm");
		d.findElement(By.xpath("//input[@id='LastName']")).sendKeys("niru");
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys("bmniranjan99@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys("bmniranjan97@gmail.com");
		d.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("bmniranjan97@gmail.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(3000);
		d.quit();
		
		
	}

}
