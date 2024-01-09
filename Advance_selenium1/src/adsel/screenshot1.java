package adsel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(2000);
		TakesScreenshot ss=(TakesScreenshot)d;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File path=new File("C:\\Users\\LENOVO\\Desktop\\seleniumss1\\amazon defect.jpg");
		FileHandler.copy(src, path);
		Thread.sleep(2000);
		d.quit();
	}

}
