package Utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
public static void capturescreenshot(WebDriver driver, int testID) throws IOException
{
	
	DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-mm-dd hh-mm-ss");
	

	TakesScreenshot ts =(TakesScreenshot)driver;
	
 File s = ts.getScreenshotAs(OutputType.FILE);
 
 LocalDateTime now =LocalDateTime.now();
 
 File d = new File ("test-output\\Screenshot" + "73.png");
 FileHandler.copy(s, d);
	
}


}
