package adselenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		//input[@id='name']
		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(2000);
		js.executeScript("document.getElementById(\"name\").value='xyz'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById(\"email\").value='abc'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='123#qwe'");
		Thread.sleep(2000);
		d.findElement(By.xpath("input[@type='submit']")).click();
		Thread.sleep(2000);
		d.quit();
		
		
		
		
		
		

		

	}

}
