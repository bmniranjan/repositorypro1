package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoaddtocart
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
	//d.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("smartphone");
	//d.findElement(By.xpath("//input[@type='submit']")).click();
	//Thread.sleep(3000);
	//d.findElement(By.xpath("//a[text()='Smartphone']")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a[1]")).click();
	d.findElement(By.xpath("//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//div[@class='header-links']/ul/li[3]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[1]/input")).click();
	Thread.sleep(3000);
	//d.findElement(By.xpath("//table[@class='cart']/tbody/tr[2]/td[1]/input")).click();
	//Thread.sleep(3000);
	d.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//a[text()='Log out']")).click();
	d.quit();
	}

}
