package am.itu.qa.generalPage;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class SearchResultPage extends BasePage {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	//// SearchTest xpats
	public final String ALLERT_MESSAGE = "//div[@class='alert--content']";
	// voronman ardyunqum nor eji headline - goyutyun unecox apranqi
	public final String EXISTING_PRODUCT_HEADLINE = "//h1[@class='search--headline']";
	// voronman ardyunqun nor eji headline - goyutyun chunecox apranqi
	public final String NON_EXISTING_PRODUCT_HEADLINE = "//div[@class='alert--content']";

	@FindBy(xpath = ALLERT_MESSAGE)
	WebElement allertMessage;

	public boolean allertMessageIsDisplayed() {
		return allertMessage.isDisplayed();
	}

	@FindBy(xpath = EXISTING_PRODUCT_HEADLINE)
	WebElement existingProductHeadline;

	public boolean existingProductHeadlineIsDisplayed() {
		return existingProductHeadline.isDisplayed();
	}

	@FindBy(xpath = NON_EXISTING_PRODUCT_HEADLINE)
	WebElement nonExistingProductHeadline;

	public boolean nonExistingProductHeadlineIsDisplayed() {
		return nonExistingProductHeadline.isDisplayed();
	}
	
	/*
	 * public boolean existingProductHeadlineIsDisplayed() { return
	 * existingProductHeadline.isDisplayed(); }
	 */

	/*
	 * public boolean nonExistingProductHeadlineIsDisplayed() { try { return
	 * nonExistingProductHeadline.isDisplayed(); } catch (NoSuchElementException e)
	 * { return nonExistingProductHeadline.isDisplayed(); }
	 */
	/*public boolean existingProductHeadlineIsDisplayed() {
		if (existingProductHeadline.isDisplayed()) {
			return existingProductHeadline.isDisplayed();
		}
		try {
			return nonExistingProductHeadline.isDisplayed();
		} catch (NoSuchElementException e) {
			return nonExistingProductHeadline.isDisplayed();
		}
	}
*/
}
