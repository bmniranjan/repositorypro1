package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class hardassert {
 
	@Test
	public void title() throws InterruptedException
{
		
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	String title = d.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
	Thread.sleep(2000);
	d.findElement(By.name("username")).sendKeys("hello");
	Thread.sleep(2000);
	d.findElement(By.name("password")).sendKeys("hello123$");
}
}
