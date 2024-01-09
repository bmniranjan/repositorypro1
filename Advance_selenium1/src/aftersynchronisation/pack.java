package aftersynchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pack
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/progress/element?sublist=2");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("1");
		d.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebElement select = d.findElement(By.tagName("//select"));
		Select k=new Select(select);
		k.selectByVisibleText("YES");
		
		
		
	}

	
}