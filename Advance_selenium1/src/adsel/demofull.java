package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demofull {

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
	d.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("smartphone");
	d.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//a[text()='Smartphone']")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("//a[text()='Add your review']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@name='AddProductReview.Title']")).sendKeys("badone");
	Thread.sleep(1000);
	d.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("very very bad chayya chayya mobile set");
	d.findElement(By.xpath("//input[@type='submit' and @name='add-review']")).click();
	Thread.sleep(3000);
	d.findElement(By.xpath("")).click();
	
	
	
	
	
	
	
	d.findElement(By.xpath("//a[text()='Log out']")).click();
	d.quit();
	}

}
