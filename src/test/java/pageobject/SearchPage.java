package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="//input[@id='search']") WebElement sb;

@FindBy(xpath="//*[@class='search-icon icofont-search']") WebElement ico;

public WebElement search()
{
	 return sb;
}
public WebElement searchIcon()
{
	 return ico;
}



}
