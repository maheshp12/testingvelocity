package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclasses.Homepage;

public class Verifyactiveheaders {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	Homepage homepage = new Homepage(driver);
	
	homepage.clickonmob();
	
String url=	driver.getCurrentUrl();


String title = driver.getTitle();

if(url.equals("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles") && (title.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")))
		{
	System.out.println("pass");
		}
else
{
	System.out.println("fail");
}
		
	
		

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

}
