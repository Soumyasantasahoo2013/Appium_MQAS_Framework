package com.GeneralStore.GenericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;

public class DriverUtility {
	
AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void installingApp()
	{
		driver.installApp("apk file path");
		System.out.println(driver.isAppInstalled("io.appium.android.apis"));
	}
	
	public void uninstallingApp()
	{
		driver.removeApp("package name");
	}
	
	public void runningAppinBackground()
	{
		driver.runAppInBackground(Duration.ofSeconds(30));
		System.out.println(driver.queryAppState("packageName"));
	}
	
	public void orientationChange()
	{
		ScreenOrientation s=driver.getOrientation();
		driver.rotate(s.PORTRAIT);
	}
	
	public void getViews()
	{
		Set<String> contextHandles = driver.getContextHandles();
        //System.out.println(contextHandles.size());
        for(String s:contextHandles)
        {
        	System.out.println(s);
        }
	}
	
	public void switchContext(String viewPackageName)
	{
		driver.context(viewPackageName);
	}

}
