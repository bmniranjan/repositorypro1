import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class frames1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demoapps.qspiders.com/frames");
	Thread.sleep(5000);
	d.manage().window().maximize();
	WebElement frame1_address = d.findElement(By.xpath("//iframe[@title='Login Form']"));
	Thread.sleep(3000);
	d.switchTo().frame(frame1_address);
	d.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
	Thread.sleep(3000);
	d.findElement(By.xpath("//input[@id='password']")).sendKeys("hello23");
	Thread.sleep(3000);
	d.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	d.switchTo().defaultContent();
	d.close();
	}

}
