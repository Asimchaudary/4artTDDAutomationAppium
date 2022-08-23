package com.qa.listeners;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.NewTest1;

public class testListener implements ITestListener{
	public void onTestFailure(ITestResult result) {
		if(result.getThrowable() != null)
		{
			StringWriter sw=new StringWriter();
			PrintWriter pw=new PrintWriter(sw);
			result.getThrowable().printStackTrace(pw);
			System.out.println(sw.toString());
		}
//		NewTest1 baseClass= new NewTest1();
//		File file= baseClass.getDriver().getScreenshotAs(OutputType.FILE);
//		
//		Map <String, String> params= new HashMap <String, String>();
//		params= result.getTestContext().getCurrentXmlTest().getAllParameters();
//		
//		String imagePath="Screenshots" + File.separator + params.get("platformName") + "_" + params.get("deviceName")+
//		File.separator+ baseClass.getDate;
//		
//		try {
//			FileUtils.copyFile(file, new File ("SampleScr.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
