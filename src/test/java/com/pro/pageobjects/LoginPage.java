package com.pro.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//input[@type='text']")
	WebElement txtUserName;
	

	@FindBy(xpath="//input[@type='password']")
	WebElement txtPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	
	

	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	public void clickLogin() {
		btnLogin.click();;
	}
}
