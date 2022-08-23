package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.NewTest1;
import com.qa.loc;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class MyProfile_EditProfile extends NewTest1{

	LoginPage loginpage;
	NewTest1 baseClass;
	LoginTests lt=new LoginTests();

	  @Parameters({"platformName","deviceName", "udid"}) 

//	  @BeforeSuite
//	  public void beforeSuite() {
//////		  server=getAppiumService();
//////		  server.start();
//////		  server.clearOutPutStreams();
//		  NewTest1.startServer();
//		  System.out.println("Appium Server Started Successfully");
//	  }
//	  @AfterSuite
//	  public void afterSuite() {
//		  NewTest1.stopServer();
//		  System.out.println("Appium Server Stopped");
//	  }
	  @BeforeClass
	  public void beforeClass(String platformName, String deviceName, String udid) throws Exception {	
		  baseClass=new NewTest1();
			baseClass.initializeDriver(platformName, deviceName, udid);

	  }

	  @AfterClass
	  public void afterClass() {
//		 baseClass.quitDriver();
	  }
	  @BeforeMethod
	  public void beforeMethod(Method m) 
	  {
		  System.out.println("\n"+" Starting test: "+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @Test
	  public void checkProfile() throws InterruptedException {
		 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		 	wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.myProfile))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.editProfile))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.personalData))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.artistName))).click();
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(175, 451)).perform();
		 	String artistPopUpText=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.popUpForArtistChange))).getText();
		 	System.out.println("This is the text in Artist Pop up:"+artistPopUpText);
		 	String actualArtistPopUpText="If you have an official artist name and would like to store it here, please contact our support.";
		    Assert.assertEquals(artistPopUpText,actualArtistPopUpText);
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.emailChangeEditProfile))).click();
		 	String actualEmailScreenLabel=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.changeEmailScreenLabelText))).getText();
		 	String expectedEmailScreenLabel="CHANGE E-MAIL";
		 	System.out.println("This is the text on change email screen: "+actualEmailScreenLabel);
		    Assert.assertEquals(actualEmailScreenLabel,expectedEmailScreenLabel);
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.backButton))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.streetNo))).clear();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.streetNo))).sendKeys("Street No 1");
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.zipCode))).clear();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.zipCode))).sendKeys("54000");
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.city))).clear();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.city))).sendKeys("Lahore");
//		     int pressX = baseClass.getDriver().manage().window().getSize().width / 2;
//		        // 4/5 of the screen as the bottom finger-press point
//		        int bottomY = baseClass.getDriver().manage().window().getSize().height * 4/5;
//		        // just non zero point, as it didn't scroll to zero normally
//		        int topY = baseClass.getDriver().manage().window().getSize().height / 8;
//		        //scroll with TouchAction by itself
//		        scroll(pressX, bottomY, pressX, topY);
		     TouchAction touchAction = new TouchAction(baseClass.getDriver());
		        touchAction.longPress(PointOption.point(355, 468)).moveTo(PointOption.point(355, 367)).release().perform();
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.vatNumber))).clear();
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.vatNumber))).sendKeys("123ABC");
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
			 	MobileElement save = (MobileElement) baseClass.getDriver().findElementByXPath("//XCUIElementTypeButton[@name=\"SAVE\"]");
			 	save.click();
			    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.okButton)).click();
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.backButton))).click();

	  }
	  @Test
	  public void changePassword() {
		 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		 	
		 	wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.myProfile))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.editProfile))).click();
		 	
		 	MobileElement resetPasswordOption = (MobileElement) baseClass.getDriver().findElementByXPath("//XCUIElementTypeStaticText[@name=\"PASSWORD\"]");
		 	resetPasswordOption.click();
//		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.resetPasswordOptionInMenu))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).sendKeys("Coeus123@");
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).sendKeys("Coeus123$");
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).sendKeys("Coeus123$");
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveButtonPasswordScreen))).click();
		 	String passwordUnsuccessfulExpected="Old password is not correct.";
		 	String passwordSuccessfulExpected="Password changed successfully.";
//		 	WebElement obj=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.passwordChangeFailPopUpText)));
//		 	MobileElement element = (MobileElement) baseClass.getDriver().findElementByXPath("//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther");
//		 	System.out.println("This is the text:"+element.getText());
//		 	boolean isDisplayed = element.isDisplayed();
//	        boolean isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated((By) baseClass.getDriver().findElementByXPath(loc.passwordChangedSuccessfullyPopUpText))).isDisplayed();
//	 		System.out.println(loc.passwordChangeFailPopUpText);
//	 		boolean isDisplayed=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.passwordChangeFailPopUpText))) != null;
//		 	if(isDisplayed)
//			 	{
//				 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
//
//		 				 		System.out.println("Changing password now");
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).clear();
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).sendKeys("Coeus123$");
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).clear();
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).sendKeys("Coeus123@");
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).clear();
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).sendKeys("Coeus123@");
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveButtonPasswordScreen))).click();
//		 				 		System.out.println("Password Change Successfully");
//		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
//		 				 	}
//		 				 	else
//		 				 	{
//		 				 		
//		 				 		System.out.println("Password Change Successfully");
//		 				 	}
	 		try {
		 		boolean isDisplayed=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.passwordChangeFailPopUpText))) != null;
			 	if(isDisplayed)
			 	{
				 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();

		 				 		System.out.println("Changing password now");
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).clear();
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).sendKeys("Coeus123$");
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).clear();
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).sendKeys("Coeus123@");
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).clear();
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).sendKeys("Coeus123@");
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveButtonPasswordScreen))).click();
		 				 		System.out.println("Password Changed Successfully");
		 					 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
		 				 	}
	 		}
	 		catch(Exception e){
				 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
	 			System.out.println("Password already changed Successfully");
	 		}
//		 	if(isDisplayed)
//		 	{
//		 		System.out.println("A");
//		 	}
//		 	else {		 
//		 		System.out.println("B");
}
////		 	
//		 	
//		 	String passwordUnsuccessfulActual=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.passwordChangeFailPopUpText))).getText();
////		 	String passwordSuccessfulActual=wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.passwordChangedSuccessfullyPopUpText))).getText();
//		 	
//		 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
//
//
//		 	if(passwordUnsuccessfulExpected.equals(passwordUnsuccessfulActual))
//		 	{
//
//		 		System.out.println("Changing password now");
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).clear();
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.actualPassword))).sendKeys("Coeus123$");
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).clear();
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newPassword))).sendKeys("Coeus123@");
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).clear();
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.repeatNewPassword))).sendKeys("Coeus123@");
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.doneButton))).click();
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveButtonPasswordScreen))).click();
//		 		System.out.println("Password Change Successfully");
//			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.okButtonCautionPopUp))).click();
//		 	}
//		 	else
//		 	{
//		 		
//		 		System.out.println("Password Change Successfully");
//		 	}
//		 		
//


	private boolean visibilityOfElementLocated(WebElement findElementByXPath) {
		// TODO Auto-generated method stub
		return false;
	}
}
