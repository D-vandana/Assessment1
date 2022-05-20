package reusability;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AboutUs;
import pageobject.Shipping;
import pageobject.GiftCards;
import pageobject.HomePage;
import pageobject.Livingroom;
import pageobject.SalesPage;
import pageobject.SearchPage;
import pageobject.LoginPage;

import pageobject.StudyPage;
import pageobject.TVPage;
import utility.BaseClass;



public class MainClass extends BaseClass {
	@Test
	public void ass() throws InterruptedException {
		log=report.createTest("urbanladder");
		log.info("urbanladder running successfully");
	    HomePage HP= new HomePage(driver);
	    HP.icon().click();
	    HP.Login().click();
	    Thread.sleep(2000);
	    log.pass("Website opened");
	    
	    log=report.createTest("Log in page");
	    
	    LoginPage lp = new LoginPage(driver);
	    Thread.sleep(5000);
	    
	    lp.email().sendKeys("vandanadunaboina@gmail.com");
	    Thread.sleep(2000);
	    lp.password().sendKeys("vandana@14");
	    Thread.sleep(2000);
	    lp.submit().click();
	    Thread.sleep(2000);
	    log.pass("Login success");
	    
	    log=report.createTest("Signup Page");
	    log.info("Signup successfull");
	    log.pass("login Success");
	    
	    
	    
	    log=report.createTest("Search Page");
	    
	    
	    SearchPage sr = new SearchPage(driver);
	    sr.search().sendKeys("Tables");
	    sr.searchIcon().click();
	    log.pass("Searched tables in search bar");
	   log.pass("opened tables page");
	    
	 
	    
	    
	    log=report.createTest("study link");
	    
	    StudyPage sp1 = new StudyPage(driver);
	    Thread.sleep(5000);
	    sp1.study().click();
	    Thread.sleep(5000);
	    sp1.officetables().click();
	    Thread.sleep(5000);
	    log.pass("opened office tables page");
	    
	    
	    Thread.sleep(5000);
	   
	    
	    
	    log=report.createTest("Shipping and Delivery");
	    log.info("Clicking on shipping");
	    Shipping sh = new Shipping(driver);
	    Thread.sleep(5000);
	    sh.shipping().click();
	    
	 
	    Assert.assertEquals(sh.shippingVerify().getText(), "TERMS OF SHIPPING AND DELIVERY");
	    log.info("Shipping page is done");
	    log=report.createTest("about us");
	    log.info("clicking on About us");
	    
	  
	    
	    Thread.sleep(5000);
	    log=report.createTest("Gift cards");
	    log.info("clicking on gift cards");
	    Thread.sleep(5000);
	  
	    GiftCards gc = new GiftCards(driver);
	    gc.giftcard().click();
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(gc.giftVerify().getText().contains("Gift Cards"));
	    Thread.sleep(5000);
	    log.pass("GiftPage Opened");
	    AboutUs au = new AboutUs(driver);
	    Thread.sleep(5000);
	    gc.AboutUs().click();
	    System.out.println("AboutUs");
	    Thread.sleep(5000);
	    Assert.assertTrue( au.About().getText().contains("Honesty & Transparency"));
	    System.out.println("AboutUs");
	  
	    
	    
	    
	    log=report.createTest("TV Units");
	    log.info("clicking on TV Units");
	    Thread.sleep(5000);
	    
	    TVPage TP = new TVPage(driver);
	    Thread.sleep(5000);
	    TP.tvUnits().click();
	    
	    log.pass("TV units verified");
	    
	    Thread.sleep(5000);
	    
	    
	    
	    
	    log.pass("about us page is done");
	    Thread.sleep(5000);
	    log=report.createTest("Living room");
	    log.info("clicking on living room");
	    
	    Livingroom lc = new Livingroom(driver);
	    Thread.sleep(5000);
	    lc.liv().click();
	    Thread.sleep(5000);
	    lc.type().click();
	    log.pass("living room");
	    
	    /*log=report.createTest("Sales Page");
	     SalesPage ss = new SalesPage(driver);
	     Thread.sleep(5000);
	     ss.shoeRacks().click();
	     
	  
	   Thread.sleep(5000);
	   
	    System.out.println("shoe racks");
	    Assert.assertEquals(ss.saleverify().getText(),"Shoe Racks");
	    Thread.sleep(5000);
	    System.out.println("shoe racks");
	    log.pass("Sales Page Opened");*/
	    
	    
	    
	    
				

	    
	    
		
	    
	}

}


