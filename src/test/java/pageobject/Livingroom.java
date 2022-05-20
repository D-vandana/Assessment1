package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Livingroom {
	WebDriver driver;
	public Livingroom(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//li[@class='topnav_item livingunit']") WebElement Ele;
	@FindBy(xpath="//li[@class='subnav_item 1699']") WebElement tv;
	
	public WebElement liv()
	{
		return Ele;
	}
	
	public WebElement type()
	{
		return tv;
	}
	
	

}
