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
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class generalCases{
	
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
		  System.out.println("\n"+" Starting test: "+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @Test
	  public void checkNotificationScreen() throws InterruptedException{
		 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		    MobileElement bellIcon= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.bellIcon);
		    wait.until(ExpectedConditions.visibilityOf(bellIcon)).click();
		    MobileElement notification= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.notificationsScreen);
		    String screenLabel= wait.until(ExpectedConditions.visibilityOf(notification)).getText();
		    System.out.println(screenLabel);
		    String actualLabel="NOTIFICATIONS";
		    Assert.assertEquals(screenLabel,actualLabel);
		    String newLabel= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newLabelNotificationScreen))).getText();
		    String n= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newLabelNotificationScreen))).getText();
		    
		    System.out.println("The text is: "+n);
		    String actualNewLabel="NEW";
		    Assert.assertEquals(newLabel,actualNewLabel);
			   int pressX = baseClass.getDriver().manage().window().getSize().width / 2;
		       // 4/5 of the screen as the bottom finger-press point
		       int bottomY = baseClass.getDriver().manage().window().getSize().height * 4/5;
		       // just non zero point, as it didn't scroll to zero normally
		       int topY = baseClass.getDriver().manage().window().getSize().height / 8;
		       //scroll with TouchAction by itself
		        scroll1(pressX, bottomY, pressX, topY);
		        
	  }

		    private void scroll1(int fromX, int fromY, int toX, int toY) 
		    {
		        TouchAction touchAction = new TouchAction(baseClass.getDriver());
		        touchAction.longPress(PointOption.point(200, 701)).moveTo(PointOption.point(200, 301)).release().perform();
		    }
		    @Test
	        public void conversationTab() {
			 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
			    MobileElement conversationTab= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.conversationsTab);
			    conversationTab.click();
//			    int pressX = baseClass.getDriver().manage().window().getSize().width / 2;
//			       // 4/5 of the screen as the bottom finger-press point
//			       int bottomY = baseClass.getDriver().manage().window().getSize().height * 4/5;
//			       // just non zero point, as it didn't scroll to zero normally
//			       int topY = baseClass.getDriver().manage().window().getSize().height / 8;
//			       //scroll with TouchAction by itself
//			        scroll1(pressX, bottomY, pressX, topY);
//		        scroll1(pressX, bottomY, pressX, topY);
//			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.closeIcon))).click();
	        }
	        
		    @Test
	        public void checkChat() {
			 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.openChatOnSecondTab))).click();
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.chatField))).sendKeys("Hi This is a test message");
			 	wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.sendChatButton))).click();

			 	
			 
	        }
	        

}  

