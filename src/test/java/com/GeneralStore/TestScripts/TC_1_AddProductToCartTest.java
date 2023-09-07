package com.GeneralStore.TestScripts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.GeneralStore.GenericUtility.BaseAppiumClass;
import com.GeneralStore.GenericUtility.GestureUtility;
import com.GeneralStore.ObjectRepository.LoginPage;
import com.GeneralStore.ObjectRepository.ProductPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

@Listeners(com.GeneralStore.GenericUtility.ListenerImp.class)
public class TC_1_AddProductToCartTest extends BaseAppiumClass{
	
	//@Parameters({"deviceName","UDID","port"})
	@Test
	public void addProductToCart() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		lp.selectCountry(gUtil,"Soumya","India");
		Assert.assertEquals("A", "B");
		pp.addProductToCart();
	}

}
