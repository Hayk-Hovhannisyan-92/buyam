package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.AddressPage;
import am.itu.qa.generalPage.ChangeAddressPage;
import am.itu.qa.generalPage.FacebookPage;
import am.itu.qa.generalPage.ForgotPasswordPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.InstagramPage;
import am.itu.qa.generalPage.LogOutPage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.ProfilePage;
import am.itu.qa.generalPage.ProfileSettingsPage;
import am.itu.qa.generalPage.YoutubePage;

public class GeneralTest extends BaseTest {

	///  #1-languageTest  ///
	@Test()
	public void languageTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.settingsElementIsDisplayed());
		Thread.sleep(2000);
		home.clickOnElementSettings();
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsArmenian());
		//After step openned small window   where are  two buttons 
		//currency button  and  language button  
		Thread.sleep(2000);
		home.clickOnElementLanguage();
		// After step openned window where can changed language
		Thread.sleep(2000);
		home.clickOnElementLenguage_ENG();
		Thread.sleep(2000);
		// After step update page buy.am and all text in page buy.am
		// is written by english language and window is clossed
		home.clickOnElementSettings();
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsEnglish());
		Thread.sleep(2000);
		//After step openned small window   where are  two buttons 
		//currency button  and  language button  
		home.clickOnElementLanguage();
		// After step openned window where can changed language
		Thread.sleep(2000);
		home.clickOnElementLenguage_RUS();
		// After step update page buy.am and all text in page buy.am
		// is written by russian language and window is clossed
		home.clickOnElementSettings();
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsRussian());
	}
	
	
	public void changeLanguageEN(){
		HomePage home = new HomePage(this.driver);
		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_ENG();
	}
	
	public void changeLanguageRU(){
		HomePage home = new HomePage(this.driver);
		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_RUS();
	}
	
	
	
	///  #2-registracionTest  ///????????????????????????????
	@Test
	public void registracionTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.registracionElementIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToRegistracion();
		Thread.sleep(1000);
		Assert.assertTrue(login.loginPageIsOpen());
		
		///Test-1  with Armenian language(default)
		Thread.sleep(3000);
		Assert.assertTrue(login.salutationFieldIsDisplayed());
		Thread.sleep(1000);
		login.navigateToSalutationField();
		Thread.sleep(1000);
		Assert.assertTrue(login.mrSubfieldAMIsDisplayed());
		login.navigateToMrSubfieldAM();
		Thread.sleep(1000);
		Assert.assertTrue(login.firstNameFieldIsDisplayed());
		login.navigateTofirstNameField("Hayk");
		Thread.sleep(1000);
		Assert.assertTrue(login.lastNameFieldIsDisplayed());
		login.navigateToLastNameField("Hovhannisyan");
		Thread.sleep(1000);
		Assert.assertTrue(login.emailFieldRegisterIsDisplayed());
		login.navigateToEmailFieldRegister("hovhanniysanhayk56@gmail.com");
		Thread.sleep(1000);
		login.navigateToPasswordFieldRegister("BuyamHayk");
	    Thread.sleep(1000);
		login.navigateToPasswordConfirmFieldRegister("BuyamHayk");
		Thread.sleep(1000);
		login.navigateToPhoneNumberField("098484056");
		Thread.sleep(1000);
		login.navigateToCityField();
		Thread.sleep(1000);
		Assert.assertTrue(login.cityListIsDisplayed());
		Assert.assertTrue(login.chooseCity1IsDisplayed());
		Thread.sleep(1000);
		login.navigateToChooseCity1();
		Thread.sleep(1000);
		login.navigateToBillingStreetField("Hovsep Emini p. 29 tun");
		Thread.sleep(1000);
		ProfilePage profile = new ProfilePage(this.driver);
		profile=login.navigateToContinueBtnRegister();
		Assert.assertTrue(profile.profilePageIsOpen());
		home.navigateToMyAccount();
		Thread.sleep(1000);
		Assert.assertTrue(home.logOutBtnIsDisplayed());
		LogOutPage logOut = home.navigateToLogOutBtn();
		Assert.assertTrue(logOut.logOutPannelIsDisplayed());
		
	}
	
	

	///  #3-loginTest  ///
	@Test
	public void loginTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		// After step must be openned small window when are few elements with Login btn
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		// After step by clicking login must be openned new ProfilePage
		// when user can write email and password and log in

		// test-1 without email and password
		Thread.sleep(2000);
		login.emailField("");
		login.passwordField("");
		login.clickOnLoginBtn();
		Assert.assertTrue(login.errorDisplayed());

		// test-2 with incorrect email and without password
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.emailField("asasas");
		login.passwordField("");
		login.clickOnLoginBtn();
		Assert.assertTrue(login.errorDisplayed());

		// test-3 with incorrect email and withowt password
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.emailField("anun@gmail.com");
		login.passwordField("");
		login.clickOnLoginBtn();
		Assert.assertTrue(login.errorDisplayed());

		// test-4 with correct email and without password
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.emailField("hovhannisyanhayk56@gmail.com");
		login.passwordField("");
		login.clickOnLoginBtn();
		Assert.assertTrue(login.errorDisplayed());

		// test-5 with correct email and incorrect password
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.emailField("hovhannisyanhayk56@gmail.com");
		login.passwordField("12345");
		login.clickOnLoginBtn();
		Assert.assertTrue(login.errorDisplayed());

		// test-6 with correct email and correct password
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.emailField("hovhannisyanhayk56@gmail.com");
		login.passwordField("BuyamHayk");
		ProfilePage profile = new ProfilePage(this.driver);
		profile = login.clickOnLoginBtn();
		Assert.assertTrue(profile.welcomeDisplayed());
		// After step make sure that user in ProfilePage
	}

	///  #4-forgotPasswordTest  ///
	@Test
	public void forgotPasswordTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		Thread.sleep(2000);
		home.navigateToMyAccount();
		home.navigateToLogin();
		Thread.sleep(2000);
		Assert.assertTrue(login.forgotPasswordIsDisplayed());
		ForgotPasswordPage forgotPassword = new ForgotPasswordPage(this.driver);
		forgotPassword	= login.navigateToForgotPassword();
		Thread.sleep(4000);
		Assert.assertTrue(forgotPassword.forgotPasswordPageIsDisplayed());
		Assert.assertTrue(forgotPassword.passwordResetInputIsDisplayed());
		forgotPassword.passwordResetInputType("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(forgotPassword.sendEmailBtnIsDisplayed());
		home = forgotPassword.navigateToSendEmailBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.allertContentIsDisplayed());

	}
		
	///  #5-wishlistBtnTest  ///
	@Test
	public void wishlistBtnTest() throws InterruptedException {
		ProfilePage profile = new ProfilePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(profile.wishlistBtnIsDisplayed());
		profile.wishlistBtnClick();
		Assert.assertTrue(profile.emptyWishlistIsDisplayed());
		// After step make sure that user's wishlist is empty
	}

	///  #6-shoppingCartBtnTest  ///
	@Test
	public void shoppingCartBtnTest() throws InterruptedException {
		ProfilePage profile = new ProfilePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(profile.shopingCartBtnIsDisplayed());
		profile.shopingCartBtnClick();
		Assert.assertTrue(profile.shopingCartPanelIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(profile.emptyShopingCartIsDisplayed());
	}
	
	///  #7-returnHomeBtnTest  ///
	@Test
	public void returnHomeBtnTest() throws InterruptedException{
		ProfilePage profile = new ProfilePage(this.driver);
		Assert.assertTrue(profile.returnHomePageIconIsDisplayed());
		Thread.sleep(2000);
		profile.returnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(profile.homePageIsDisplayed());
	}
	
	///  #8-searchTest  ///???????????????
	@Test
	public void searchTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.searchInputFieldIsDisplayed());
		home.navigateToSearchIcon();
		//click search  iconi  vra  aranc text mutqagrelu dashtum
		Thread.sleep(2000);
		Assert.assertTrue(home.allertMessageIsDisplayed());
		//erevum e allert message
		Thread.sleep(2000);
		home.typeInSearhField("prinv");
		//grvum e voreve text search  dashtum
		Thread.sleep(2000);
		home.navigateToSearchIcon();
		//click  search iconi vra
		//nkaragrutyun@ HomePage-um
		Assert.assertTrue(home.nonExistingProductHeadlineIsDisplayed());
		
	}
	
	///  #9-facebookTest  ///
	@Test
	public void facebookTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		FacebookPage facebook = new FacebookPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.facebookBtnIsDisplayed());
		Thread.sleep(2000);
		facebook=home.navigateToFacebookBtn();
		Thread.sleep(2000);
		Assert.assertTrue(facebook.facebookBuyamPageIsDisplayed());
		facebook.closeNewTab();
	}
	
	///  #10-instagramTest  ///
		@Test
		public void instagramTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			InstagramPage instagram = new InstagramPage(this.driver);
			Thread.sleep(2000);
			Assert.assertTrue(home.instagramBtnIsDisplayed());
			instagram = home.navigateToInstagramBtn();
			Thread.sleep(2000);
			Assert.assertTrue(instagram.instagramBuyamPageIsDisplayed());
			instagram.closeNewTab();
		}
		
	///  #11-youtubeTest  ///
		@Test
		public void youtubeTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			YoutubePage youtube = new YoutubePage(this.driver);
			Thread.sleep(2000);
			Assert.assertTrue(home.youtubeBtnIsDisplayed());
			youtube = home.navigateToYoutubeBtn();
			Thread.sleep(2000);
			Assert.assertTrue(youtube.youtubeBuyamPageIsDisplayed());
			youtube.closeNewTab();
		}
		
	///  #12-changeAddressTest  ///
		@Test
		public void changeAddressTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			LoginPage login = new LoginPage(this.driver);
			ProfilePage profile = new ProfilePage(this.driver);
			home.navigateToMyAccount();
			Thread.sleep(2000);
			login = home.navigateToLogin();
			login.emailField("hovhannisyanhayk56@gmail.com");
			login.passwordField("BuyamHayk");
			profile = login.clickOnLoginBtn();
			home = profile.returnHomePage();
			home.navigateToMyAccount();
			Assert.assertTrue(home.accountDropdownIsDisplayed());
			Assert.assertTrue(home.addressBtnIsDisplayed());
			Thread.sleep(2000);
			AddressPage address = new AddressPage(this.driver);
			address = home.navigateToAddressBtn();
			Thread.sleep(2000);
			Assert.assertTrue(address.changeAddressPanelIsDisplayed());
			Assert.assertTrue(address.changeBtnIsDisplayed());
			Thread.sleep(2000);
			ChangeAddressPage changeAddress = new ChangeAddressPage(this.driver);
			changeAddress = address.navigateToChangeBtn();
			Thread.sleep(2000);
			Assert.assertTrue(changeAddress.changeAddressPannelIsDisplayed());
			Thread.sleep(2000);
			Assert.assertTrue(changeAddress.changeAddressFieldIsDisplayed());
			changeAddress.navigateToChangeAddressField("Agatangexos");
			Thread.sleep(2000);
			changeAddress.navigateToSaveAddressBtn();
			Thread.sleep(2000);
			Assert.assertTrue(address.allertContentIsDisplayed());
			
		}
		
	///  #13-changeEmailTest  ///
		@Test
		public void changeEmailTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			LoginPage login = new LoginPage(this.driver);
			ProfilePage profile = new ProfilePage(this.driver);
			AddressPage address = new AddressPage(this.driver);
			home.navigateToMyAccount();
			Thread.sleep(2000);
			login = home.navigateToLogin();
			Thread.sleep(2000);
			login.emailField("hovhannisyanhayk56@gmail.com");
			login.passwordField("BuyamHayk");
			profile = login.clickOnLoginBtn();
			home = profile.returnHomePage();
			home.navigateToMyAccount();
			Assert.assertTrue(home.accountDropdownIsDisplayed());
			Assert.assertTrue(home.profileSettingsBtnIsDisplayed());
			Thread.sleep(2000);
			ProfileSettingsPage profileSettings = new ProfileSettingsPage(this.driver);
			profileSettings = home.navigateToProfileSettingsBtn();
			Thread.sleep(2000);
			Assert.assertTrue(profileSettings.accountProfileIsDisplayed());	
			Assert.assertTrue(profileSettings.newEmailFieldIsDisplayed());
			Thread.sleep(2000);
			profileSettings.navigateToNewEmailField("gor95hovhannisyan22@mail.ru");
			Thread.sleep(2000);
			Assert.assertTrue(profileSettings.emailConfirmationFieldIsDisplayed());
			profileSettings.navigateToEmailConfirmationField("gor95hovhannisyan22@mail.ru");
			Thread.sleep(2000);
			Assert.assertTrue(profileSettings.currentPasswordFieldIsDisplayed());
			profileSettings.navigateToCurrentPasswordField("BuyamHayk");
			Assert.assertTrue(profileSettings.emailSaveChangesBtnIsDisplayed());
			profileSettings.navigateToEmailSaveChangesBtn();
			Thread.sleep(2000);
			Assert.assertTrue(address.allertContentIsDisplayed());
			
		}
}