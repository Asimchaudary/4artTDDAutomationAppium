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
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AR_View{
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
		  System.out.println("\n"+" Starting test : "+m.getName()+"\n");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @Test
	  public void checkArView() throws InterruptedException{
		 	WebDriverWait wait = new WebDriverWait(baseClass.getDriver(), TestUtils.WAIT);
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.selectArtworkInSecondCell))).click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.arViewButton))).click();
		    String frameText=baseClass.getDriver().findElementByAccessibilityId(loc.frameText).getText();
			String expectedText="Frame";
			System.out.println("This is the actual text: "+frameText+"\n" + "Expected text is: "+ expectedText);
			Assert.assertEquals( frameText, expectedText);
		    String fameText=baseClass.getDriver().findElementByAccessibilityId(loc.frameText).getText();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.frameText))).click();
		    MobileElement frame = (MobileElement) baseClass.getDriver().findElementByXPath("//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch");
		    frame.click();
		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.cameraShotAR))).click();
//		    wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByAccessibilityId(loc.frameBtn))).click();
//		    ((MobileElement) wait.until(ExpectedConditions.visibilityOf(baseClass.getDriver().findElementByXPath(loc.slider1)))).setValue("50%");
//		    (new TouchAction(driver))
//		    .press({x: 355, y: 468})
//		    .moveTo({x: 355: y: 367})
//		    .release()
//		    .perform()
//		    
//		      TouchAction t = new TouchAction(baseClass.getDriver());
//	        t.press(ElementOption.element(baseClass.getDriver().findElementByXPath(loc.slider1)))
//	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//	                .moveTo(ElementOption.element(baseClass.getDriver().findElementByXPath(loc.to)))
//	                .release()
//	                .perform();
//		    
//	        TouchAction t = new TouchAction ((PerformsTouchActions) baseClass.getDriver()); 
//	        t.press(PointOption.point(355, 468))
//	        	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//	        	.moveTo(PointOption.point(355, 367))
//	        	.release()
//	        	.perform();
	        
//            TouchAction swipe = new TouchAction(baseClass.getDriver());
//                    swipe.press(PointOption.point(355,468))
//    	        	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                    .moveTo(PointOption.point(355,367))
//                    .release()
//                    .perform();
		    
	
		        int pressX = baseClass.getDriver().manage().window().getSize().width / 2;
		        // 4/5 of the screen as the bottom finger-press point
		        int bottomY = baseClass.getDriver().manage().window().getSize().height * 4/5;
		        // just non zero point, as it didn't scroll to zero normally
		        int topY = baseClass.getDriver().manage().window().getSize().height / 8;
		        //scroll with TouchAction by itself
		        scroll(pressX, bottomY, pressX, topY);
		        scroll1(pressX, bottomY, pressX, topY);
		    }
	 
		    private void scroll(int fromX, int fromY, int toX, int toY) {
		        TouchAction touchAction = new TouchAction(baseClass.getDriver());
		        touchAction.longPress(PointOption.point(355, 468)).moveTo(PointOption.point(355, 367)).release().perform();
		    }
		    private void scroll1(int fromX, int fromY, int toX, int toY) {
		        TouchAction touchAction = new TouchAction(baseClass.getDriver());
		        touchAction.longPress(PointOption.point(182, 743)).moveTo(PointOption.point(41, 743)).release().perform();
		    }
		   
	        
	  }

