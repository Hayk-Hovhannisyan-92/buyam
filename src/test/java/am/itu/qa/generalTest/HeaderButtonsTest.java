package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.SearchResultPage;

public class HeaderButtonsTest extends BaseTest {

	/// returnHomeBtnTest ///
	@Test (priority = 1)
	public void returnHomeBtnTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.returnHomePageIconIsDisplayed());
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.homePageIsDisplayed());
	}

	/// wishlistBtnTest ///
	@Test (priority = 2)
	public void wishlistBtnTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.wishlistBtnIsDisplayed());
		login = home.navigateToWishlistButton();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		login.navigateToLoginBtn();
		Assert.assertTrue(home.emptyWishlistIsDisplayed());
		// After step make sure that user's wishlist is empty
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	}

	/// shoppingCartBtnTest ///
	@Test (priority = 3)
	public void shoppingCartTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.shopingCartBtnIsDisplayed());
		home.navigateToShopingCartBtn();
		Assert.assertTrue(home.shopingCartPanelIsDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(home.emptyShopingCartIsDisplayed());
		Assert.assertTrue(home.crossIconContainerIsDisplayed());
		home.navigateToCrossIconContainer();
		home.navigateToReturnHomePage();
	}

	/// searchTest ///???????????????
	@Test (priority = 4)
	public void searchTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		SearchResultPage search = new SearchResultPage(this.driver);
		Assert.assertTrue(home.searchInputFieldIsDisplayed());
		search = home.navigateToSearchIcon();
		// click search iconi vra aranc text mutqagrelu dashtum
		Thread.sleep(2000);
		Assert.assertTrue(search.allertMessageIsDisplayed());
		Thread.sleep(2000);
		home.typeInSearhField("prinv");
		Thread.sleep(2000);
		search = home.navigateToSearchIcon();
		Assert.assertTrue(search.nonExistingProductHeadlineIsDisplayed());
		Thread.sleep(2000);
		home.typeInSearhField("termos");
		Thread.sleep(2000);
		search = home.navigateToSearchIcon();
		Assert.assertTrue(search.existingProductHeadlineIsDisplayed());
		Thread.sleep(2000);
		home.navigateToReturnHomePage();	
	}
}
