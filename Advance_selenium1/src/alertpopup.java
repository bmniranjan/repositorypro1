import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://shoppersstack.com/");
		Thread.sleep(20000);
		
	    JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(2000);
		WebElement scroll_till = d.findElement(By.xpath("//a[text()='Help Center']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scroll_till);
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
		Thread.sleep(4000);
		Alert al = d.switchTo().alert();
		al.accept();
		d.quit();
	}

}
