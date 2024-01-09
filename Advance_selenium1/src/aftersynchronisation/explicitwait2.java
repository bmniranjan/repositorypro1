package aftersynchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromrdriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(d, 10);
		
		d.get("https://demoapps.qspiders.com/progress/element?sublist=2");
		 WebElement xy = d.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
	wait.until(ExpectedConditions.visibilityOf(xy)).sendKeys("10");
	

	}

}
