package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.NewTest1;
import com.qa.loc;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class forgotPassword{
	LoginPage loginpage;
	NewTest1 baseClass;
	LoginTests lt=new LoginTests();
	
	  @Parameters({"platformName","deviceName", "udid"}) 

	  @BeforeClass
	  public void beforeClass(String platformName, String deviceName, String udid) throws Exception {
			baseClass=new NewTest1();
			baseClass.initializeDriver(platformName, deviceName, udid);;
	  }

	  @AfterClass
	  public void afterClass() {
//		 baseClass.quitDriver();
	  }
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
//		  baseClass.getDriver().closeApp();
//		  baseClass.getDriver().launchApp();
		  System.out.println("\n"+" Starting test number:"+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	 @Test
	 public void forgotPassordFlow() {
		  WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		    
		    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
		    String str1= loginButton.getText(); 	
		    System.out.println(str1);
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.forgotPasswordButtonLoginScreen))).click();
		    
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.emailFieldForgotPasswordScreen))).sendKeys("asim.chaudhry@coeus-solutions.de");

		    
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.resetButtonForgotPasswordScreen))).click();

		    MobileElement resetString = (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.resetScreenLabel);			
		    String actualLabelOfResetScreen=resetString.getText();
			String expectedLabelOfScreen="RESET PASSWORD";
			System.out.println("This is the actual reset screen text: "+( actualLabelOfResetScreen)+"\n" + "Expected reset screen text is: "+ expectedLabelOfScreen);
			Assert.assertEquals( actualLabelOfResetScreen, expectedLabelOfScreen);
			wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.loginButtonResetPasswordScreen))).click();
	 }

}
	  
