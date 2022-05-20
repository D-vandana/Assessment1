package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverClass {
	public static WebDriver launch(WebDriver driver,String browser,String URL) {
		if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./Drivers//msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("no browser");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	public static void quit(WebDriver driver) {
		driver.quit();
	}

}
