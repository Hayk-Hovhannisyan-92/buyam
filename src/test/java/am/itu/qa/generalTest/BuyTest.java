package am.itu.qa.generalTest;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.CarrefourBreakfastCofeeTeaPage;
import am.itu.qa.generalPage.CarrefourPage;
import am.itu.qa.generalPage.CoffeeTeaFreshIceCreamPage;
import am.itu.qa.generalPage.FoodCourtPage;
import am.itu.qa.generalPage.HomePage;
import am.itu.qa.generalPage.LoginPage;
import am.itu.qa.generalPage.OrdersPage;
import am.itu.qa.generalPage.ProfilePage;
import am.itu.qa.generalPage.ShopsBooksPage;
import am.itu.qa.generalPage.ShopsPage;

public class BuyTest extends BaseTest {

	/// returnToTopTest EXPERIMENT///
	// @Test
	public void returnToTopTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		home.ByPixel();
		Thread.sleep(2000);
		home.navigateToReturnToTopBtn();
		Thread.sleep(2000);
		//Assert.assertTrue(home.homeMainIsDisplayed());
	}

	/// buyWithoutLoginTest ///
	//@Test(priority = 1)
	public void buyWithoutLoginTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		Thread.sleep(2000);
		login = home.navigateToCheckoutBtn();
		Thread.sleep(2000);
		Assert.assertTrue(login.loginPageIsOpen());
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		home.navigateToCrossIconItem();
		Thread.sleep(2000);
		home.navigateToCrossIconContainer();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.homePageIsDisplayed());
	}
	
	/// checkProductStayInShoppingCart ///
	//@Test(priority = 2)
	public void checkProductStayInShoppingCart() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToLogin();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		login.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		Thread.sleep(2000);
		home.navigateToCrossIconContainer();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		home.navigateToLogOutBtn();
		Thread.sleep(2000);
		home.navigateToMyAccount();
		Thread.sleep(2000);
		login = home.navigateToLogin();
		Thread.sleep(2000);
		login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
		Thread.sleep(2000);
		login.navigateToPasswordField("BuyamHayk");
		Thread.sleep(2000);
		login.navigateToLoginBtn();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		Thread.sleep(2000);
		home.navigateToCrossIconItem();
		Thread.sleep(2000);
		home.navigateToCrossIconContainer();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.homePageIsDisplayed());
	}

	/// addProductQuantityTest() -- click on plusSign and saw that how many are
	/// clicked on plusSign so many are increment quantity of product ///
	/// ?????????????????
	//@Test(priority = 3)
	public void addProductQuantityTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		home.checkProductQuantityByAdd(3);
		Thread.sleep(2000);
		Assert.assertTrue(home.checkQuantityOfNumber(3));
		Thread.sleep(2000);
	}

	/// removeProductQuantity() -- click on minus sign and saw that how many are
	/// clicked on minusSign so many are decrement quantity of product
	//@Test(priority = 4)
	public void removeProductQuantity() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.checkProductQuantityByRemove());
		Thread.sleep(2000);
		home.navigateToCrossIconContainer();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
	}

	/// priceProductTest() -- add product quantity and saw price of added product
	//@Test(priority = 5)
	public void priceProductTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Thread.sleep(2000);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		Assert.assertTrue(home.checkEqualityInStart());
		Thread.sleep(2000);
	//	Assert.assertTrue(home.checkProductsPriceEquality(3));
	//	Assert.assertTrue(home.checkProductQuantityByRemove());
		//home.navigateToCrossIcon();
	//	Thread.sleep(2000);
		//home.navigateToReturnHomePage();

	}

	/// allPriceProductTest() -- saw that all price are equal sum of product and
	/// delivery payment
	//@Test(priority = 6)
	public void allPriceProduct() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		Assert.assertTrue(home.productInShoppingCartIsDisplayed());
	//	Assert.assertTrue(home.checkAllPrice());
		Thread.sleep(2000);
		Assert.assertTrue(home.checkProductQuantityByRemove());
		//home.navigateToCrossIcon();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();

	}
	
	/// priceDifferentProductTest() -- add different products and saw price of added
		/// product
		//@Test(priority = 7)
		public void priceDifferentProductTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
			Thread.sleep(2000);
			home.addProductsInShoppingCart(2);
			Thread.sleep(2000);
			home.navigateToShopingCartBtn();
			Thread.sleep(2000);
			Assert.assertTrue(home.productInShoppingCartIsDisplayed());
		//	Assert.assertTrue(home.sumOfProductsInContainer());
			Thread.sleep(2000);
			Assert.assertTrue(home.checkProductQuantityByRemove());
			//home.navigateToCrossIcon();
			Thread.sleep(2000);
			home.navigateToReturnHomePage();
		}

	/// productsInDifferentSection() -- saw that all price are equal sum of products
	/// pricees and delivery payment
	//@Test(priority = 8)
	public void productsInSameSection() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		CarrefourPage carrefour = new CarrefourPage(this.driver);
		CarrefourBreakfastCofeeTeaPage cofeeTea = new CarrefourBreakfastCofeeTeaPage(this.driver);
		FoodCourtPage foodCourt = new FoodCourtPage(this.driver);
		CoffeeTeaFreshIceCreamPage freshIceCream = new CoffeeTeaFreshIceCreamPage(this.driver);
		ShopsPage shops = new ShopsPage(this.driver);
		ShopsBooksPage shopsBook = new ShopsBooksPage(this.driver);
		carrefour = home.navigateToCarrefourBtn();
		Thread.sleep(2000);
		Assert.assertTrue(carrefour.carrefourPageIsDisplayed());
		Assert.assertTrue(carrefour.breakfastCofeeTeaIsDisplayed());
		Thread.sleep(2000);
		cofeeTea = carrefour.navigateToBreaakfastCofeeTea();
		Thread.sleep(2000);
		Assert.assertTrue(cofeeTea.breakfastCofeeTeaPageIsDisplayed());
		Assert.assertTrue(cofeeTea.productIsDisplayed());
		cofeeTea.navigateToProduct();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.foodCourtBtnIsDisplayed());
		foodCourt = home.navigateToFoodCourtBtn();
		Assert.assertTrue(foodCourt.foodCourtPageIsDisplayed());
		Thread.sleep(2000);
		freshIceCream = foodCourt.navigateToCoffeeTeaFreshIceCream();
		Assert.assertTrue(freshIceCream.cofeeTeaFreshIceCreamPageIsDisplayed());
		freshIceCream.navigateToProduct();
		Thread.sleep(2000);
		home.navigateToReturnHomePage();
		Thread.sleep(2000);
		Assert.assertTrue(home.shopsBtnIsDisplayed());
		shops = home.navigateToShopsBtn();
		Assert.assertTrue(shops.shopsPageIsDisplayed());
		Thread.sleep(2000);
		shopsBook = shops.navigateToProduct();
		Assert.assertTrue(shopsBook.shopsBooksPageIsDisplayed());
		Assert.assertTrue(shopsBook.productIsDisplayed());
		Thread.sleep(2000);
		//shopsBook.navigateToProduct();
		//Thread.sleep(2000);
		//home.navigateToReturnHomePage();
		//Thread.sleep(2000);
		//home.navigateToShopingCartButton();
		Assert.assertTrue(home.shippingPriceIsDisplayed());
		Assert.assertTrue(home.checkShippingPrice());
		home.checkProductQuantityByRemove();
		Thread.sleep(2000);
	//	home.navigateToCrossIcon();
		home.navigateToReturnHomePage();
	}

	/// changeOrdersDeliveryTest() -- check can user buy product at last day
	// @Test(priority = 9) ?????????????????????????
	public void changeOrdersDeliveryTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		LoginPage login = new LoginPage(this.driver);
		OrdersPage orders = new OrdersPage(this.driver);
		Date currentDate = new Date();
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		login = home.navigateToCheckoutBtn();
		Assert.assertTrue(login.loginPageIsOpen());
		//login.emailField("hovhannisyanhayk56@gmail.com");
		//login.passwordField("BuyamHayk");
		//orders = login.clickOnLoginButton();
		Assert.assertTrue(orders.dateDeliverylIsDisplayed());

		home.navigateToReturnHomePage();
	}

	/// maxQuantityPurchasedProductTest -- check how many product can buy
	//@Test(priority = 10)
	public void maxQuantityPurchasedProductTest() throws InterruptedException {
		HomePage home = new HomePage(this.driver);
		Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
		Thread.sleep(2000);
		home.navigateToShopCartBtnOfProduct();
		Thread.sleep(2000);
		home.navigateToShopingCartBtn();
		Thread.sleep(2000);
		home.typeQuantity("100001");
		Thread.sleep(2000);
		home.navigateToCheckoutBtn();
		Thread.sleep(2000);
		//Assert.assertTrue(home.restoreMaxQuntity("100001"));
		//home.navigateToCrossIcon();
		home.navigateToReturnHomePage();
	}
	
	/// maxKGPurchasedProductTest -- check how many product can buy
		@Test(priority = 11)
		public void maxKGPurchasedProductTest() throws InterruptedException {
			HomePage home = new HomePage(this.driver);
			LoginPage login = new LoginPage(this.driver);
			home.navigateToMyAccount();
			Thread.sleep(2000);
			login = home.navigateToLogin();
			Thread.sleep(2000);
			login.navigateToEmailField("hovhannisyanhayk56@gmail.com");
			Thread.sleep(2000);
			login.navigateToPasswordField("BuyamHayk");
			Thread.sleep(2000);
			login.navigateToLoginBtn();
			Thread.sleep(2000);
			home.navigateToReturnHomePage();
			Thread.sleep(2000);
			Assert.assertTrue(home.shopCartBtnOfProductIsDisplayed());
			Thread.sleep(2000);
			home.navigateToShopCartBtnOfProduct();
			Thread.sleep(2000);
			home.navigateToShopingCartBtn();
			Thread.sleep(2000);
			home.typeQuantity("1000002");
			Thread.sleep(2000);
			//home.navigateCheckoutBtn();
			Thread.sleep(2000);
			Assert.assertTrue(home.restoreMaxQuantity(1000002));
			home.navigateToCrossIconItem();
			Thread.sleep(2000);
			home.navigateToCrossIconContainer();
			Thread.sleep(2000);
			home.navigateToReturnHomePage();
		}
}
