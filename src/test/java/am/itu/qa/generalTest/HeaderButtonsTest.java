package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;

public class HeaderButtonsTest extends BaseTest {

	/// returnHomeBtnTest ///
	@Test
	public void returnHomeBtnTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.returnHomePageIconIsDisplayed());
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.homePageIsDisplayed());
	}

	/// wishlistBtnTest ///
	@Test
	public void wishlistBtnTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.wishlistBtnIsDisplayed());
		home.navigateToWishlistBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.emptyWishlistIsDisplayed());
		// After step make sure that user's wishlist is empty
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	}

	/// shoppingCartBtnTest ///
	@Test
	public void shoppingCartTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.shopingCartBtnIsDisplayed());
		home.shopingCartBtnClick();
		Assert.assertTrue(home.shopingCartPanelIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.emptyShopingCartIsDisplayed());
		Assert.assertTrue(home.crossIconIsDisplayed());
		home.navigateToCrossIcon();
		Thread.sleep(2000);
	}

	/// searchTest ///???????????????
	//@Test
	public void searchTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.searchInputFieldIsDisplayed());
		home.navigateToSearchIcon();
		// click search iconi vra aranc text mutqagrelu dashtum
		Thread.sleep(2000);
		Assert.assertTrue(home.allertMessageIsDisplayed());
		// erevum e allert message
		Thread.sleep(2000);
		home.typeInSearhField("prinv");
		// grvum e voreve text search dashtum
		Thread.sleep(2000);
		home.navigateToSearchIcon();
		// click search iconi vra
		// nkaragrutyun@ HomePage-um
		Assert.assertTrue(home.existingProductHeadlineIsDisplayed());

	}
}
