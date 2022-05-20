package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {
	WebDriver driver;
	public SalesPage(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li[@class='subnav_item 15040']") WebElement sb;
	
	
	
	public WebElement saleverify()
	{
		return sb;
	}
	
	


}
