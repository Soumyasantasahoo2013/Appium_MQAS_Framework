package com.GeneralStore.GenericUtility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.GeneralStore.ObjectRepository.LoginPage;
import com.GeneralStore.ObjectRepository.ProductPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseAppiumClass {

	AppiumDriverLocalService service;
	public AndroidDriver driver;
	public GestureUtility gUtil;
	public DriverUtility dUtil;
	public LoginPage lp;
	public ProductPage pp;
	public static AndroidDriver sdriver;
	
	@BeforeSuite
	public void startServer()
	{

		File f=new File("C:\\Users\\Soumya Santa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		service.start();
	}
	
	@BeforeMethod
	public void openApp() throws Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		//Identify specific device
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M30s");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8M83ZJH2W");
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL u=new URL("http://localhost:4723");
		driver=new AndroidDriver(u,dc);
		sdriver=driver;
		gUtil=new GestureUtility(driver);
		dUtil=new DriverUtility(driver);
		lp=new LoginPage(driver);
		pp=new ProductPage(driver);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void stopServer()
	{
		service.stop();
	}

}
