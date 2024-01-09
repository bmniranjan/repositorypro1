package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubesong {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.youtube.com/");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("saptha saagaradache ello kannada new song");
		Thread.sleep(3000);

		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and contains(@aria-label,'Sapta Sagaradaache Ello - Title')]")).click();
		Thread.sleep(3000);
		d.quit();
	}

}
