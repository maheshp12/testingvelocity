package testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Utility;
import browser.Base;
import pomclasses.Homepage;
import pomclasses.Mobilespage;

public class Verifyactiveheaderstng {

	
	WebDriver driver;
	Homepage homepage;
	 Mobilespage  mobilespage;
	
	 
	 
	 @Parameters ("Browesersnme")
	 @BeforeTest
	 public void lanchBrowser(String browser)
	 { 
	 System.out.println(browser);
	 
	 
	 if(browser.equals("Chrome"))
	 {
		
		driver = Base.openchromebrowser();
	 }
	 if(browser.equals("FireFox"))
 {
		
		driver = Base.openfirefoxbrowser();
	 }
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
	 }
	 
	  
	@BeforeClass
	public void createPomObjects()
	{
		 homepage = new Homepage(driver);
		 mobilespage = new Mobilespage(driver);
		
	}
	@BeforeMethod
	
	public void openhompage() 
	{
		driver.get("https://www.amazon.in/");

	
	}
	
	@Test 
	
	public void verifymobtab() 
	{
		
		homepage.clickonmob();
		
		String url=	driver.getCurrentUrl();


		String title = driver.getTitle();

		
				
		Assert.assertEquals( "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles", url );
				
		Assert.assertEquals( "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in",title);
		
		mobilespage.smart();
		mobilespage.real();
	}
	
   @Test  (enabled =false)
	
	public void verifycustomerservicetab()
	{
		
	   
	   homepage.clickoncustomerservice();
	   String url1 = driver.getCurrentUrl();

	   String title1 = driver.getTitle();
	   	
	   if(url1.equals("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help") && (title1.equals("Help - Amazon Customer Service")))
	   {
	   	System.out.println("pass");
	   }
	   	
	   else
	   {
	   	System.out.println("fail");
	   }
	   
	   	}
	
	
	@Test  (enabled =false)
	
	public void clickall1() 
	{
		homepage.clickall(driver);
	}
	
	@Test  (enabled =false)
	public void alllist()
	{
		homepage.accanlist(driver);
	}
	
	@Test (enabled =false)
	
	public void ss() throws IOException
	{
		
		homepage.screenshot(driver);
		
	}
	
	@Test (enabled =false)
	public void realopen()
	{
		mobilespage.real();
	}
	
	
	@AfterMethod
	public void checkit(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.capturescreenshot(driver, 73);
		}
	}
	
	@AfterTest
	public void close()
	{
		//driver.close();
		driver = null;
		System.gc();
	}
	
	
	
	
	
	
	
	
	
	
}
