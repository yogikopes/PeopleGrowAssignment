package com.Assignment1.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment1.qa.base.TestBase;


	public class LoginPage extends TestBase {
		@FindBy(xpath ="//input[@id='email']")
		WebElement username;
		
		@FindBy(xpath ="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="//button[contains(@type,'submit')]")
		WebElement LoginBtn;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
			
		}
	public String validateLoginPageTitleC() {
		return driver.getTitle();

	}
	public HomePage Login (String un,String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}

	}



