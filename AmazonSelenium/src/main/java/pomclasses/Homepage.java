package pomclasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement mobiles;
	
	
	@FindBy (xpath="//a[text()='Customer Service']")
	private WebElement customerservices;
	
	
	@FindBy (xpath="//a[text()='Fashion']")
	private WebElement fashion;
	
	@FindBy (xpath="//select[@id='searchDropdownBox']")
	private WebElement clickall;
	
	@FindBy (xpath="//span[text()='Account & Lists']")
	private WebElement moveele;
	
	
	
public Homepage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void clickonmob()
{
	mobiles.click();
}

public void clickoncustomerservice()
{
	customerservices.click();
}


public void clickonfashion()
{
	fashion.click();
}

public void clickall(WebDriver driver)
{
	clickall.click();
	Select s = new Select(clickall);
	s.selectByIndex(5);
}

public void accanlist(WebDriver driver)
{
	moveele.click();
	
	Actions act = new Actions(driver);
	
	
}

public void screenshot(WebDriver driver) throws IOException 
{
	
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	
 File s = ts.getScreenshotAs(OutputType.FILE);
 File d = new File ("D:\\scrrenshot\\" + "73.png");
 FileHandler.copy(s, d);
	
}




}
