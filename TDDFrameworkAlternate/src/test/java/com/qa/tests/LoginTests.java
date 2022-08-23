package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.qa.NewTest1;
import com.qa.loc;
import com.qa.locators;
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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginTests{
	LoginPage loginpage;
	 NewTest1 baseClass;
//	protected static String dateTime;
	
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
//		  dateTime = TestUtils.getDateTime();
		  System.out.println("\n"+" Starting test number:"+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }


	  @Test
	  public void userLoginWithIncorrectEmail() throws InterruptedException{
				WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();

			    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
			    String str1= loginButton.getText(); 	
			    System.out.println(str1);
			 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
			    
			    MobileElement email = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				.findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
			    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("abcd");
			    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.done)).click();

			    MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
					      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
			    loginButtonSignInScreen.click();

			    MobileElement errorText = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
			              .findElementByIosNsPredicate(locators.loginErrorText);
				String actualErrorLabel=errorText.getText();
				String expectedErrorLabel="Please enter credentials";
				System.out.println("This is the actual error text: "+((WebElement) errorText).getText()+"\n" + "Expected Error text is: "+ expectedErrorLabel);
				
				Assert.assertEquals( actualErrorLabel, expectedErrorLabel);

			    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.okButton)).click();
			    email.clear();
				
			
	  }
	  @Test
	  public void userLoginWithIncorrectPassword() throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
		    MobileElement email = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
		    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("zoya.latif+60@coeus-solutions.de");

		    MobileElement password= (MobileElement) baseClass.getDriver().findElementByXPath(locators.password);
		    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("abc");;
		    MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
		    loginButtonSignInScreen.click();
		    
		    MobileElement errorTextPassword = (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.errorTextPassword);			
		    String actualErrorLabel=errorTextPassword.getText();
			String expectedErrorLabel="You entered invalid credentials.";
			System.out.println("This is the actual error text: "+((WebElement) errorTextPassword).getText()+"\n" + "Expected Error text is: "+ expectedErrorLabel);
			Assert.assertEquals( actualErrorLabel, expectedErrorLabel);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.okButton)).click();
		    
		    password.clear();
		    email.clear();
		    
}  
	  @Test
	  public void userLogin() throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
		    MobileElement email = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
		    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("zoya.latif+60@coeus-solutions.de");

		    MobileElement password= (MobileElement) baseClass.getDriver().findElementByXPath(locators.password);
		    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Coeus123@");;
		    MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
		    loginButtonSignInScreen.click();
		    MobileElement contButton = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.contButton);
		    wait.until(ExpectedConditions.visibilityOf(contButton));
		    String actualContButtonText=contButton.getText();
			String expectedText="CONTINUE";
			System.out.println("This is the actual error text: "+actualContButtonText+"\n" + "Expected Error text is: "+ expectedText);
			Assert.assertEquals( actualContButtonText, expectedText);
}  
//	  public String getDateTime() {
//		  return dateTime;
//		  
//	  }
//	  public void Login() {
//		  WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
//		    MobileElement email = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
//				      .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
//		    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("zoya.latif+60@coeus-solutions.de");
//		    MobileElement password= (MobileElement) baseClass.getDriver().findElementByXPath(locators.password);
//		    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Coeus123@");;
//		    MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
//				      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
//		    loginButtonSignInScreen.click();
//	  }

}
