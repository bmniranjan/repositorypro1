package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class insta2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("9343889697");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("Anna@143");
		Thread.sleep(5000);
		
		
		d.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(12000);
		//d.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();
		
		
		
		d.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("jyothiraj yadav");
		Thread.sleep(8000);
		
d.findElement(By.xpath("//span[contains(text(),'jyothirajyadav')]")).click();
Thread.sleep(8000);
d.findElement(By.xpath("//div[contains(text(),'Message')]")).click();
Thread.sleep(10000);
d.findElement(By.xpath("//div[contains(text(),'Message...')]")).sendKeys("jyothiraj yadav");
Thread.sleep(8000);
		
	}
}

