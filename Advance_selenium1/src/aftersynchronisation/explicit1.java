package aftersynchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.urlContains("facebook"));
		d.findElement(By.id("email")).sendKeys("omg");
		d.findElement(By.id("pass")).sendKeys("omg");

	}

}
