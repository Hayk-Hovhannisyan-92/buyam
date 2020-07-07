package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class FacebookLoginPage extends BasePage{

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
	}

	public final String FACEBOOK_LOGIN_PAGE = "//div[@class='_4-u2 _1w1t _4-u8 _52jv']";
	
	@FindBy(xpath = FACEBOOK_LOGIN_PAGE)
	WebElement facebookLoginPage;
	
	public boolean facebookLoginPageIsDisplayed() {
		facebookLoginPage.isDisplayed();
		return facebookLoginPage.isDisplayed();
	}

}

