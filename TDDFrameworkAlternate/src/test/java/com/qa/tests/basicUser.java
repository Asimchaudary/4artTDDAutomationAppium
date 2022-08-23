package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.NewTest1;
import com.qa.pages.LoginPage;

public class basicUser {
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
	  public void checkBasicUserMenu() {
		  
	  }
}
