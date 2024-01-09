package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmap {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.com/maps/@13.0193523,77.5046096,15z?entry=ttu");
	Thread.sleep(8000);
	d.findElement(By.xpath("//button[@id='hArJGc']")).click();
	d.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("rajajinagar");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("sirsi");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../following-sibling::button[1]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//span[@id='section-directions-trip-details-msg-0']")).click();
	Thread.sleep(6000);
	d.quit();
	

	}

}
