package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends base {

	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver=capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
		
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	//Select slct = new Select(driver.findElementById("android:id/text1"));
	//slct.selectByIndex(0);
		
		
		
		
	}

}
