package com.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;


public class NewTest1 {
	protected static AppiumDriver driver;
	protected static Properties props;
	  InputStream inputStream;
	  public static AppiumDriverLocalService server;
	  
	  public NewTest1() {
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this); //initializing UI elements for page factory
	  }
	   public void setDriver(AppiumDriver driver) { //getter
		   NewTest1.driver=driver;
		   
	   }
	   public AppiumDriver getDriver() { //setter
		   return driver;
	   }

  public void initializeDriver(String platformName, String deviceName, String udid) throws Exception
  {	  
	  try
	  {
//		  NewTest1.startServer();
		  props=new Properties();
		  String propFileName="config.properties";
		  inputStream= getClass().getClassLoader().getResourceAsStream(propFileName);
		  props.load(inputStream);
	      DesiredCapabilities caps = new DesiredCapabilities();
	      caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	      caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	      caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iosAutomationName"));
	      caps.setCapability(MobileCapabilityType.UDID, udid);
	      caps.setCapability("bundleId", "com.4art-technologies.4artmain");
//	      caps.setCapability(MobileCapabilityType.APP,"/Users/coeus/Downloads/4ART-Mon25April/4ART.ipa");
//	      URL url = new URL("http://0.0.0.0:4723/wd/hub");
//			URL url = new URL(props.getProperty("appiumURL"));
	      URL url = new URL("http://0.0.0.0:4723/wd/hub");
	      driver = new IOSDriver(url, caps);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  } 
  }
//  @BeforeSuite
//  public void beforeSuite() {
//	  server=getInstanceOfAppiumService();
//	  server.start();
//	  server.clearOutPutStreams();
////	  NewTest1.startServer();
//	  System.out.println("Appium Server Started Successfully");
//  }
//  @AfterSuite
//  public void afterSuite() {
//	  server.stop();
//	  System.out.println("Appium Server Stopped");
//  }
//  public AppiumDriverLocalService getAppiumServerDefault() {
//	  return AppiumDriverLocalService.buildDefaultService();
//  }
//  static void startServer() {
//	  getInstanceOfAppiumService().start();
//  }
//  static AppiumDriverLocalService getInstanceOfAppiumService() {
//	  HashMap<String, String> environment=new HashMap<String,String>();
////	  environment.put("PATH", "/usr/local/bin /usr/bin /bin /usr/sbin /sbin /etc/platform-tools /Library/Apple/usr/bin" + System.getenv("PATH"));
////	  environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home");
//	return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//			  .usingDriverExecutable(new File("/usr/local/bin/node"))
//			  .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
//			  .usingPort(4723)
//			  .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
//			  .withEnvironment(environment));
//	  AppiumServiceBuilder builder=new AppiumServiceBuilder();
//	  builder
//	  .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
//			  .usingDriverExecutable(new File("/usr/local/bin/node"))
//			  .usingPort(4723)
//			  .withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//	  return AppiumDriverLocalService.buildService(builder);
//  }
//  public static void startServer() {
//	  getInstanceOfAppiumService().start();
//  }
//  public static void stopServer() {
//	  getInstanceOfAppiumService().stop();
//  }
//  public static void WaitForVisibility(MobileBy e)
//  {
//	  WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
//	  wait.until(ExpectedConditions.visibilityOf((WebElement) e));
//  }
//  public static void Click(MobileBy e) {
//	  WaitForVisibility(e);
//	  ((WebElement) e).click();
//  }
//  public static void waitForVisibility(MobileElement e)
//  {
//	  WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
//	  wait.until(ExpectedConditions.visibilityOf(e));
//  }
//  public static void click(MobileElement e) {
//	  waitForVisibility(e);
//	  e.click();
//  }
//public static void SendKeys(MobileElement e, String text)
//{
//	waitForVisibility(e);
//	e.sendKeys(text);
//}
//public String getAttribute(MobileElement e, String attribute)
//{
//	waitForVisibility(e);
//	return e.getAttribute(attribute);
//}
//public void clearField(MobileElement e)
//{
//	waitForVisibility(e);
//	e.clear();
//}
 public void quitDriver() {
	 driver.quit();
 }
}
