package com.qa.pages;

import java.lang.module.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.NewTest1;
import com.qa.locators;

import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends NewTest1{
//	@iOSXCUITFindBy(accessibility="settings") private MobileElement settingIcon;
//	@iOSXCUITFindBy(accessibility="backButton") private MobileElement backButton;
//	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\\\"ERROR\\\"]") private MobileElement errorTitle;
//	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\\\"OK\\\"]") private MobileElement okButton;
//	@iOSXCUITFindBy(accessibility="faceId") private MobileElement faceId;
////	@iOSXCUITFindBy(accessibility="Please enter credentials") private MobileElement errorTextIncorrectEmailAndNoPassword;
//
//public LoginPage clickSetting()
//	{	
//	click(settingIcon); 
//	return this;
//	}
////public LoginPage clickFaceId() {
////	click(faceId);
////	return this;
////}
//public LoginPage clickBackButton()
//	{	
//	click(backButton); 
//	return this;
//	}
//public LoginPage clickOkButtonInPopup() {
//	  MobileElement okButton = (MobileElement) ((FindsByIosNSPredicate) driver)
//              .findElementByIosNsPredicate(" label == \"OK\" AND name == \"OK\" AND type == \"XCUIElementTypeButton\" ");
//	click(okButton);
//	return this;
//	}
//public LoginPage enterEmail(String Email) {
//	  MobileElement email = (MobileElement) ((FindsByIosNSPredicate) driver)
//              .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
//	
////		driver.findElement(By.xpath(locators.email)).sendKeys(Email);
////	sendKeys(email, Email);
//	return this;
//	}
//public LoginPage pressLogin() {
//	  MobileElement loginButtonSignInScreen = (MobileElement) ((FindsByIosNSPredicate) driver)
//      .findElementByIosNsPredicate("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
//    click(loginButtonSignInScreen); 
//	return this;
//	}
//public String getErrText() 
//	{
//	  MobileElement errorTextIncorrectEmailAndNoPassword = (MobileElement) ((FindsByIosNSPredicate) driver)
//              .findElementByIosNsPredicate(" label == \"Please enter credentials\" ");
//
//	  return errorTextIncorrectEmailAndNoPassword.getText();
////	  return errorTextIncorrectEmailAndNoPassword.getText();
//	}
//public void clearEmailField() {
//	  MobileElement email = (MobileElement) ((FindsByIosNSPredicate) driver)
//              .findElementByIosNsPredicate(" type == \"XCUIElementTypeTextField\" ");
//	  email.clear();
//	  
//}
}