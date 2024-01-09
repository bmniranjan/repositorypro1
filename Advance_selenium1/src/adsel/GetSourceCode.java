package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSourceCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver	a=new FirefoxDriver();
	a.get("https://www.google.com");
	String b = a.getPageSource();
	Thread.sleep(1000);
System.out.println(b);
a.quit();
	}
	

	
}
