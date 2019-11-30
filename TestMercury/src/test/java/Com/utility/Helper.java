package Com.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Helper {
	public static  String CaptureScreenshot(WebDriver driver) {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String screenshotpath=System.getProperty("user.dir")+"./ScreenShots/Mercurry"+getCurrentDateTime()+".png";
	try {
		org.openqa.selenium.io.FileHandler.copy(src,new File(screenshotpath));
		System.out.println("Screenshot captured");
	} catch (IOException e) {
		System.out.println("Unable to capture screenshot"+e.getMessage());
	}
	return screenshotpath; 
	
	}
	public static String getCurrentDateTime() {
		DateFormat customformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customformat.format(currentDate);
		
	}


}
