package adsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class launchedge1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
 WebDriver driver=new EdgeDriver();
		driver.quit();
	}

}
