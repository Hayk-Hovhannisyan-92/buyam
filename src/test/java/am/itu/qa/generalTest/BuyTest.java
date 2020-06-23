package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;

public class BuyTest extends BaseTest {

	/// returnToTopTest  EXPERIMENT///
	//@Test
	public void returnToTopTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		home.ByPixel();
		Thread.sleep(2000);
		home.navigateToReturnToTopBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// buyWithoutLoginTest ///
	//@Test
	public void buyWithoutLoginTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		Assert.assertTrue(home.shopCartBtnIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.shopingCartBtnClick();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		Thread.sleep(2000);
		login = home.navigateToCheckoutBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
	}

	/// buyFewProductInSame() -- buy few product in same and saw price ///
	@Test
	public void buyFewProductInSame() throws InterruptedException{
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.shopCartBtnIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.shopingCartBtnClick();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		home.checkProductQuantity(3);
		Thread.sleep(2000);
		
	}
}