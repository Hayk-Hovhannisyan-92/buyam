package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.FacebookPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.InstagramPage;
import am.itu.qa.generalPage.YoutubePage;

public class FooterFIYTest extends BaseTest {

	/// facebookTest ///
	@Test
	public void facebookTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		FacebookPage facebook = new FacebookPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.facebookBtnIsDisplayed());
		Thread.sleep(2000);
		facebook = home.navigateToFacebookBtn();
		Thread.sleep(2000);
		Assert.assertTrue(facebook.facebookBuyamPageIsDisplayed());
		facebook.closeNewTab();
		Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// instagramTest ///
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

	/// youtubeTest ///
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

}
