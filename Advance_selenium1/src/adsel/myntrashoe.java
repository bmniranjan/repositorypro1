package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myntrashoe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.myntra.com/");
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("men shoes");
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[@class='search-searchProductsContainer row-base']/section/ul/li[1]/a/div[2]/h3")).click();
		Thread.sleep(5000);
		
		
		
		
	}

}
