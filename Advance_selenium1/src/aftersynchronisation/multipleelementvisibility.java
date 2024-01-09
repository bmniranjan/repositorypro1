package aftersynchronisation;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipleelementvisibility {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
	                              
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start maximized");
	
	WebDriver d=new FirefoxDriver(opt); 
	WebDriverWait wait=new WebDriverWait(d, 10);
	d.get("https://demo.guru99.com/test/delete_customer.php");
	d.findElement(By.name("cusid")).sendKeys("12345",Keys.ENTER);
	wait.until(ExpectedConditions.alertIsPresent()).accept();
	
	}

}
