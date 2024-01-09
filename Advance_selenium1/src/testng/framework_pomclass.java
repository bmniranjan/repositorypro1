package testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class framework_pomclass {
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement u_text;
	@FindBy()
	private WebElement password;
	@FindBy(id="email")
	private WebElement pass_text;

}
