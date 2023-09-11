package com.Assignment1.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment1.qa.base.TestBase;
import com.Assignment1.qa.pages.HomePage;
import com.Assignment1.qa.pages.LoginPage;
import com.Assignment1.qa.pages.SignInLink;



public class LoginPageTest extends TestBase {
	public LoginPageTest() throws IOException {
		super();
		
	}
	public SignInLink signInButton;
	public LoginPage loginPage;
	public HomePage homePage;
	
	
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signInButton = new SignInLink();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage=signInButton.ClickonSignInButtonLink();
		
	

}
	
	@Test()
	public void LoginPageTitle() {
		String title =loginPage.validateLoginPageTitleC();
		System.out.println(title);
		
		
	}
	
	@Test()
	public void LoginTest() throws IOException
	{
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	}

