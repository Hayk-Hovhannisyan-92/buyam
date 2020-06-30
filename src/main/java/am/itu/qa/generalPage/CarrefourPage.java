package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class CarrefourPage extends BasePage {

	public CarrefourPage(WebDriver driver) {
		super(driver);
	}

	public final String CARREFOUR_PAGE = "//nav[@class='navigation-main']";

	@FindBy(xpath = CARREFOUR_PAGE)
	WebElement carrefourPage;

	public boolean carrefourPageIsDisplayed() {
		return carrefourPage.isDisplayed();
	}

	public final String BREAKFAST_COFEE_TEA = "//a[@class='navigation--link' and contains(@href,'/carrefour/breakfast-coffee-tea/')]";

	@FindBy(xpath = BREAKFAST_COFEE_TEA)
	WebElement breakfastCofeeTea;

	public boolean breakfastCofeeTeaIsDisplayed() {
		return breakfastCofeeTea.isDisplayed();
	}

	public CarrefourBreakfastCofeeTeaPage navigateToBreaakfastCofeeTea() {
		breakfastCofeeTea.click();
		return new CarrefourBreakfastCofeeTeaPage(this.driver);
	}
}
