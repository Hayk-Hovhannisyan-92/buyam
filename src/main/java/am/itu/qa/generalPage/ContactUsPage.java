package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;


public class ContactUsPage extends BasePage{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	public final String CONTACT_US_PAGE = "//div[@class='forms--content content right']";

	@FindBy(xpath = CONTACT_US_PAGE)
	WebElement contactUsPage;

	public boolean contactUsPageIsDisplayed() {
		return contactUsPage.isDisplayed();
	}
}
