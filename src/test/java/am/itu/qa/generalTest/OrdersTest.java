package am.itu.qa.generalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.baseTest.BaseTest;
import am.itu.qa.generalPage.HomePage;

public class OrdersTest extends BaseTest{

	@Test
	public void ordersTest() throws InterruptedException {
		
		HomePage home = new HomePage(this.driver);
		home.navigateToShopingCartButton();
		Thread.sleep(2000);
		
		
	}

	
}
