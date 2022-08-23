package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.NewTest1;
import com.qa.loc;
import com.qa.locators;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class chooseProfileScreen{
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
		  System.out.println("\n"+" Starting test number:"+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @Test
	  public void userLoginAndLogout() throws InterruptedException{
		  
			WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
		    String str1= loginButton.getText(); 	
		    System.out.println(str1);
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
		    
			
		    MobileElement email = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
		    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("zoya.latif+60@coeus-solutions.de");

		    MobileElement password= (MobileElement) baseClass.getDriver().findElementByXPath(locators.password);
		    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Coeus123@");;
		    MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
		    loginButtonSignInScreen.click(); 
		    By chooseCompany= MobileBy.xpath(loc.chooseCompany);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(chooseCompany)).click();
		    MobileElement contButton = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.contButton);
		    contButton.click();
		    MobileElement yesButton = (MobileElement) ((FindsByIosNSPredicate) baseClass.getDriver())
				      .findElementByIosNsPredicate(loc.yesButtonCompanyScreen);
		    yesButton.click();   
			
		    //Checking list icon screen
		    System.out.println("Now checking the list icon on artworks screen");
		    Thread.sleep(2000);
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.listIcon))).click();
		    System.out.println("List Icon clicked successfully");

//		    Checklogoutfeature
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();

		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.logoutButtonInMenu))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.logoutButtonInLogoutPopUp))).click();


		    


}  

}