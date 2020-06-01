package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.ForgotPasswordPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.ProfilePage;

public class RegistracionLoginTest extends BaseTest {

	/// registracionTest ///
	@Test
	public void registracionTestAM() throws InterruptedException {
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

		/// Armenian language(default)
		/// test with incorrect msg
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
		login.navigateToEmailFieldRegister("hayk.com");
		Thread.sleep(1000);
		login.navigateToPasswordFieldRegister("BuyamHayk");
		Thread.sleep(1000);
		Assert.assertTrue(login.registerErrMsgIsDisplayed());

		//// continue with correct email
		login.clearEmailField();
		login.navigateToEmailFieldRegister("hovhannisyanhayk56@gmail.com");
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

		//// English language

		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_ENG();
		Thread.sleep(3000);
		Assert.assertTrue(login.salutationFieldIsDisplayed());
		Thread.sleep(1000);
		login.navigateToSalutationField();
		Thread.sleep(1000);
		Assert.assertTrue(login.mrSubfieldENIsDisplayed());
		login.navigateToMrSubfieldEN();
		Thread.sleep(1000);
		Assert.assertTrue(login.firstNameFieldIsDisplayed());
		login.navigateTofirstNameField("Hayk");
		Thread.sleep(1000);
		Assert.assertTrue(login.lastNameFieldIsDisplayed());
		login.navigateToLastNameField("Hovhannisyan");
		Thread.sleep(1000);
		login.navigateToEmailFieldRegister("hovhannisyanhayk56@gmail.com");
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

		//// Russian language

		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_RUS();
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
		login.navigateToEmailFieldRegister("hovhannisyanhayk56@gmail.com");
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

	}

	/// loginTest ///
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
	
	/// forgotPasswordTest ///
		@Test
		public void forgotPasswordTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			LoginPage login = new LoginPage(this.driver);
			home.navigateToMyAccount();
			Thread.sleep(2000);
			home.navigateToLogOutBtn();
			Thread.sleep(2000);
			home.navigateToReturnHomePage();
			Thread.sleep(2000);
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
			Assert.assertTrue(home.allertContentIsDisplayed());

		}

}
