package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pom_multiple {
	@FindBy(id="email")
	private WebElement un_text;
	@FindBy(id="pass")
	private WebElement pass_text;
	@FindBy(name="login")
	private WebElement lgn_bt;
	
	public pom_multiple(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}
	public WebElement enter_un()
	{
		return un_text;
	}public WebElement lgn_bt()
	{
		return un_text;
	}
	public WebElement enter_pass ()
	{
		return pass_text;
	}
}
