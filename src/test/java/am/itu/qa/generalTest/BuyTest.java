package am.itu.qa.generalTest;

import org.openqa.selenium.By;
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
	@Test
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

	/// addProductQuantityTest() -- click on plusSign and saw that how many are clicked on plusSign
	//  so many are increment quantity of product ///  ?????????????????
	//@Test
	public void addProductQuantityTest() throws InterruptedException{
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
		//By badgeCartQuantity = null;
		//Assert.assertTrue(Integer.parseInt(driver.findElement((By) badgeCartQuantity).getText())==3);
		//home.navigateToPlusSign();
		Assert.assertTrue(home.checkQuantityOfNumber(3));
	}
	
	/// priceProductTest() -- add product quantity  and saw price of added product
	//@Test
	public void priceProductTest() throws InterruptedException{
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.shopCartBtnIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.shopingCartBtnClick();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		
	}
}