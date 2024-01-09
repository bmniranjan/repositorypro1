import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingchildpopup {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver d=new ChromeDriver();
			Thread.sleep(2000);
			d.manage().window().maximize();
			Thread.sleep(2000);
			d.get("https://www.myntra.com/");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
			Thread.sleep(2000);
			d.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//a[@href='casual-shoes/roadster/roadster-men-brown-textured-pu-sneakers/18274390/buy'][1]/div[2]/h3")).click();
			Thread.sleep(4000);
			d.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[3]")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//div[contains(@class,'pdp-action-container pdp-fixed')]/div[1]")).click();
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//a[contains(@class,'pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ')]")).click();
			Thread.sleep(2000);
			
	}

}
