package com.Assignment1.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment1.qa.base.TestBase;
import com.Assignment1.qa.pages.LoginPage;
import com.Assignment1.qa.pages.SignInLink;



public class SignInLinkTest extends TestBase {
	public SignInLink signInButton;
	public LoginPage loginPage;

	public SignInLinkTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signInButton = new SignInLink();
		loginPage = new LoginPage();
	}
	
	@Test( ) 
	
		public void signInButtonLinkTest() throws IOException{
			loginPage=signInButton.ClickonSignInButtonLink();
		
		}
	

}