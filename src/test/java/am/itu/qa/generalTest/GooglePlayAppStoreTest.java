package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.AppStorePage;
import am.itu.qa.generalPage.GooglePlayPage;
import am.itu.qa.generalPage.HomePage;

public class GooglePlayAppStoreTest extends BaseTest {

	/// googlePlayTest ///
	@Test
	public void googlePlayTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		GooglePlayPage googlePlay = new GooglePlayPage(this.driver);
		Assert.assertTrue(home.googlePlayBtnIsDisplayed());
		googlePlay = home.navigateToGooglePlayBtn();
		Thread.sleep(2000);
		Assert.assertTrue(googlePlay.googlePlayPageIsDisplayed());
		Thread.sleep(2000);
		googlePlay.closeNewTab();
		Thread.sleep(2000);
		Assert.assertTrue(home.homeMainIsDisplayed());
		Thread.sleep(2000);
	}

	/// appStoreTest ///
	@Test
	public void appStoreTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		AppStorePage appstore = new AppStorePage(this.driver);
		Assert.assertTrue(home.appStoreBtnIsDisplayed());
		Thread.sleep(2000);
		appstore = home.navigateToAppStoreBtn();
		Thread.sleep(2000);
		Assert.assertTrue(appstore.appStorePageIsDisplayed());
		Thread.sleep(2000);
		appstore.closeNewTab();
		Thread.sleep(2000);
		Assert.assertTrue(home.homeMainIsDisplayed());
	}

}
