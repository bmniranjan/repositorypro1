package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebooklogin {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromrdriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
		
	}

}
