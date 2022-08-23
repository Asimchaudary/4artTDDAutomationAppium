package com.qa.tests;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.qa.NewTest1;
import com.qa.loc;
import com.qa.locators;
import com.qa.pages.LoginPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.Dimension;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class registerDigitalArtwork{
	NewTest1 baseClass;	
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
	  public void digitalArtwork() throws InterruptedException {
		 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.addArtwork))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.registerDigitalArtwork))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.payAndRegisterArtwork))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.galleryButtonOption))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.imageForDigitalArtwork))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.titleOfArtwork))).sendKeys("Digital Artwork for Automation Testing");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.selfSelectionArtist))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.yearDropdown))).click();
		 	new TouchAction<>(baseClass.getDriver()).tap(PointOption.point(163,404)).perform();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.continueButtonDetailsScreen))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.registerArtwork))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.enterProvenance))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.enterTextForProvenance))).sendKeys("This is test provenance");
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveProvenance))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.addDocument))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.plusButtonAddDoc))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.cameraOptionForDocUpload))).click();

		    Thread.sleep(3000);
		    baseClass.getDriver().executeScript("mobile: pressButton", ImmutableMap.of("name", "volumedown"));

		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.keepScan))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.saveScan))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.doneButtonDocScreen))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.docTitle))).sendKeys("Test Document via Camera");
		    MobileElement el1 = (MobileElement) baseClass.getDriver().findElementByXPath("(//XCUIElementTypeButton[@name=\"Done\"])[1]");
		    el1.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.addDoc))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.continueButtonDocScreen))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.uploadDocButton))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.toArtworkButton))).click();



		    



	  }
}