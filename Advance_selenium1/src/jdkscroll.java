import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdkscroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(5000);
		WebElement scroll_upto = d.findElement(By.xpath("//strong[text()='The Oracle JDK 8 license changed in April 2019']"));
		Thread.sleep(4000);
        js.executeScript("arguments[0].scrollIntoView();", scroll_upto);
        
        
        Thread.sleep(2000);
        d.findElement(By.xpath("//a[@aria-controls='java8-windows']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//a[text()='jdk-8u391-windows-i586.exe']")).click();
        Thread.sleep(2000);
         WebElement ab = d.findElement(By.xpath("//div[@class='license-download'])[2]/div[1]/following-sibling::div[1]/div[1]"));
         Thread.sleep(2000);
         js.executeScript("arguments[0].click()", ab);
        Thread.sleep(1000);
        d.quit();
        
        
		
	}

}
