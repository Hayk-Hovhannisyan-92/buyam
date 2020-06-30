package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class CarrefourBreakfastCofeeTeaPage extends BasePage {

	public CarrefourBreakfastCofeeTeaPage(WebDriver driver) {
		super(driver);
	}

	public final String BREAKFAST_COFEE_TEA_PAGE = "//nav[@class='content--breadcrumb block']";

	@FindBy(xpath = BREAKFAST_COFEE_TEA_PAGE)
	WebElement breakfastCofeeTeaPage;

	public boolean breakfastCofeeTeaPageIsDisplayed() {
		return breakfastCofeeTeaPage.isDisplayed();
	}

	public final String BREAKFAST_COFEE_TEA = "//a[@class='navigation--link' and contains(@href,'/carrefour/breakfast-coffee-tea/')]";

	@FindBy(xpath = BREAKFAST_COFEE_TEA)
	WebElement breakfastCofeeTea;

	public boolean breakfastCofeeTeaIsDisplayed() {
		return breakfastCofeeTea.isDisplayed();
	}

	public void navigateToBreaakfastCofeeTea() {
		breakfastCofeeTea.click();
	}

	public final String PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	@FindBy(xpath = PRODUCT)
	WebElement product;

	public boolean productIsDisplayed() {
		return product.isDisplayed();
	}

	public void navigateToProduct() {
		product.click();
	}
}
