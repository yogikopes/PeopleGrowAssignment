package com.Assignment1.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Assignment1.qa.base.TestBase;
import com.Assignment1.qa.util.TestUtil;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//button[contains(text(),'Career')]")
	WebElement careerLink;
	
	
	@FindBy(xpath="//p[contains(text(),'Jobs')]")
	WebElement jobs;
	@FindBy(xpath="(//div//div[contains(text(),'Senior QA')])[1]")
	WebElement SeniorQA;
	
	//@FindBy(xpath="((//div//div[contains(text(),'Delloite')])[1]")
	//WebElement SeniorQA;
	
	
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyclickonCareerLink() throws IOException
	{
		careerLink.click();
		jobs.click();
		
		
	}
	public void SeniorQAJob() {
		
		
		
		JavascriptExecutor js=((JavascriptExecutor) driver);
		//js.executeScript("arguments[0].scrollIntoView(true);", SeniorQA);
		js.executeScript("arguments[0].click();", SeniorQA);
		//SeniorQA.click();
		
		driver.findElement(By.xpath("//button[contains(@class,'Button-module_primary__4ciLr cta__XUl3')]")).click();
		
		WebElement textBox = driver.findElement(By.xpath("(//p)[2]"));
		try {
			textBox.click();
		} catch (StaleElementReferenceException e) {
			WebElement textBox2 = driver.findElement(By.xpath("(//p)[2]"));

			textBox2.sendKeys("Name:YogeshwarKolpewad,DOB:01/05/1987,Exp:5.3 Years");

		}
		
          //	 driver.findElement(By.xpath("//div[@class='sendMessageBtn__NhCjS']")).click();
		
	}
	

	
	
	

}

