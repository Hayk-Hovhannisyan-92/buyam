package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.AboutUsPage;
import am.itu.qa.generalPage.ContactUsPage;
import am.itu.qa.generalPage.DeliveryAndPaymentPage;
import am.itu.qa.generalPage.HomePage;

public class FooterButtonsTest extends BaseTest {

	/// contactUsTest ///
	@Test
	public void contactUsTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		ContactUsPage contactUs = new ContactUsPage(this.driver);
		Assert.assertTrue(home.contactUsIsDisplayed());
		contactUs = home.navigateToContactUs();
		Thread.sleep(2000);
		Assert.assertTrue(contactUs.contactUsPageIsDisplayed());
		home.navigateToReturnHomePage();
		Assert.assertTrue(home.homeMainIsDisplayed());
		Thread.sleep(2000);
	}

	/// aboutUsTest ///
	/// Armenian language
	@Test
	public void aboutUsTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		AboutUsPage aboutUsAM = new AboutUsPage(this.driver);
		Assert.assertTrue(home.aboutUsAMIsDisplayed());
		aboutUsAM = home.navigateToAboutUsAM();
		Thread.sleep(2000);
		Assert.assertTrue(aboutUsAM.aboutUsPageIsDisplayed());
		/// English language
		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_ENG();
		AboutUsPage aboutUsEN = new AboutUsPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(aboutUsEN.aboutUsPageIsDisplayed());
		/// Russian language
		home.clickOnElementSettings();
		home.clickOnElementLanguage();
		home.clickOnElementLenguage_RUS();
		AboutUsPage aboutUsRU = new AboutUsPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(aboutUsRU.aboutUsPageIsDisplayed());
		home.navigateToReturnHomePage();
		Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// deliveryAndPaymentTest ///
	@Test
	public void deliveryAndPaymentTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		DeliveryAndPaymentPage deliveryAndPayment = new DeliveryAndPaymentPage(this.driver);
		Assert.assertTrue(home.deliveryAndPaymentIsDisplayed());
		deliveryAndPayment = home.navigateToDeliveryAndPayment();
		Thread.sleep(2000);
		Assert.assertTrue(deliveryAndPayment.deliveryAndPaymentPageIsDisplayed());
	}

}
