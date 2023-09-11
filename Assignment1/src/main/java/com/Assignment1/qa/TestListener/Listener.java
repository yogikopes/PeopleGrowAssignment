package com.Assignment1.qa.TestListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Assignment1.qa.util.TestUtil;


public class Listener extends TestUtil implements ITestListener {

	
	
	public Listener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		String filename=result.getName();
		try {
			TestUtil.captureScreenshot(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
}