package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageobject.AboutUs;
import pageobject.GiftCards;
import pageobject.HomePage;
import pageobject.Livingroom;
import pageobject.LoginPage;
import pageobject.SearchPage;
import pageobject.Shipping;
import pageobject.StudyPage;
import pageobject.TVPage;



public class BaseClass {
	public WebDriver driver;
	public ConfigureClass co;
	public ExtentReports report;
	public ExtentTest log;
	public HomePage HP;
	public LoginPage lp;
	public SearchPage sr;
	public StudyPage sp1;
	public Shipping sh;
	public GiftCards gc;
	public AboutUs au;
	public TVPage TP;
	public Livingroom lc;
	
	
	@BeforeSuite
	public void setUp() throws IOException {
		co = new ConfigureClass();
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/urbanladder"+Helper.getCurrentDateTime()+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	@BeforeClass
	public void welcome() {
		driver=DriverClass.launch(driver, co.getBrowser(), co.getURL());
	}
	
	@AfterClass
	public void close() {
		DriverClass.quit(driver);
	}
	
	@AfterMethod
	public void ssMethod(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
		log.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.screenShot(driver)).build());
		log.fail("Oops testcase failed");
	}
	
	else if(result.getStatus()==ITestResult.SUCCESS) {
		log.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.screenShot(driver)).build());
	}
	report.flush();
}
}