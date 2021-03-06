package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@autofocus='autofocus']")
	WebElement em;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@class='button primary']")
	WebElement sub;
	
	public WebElement email()
	{
		return em;
		
	}
	
	public WebElement password()
	{
		return pwd;
		
	}
	public WebElement submit()
	{
		return sub;
	}

}


