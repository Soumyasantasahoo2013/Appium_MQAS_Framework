package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
	
	AndroidDriver driver;
	public ProductPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//android.widget.TextView[@text='ADD TO CART'])[1]")
	private WebElement addProToCart;
	
	@FindBy(id ="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cartBtn;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getAddProToCart() {
		return addProToCart;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}
	
	public void addProductToCart()
	{
		addProToCart.click();
		cartBtn.click();
	}

}
