package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class runnermultiple {
	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		pom_multiple p=new pom_multiple(d);
		p.enter_un().sendKeys("omg");
		Thread.sleep(3000);
		p.enter_pass().sendKeys("ok");
		Thread.sleep(3000);
		p.lgn_bt().click();
		Thread.sleep(3000);
	}

}
