package BrowserStack;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppTest {
	
	public static final String username="soumyasantasahoo_0EBiCu";
	public static final String accessKey="2fRdT5HFxg3SqsAtH79q";
	public static final String url="https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void mobileBrowser() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability("Project", "API Demo Project");
		dc.setCapability("build", "APIDemo 2.2.3");
		dc.setCapability("name", "MobileApp_Testing");
		dc.setCapability("app", "bs://566d2b6b50805137e9e4a40a483761c722591301");
		
		URL u=new URL(url);
		AndroidDriver driver=new AndroidDriver(u,dc);
	}

}
