package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyPage {
	WebDriver driver;
	public StudyPage(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='topnav_item studyunit']") WebElement su;
	
	@FindBy(linkText="Office Tables") WebElement office;
	
	
	public WebElement officetables()
	{
		return office;
		
	}
	public WebElement study() {
		{
			return su;
			
		}
		// TODO Auto-generated method stub

}
}