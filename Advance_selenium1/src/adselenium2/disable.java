package adselenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disable {

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
WebElement name_text = d.findElement(By.xpath("//input[@id='name']")) ;
Thread.sleep(2000);
WebElement email_text = d.findElement(By.xpath("//input[@id='email']")) ;
Thread.sleep(2000);
WebElement pass_text = d.findElement(By.xpath("//input[@id='password']")) ;
Thread.sleep(2000);
js.executeScript("arguments[0].value='abc'", name_text);
Thread.sleep(2000);
js.executeScript("arguments[0].value='abc'", email_text);
Thread.sleep(2000);
js.executeScript("arguments[0].value='abc'", pass_text);
Thread.sleep(2000);
d.quit();
	}

}
