package com.APIDemo.DriverMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverMethods {
	@Test
	public void driverMethods() throws Throwable
	{
	File f=new File("C:\\Users\\Soumya Santa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
	
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
	service.start();
	
	DesiredCapabilities dc=new DesiredCapabilities();
	//Identify specific device
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M30s");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.UDID, "RZ8M83ZJH2W");
	dc.setCapability("unlockType", "pin");
	dc.setCapability("unlockKey", "153515");
	
	//To install App
	//dc.setCapability(MobileCapabilityType.APP, "");
	
	//To open perticular App
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	
	URL u=new URL("http://localhost:4723");
	AndroidDriver driver=new AndroidDriver(u,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//install
	driver.installApp(null);
	
	//to check installed or not
	System.out.println(driver.isAppInstalled("packageName"));
	
	//activate app
	driver.activateApp("packageName");
	
	//to run app in background
	driver.runAppInBackground(Duration.ofSeconds(20));
	
	//to check app is running in background
	driver.queryAppState("packageName");
	
	//hideKeyboard
	driver.hideKeyboard();
	
	//openNotification
	driver.openNotifications();
	
	//orientation
	ScreenOrientation s = driver.getOrientation();
	driver.rotate(s.LANDSCAPE);
	
	//contextHandle
	
}
}
