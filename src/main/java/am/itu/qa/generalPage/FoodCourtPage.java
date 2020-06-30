package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class FoodCourtPage extends BasePage {

	public FoodCourtPage(WebDriver driver) {
		super(driver);
	}

	public final String FOOD_COURT_PAGE = "nav[@class='navigation-main']";

	@FindBy(xpath = FOOD_COURT_PAGE)
	WebElement foodCourtPage;

	public boolean foodCourtPageIsDisplayed() {
		return foodCourtPage.isDisplayed();
	}

	public final String COFFEE_TEA_FRESH_ICE_CREAM = "//a[@class='navigation--link' and contains(@href,'/food-court/fresh-coffee-tea-ice-cream/')]";

	@FindBy(xpath = COFFEE_TEA_FRESH_ICE_CREAM)
	WebElement coffeeTeaFreshIceCream;

	public boolean coffeeTeaFreshIceCreamIsDisplayed() {
		return coffeeTeaFreshIceCream.isDisplayed();
	}

	public CoffeeTeaFreshIceCreamPage navigateToCoffeeTeaFreshIceCream() {
		coffeeTeaFreshIceCream.click();
		return new CoffeeTeaFreshIceCreamPage(this.driver);
	}

}
