package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class moneycontrol {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.moneycontrol.com/");
		Thread.sleep(4000);
		d.findElement(By.xpath("//a[@title='Stock Action']")).click();
		d.findElement(By.xpath("//div[@id='")).click();
	}

}
