package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public static String screenShot(WebDriver driver) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String scPath = System.getProperty("user.dir")+"/Screenshots/urbanladder_"+getCurrentDateTime()+".png";
		 
		
		try {
			FileHandler.copy(src, new File(scPath));
			System.out.println("Screenshot Captured");
		}catch(Exception e) {
			System.out.println("Not Captured");
		}
		return scPath;
	}
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}

}
