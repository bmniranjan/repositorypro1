package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allbrowser
{
	    public static WebDriver k;
		public static void chrome()
		{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			 k=new ChromeDriver();
			k.get("https:/www.google.com");
			String a = k.getTitle();
			String b = k.getCurrentUrl();
			String c = k.getPageSource();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			k.quit();
		}
		
		public static void edge()
		{
			System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
			 k=new EdgeDriver();
			k.get("https:/www.youtube.com");
			String a = k.getTitle();
			String b = k.getCurrentUrl();
			String c = k.getPageSource();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			k.quit();
		}
		public static void firefox()
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			 k=new FirefoxDriver();
			k.get("https:/www.zomato.com");
			String a = k.getTitle();
			String b = k.getCurrentUrl();
			String c = k.getPageSource();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			k.quit();
		}
	
public static void main(String[] args) 
{
	chrome();
	edge();
	firefox();
}
}


	

