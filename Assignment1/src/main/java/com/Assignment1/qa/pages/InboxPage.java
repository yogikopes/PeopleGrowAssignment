package com.Assignment1.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Assignment1.qa.base.TestBase;



public class InboxPage extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'Inbox')]")
	WebElement inBox;
	@FindBy(xpath="//div[@class='ant-list-item-content ant-list-item-content-single']//following-sibling::div")
	List<WebElement> otherDetails;
	//@FindBy(xpath="//div[@class='ant-list-item-content ant-list-item-content-single']")
	//List<WebElement> otherDetails;
	
	
	
	public InboxPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyinBoxdetails() throws InterruptedException {
		inBox.click();
		
		String expectedResult = "Name:YogeshwarKolpewad,DOB:01/05/1987,Exp:5.3 Years";
		String actualResult = driver.findElement(By.xpath("(//p)[5]")).getText();

		if (expectedResult.equals(actualResult)) {
			System.out.println("display message verified");
		} else {
			System.out.println("display message not verified");

		}
		
		driver.findElement(By.xpath("//button[@class='ant-btn btn-link']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//img[@src='https://d3mvisyds448r0.cloudfront.net/profile-pictures"
				+ "/xTx9gtDpRCqGtpdppZrB_1683297374140-4307046cd5fd64f7eb8d.jpg'])[2]")).click();
		
		
	}
	
	 public void verifygetElementsList() {
		 for(WebElement ls:otherDetails)
	        {
	        	String printText=ls.getText();
	        	System.out.println(printText);
	        }
		
		
	 }
	}
