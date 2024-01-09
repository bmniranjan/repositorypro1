package adsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectdropdown
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/LENOVO/Desktop/dummy4.html");
		Thread.sleep(2000);
	    WebElement	dropdown=d.findElement(By.xpath("//select[@id='city-dropdown']"));
        Select sel=new Select(dropdown);
        if(sel.isMultiple())
          {
	       System.out.println("Multiple select");
          }
       else 
       {
	    System.out.println("single select");	
       }
        Thread.sleep(1000);
        d.quit();
	}

}
