package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;

public class LanguageTest extends BaseTest {

	/// languageTest ///
	@Test()
	public void languageTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.settingsElementIsDisplayed());
		Thread.sleep(2000);
		home.clickOnElementSettings();
		Thread.sleep(2000);
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsArmenian());
		// After step openned small window where are two buttons
		// currency button and language button
		Thread.sleep(2000);
		home.clickOnElementLanguage();
		// After step openned window where can changed language
		Thread.sleep(2000);
		home.clickOnElementLenguage_ENG();
		Thread.sleep(2000);
		// After step update page buy.am and all text in page buy.am
		// is written by english language and window is clossed
		home.clickOnElementSettings();
		Thread.sleep(2000);
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsEnglish());
		Thread.sleep(2000);
		// After step openned small window where are two buttons
		// currency button and language button
		home.clickOnElementLanguage();
		// After step openned window where can changed language
		Thread.sleep(2000);
		home.clickOnElementLenguage_RUS();
		// After step update page buy.am and all text in page buy.am
		// is written by russian language and window is clossed
		home.clickOnElementSettings();
		Thread.sleep(2000);
		Assert.assertTrue(home.dropBoxIsDisplayed());
		Assert.assertTrue(home.langIsRussian());
	}

}
