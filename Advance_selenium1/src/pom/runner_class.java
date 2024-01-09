package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class runner_class {
	@Test
	public void run() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		pom_class p = new pom_class(d);
		Thread.sleep(3000);
		p.enter_un();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		p.enter_un();
		Thread.sleep(3000);
		d.close();
		
	}

}
