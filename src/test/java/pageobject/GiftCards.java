package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards {
	WebDriver driver;
	public GiftCards(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Gift Cards']") WebElement gc;
	
	public WebElement giftVerify()
	 {
		 return gc;
	 }
	
	@FindBy(linkText="Gift Cards") WebElement gcf;
	
	
	public WebElement giftcard()
	{
		return gcf;
	}
	
	@FindBy(linkText="About Us") WebElement about;
	WebElement abt;
	
	public WebElement AboutUs()
	{
		return about;
	}
	
	
		

}
