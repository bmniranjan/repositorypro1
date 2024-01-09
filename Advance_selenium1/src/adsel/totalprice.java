package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class totalprice
{

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe")	;
	WebDriver d=new FirefoxDriver();
	d.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	d.findElement(By.xpath("//a[@class='ico-login']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@id='Email']")).sendKeys("bmniranjan99@gmail.com");
	d.findElement(By.xpath("//input[@id='Password']")).sendKeys("bmniranjan97@gmail.com");
	d.findElement(By.xpath("//input[ @type='submit' and  @value='Log in' ]")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//div[@class='center-2']/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	Thread.sleep(3000);
	
	
	d.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	//Thread.sleep(3000);
	d.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	//Thread.sleep(3000);
	
	Thread.sleep(5000);
	d.findElement(By.xpath("//div[@class='product-grid']/div[1]/following-sibling::div[1]/div[1]/div[2]/div[3]/div[2]")).click();
	
	
	//Thread.sleep(3000);*/
	
	}
	}