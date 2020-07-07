package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.AddressPage;
import am.itu.qa.generalPage.ChangeAddressPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.PaymentMethodPage;
import am.itu.qa.generalPage.ProfilePage;
import am.itu.qa.generalPage.ProfileSettingsPage;

public class ChangeDatasTest extends BaseTest {

	/// changeAddressTest ///
	@Test(priority = 1)
	public void changeAddressTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToLogin();
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		login.navigateToPasswordField("BuyamHayk");
		profile = login.navigateToLoginBtn();
		home.navigateToReturnHomePage();
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
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	//	Assert.assertTrue(home.homeMainIsDisplayed());
		home.navigateToReturnHomePage();
	}

	/// changeEmailTest ///
	@Test(priority = 2)
	public void changeEmailTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		AddressPage address = new AddressPage(this.driver);
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Assert.assertTrue(home.profileSettingsBtnIsDisplayed());
		Thread.sleep(2000);
		ProfileSettingsPage profileSettings = new ProfileSettingsPage(this.driver);
		profileSettings = home.navigateToProfileSettingBtn();
		Thread.sleep(2000);
	//	Assert.assertTrue(profileSettings.accountProfileIsDisplayed());
		Assert.assertTrue(profileSettings.newEmailFieldIsDisplayed());
		Thread.sleep(2000);
		profileSettings.navigateToNewEmailField("gor95hovhannisyan22@mail.ru");
		Thread.sleep(2000);
		Assert.assertTrue(profileSettings.emailConfirmationFieldIsDisplayed());
		profileSettings.navigateToEmailConfirmationField("gor95hovhannisyan22@mail.ru");
		Thread.sleep(2000);
		Assert.assertTrue(profileSettings.currentPasswordFieldInChangeEmailIsDisplayed());
		profileSettings.navigateToCurrentPasswordFieldInChangeEmail("BuyamHayk");
		Assert.assertTrue(profileSettings.emailSaveChangesBtnIsDisplayed());
		profileSettings.navigateToEmailSaveChangesBtn();
		Thread.sleep(2000);
		Assert.assertTrue(address.allertContentIsDisplayed());
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	//	Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// changePasswordTest ///?????? this test is worked in sometimes
	@Test(priority = 3)
	public void changePasswordTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		AddressPage address = new AddressPage(this.driver);
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Assert.assertTrue(home.profileSettingsBtnIsDisplayed());
		Thread.sleep(2000);
		ProfileSettingsPage profileSettings = new ProfileSettingsPage(this.driver);
		profileSettings = home.navigateToProfileSettingBtn();
		Thread.sleep(2000);
	//	Assert.assertTrue(profileSettings.accountProfileIsDisplayed());
		Assert.assertTrue(profileSettings.newPasswordFieldIsDisplayed());
		profileSettings.navigateToNewPasswordField("buyamHayk");
		Thread.sleep(2000);
		Assert.assertTrue(profileSettings.reEnterPasswordFieldIsDisplayed());
		profileSettings.navigateToReEnterPasswordField("buyamHayk");
		Thread.sleep(2000);
		Assert.assertTrue(profileSettings.currentPasswordFieldInChangePasswordIsDisplayed());
		profileSettings.navigateToCurrentPasswordFieldInChangePassword("BuyamHayk");
		Thread.sleep(2000);
		profileSettings.navigateToPasswordSaveChangesBtn();
		Thread.sleep(2000);
		Assert.assertTrue(profileSettings.allertMessageInChangePasswordIsDisplayed());
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		//Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// changePaymentMethodTest ///
	@Test(priority = 4)
	public void changePaymentMethodTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		PaymentMethodPage paymentMethod = new PaymentMethodPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToPaymentMetodBtn();
		Thread.sleep(2000);
		Assert.assertTrue(paymentMethod.paymentMethodPageIsOpen());
		paymentMethod.navigateToPaymentTypePosTerminal();
		Thread.sleep(2000);
		paymentMethod.navigateToSaveBtn();
		Thread.sleep(2000);
		//Assert.assertTrue(profile.profilePageIsOpen());
		Assert.assertTrue(profile.allertContentIsDisplayed());
	}
}
