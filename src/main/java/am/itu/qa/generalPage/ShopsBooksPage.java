package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ShopsBooksPage extends BasePage {

	public ShopsBooksPage(WebDriver driver) {
		super(driver);
	}

	public final String SHOPS_BOOKS_PAGE = "//nav[@class='content--breadcrumb block']";
	public final String PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	@FindBy(xpath = SHOPS_BOOKS_PAGE)
	WebElement shopsBooksPage;

	public boolean shopsBooksPageIsDisplayed() {
		return shopsBooksPage.isDisplayed();
	}

	@FindBy(xpath = PRODUCT)
	WebElement product;

	public boolean productIsDisplayed() {
		return product.isDisplayed();
	}

	public void navigateToProduct() {
		product.click();
	}
}
