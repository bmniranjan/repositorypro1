package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class framework_baseclass implements framework_costant {
public WebDriver driver;
	@BeforeMethod
public void Openapp()
{
System.setProperty(x,y);
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(base_url);

}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
