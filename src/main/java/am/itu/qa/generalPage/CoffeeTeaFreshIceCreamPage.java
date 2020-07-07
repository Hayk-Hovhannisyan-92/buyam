package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class CoffeeTeaFreshIceCreamPage extends BasePage {

	public CoffeeTeaFreshIceCreamPage(WebDriver driver) {
		super(driver);
	}

	public final String COFFEE_TEA_FRESH_ICE_CREAM_PAGE = "nav[@class='content--breadcrumb block']";
	public final String PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";


	@FindBy(xpath = COFFEE_TEA_FRESH_ICE_CREAM_PAGE)
	WebElement cofeeTeaFreshIceCreamPage;

	public boolean cofeeTeaFreshIceCreamPageIsDisplayed() {
		return cofeeTeaFreshIceCreamPage.isDisplayed();
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
