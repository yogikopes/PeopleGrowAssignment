package com.Assignment1.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Assignment1.qa.util.TestUtil;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase() throws IOException {
		
		try {
			prop = new Properties();
			FileInputStream ip =new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Assignment1\\src\\main\\java\\com\\Assignment1\\qa\\config\\config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
		  e.printStackTrace();	
		}
	}

	public static void initialization() {
		
		String browserName =prop.getProperty("browser");
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Assignment1\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		} 
		
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\eclipse-workspace\\Assignment1\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
}

