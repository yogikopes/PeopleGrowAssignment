package com.Assignment1.qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Assignment1.qa.base.TestBase;
import com.Assignment1.qa.pages.HomePage;
import com.Assignment1.qa.pages.LoginPage;
import com.Assignment1.qa.pages.SignInLink;



public class HomePageTest extends TestBase{
	
	public SignInLink signInButton;
	public LoginPage loginPage;
	public HomePage homePage;
	
	public HomePageTest() throws IOException
	{
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
	
	
	}
	
	/*@Test(priority=1)
	public void verifyclickonCareerLinkTest() throws IOException
	{
		homePage.verifyclickonCareerLink();
		//homePage.verifyclickonCareerLink();
	}
	*/
	@Test()
	
	public void verifySenoirQA() throws IOException {
		homePage.verifyclickonCareerLink();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		homePage.SeniorQAJob();
		
	}


}
