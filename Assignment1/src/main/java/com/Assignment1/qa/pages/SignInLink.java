package com.Assignment1.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment1.qa.base.TestBase;



public class SignInLink extends TestBase {
	 @FindBy(xpath=("(//button[contains(@class,'ant-btn sign_in_btn__fmPfd')])[1]"))
	  WebElement SignIn;

	public SignInLink() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage ClickonSignInButtonLink() throws IOException {
		SignIn.click();
		return new LoginPage();
	}

}
