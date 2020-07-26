package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.FacebookLoginPage;
import am.itu.qa.generalPage.ForgotPasswordPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.ProfilePage;

public class RegistracionLoginTest extends BaseTest {

/// registracionTest ///
	/// Armenian language(default)
	@Test(priority = 1)
	public void registracionTest1() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.registracionBtnIsDisplayed());
		login = home.navigateToRegistracion();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		/// test with incorrect msg
		Thread.sleep(2000);
		Assert.assertTrue(login.salutationFieldIsDisplayed());
		Thread.sleep(2000);
		login.navigateToSalutationField();
		Thread.sleep(2000);
		Assert.assertTrue(login.mrSubfieldAMIsDisplayed());
		login.navigateToMrSubfieldAM();
		Thread.sleep(2000);
		Assert.assertTrue(login.firstNameFieldIsDisplayed());
		login.navigateTofirstNameField("Hayk");
		Thread.sleep(2000);
		Assert.assertTrue(login.lastNameFieldIsDisplayed());
		login.navigateToLastNameField("Hovhannisyan");
		Thread.sleep(2000);
		Assert.assertTrue(login.emailFieldRegisterIsDisplayed());
		login.navigateToEmailFieldRegister("hayk.com");
		Thread.sleep(2000);
		login.navigateToPasswordFieldRegister("BuyamHayk");
		Thread.sleep(2000);
		Assert.assertTrue(login.registerErrMsgIsDisplayed());
		//// continue with correct email
		login.clearEmailField();
		login.navigateToEmailFieldRegister("bnbhvg@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordConfirmFieldRegister("BuyamHayk");
		Thread.sleep(2000);
		login.navigateToPhoneNumberField("098484056");
		Thread.sleep(2000);
		login.navigateToCityField();
		Thread.sleep(2000);
		Assert.assertTrue(login.cityListIsDisplayed());
		Assert.assertTrue(login.chooseCity1IsDisplayed());
		Thread.sleep(2000);
		login.navigateToChooseCity1();
		Thread.sleep(2000);
		login.navigateToBillingStreetField("Hovsep Emini p. 29 tun");
		Thread.sleep(2000);
		profile = login.navigateToContinueBtnRegister();
		Thread.sleep(2000);
		Assert.assertTrue(profile.profilePageIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	}

	//// English language
	@Test(priority = 2)
	public void registracionTest2() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		Thread.sleep(2000);
		home.navigateToSettingsBtn();
		Thread.sleep(2000);
		home.clickOnElementLanguage();
		Thread.sleep(2000);
		home.clickOnElementLenguage_ENG();
		Thread.sleep(2000);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.registracionBtnIsDisplayed());
		login = home.navigateToRegistracion();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		Assert.assertTrue(login.salutationFieldIsDisplayed());
		Thread.sleep(2000);
		login.navigateToSalutationField();
		Thread.sleep(2000);
		Assert.assertTrue(login.mrSubfieldENIsDisplayed());
		login.navigateToMrSubfieldEN();
		Thread.sleep(2000);
		Assert.assertTrue(login.firstNameFieldIsDisplayed());
		login.navigateTofirstNameField("Hayk");
		Thread.sleep(2000);
		Assert.assertTrue(login.lastNameFieldIsDisplayed());
		login.navigateToLastNameField("Hovhannisyan");
		Thread.sleep(2000);
		login.navigateToEmailFieldRegister("mkoko@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordFieldRegister("BuyamHayk");
		Thread.sleep(2000);
		login.navigateToPasswordConfirmFieldRegister("BuyamHayk");
		Thread.sleep(2000);
		login.navigateToPhoneNumberField("098484056");
		Thread.sleep(2000);
		login.navigateToCityField();
		Thread.sleep(2000);
		Assert.assertTrue(login.cityListIsDisplayed());
		Assert.assertTrue(login.chooseCity1IsDisplayed());
		Thread.sleep(2000);
		login.navigateToChooseCity1();
		Thread.sleep(2000);
		login.navigateToBillingStreetField("Hovsep Emini p. 29 tun");
		Thread.sleep(2000);
		profile = login.navigateToContinueBtnRegister();
		Assert.assertTrue(profile.profilePageIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	//// Russian language
	@Test(priority = 3)
	public void registracionTest3() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		home.navigateToSettingsBtn();
		Thread.sleep(2000);
		home.clickOnElementLanguage();
		Thread.sleep(2000);
		home.clickOnElementLenguage_RUS();
		Thread.sleep(3000);
		home.navigateToMyAccount();
		Thread.sleep(3000);
		login = home.navigateToRegistracion();
		Thread.sleep(3000);
		Assert.assertTrue(login.salutationFieldIsDisplayed());
		Thread.sleep(1000);
		login.navigateToSalutationField();
		Thread.sleep(1000);
		Assert.assertTrue(login.mrSubfieldRUIsDisplayed());
		login.navigateToMrSubfieldRU();
		Thread.sleep(1000);
		Assert.assertTrue(login.firstNameFieldIsDisplayed());
		login.navigateTofirstNameField("Hayk");
		Thread.sleep(1000);
		Assert.assertTrue(login.lastNameFieldIsDisplayed());
		login.navigateToLastNameField("Hovhannisyan");
		Thread.sleep(1000);
		login.navigateToEmailFieldRegister("plplpl@gmail.com");
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
		Thread.sleep(2000);
		profile = login.navigateToContinueBtnRegister();
		Assert.assertTrue(profile.profilePageIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

/// loginTest ///
	// test-1 without email and password
	@Test(priority = 4)
	public void loginTest1() throws InterruptedException {
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
		Thread.sleep(2000);
		login.navigateToEmailField("");
		Thread.sleep(2000);
		login.navigateToPasswordField("");
		Thread.sleep(2000);
		login.navigateToLoginBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.errorDisplayed());
		home.navigateToReturnHomePage();
	}

	// test-2 with incorrect email and without password
	 @Test (priority = 5)
	public void loginTest2() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.navigateToEmailField("asasas");
		Thread.sleep(2000);
		login.navigateToPasswordField("");
		Thread.sleep(2000);
		login.navigateToLoginBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.errorDisplayed());
		home.navigateToReturnHomePage();
	}

	// test-3 with not registered email and withowt password
	@Test(priority = 6)
	public void loginTest3() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.navigateToEmailField("anun@gmail.com");
		login.navigateToPasswordField("");
		login.navigateToLoginBtn();
		Assert.assertTrue(login.errorDisplayed());
		home.navigateToReturnHomePage();
	}

	// test-4 with correct email and without password
	@Test(priority = 7)
	public void loginTest4() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		login.navigateToPasswordField("");
		login.navigateToLoginBtn();
		Assert.assertTrue(login.errorDisplayed());
		home.navigateToReturnHomePage();
	}

	// test-5 with correct email and incorrect password
	@Test(priority = 8)
	public void loginTest5() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		login.navigateToPasswordField("12345");
		login.navigateToLoginBtn();
		Assert.assertTrue(login.errorDisplayed());
		home.navigateToReturnHomePage();
	}

	// test-6 with correct email and correct password
	@Test(priority = 9)
	public void loginTest6() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Assert.assertTrue(home.dropBoxMyAccountIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToLogin();
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		login.clearField();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		login.navigateToPasswordField("BuyamHayk");
		ProfilePage profile = new ProfilePage(this.driver);
		profile = login.navigateToLoginBtn();
		Assert.assertTrue(profile.profilePageIsDisplayed());
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
	}

	/// loginTest with facebook ///
	@Test(priority = 11)
	public void loginWithFacebookTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		FacebookLoginPage facebook = new FacebookLoginPage(this.driver);
		Assert.assertTrue(home.myAccountElementIsDisplayed());
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToLogin();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginWithFacebookBtnIsDisplayed());
		facebook = login.navigateToLoginWithFacebookBtn();
		Thread.sleep(2000);
		Assert.assertTrue(facebook.facebookLoginPageIsDisplayed());
		Assert.assertTrue(facebook.facebookEmailBtnIsDisplayed());
		facebook.typeEmail("gor95hovhannisyan22@mail.ru");
		Thread.sleep(2000);
		Assert.assertTrue(facebook.facebookPasswordBtnIsDisplayed());
		Thread.sleep(2000);
		facebook.typePassword("norparol1992");
		Thread.sleep(2000);
		profile = facebook.navigateToFacebookLoginBtn();
		Thread.sleep(2000);
		Assert.assertTrue(profile.welcomePanelIsDisplayed());
	}

	/// forgotPasswordTest ///
	@Test(priority = 10)
	public void forgotPasswordTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogin();
		Thread.sleep(2000);
		Assert.assertTrue(login.forgotPasswordIsDisplayed());
		ForgotPasswordPage forgotPassword = new ForgotPasswordPage(this.driver);
		forgotPassword = login.navigateToForgotPassword();
		Thread.sleep(4000);
		Assert.assertTrue(forgotPassword.forgotPasswordPageIsDisplayed());
		Assert.assertTrue(forgotPassword.passwordResetInputIsDisplayed());
		forgotPassword.passwordResetInputType("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		Assert.assertTrue(forgotPassword.sendEmailBtnIsDisplayed());
		home = forgotPassword.navigateToSendEmailBtn();
		Thread.sleep(2000);
		// Assert.assertTrue(home.allertContentIsDisplayed());

	}
}
