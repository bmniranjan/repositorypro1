package Testng_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runner_class extends base_class
{
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("THALA");
		driver.findElement(By.id("pass")).sendKeys("THALA FOR reason");
		Thread.sleep(2000);
	}

}
