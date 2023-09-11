package com.Assignment1.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Assignment1.qa.base.TestBase;



public class TestUtil extends TestBase {
	
	public TestUtil() throws IOException {
		super();
		
	}
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	
	public static  void captureScreenshot(String filename) throws IOException {
        
           
            TakesScreenshot ts = (TakesScreenshot) driver;

          
            File source = ts.getScreenshotAs(OutputType.FILE);

           
            String dest = "C:\\Users\\Dell\\eclipse-workspace\\Assignment1\\screenshots\\"+filename+".png" ;

            
            FileUtils.copyFile(source, new File(dest));
        }
    

}

