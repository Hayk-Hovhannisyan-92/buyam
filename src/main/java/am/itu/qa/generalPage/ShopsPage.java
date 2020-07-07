package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ShopsPage extends BasePage {

	public ShopsPage(WebDriver driver) {
		super(driver);
	}

	public final String SHOPS_PAGE = "//nav[@class='navigation-main']";
	public final String PRODUCT = "div[@class='mobile-nav-bg']//a[@class='navigation--link' and contains(@href,'/shops/books')]";

	@FindBy(xpath = SHOPS_PAGE)
	WebElement shopsPage;

	public boolean shopsPageIsDisplayed() {
		return shopsPage.isDisplayed();
	}

	@FindBy(xpath = PRODUCT)
	WebElement product;

	public boolean productIsDisplayed() {
		return product.isDisplayed();
	}

	public ShopsBooksPage navigateToProduct() {
		product.click();
		return new ShopsBooksPage(this.driver);
	}
}
