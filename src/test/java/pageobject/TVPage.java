package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVPage {
	WebDriver driver;
	public TVPage(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="TV Units") WebElement tu;
	public WebElement tvUnits()
	{
		return tu;
	}


}
