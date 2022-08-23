package com.qa;

import org.openqa.selenium.By;
import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class locators extends NewTest1{
		
		//public static String email=" type == \"XCUIElementTypeTextField\" ";
	 	public static String loginErrorText=" label == \"Please enter credentials\" ";
//	  	public static String loginButtonSignInScreen=("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
		public static String email =  "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String password = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
		public static String loginbutton = "//XCUIElementTypeButton[@name='LOGIN']";
		public static String editprofile = "//XCUIElementTypeStaticText[@name='EDIT PROFILE']";
		public static String personaldata = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String useridentification = "//XCUIElementTypeStaticText[@name='START USER IDENTIFICATION']";
		public static String unlocknow = "//XCUIElementTypeStaticText[@name='UNLOCK NOW']";
		public static String street = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String zip = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String city = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String country = "//XCUIElementTypeButton[@name=\"arrow down\"]";
		public static String continues = "//XCUIElementTypeButton[@name='CONTINUE']";
		public static String done = "//XCUIElementTypeButton[@name='DONE']";
		public static String allow = "//XCUIElementTypeButton[@name='Allow']";
		public static String crossbutton = "//XCUIElementTypeButton[@name='list grey']";
		public static String settings = "//XCUIElementTypeButton[@name='settings']";
		public static String photo1 = "//XCUIElementTypeOther[@type='XCUIElementTypeOther']/XCUIElementTypeImage[2]";
		public static String gallery = "//XCUIElementTypeButton[@name='GALLERY']";
		public static String frontadd = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";
		public static String backadd = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]";
		public static String vat = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String countryselection = "//XCUIElementTypeStaticText[@name='Pakistan']";
		public static String profilepassword = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String faceid = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String payment = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String gender = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String activatenotifications = "//XCUIElementTypeSwitch[@name='ACTIVATE NOTIFICATIONS']";
		public static String backbutton = "//XCUIElementTypeButton[@name='backButton']";
		public static String qrcode = "//XCUIElementTypeStaticText[@name='QR-CODE FOR KEY TRANSFER']";
		public static String manageemployees = "//XCUIElementTypeStaticText[@value='MANAGE EMPLOYEES']";
		public static String countrysearch = "//XCUIElementTypeStaticText[@name='Country']";
		public static String savebutton = "//XCUIElementTypeButton[@name='SAVE']";
		public static String buttonsave = "//XCUIElementTypeButton[@name=\"Save\"]";
		public static String faceidswitch = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch";
		
		
		public static String oktext = "//XCUIElementTypeStaticText[@name=\"OK\"]";
		public static String donetext = "//XCUIElementTypeButton[@name='Done']";
		public static String textdone = "//XCUIElementTypeButton[@name='DONE']";
		public static String actualpassword = "//XCUIElementTypeStaticText[@name='Actual Password']";
		public static String newpassword = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
		public static String confirmnewpassword = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
		
		
		public static String dontallow = "//XCUIElementTypeButton[@name='Don’t Allow']";
		public static String setting = "//XCUIElementTypeStaticText[@name='SETTINGS']";
		public static String logout = "//XCUIElementTypeStaticText[@name='LOGOUT']";
		public static String logoutbutton = "//XCUIElementTypeStaticText[@name='LOGOUT' OR @label='LOGOUT']";
		public static String cancelbutton = "//XCUIElementTypeButton[@name='CANCEL']";
		public static String scanpassport = "//XCUIElementTypeStaticText[@name='SCAN 4ARTPASSPORT']";
		public static String emailarrow = "//XCUIElementTypeButton[@name='arrow next']";
		public static String newmail = "//XCUIElementTypeStaticText[@name='New Mail']";
		public static String changeemail = "XCUIElementTypeButton[@name='CHANGE E-MAIL']";
		public static String close = "//XCUIElementTypeButton[@name='close']";
		public static String closes = "//XCUIElementTypeButton[@name='Close']";
		public static String addpaymentmethod = "//XCUIElementTypeButton[@name='ADD ANOTHER PAYMENT METHOD']";
		public static String male = "//XCUIElementTypeStaticText[@name='Male']";
		public static String female = "//XCUIElementTypeStaticText[@name='Female']";
		public static String qrpassword = "//XCUIElementTypeStaticText[@name='Password']";
		public static String confirm = "//XCUIElementTypeButton[@name='CONFIRM']";
		public static String lightconditions = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch";
		
		
		//Basic Art Work Milestone 4
		public static String addartwork = "//XCUIElementTypeImage[@name='add']";
		public static String edit = "//XCUIElementTypeButton[@name='edit']";
		public static String toartwork = "//XCUIElementTypeButton[@name='TO ARTWORK']";
		public static String yearsearch = "//XCUIElementTypeStaticText[@name='Year']";
		public static String upload = "//XCUIElementTypeButton[@name='UPLOAD']";
		public static String editstatic = "//XCUIElementTypeButton[@name='EDIT']";
		public static String delete = "//XCUIElementTypeButton[@name='delete']";
		public static String uploaddocumentagain = "//XCUIElementTypeButton[@name=\"UPLOAD DOCUMENT AGAIN\"]";
		public static String adddocument = "//XCUIElementTypeImage[@name='add']";
		public static String documentadd = "//XCUIElementTypeButton[@name='ADD DOCUMENT']";
		public static String editimage = "(//XCUIElementTypeButton[@name=\"EDIT\"])[1]";
		public static String edittext = "(//XCUIElementTypeButton[@name=\"EDIT\"])[2]";
		public static String adddocuments = "//XCUIElementTypeButton[@name='ADD DOCUMENTS']";
		public static String finishregistration = "//XCUIElementTypeButton[@name='FINISH REGISTRATION']";
		public static String enterprovenance = "//XCUIElementTypeButton[@name='ENTER PROVENANCE']";
		public static String provenancetext = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView";
		public static String congratulationpopup = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		
		public static String imageselection = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]";
		public static String registerartwork = "//XCUIElementTypeButton[@name='REGISTER ARTWORK']";
		public static String registersartwork = "//XCUIElementTypeStaticText[@name='REGISTER ARTWORK']";
		public static String buttoncancel = "//XCUIElementTypeButton[@name='Cancel']";
		public static String add4artpassport = "//XCUIElementTypeStaticText[@name='ADD 4ARTPASSPORT']";
		public static String yearselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String materialsearch = "//XCUIElementTypeStaticText[@name='Material']";
		public static String basematerialsearch = "//XCUIElementTypeStaticText[@name='Base Material']";
		public static String basematerialselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";
		public static String materialselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";
		public static String nobutton = "//XCUIElementTypeButton[@name='NO']";
		public static String proceed = "//XCUIElementTypeStaticText[@name='PROCEED']";
		public static String yesbutton = "//XCUIElementTypeButton[@name='YES']";
		public static String firstimage = "//XCUIElementTypeImage[@name='Photo, March 31, 2018, 12:14 AM']";
		public static String secondimage = "//XCUIElementTypeImage[@name='Photo, August 09, 2012, 2:55 AM']";
		public static String thirdimage = "//XCUIElementTypeImage[@name='Photo, March 13, 2011, 5:17 AM']";
		public static String backsidebutton = "//XCUIElementTypeButton[@name='ADD BACKSIDE']";
		public static String cropicon = "//XCUIElementTypeButton[@name='cropIcon']";
		public static String restart = "//XCUIElementTypeButton[@name='Restart']";
		public static String autocrop = "//XCUIElementTypeButton[@name='Autocrop']";
		public static String enhance = "//XCUIElementTypeButton[@name='enhance']";
		public static String rotate = "//XCUIElementTypeButton[@name='Rotate Right']";
		public static String redo = "//XCUIElementTypeButton[@name='redo']";
		public static String panning = "//XCUIElementTypeButton[@name='Panning' or @label= 'Panning']";
		public static String title = "//XCUIElementTypeStaticText[@name='Title']";
		public static String year = "(//XCUIElementTypeButton[@name=\"arrow down\"])[1]";
		public static String material = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]";
		public static String basematerial = "(//XCUIElementTypeButton[@name=\"arrow down\"])[3]";
		public static String heightincrease = "(//XCUIElementTypeButton[@name=\"addCircle\"])[1]";
		public static String heightdecrease = "(//XCUIElementTypeButton[@name=\"substractCircle\"])[1]";
		public static String widthincrease = "(//XCUIElementTypeButton[@name=\"addCircle\"])[2]";
		public static String widthdecrease = "(//XCUIElementTypeButton[@name=\"substractCircle\"])[2]";
		public static String depthincrease = "(//XCUIElementTypeButton[@name=\"addCircle\"])[3]";
		public static String depthdecrease = "(//XCUIElementTypeButton[@name=\"substractCircle\"])[3]";
		public static String clickartwork = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeImage";
		public static String documenttitle = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String artworklocation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String artist = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		
		//Filters Milestone 5
		public static String filtergrey = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";
		public static String artworkclick = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeImage";
		public static String artwork = "//XCUIElementTypeButton[@name='ARTWORK']";
		public static String listgrey = "//XCUIElementTypeButton[@name='list grey']";
		public static String listingon = "//XCUIElementTypeButton[@name='listIcon']";
		public static String searchterm = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String searchartist = "(//XCUIElementTypeButton[@name=\"arrow down\"])[1]";
		public static String searchartistname = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String searchartistselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String selectionsearchedartist = "//XCUIElementTypeButton[@name='FILTER ARTWORKS']";
		public static String filterartwroks = "//XCUIElementTypeButton[@name='FILTER ARTWORKS']";
		public static String resetallfilters = "//XCUIElementTypeButton[@name='RESET ALL FILTERS']";
		public static String searchmaterial = "(//XCUIElementTypeButton[@name=\"arrow down\"])[2]";
		public static String searchmaterialselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";
		public static String searchmaterialname = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String searchbasematerial = "(//XCUIElementTypeButton[@name=\"arrow down\"])[3]";
		public static String statusfilter = "(//XCUIElementTypeButton[@name=\"arrow down\"])[4]";
		public static String searchbasematerialname = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String searchbasematerialselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]";
		public static String statusfilterselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String statusfiltersearch = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String englishdescriptionclick = "//XCUIElementTypeStaticText[@name='DESCRIPTION IN ENGLISH (INTERNATIONAL)']";
		public static String englishdescription = "//XCUIElementTypeStaticText[@name='Details, additional information, etc.']";
		public static String germanescriptionclick = "//XCUIElementTypeStaticText[@name='DESCRIPTION IN GERMAN']";
		public static String germandescription = "//XCUIElementTypeStaticText[@name='Details, additional information, etc.']";
		public static String artworkthumbnail = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeButton[1]";
		public static String documentimage = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeImage";
		public static String documentimageclose = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage";
		public static String documents = "//XCUIElementTypeStaticText[@name='DOCUMENTS']";
		public static String documentsadd = "//XCUIElementTypeStaticText[@name='ADD DOCUMENTS']";
		public static String provenance = "//XCUIElementTypeStaticText[@name='PROVENANCE']";
		public static String addprovenanceentry = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeButton";
		public static String backtooverview = "//XCUIElementTypeButton[@name='BACK TO OVERVIEW']";
		public static String track = "//XCUIElementTypeStaticText[@name='TRACK']";
		public static String art2015 = "//XCUIElementTypeStaticText[@name='Art 2015']";
		public static String share = "//XCUIElementTypeButton[@name='share']";
		public static String shareqr = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage";
		public static String qrcodearrow = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
		public static String qrcodeswitch = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch";
		public static String qrcodethumbnail = "//XCUIElementTypeButton[@name='QR-Code & Thumbnail']";
		public static String sharedwithpeople = "//XCUIElementTypeButton[@name='SHARE WITH PEOPLE']";
		public static String sharedemail = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextView";
		public static String fivedays = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton";
		public static String permanent = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton";
		public static String basicshare = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton";
		public static String basiccontent= "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String extendedcontent = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String sharenow = "//XCUIElementTypeButton[@name='SHARE NOW']";
		public static String extendaccess = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String extendfivedays = "//XCUIElementTypeStaticText[@name='FOR 5 DAYS']";
		public static String extendpermanent = "(//XCUIElementTypeStaticText[@name='PERMANENT'])[2]";
		public static String cancelaccess = "//XCUIElementTypeStaticText[@name='CANCEL ACCESS']";
		
		
		//Locators for Milestone 6
		
		public static String compilation = "//XCUIElementTypeButton[@name='COMPILATION']";
		public static String compilations = "//XCUIElementTypeStaticText[@name='COMPILATION']";
		public static String createcompilation = "//XCUIElementTypeStaticText[@name='CREATE COMPILATION']";
		public static String compilationclick = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther";
		public static String compileartwork = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeButton";
		public static String compilationname = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String compilationvalue = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String compilationenglish = "//XCUIElementTypeStaticText[@name='Description in English (INTERNATIONAL)']";
		public static String compilationgerman = "//XCUIElementTypeStaticText[@name='Description in German']";
		public static String compilationspanish = "//XCUIElementTypeStaticText[@name='Description in Spanish']";
		public static String compilationartwork = "//XCUIElementTypeButton[@name='CHOOSE ARTWORKS']";
		public static String compilationcreation = "//XCUIElementTypeButton[@name='CREATE COMPILATION']";
		public static String editcompilation = "//XCUIElementTypeImage[@name='edit']";
		public static String editartwork = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String compilationart1 = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[7]/XCUIElementTypeOther/XCUIElementTypeButton";
		public static String compilationtransfer = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton";
		public static String compilationlocation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String compilationforlocation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeButton";
		public static String deselectcompilation = "//XCUIElementTypeButton[@name='DESELECT']";
		public static String selectallcompilation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther";
		public static String newlocationname = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String thirdpartylocation = "//XCUIElementTypeButton[@name='CHANGE OF LOCATION BY A THIRD PARTY']";
		public static String selflocationchange = "//XCUIElementTypeButton[@name='SELF-ORGANIZED CHANGE OF LOCATION']";
		public static String tooverview = "//XCUIElementTypeButton[@name='TO OVERVIEW']";
		public static String closewhite = "//XCUIElementTypeButton[@name='closeWhite']";
		public static String handovercompilation = "//XCUIElementTypeButton[@name='HANDOVER COMPILATION']";
		public static String possesoremail = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String changepossesor = "//XCUIElementTypeButton[@name='CHANGE POSSESSOR']";
		public static String cancelchangepossesor = "//XCUIElementTypeButton[@name='CANCEL CHANGE POSSESSOR']";
		public static String compilationlocationchange = "//XCUIElementTypeButton[@name='COMPLETE LOCATION CHANGE']";
		public static String possesorchange = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String transferownership = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String deletecompilation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton";
		public static String compileartwork1 = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeButton";
		public static String compilationfiltergrey = "//XCUIElementTypeButton[@name='filter grey']";
		public static String compilationsearchterm = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String compilationartist = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String compilationartistselection = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String compilationfilter = "//XCUIElementTypeButton[@name='FILTER COMPILATIONS']";
		public static String resetcompilationgrey = "//XCUIElementTypeButton[@name='RESET ALL FILTERS']";
		public static String compilationfiltericon = "//XCUIElementTypeButton[@name='filterIcon']";
		public static String compilationclickonartwork = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage";
		public static String clickcompilation = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther";
		public static String bellnotification = "//XCUIElementTypeButton[@name='bell notification']";
		public static String conversations = "//XCUIElementTypeButton[@name='Conversations']";
		public static String register = "//XCUIElementTypeStaticText[@name='REGISTER']";
		public static String notifications = "//XCUIElementTypeStaticText[@name='NOTIFICATIONS']";
		public static String allowexhibitionapp = "//XCUIElementTypeStaticText[@name='ALLOW EXHIBITION APP']";
		public static String okay = "//XCUIElementTypeButton[@name='Okay']";
		public static String help = "//XCUIElementTypeStaticText[@name='HELP']";
		public static String supportfaq = "//XCUIElementTypeStaticText[@name='SUPPORT & FAQ']";
		public static String artapponlineguide = "//XCUIElementTypeButton[@name='4ARTapp ONLINE GUIDE']";
		public static String sendfeedback = "//XCUIElementTypeButton[@name='SEND FEEDBACK']";
		public static String videos = "//XCUIElementTypeStaticText[@name='VIDEOS']";
		public static String playvideo = "(//XCUIElementTypeButton[@name='play'])[2]";
		public static String legal = "//XCUIElementTypeStaticText[@name='LEGAL']";
		public static String termsconditions = "//XCUIElementTypeStaticText[@name='TERMS & CONDITIONS']";
		public static String privacypolicy = "//XCUIElementTypeStaticText[@name='PRIVACY POLICY']";
		public static String imprint = "//XCUIElementTypeStaticText[@name='IMPRINT']";
		public static String login = "//XCUIElementTypeStaticText[@name='LOGIN']";
		public static String contactowner = "//XCUIElementTypeButton[@name='CONTACT OWNER']";
		public static String dismiss = "//XCUIElementTypeStaticText[@name='DISMISS']";
		public static String chatbutton = "//XCUIElementTypeButton[@name='chat button']";
		public static String cancelcompilationsharing = "//XCUIElementTypeButton[@name='cancelCompilationSharing']";
		public static String myprofile = "//XCUIElementTypeStaticText[@name='MY PROFILE']";
		public static String savewallet = "//XCUIElementTypeButton[@name='SAVE WALLET']";
		public static String confirmandtooverview = "//XCUIElementTypeButton[@name='CONFIRM AND TO OVERVIEW']";
		public static String save = "//XCUIElementTypeStaticText[@name='SAVE']";
		public static String vatnumber = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeTextField";
		
		public static String forgetpassword = "//XCUIElementTypeStaticText[@name='FORGOT PASSWORD?']";
		public static String email2 = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String resetpassword = "//XCUIElementTypeStaticText[@name='RESET PASSWORD']";
		
		public static String proceedasguest = "//XCUIElementTypeButton[@name='PROCEED AS GUEST']";
		
		
		public static String registercompany = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String registerfirstname = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String registerlastname = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String registeremail = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeTextField";
		public static String registerpassword = "//XCUIElementTypeSecureTextField[@type='XCUIElementTypeSecureTextField']";
		public static String registerfirstcheckbox = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
		public static String registersecondcheckbox = "//XCUIElementTypeApplication[@name='4ART']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeOther";
		public static String registerbutton = "//XCUIElementTypeButton[@name='REGISTER']";
		
		
		
		
		
		
		
		
	}



