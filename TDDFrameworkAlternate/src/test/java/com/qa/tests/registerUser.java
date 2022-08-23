package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.NewTest1;
import com.qa.loc;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.FindsByIosNSPredicate;
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

public class registerUser{
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
		 baseClass.quitDriver();
	  }
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
		  System.out.println("\n"+" Starting test number:"+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	  @Test
	  public void userSignupWithAlreadyRegisteredUser() {
		  WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		    
		    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
		    String str1= loginButton.getText(); 	
		    System.out.println(str1);
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
		    MobileElement regButtonLoginScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.registerButton);
		    regButtonLoginScreen.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.companyName))).sendKeys("Asim's Company");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.firstName))).sendKeys("Asim");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.lastName))).sendKeys("Chaudhry");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.emailOnRegScreen))).sendKeys("zoya.latif+60@coeus-solutions.de");
		    MobileElement pass = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.passwordOnRegScreen);
		    pass.sendKeys("Coeus123@");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.termsAndConfitionsLink))).click();
		    String expectedLabelTermsDoc= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.docTextTermsAndConditions))).getText();
		    String actualLabelTermsDoc="TERMS & CONDITIONS";
		    System.out.println("Actual label of privacy document is "+actualLabelTermsDoc+"\n Expected is "+expectedLabelTermsDoc);
		    Assert.assertEquals(actualLabelTermsDoc, expectedLabelTermsDoc);
		    MobileElement back = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("backButton");
		    System.out.println(back.getText());
		    back.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.checkboxTermsAndConditions))).click();
	
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.privacyNotesLink))).click();
		    String expectedLabelPrivacyDoc= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.docTextPrivacyPolicy))).getText();
		    String actualLabelPrivacyDoc="PRIVACY POLICY";
		    System.out.println("Actual label of privacy document is "+actualLabelPrivacyDoc+"\n Expected is "+actualLabelPrivacyDoc);
		    Assert.assertEquals(actualLabelPrivacyDoc, expectedLabelPrivacyDoc);
		    MobileElement privacyBack = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("backButton");
		    System.out.println(privacyBack.getText()+" for privacy document");
		    privacyBack.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.privacyNotesCheckbox))).click();
		    MobileElement regButton = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.registerButtonOnSignupScreen);
		    regButton.click();
		    String ExpectedUserRegPopUpText= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.userAlreadyRegisteredPopUp))).getText();
		    String ActualUserRegPopUpText="User is already registered.";
		    System.out.println("Text of pop up for already reg user is "+ExpectedUserRegPopUpText+"\n Expected text is "+ActualUserRegPopUpText);
		    Assert.assertEquals(ActualUserRegPopUpText, ExpectedUserRegPopUpText);
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonUserRegPopUp))).click();

	  }
	  
	  
	  @Test
	  public void userSignup() {
			WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
//		    
//		    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
//		    String str1= loginButton.getText(); 	
//		    System.out.println(str1);
//		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
			   MobileElement back1 = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("backButton");
			    System.out.println(back1.getText());
			    back1.click();
		    MobileElement regButtonLoginScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.registerButton);
		    regButtonLoginScreen.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.companyName))).sendKeys("Asim's Company");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.firstName))).sendKeys("Asim");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.lastName))).sendKeys("Chaudhry");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.emailOnRegScreen))).sendKeys("asim.chaudhry+2133@coeus-solutions.de");
		    MobileElement pass = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.passwordOnRegScreen);
		    pass.sendKeys("Coeus123@");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.termsAndConfitionsLink))).click();
		    MobileElement back = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("backButton");
		    System.out.println(back.getText());
		    back.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.checkboxTermsAndConditions))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.privacyNotesLink))).click();
		    MobileElement privacyBack = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("backButton");
		    System.out.println(privacyBack.getText()+" for privacy document");
		    privacyBack.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.privacyNotesCheckbox))).click();
		    MobileElement regButton = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.registerButtonOnSignupScreen);
		    regButton.click();
	  }
	  


}