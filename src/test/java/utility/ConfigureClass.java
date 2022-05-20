package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureClass {
	Properties prop;
	public ConfigureClass()  {
		File fi = new File("./Configuration/config.properties");
		try {
		FileInputStream fis = new FileInputStream(fi);
		prop=new Properties();
		prop.load(fis);
	}
		catch(Exception e) {
			System.out.println("Exception is:"+e.getMessage());
		}
	}
	public String getBrowser() {
		return prop.getProperty("Browser");
	}
	public String getURL() {
		return prop.getProperty("URL");
				
	}
	
	
	public String getExcelDataPath() {
		String xlpath = prop.getProperty("excelDataPath");
		return xlpath;
		
	}

}
