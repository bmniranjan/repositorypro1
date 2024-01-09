package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shaadfi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver d=new FirefoxDriver();
d.get("https://www.shaadi.com/");
Thread.sleep(3000);
d.findElement(By.xpath("//a[@data-testid='login_link']")).click();
Thread.sleep(1000);
d.findElement(By.xpath("//input[@name='email']")).sendKeys("jyoto123");
Thread.sleep(1000);
d.findElement(By.xpath("//input[@name='password']")).sendKeys("jyoto@123");
Thread.sleep(1000);
d.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
d.quit();

	}

}
