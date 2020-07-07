package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.AddressPage;
import am.itu.qa.generalPage.ChangeAddressPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.NewsletterPage;
import am.itu.qa.generalPage.OrdersPage;
import am.itu.qa.generalPage.PaymentMethodPage;
import am.itu.qa.generalPage.ProfilePage;
import am.itu.qa.generalPage.ProfileSettingsPage;

public class MyAccountSubsectionButtonsTest extends BaseTest {

////myProfileTest ////
	@Test (priority=1)
	public void myProfileTest() throws InterruptedException {
		//// Test-1 without login ////
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToMyProfileBtnAM();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		//home.navigateToReturnHomePage();
		//// Test-2 with logged in ////
		//home.navigateToMyAccount();
		//Thread.sleep(2000);
		//login = home.navigateToLogin();
		//Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		profile.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		profile = home.navigateToMyProfilBtnAM();
		Thread.sleep(2000);
		Assert.assertTrue(profile.profilePageIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	/// profileSettingsTest ////
	@Test (priority=2)
	public void profileSettingsTest() throws InterruptedException {
		//// Test-1 without login ////
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		ProfileSettingsPage profileSettings = new ProfileSettingsPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToProfileSettingsBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		//home.navigateToReturnHomePage();
		//// Test-2 with logged in ////
		//home.navigateToMyAccount();
		//Thread.sleep(2000);
		//login = home.navigateToLogin();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		profile.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		profileSettings = home.navigateToProfileSettingBtn();
		Assert.assertTrue(profileSettings.profileSettingsPageDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	/// adressesTest ////
	@Test (priority=3)
	public void adressesTest() throws InterruptedException {
		//// Test-1 without login ////
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		AddressPage address = new AddressPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToAddresBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		//home.navigateToReturnHomePage();
		//// Test-2 with logged in ////
		//home.navigateToMyAccount();
		//Thread.sleep(2000);
		//login = home.navigateToLogin();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		profile.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		address = home.navigateToAddressBtn();
		Assert.assertTrue(address.addressPagelIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	/// paymentMethodTest ////
	@Test (priority=4)
	public void paymentMethodTest() throws InterruptedException {
		//// Test-1 without login ////
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		ProfilePage profile = new ProfilePage(this.driver);
		PaymentMethodPage paymentMethod = new PaymentMethodPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToPaymentMethodBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		//home.navigateToReturnHomePage();
		//// Test-2 with logged in ////
		//home.navigateToMyAccount();
		//Thread.sleep(2000);
		//login = home.navigateToLogin();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		profile.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		paymentMethod = home.navigateToPaymentMetodBtn();
		Assert.assertTrue(paymentMethod.paymentMethodPageIsOpen());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	/// ordersTest ///
	@Test (priority=5)
	public void ordersTest() throws InterruptedException {
		//// Test-1 without login ////
		HomePage home = new HomePage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		//home.navigateToLogOutBtn();
		//Thread.sleep(2000);
		//home.navigateToReturnHomePage();
		//Thread.sleep(2000);
		//home.navigateToMyAccount();
		//Thread.sleep(2000);
		Assert.assertTrue(home.ordersBtnIsDisplayed());
		LoginPage login = new LoginPage(this.driver);
		login = home.navigateToOrdersBtnWithoutLogin();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		//// Test-2 logged in ////
		OrdersPage orders = new OrdersPage(this.driver);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		login.navigateToPasswordField("BuyamHayk");
		orders = login.navigateToLoginForOrders();
		Thread.sleep(2000);
		Assert.assertTrue(orders.ordersPannelIsDisplayed());
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}

	/// newsletterTest ///
	@Test (priority=6)
	public void newsletterTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		Assert.assertTrue(home.newsletterBtnIsDisplayed());
		NewsletterPage newsletter = new NewsletterPage(this.driver);
		newsletter = home.navigateToNewsletterBtn();
		Thread.sleep(2000);
		Assert.assertTrue(newsletter.newsletterPannelIsDisplayed());
	}
}
