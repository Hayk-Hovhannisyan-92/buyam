package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class NewsletterPage extends BasePage{

	public NewsletterPage(WebDriver driver) {
		super(driver);
	}

	public final String NEWSLETTER_PANNEL = "//div[@class='newsletter--headline panel--body is--wide has--border is--rounded']";
	
	@FindBy(xpath = NEWSLETTER_PANNEL)
	WebElement newsletterPannel;
	
	public boolean newsletterPannelIsDisplayed() {
		return newsletterPannel.isDisplayed();
	}
}
