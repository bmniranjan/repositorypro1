import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(20000);
		
		
		//a[text()='Multiple iframe']
		
		
		
		
	}

}
