package com.Assignment1.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment1.qa.base.TestBase;
import com.Assignment1.qa.pages.HomePage;
import com.Assignment1.qa.pages.InboxPage;
import com.Assignment1.qa.pages.LoginPage;
import com.Assignment1.qa.pages.SignInLink;
import com.Assignment1.qa.util.TestUtil;



public class InboxPageTest extends TestBase {
	public SignInLink signInButton;
	public LoginPage loginPage;
	public HomePage homePage;
	public InboxPage inboxpage;
	public TestUtil captureScreenshot;
	public InboxPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signInButton = new SignInLink();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage=signInButton.ClickonSignInButtonLink();
		loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		inboxpage=new InboxPage();
		captureScreenshot=new TestUtil();
	
		
	}
	
	@Test()
	public void VerifyinBoxdetailsTest() throws InterruptedException
	{
		inboxpage.VerifyinBoxdetails();
		inboxpage.verifygetElementsList();
		
		
	}
	}
