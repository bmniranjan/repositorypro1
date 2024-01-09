package testng;

import org.testng.annotations.Test;

public class gj {
	@Test
	public void compose()
	{
		System.out.println("mail is composed");
		
		
	}
	@Test(dependsOnMethods = "compose")
	public void send()
	{
		System.out.println("the mail is sent");
		
	}
	@Test(dependsOnMethods = "send")
	public void sendItem()
	{
		System.out.println("the mail is displayed in sent items");
	}
	@Test(dependsOnMethods = "sendItem")
	public void trash() {
		System.out.println("the mail is present in trash");
	}
	

}
