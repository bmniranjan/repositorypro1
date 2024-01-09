package aftersynchronisation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nestedwithmultipleframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
				
		d.get("https://demoapps.qspiders.com/frames/nestedWithMultiple?sublist=3");
		String email=null;
		String password=null;
		String cpass=null;
		Thread.sleep(2000);
		d.switchTo().frame(0);
		email = d.findElement(By.xpath("//div[@class='form_container']/p[2]")).getText();
		Thread.sleep(2000);
	    password= d.findElement(By.xpath("//div[@class='form_container']/p[4]")).getText();
	    Thread.sleep(2000);
	    cpass = d.findElement(By.xpath("//div[@class='form_container']/p[6]")).getText();
	    Thread.sleep(2000);
	    d.switchTo().frame(1);
	    
	    d.switchTo().frame(2);
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    Thread.sleep(2000);
	    d.switchTo().frame(1);
	    Thread.sleep(2000);
	    
	    d.switchTo().frame(3);
	    d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    Thread.sleep(2000);
	    d.switchTo().frame(2);
	    d.switchTo().frame(4);
	    d.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys(cpass);
	    Thread.sleep(2000);
	    d.switchTo().frame(2);
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    
	    
	    
		 
	}

}
