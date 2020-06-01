package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;

public class GeneralTest extends BaseTest {

	/// returnToTopTest ///
	@Test
	public void returnToTopTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		home.ByPixel();
		Thread.sleep(2000);
		home.navigateToReturnToTopBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// buyWithoutLoginTest ///????????????????
	@Test
	public void buyWithoutLoginTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.shopCartBtnIsDisplayed());
		Thread.sleep(2000);
		// home.shoppingCartMassiv();
		Thread.sleep(2000);
		// home.shoppingCartMassiv();
		Thread.sleep(2000);
		// home.shoppingCartMassiv();
		Thread.sleep(2000);
		// Assert.assertTrue(home.homeMainIsDisplayed());
	}

}