package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTest {
	
	public static final String username="soumyasantasahoo_0EBiCu";
	public static final String accessKey="2fRdT5HFxg3SqsAtH79q";
	public static final String url="https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";

	@Test
	public void mobileBrowser() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		dc.setCapability("build", "2.2.3");
		dc.setCapability("name", "MobileBrowser_Automate");
		
		URL u=new URL(url);
		WebDriver driver=new RemoteWebDriver(u, dc);
		driver.get("https://facebook.com");
	}
}
