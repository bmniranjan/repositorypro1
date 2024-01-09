package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserYoutube {
	public static WebDriver driver;
	public static void firefox()
	{
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.youtube.com");
driver.quit();
}
	public static void Chrome()	
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.quit();
	}
	public static void edge()
	{
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		driver.quit();
	}
	
	
public static void main(String[] args) 
{
	firefox();
	edge()	;
	Chrome();	
	}

}
