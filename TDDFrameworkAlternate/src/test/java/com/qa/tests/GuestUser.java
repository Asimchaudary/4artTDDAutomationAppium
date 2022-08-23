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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GuestUser{
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
	  public void GuestUserWalkThorugh() throws InterruptedException{
		  
			WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(loc.settingIcon)).click();
		    MobileElement loginButton = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("LOGIN");
		    String str1= loginButton.getText(); 	
		    System.out.println(str1);
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(59,692)).perform();
		    MobileElement guestButton= (MobileElement) baseClass.getDriver().findElementByXPath(loc.proceedAsGuest);
		    wait.until(ExpectedConditions.visibilityOf(guestButton)).click();
		    MobileElement bellIcon= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.bellIcon);
		    wait.until(ExpectedConditions.visibilityOf(bellIcon)).click();
		    MobileElement notification= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.notificationsScreen);
		    String screenLabel= wait.until(ExpectedConditions.visibilityOf(notification)).getText();
		    System.out.println(screenLabel);
		    String actualLabel="NOTIFICATIONS";
		    Assert.assertEquals(screenLabel,actualLabel);
//		    MobileElement notificationTab= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.notificationsTab);
//		    String notificationTabLabel= wait.until(ExpectedConditions.visibilityOf(notificationTab)).getText();
//		    System.out.println(notificationTabLabel);
//		    
//		    String actualTabLabelOne="Notifications";
//		    Assert.assertEquals(notificationTabLabel,actualTabLabelOne);
		    Thread.sleep(3000);
		    MobileElement conversationTab= (MobileElement) baseClass.getDriver().findElementByAccessibilityId(loc.conversationsTab);
		    String conversationTabLabel= wait.until(ExpectedConditions.visibilityOf(conversationTab)).getText();
		    System.out.println(conversationTabLabel);
		    String actualTabLabelTwo="Conversations";
		    Assert.assertEquals(conversationTabLabel,actualTabLabelTwo);
		    wait.until(ExpectedConditions.visibilityOf(conversationTab)).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.closeIcon))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.oldTag))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newTag))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.hotTag))).click();
}  
	  		@Test
	  		public void GuestFilter() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.filterIcon))).click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.filterArtistArrowDown))).click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.selectArtist))).click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.filterCompilationsButton))).click();
//			    Thread.sleep(2000);
			    MobileElement filterIcon = (MobileElement) baseClass.getDriver().findElementByAccessibilityId("filterIcon");
			    filterIcon.click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.resetFilterButton))).click();	    
	  		}
	  		@Test
	  		public void GuestUserArtworkTab() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);    
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.artworkTab))).click();
			    String count= wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.artworkAndNftCount))).getText();
			    String actualCount="0 ARTWORKS & 0 NFTS";
			    Assert.assertEquals(actualCount, count);
			    System.out.println("Actual Count is "+actualCount+"\n Count is "+count);
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.oldTag))).click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.newTag))).click();
			    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.hotTag))).click();
			    
	 		}
}