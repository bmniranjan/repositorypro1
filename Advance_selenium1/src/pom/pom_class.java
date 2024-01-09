package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class {
	@FindBy(id="email")
	private WebElement username_textfield;
	public pom_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enter_un()
	{
		username_textfield.sendKeys("xyi");
	}

}
