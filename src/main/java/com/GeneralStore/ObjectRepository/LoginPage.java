package com.GeneralStore.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeneralStore.GenericUtility.GestureUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	AndroidDriver driver;
	
	//Declaring the element
	@FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    private WebElement countryDropdown;
	
	@FindBy(xpath = "//android.widget.TextView[@text='India']")
	private WebElement country;
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameTxtFld;
	
	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement radioBtn;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement submitBtn;
	
	//Initializing the element
	public LoginPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getNameTxtFld() {
		return nameTxtFld;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void selectCountry(GestureUtility gUtil, String name, String value)
	{
		countryDropdown.click();
		gUtil.scroll(value);
		country.click();
		nameTxtFld.sendKeys(name);
		radioBtn.click();
		submitBtn.click();
	}

	
}
