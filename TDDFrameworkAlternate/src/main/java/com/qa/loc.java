package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class loc extends NewTest1{
	public static By loginButtonSignInScreen1 = MobileBy.iOSNsPredicateString("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
	public static MobileBy loginButtonSignInScreen = (MobileBy) MobileBy.iOSNsPredicateString("label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"");
 	public static By settingIcon = MobileBy.AccessibilityId("settings");
 	public static MobileBy okButton=  (MobileBy) MobileBy.iOSNsPredicateString(" label == \"OK\" AND name == \"OK\" AND type == \"XCUIElementTypeButton\" ");
 	public static By email= (MobileBy) MobileBy.iOSNsPredicateString(" type == \"XCUIElementTypeTextField\" ");
 	public static By errorText=MobileBy.iOSNsPredicateString(" label == \"Please enter credentials\" ");
 	public static String errorTextPassword=("You entered invalid credentials.");
 	public static String chooseCompany="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]";
 	public static String contButton="label == \"CONTINUE\" AND name == \"CONTINUE\" AND type == \"XCUIElementTypeButton\"";
 	public static String yesButtonCompanyScreen="label == \"YES\" AND name == \"YES\" AND value == \"YES\"";
 	public static String backButton="backButton";
 	public static String logoutButtonInPopup="label == \"LOGOUT\" AND name == \"LOGOUT\" AND value == \"LOGOUT\"";
 	public static String back="label == \"backButton\"";
 	public static String a="//XCUIElementTypeButton[@name=\"backButton\"]";
 	public static String proceedAsGuest="//XCUIElementTypeButton[@name=\"PROCEED AS GUEST\"]";
 	public static String bellIcon="bell notification";
 	public static String notificationsScreen="NOTIFICATIONS";
 	public static String notificationsTab="Notifications";	
 	public static String conversationsTab="Conversations";
 	public static String closeIcon="close";
 	public static String hotTag="//XCUIElementTypeStaticText[@name=\"HOT\"]";
 	public static String newTag="//XCUIElementTypeStaticText[@name=\"NEW\"]";
 	public static String oldTag="//XCUIElementTypeStaticText[@name=\"OLD\"]";
 	public static String resetFilterButton="//XCUIElementTypeButton[@name=\"RESET ALL FILTERS\"]";
 	public static String filterCompilationsButton="//XCUIElementTypeButton[@name=\"FILTER COMPILATIONS\"]";
 	public static String filterScreenDescription="Search For Compilations according to one or more criteria.";
 	public static String closeButtonFilterScreen="close";
 	public static String filterIcon="filter grey";
 	public static String filterArtistArrowDown="arrow down";
 	public static String selectArtist="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage";
 	public static String artworkTab="ARTWORK";
 	public static String artworkAndNftCount="0 ARTWORKS & 0 NFTS";
 	public static String registerButton="label == \"REGISTER\" AND name == \"REGISTER\" AND value == \"REGISTER\"";
//RegisterScreen
 	public static String companyName="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
 	public static String firstName="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField";
 	public static String lastName="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
 	public static String emailOnRegScreen="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeTextField";
 	public static String passwordOnRegScreen="type == \"XCUIElementTypeSecureTextField\"";
 	public static String termsAndConfitionsLink="I read the Terms & Conditions and accept it";
 	public static String checkboxTermsAndConditions="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
 	public static String privacyNotesLink="I read the Privacy Policy and accept it";
 	public static String privacyNotesCheckbox="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeOther";
 	public static String registerButtonOnSignupScreen="label == \"REGISTER\" AND name == \"REGISTER\" AND type == \"XCUIElementTypeButton\"";
 	public static String userAlreadyRegisteredPopUp="User is already registered."; //accessibility id
 	public static String okButtonUserRegPopUp="//XCUIElementTypeButton[@name=\"OK\"]";
 	public static String docTextTermsAndConditions="TERMS & CONDITIONS"; //accessibility id
 	public static String docTextPrivacyPolicy="PRIVACY POLICY"; //accessibility id
 //Forgot Password flow	
 	public static String forgotPasswordButtonLoginScreen="//XCUIElementTypeStaticText[@name=\"FORGOT PASSWORD?\"]";
 	public static String emailFieldForgotPasswordScreen="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField"; 
 	public static String resetButtonForgotPasswordScreen="//XCUIElementTypeButton[@name=\"RESET PASSWORD\"]";
 	public static String resetScreenLabel="RESET PASSWORD";
 	public static String loginButtonResetPasswordScreen="//XCUIElementTypeButton[@name=\"LOGIN\"]";
//RegisterArtwork
 	public static String addArtwork="add"; //
 	public static String artworkOption="//XCUIElementTypeStaticText[@name=\"Artwork\"]";
 	public static String registerBasicArtworkButton="//XCUIElementTypeButton[@name=\"REGISTER ARTWORK & LATER ADD THE 4ARTPASSPORT (APPROX. 3 MIN.)\"]";
 	public static String chooseCameraOption="//XCUIElementTypeStaticText[@name=\"CAMERA\"]";
 	public static String chooseGalleryOption="//XCUIElementTypeStaticText[@name=\"GALLERY\"]";
 	public static String cameraButtonToCaptureImage="cameraButton";
 	public static String retakePicture="redo";
 	public static String continueButtonPhotographingScreen="//XCUIElementTypeButton[@name=\"CONTINUE\"]";
 	public static String cropIcon="cropIcon";
 	public static String autoCrop="//XCUIElementTypeStaticText[@name=\"Autocrop\"]";
 	public static String panningButton="Panning";
 	public static String doneButton="Done";
 	public static By done = MobileBy.AccessibilityId("Done");

 	public static String doneButtonFinalScreen="//XCUIElementTypeStaticText[@name=\"Done\"]";
 	public static String addBackSideImage="//XCUIElementTypeStaticText[@name=\"ADD BACKSIDE\"]";
 	public static String titleOfArtwork = "//XCUIElementTypeStaticText[@name='Title']";	
 	public static String selfSelectionArtist="//XCUIElementTypeButton[@name=\"ME\"]";
	public static String yearDropdown="(//XCUIElementTypeButton[@name=\"arrow down\"])[1]";
	public static String MaterialDropDown="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]";
	public static String selectMaterial="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage";
	public static String yearselection = "//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther";
	public static String proceedButton="//XCUIElementTypeButton[@name=\"PROCEED\"]";
	public static String baseMaterialDropDown="(//XCUIElementTypeButton[@name=\"arrow down\"])[3]";
	public static String selectBaseMaterial1="//XCUIElementTypeTable/XCUIElementTypeCell[1]";
	public static String selectBaseMaterial2="//XCUIElementTypeTable/XCUIElementTypeCell[2]";
	public static String selectBaseMaterial3="//XCUIElementTypeTable/XCUIElementTypeCell[3]";
 	
	public static String addHeight="(//XCUIElementTypeButton[@name=\"addCircle\"])[1]";
	public static String removeHeight="(//XCUIElementTypeButton[@name=\"substractCircle\"])[1]";
	public static String addWidth="(//XCUIElementTypeButton[@name=\"addCircle\"])[2]";
	public static String removeWidth="(//XCUIElementTypeButton[@name=\"substractCircle\"])[2]";
	public static String addDepth="(//XCUIElementTypeButton[@name=\"addCircle\"])[3]";
	public static String removeDepth="(//XCUIElementTypeButton[@name=\"substractCircle\"])[3]";
	public static String artworkLocation="//XCUIElementTypeOther[9]";
	public static String continueButtonDetailsScreen="//XCUIElementTypeButton[@name=\"CONTINUE\"]";
	public static String editButtonConfirmationScreen="(//XCUIElementTypeStaticText[@name=\"EDIT\"])[2]";
	public static String registerArtwork="//XCUIElementTypeButton[@name=\"REGISTER ARTWORK\"]";
	public static String from="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]";
	public static String to="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]";
	public static String enterProvenance="//XCUIElementTypeButton[@name=\"ENTER PROVENANCE\"]";
	public static String enterTextForProvenance="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]";
 	public static String saveProvenance="//XCUIElementTypeButton[@name=\"SAVE\"]";
 	public static String addDocument="//XCUIElementTypeButton[@name=\"ADD DOCUMENTS\"]";
 	public static String continueButton="//XCUIElementTypeButton[@name=\"CONTINUE\"]";
	
 	
 	public static String addDoc="//XCUIElementTypeButton[@name=\"ADD DOCUMENT\"]";
 	
 	public static String plusButtonAddDoc="//XCUIElementTypeImage[@name=\"add\"]";
 	public static String cameraOption="//XCUIElementTypeButton[@name=\"Take picture\"]";
 	public static String photoCapture="//XCUIElementTypeButton[@name=\"PhotoCapture\"]";
 	public static String usePhotoButton="//XCUIElementTypeStaticText[@name=\"Use Photo\"]";
 	public static String doneButtonDoc="//XCUIElementTypeStaticText[@name=\"Done\"]";
 	public static String docTitle="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String uploadDocAgain="//XCUIElementTypeStaticText[@name=\"UPLOAD DOCUMENT AGAIN\"]";
	public static String uploadButton="//XCUIElementTypeButton[@name=\"UPLOAD\"]";
	public static String toArtworkButton="//XCUIElementTypeButton[@name=\"TO ARTWORK\"]";
 	
 	//register digital artwork
	public static String registerDigitalArtwork="//XCUIElementTypeStaticText[@name=\"Digital\"]";
	public static String payAndRegisterArtwork="//XCUIElementTypeButton[@name=\"PAY & ADD 4ARTPASSPORT\"]";
	public static String galleryButtonOption="//XCUIElementTypeButton[@name=\"GALLERY\"]";
	public static String imageForDigitalArtwork="//XCUIElementTypeImage[@name=\"Screenshot, April 20, 4:19 PM\"]";
	public static String cameraOptionForDocUpload="//XCUIElementTypeButton[@name=\"CAMERA\"]";
	public static String keepScan="//XCUIElementTypeStaticText[@name=\"Keep Scan\"]";
	public static String retake="//XCUIElementTypeStaticText[@name=\"Retake\"]";
	public static String saveScan="//XCUIElementTypeButton[@name=\"Save, 1 scan\"]";
	public static String takePictureForDoc="//XCUIElementTypeButton[@name=\"Take picture\"]";
	public static String doneButtonDocScreen="//XCUIElementTypeStaticText[@name=\"DONE\"]";
	public static String continueButtonDocScreen="//XCUIElementTypeButton[@name=\"CONTINUE\"]";
	public static String uploadDocButton="//XCUIElementTypeButton[@name=\"UPLOAD\"]";
	
	//DiscoveryMode
	public static String discoveryMode="//XCUIElementTypeButton[@name=\"camera\"]";
	public static String backButtonDiscoveryMode="//XCUIElementTypeButton[@name=\"backIcon\"]";
	public static String myArtDiscoveryMode="//XCUIElementTypeButton[@name=\"MyArt\"]";
	public static String sharedDiscoveryMode="//XCUIElementTypeButton[@name=\"Shared\"]";
	public static String searchingString="//XCUIElementTypeStaticText[@name=\"Searching...\"]";
	//List Icon
	//public static By listIcon= MobileBy.AccessibilityId("list grey"); //list icon accessibility id
	public static String listIcon="//XCUIElementTypeButton[@name=\"list grey\"]";
	public static String selectArtworkInSecondCell="//XCUIElementTypeCell[2]";
	public static String arViewButton="(//XCUIElementTypeButton[@name=\"arIcon blue semitransparent\"])[1]";
	public static String frameText= "Frame"; //Frame accessibility id
	//public static String frameButton="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch";
	public static String frameBtn="//XCUIElementTypeApplication[@name=\"4ART\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch";
	public static String cameraShotAR= "camera";
	public static String slider1="//XCUIElementTypeSlider[1]";
	public static String slider2="//XCUIElementTypeSlider[2]";
 	public static MobileBy slide=  (MobileBy) MobileBy.iOSNsPredicateString("value == \"100%");

	//Logout
 	public static String logoutButtonInLogoutPopUp="//XCUIElementTypeButton[@name=\"LOGOUT\"]";
 	public static String logoutButtonInMenu="//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton";
 	public static String newLabelNotificationScreen="//XCUIElementTypeStaticText[@name=\"NEW\"]";
 	public static String openChatOnSecondTab="//XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]";
 	
 	//Menu
 	
 	//All options of my profile
 	public static String myProfile="MY PROFILE";
 	public static String editProfile="EDIT PROFILE";
 	//Options inside Edit Profile
 	public static String editProfileScreenLabelText="EDIT PROFILE"; //Text label is EDIT PROFILE
 	public static String personalData="PERSONAL DATA";
 	public static String password="PASSWORD";
 	public static String faceId="FACE ID";
 	public static String payment="PAYMENT";
 	
 	public static String voiceAssistantGender="GENDER";
 	public static String selectMaleOption="//XCUIElementTypeCell[2]/XCUIElementTypeImage";
 	public static String femaleOption="//XCUIElementTypeCell[1]/XCUIElementTypeImage";
 	public static String saveGender="//XCUIElementTypeButton[@name=\"SAVE\"]";
 	
 	public static String activateNotifications="//XCUIElementTypeSwitch[@name=\"ACTIVATE NOTIFICATIONS\"]";
	
 	public static String qrCodeForKeyTransfer="QR-CODE FOR KEY TRANSFER";
 	public static String passwordForKeyTransfer="//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
 	public static String confirmButtonKeyTransferScreen="//XCUIElementTypeButton[@name=\"CONFIRM\"]";
	public static String selectWalletLabelText="SELECT WALLET";
	public static String ethereumWallet="Ethereum";
	public static String okButtonCautionPopUp="//XCUIElementTypeStaticText[@name=\"OK\"]";
	public static String cautionPopUpText="//XCUIElementTypeStaticText[@name=\"Do never share this QR-Code with others.\"]"; // Text to match is: Do never share this QR-Code with others.

	public static String qrCodeScreenText="//XCUIElementTypeStaticText[@name=\"QR-Code of your Private-Key and Public-Key\"]"; //QR-Code of your Private-Key and Public-Key
	public static String showKeysButton="//XCUIElementTypeButton[@name=\"SHOW KEYS\"]";
 	public static String publicKeyText="//XCUIElementTypeStaticText[@name=\"Public Key\"]"; //Public Key
 	public static String copyPublicKeyButton="(//XCUIElementTypeButton[@name=\"copy ic\"])[1]";
 	public static String copyPrivateKeyButton="(//XCUIElementTypeButton[@name=\"copy ic\"])[2]";
 	public static String encryptedKey="//XCUIElementTypeButton[@name=\"Encrypted\"]";
 	public static String decryptedKey="//XCUIElementTypeButton[@name=\"Decrypted\"]";
	public static String hideKeysButton="//XCUIElementTypeButton[@name=\"HIDE KEYS\"]";
 	
	//MyProfile
	public static String creditBalance="//XCUIElementTypeStaticText[@name=\"CREDIT BALANCE\"]";
	public static String creditScreenLabelText="//XCUIElementTypeStaticText[@name=\"To use our services you need to have Credits. Here you can fill up your balance.\"]"; 
	// Text to compare is: To use our services you need to have Credits. Here you can fill up your balance.
	public static String conversionRateForCredit="//XCUIElementTypeStaticText[@name=\"1 Credit = 1 €\"]"; //Text is: 1 Credit = 1 €
	public static String showAllCreditHistory="//XCUIElementTypeStaticText[@name=\"SHOW ALL\"]";
	public static String creditHistoryScreenLabelText="//XCUIElementTypeStaticText[@name=\"Here you can see all past payment transactions.\"]";
	//Text to compare is: Here you can see all past payment transactions.
	public static String purchaseCredits="//XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeButton";
	public static String appleInAppPurchase="//XCUIElementTypeStaticText[@name=\"Apple In-App-Purchase\"]";
	public static String buyCreditsLabelText="//XCUIElementTypeStaticText[@name=\"BUY CREDITS\"]"; // Text: BUY CREDITS
	public static String buy25Credits="//XCUIElementTypeStaticText[@name=\"25x 4ART Credits\"]";
	public static String purchaseButton="//XCUIElementTypeButton[@name=\"Purchase\"]";
	public static String enterPasswordToPurchase="//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
	public static String signInButtonPurchaseCredit="//XCUIElementTypeButton[@name=\"Sign In\"]";
	public static String successfulPurchasePopUp="//XCUIElementTypeStaticText[@name=\"Your purchase was successful. [Environment: Sandbox]\"]";
	//Text is: Your purchase was successful. [Environment: Sandbox]
	public static String okButtonPurchasePopup="//XCUIElementTypeButton[@name=\"OK\"]";
	public static String successfulPurchaseOfCreditPopupInApp="//XCUIElementTypeStaticText[@name=\"Thank you. Your purchase of 25 Credits was successful. Your balance will be updated as soon as possible.\"]";
	//Text is: Thank you. Your purchase of 25 Credits was successful. Your balance will be updated as soon as possible.
	public static String okButtonSuccessfulPruchasePopUpInApp="//XCUIElementTypeStaticText[@name=\"OK\"]";
	
	public static String creditPurchase="//XCUIElementTypeStaticText[@name=\"Credit Card In-App-Purchase\"]";
	public static String fillUpBalance="//XCUIElementTypeButton[@name=\"FILL UP BALANCE\"]";
	public static String yesButtonConfirmationScreen="//XCUIElementTypeStaticText[@name=\"YES\"]";
	public static String successPopupCreditConfirmationScreen="//XCUIElementTypeStaticText[@name=\"Thank you. Your purchase of 50 Credits was successful. Your balance will be updated as soon as possible.\"]";
	//SuccessText: Thank you. Your purchase of 50 Credits was successful. Your balance will be updated as soon as possible.
	public static String okButtonCreditPopUpScreen="//XCUIElementTypeStaticText[@name=\"OK\"]";
	public static String purchaseCreditWith4ArtCoins="//XCUIElementTypeStaticText[@name=\"With 4ARTCoins (+20% Bonus)\"]";
	public static String creditsWith4ArtCoinsScreenLabelText="//XCUIElementTypeStaticText[@name=\"BUY CREDITS WITH 4ARTCOIN\"]";
	//Text to compare is: BUY CREDITS WITH 4ARTCOIN
	public static String buyCreditWithCoinButton="//XCUIElementTypeButton[@name=\"BUY 250 CREDITS NOW\"]";
	public static String successPopUpText="//XCUIElementTypeStaticText[@name=\"Your request is in process. Your balance will be updated as soon as the transaction is complete. This may take several minutes (approx. 5-10 min.).\"]";
	// Text to compare is: Your request is in process. Your balance will be updated as soon as the transaction is complete. This may take several minutes (approx. 5-10 min.).
	public static String okButtonSuccessPopUpCreditWithCoins="//XCUIElementTypeStaticText[@name=\"OK\"]";
	
	//EditProfile->PersonalData
	public static String companyGalleryCollectionName="//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String firstNameEditProfile="//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String secondNameEditProfile="//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String artistName="//XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String emailChangeEditProfile="//XCUIElementTypeButton[@name=\"arrow next\"]";
	public static String changeEmailScreenLabelText="(//XCUIElementTypeStaticText[@name=\"CHANGE E-MAIL\"])[1]";
	//Text to compare is: CHANGE E-MAIL
	public static String popUpForArtistChange="//XCUIElementTypeStaticText[@name=\"If you have an official artist name and would like to store it here, please contact our support.\"]";
	//Text to compare is: If you have an official artist name and would like to store it here, please contact our support.

	public static String streetNo="//XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String zipCode="//XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String city="//XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeTextField";
	public static String countryDropDown="//XCUIElementTypeButton[@name=\"arrow down\"]";
	public static String vatNumber="//XCUIElementTypeOther[12]/XCUIElementTypeOther/XCUIElementTypeTextField";
//	public static String v="//XCUIElementTypeOther[11]/XCUIElementTypeOther/XCUIElementTypeTextField";

	public static String saveButtonPersonalDataScreen="//XCUIElementTypeButton[@name=\\\"SAVE\\\"]";
 	public static String resetPasswordOptionInMenu="//XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther";
 	public static String actualPassword="//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
 	public static String newPassword="//XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
 	public static String repeatNewPassword="//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
 	public static String saveButtonPasswordScreen="//XCUIElementTypeButton[@name=\"Save\"]";
 	public static String chatField="//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView";
 	public static String sendChatButton="//XCUIElementTypeStaticText[@name=\"Send\"]";
 	public static String passwordChangedSuccessfullyPopUpText="//XCUIElementTypeStaticText[@name=\"Password changed successfully.\"]";
 	//Text to compare is: Password changed successfully.
 	public static String passwordChangeFailPopUpText="//XCUIElementTypeStaticText[@name=\"Old password is not correct.\"]";
 	//Text to compare is: Old password is not correct.
 	

}
