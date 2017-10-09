package generics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	public DesiredCapabilities capabilities;
	public WebDriverWait wait; 
	public static AndroidDriver driver;
	
	
	@BeforeMethod
	public void setUp() throws MalformedURLException{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", GenericClass.getProperties("AUTOMATIONNAME"));
		capabilities.setCapability("platformName", GenericClass.getProperties("PLATFORMNAME"));
		capabilities.setCapability("deviceName", GenericClass.getProperties("DEVICENAME"));
		capabilities.setCapability("platformVersion", GenericClass.getProperties("PLATFORMVERSION"));
		capabilities.setCapability("app", GenericClass.getProperties("APP"));
		capabilities.setCapability("appPackage", GenericClass.getProperties("APPPACKAGE"));
		capabilities.setCapability("appActivity", GenericClass.getProperties("APPACTIVITY"));
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	@AfterMethod
	public void tearDwon(){
		driver.quit();
	}
	

}
