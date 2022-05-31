package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobilespage {

	@FindBy (xpath= "(//span[text()='Mobiles & Accessories'])[3]")
	private WebElement mobandacc;
	
	@FindBy (xpath= "//span[text()='Smartphones & Basic Mobiles']")
	private WebElement smart;
	
	@FindBy (xpath= "(//i[contains(@class,'a-icon a-icon-checkbox')])[3]")
	private WebElement real;
	
	public Mobilespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickmobandacc()
	{
		mobandacc.click();
	}
	
	public void smart()
	{
		smart.click();
	}

	public void real()
	{
		real.click();
	}
	
}
