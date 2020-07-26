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
	public final String FACEBOOK_EMAIL_BTN = "//input[@name='email']";
	public final String FACEBOOK_PASSWORD_BTN = "//input[@name='pass']";
	public final String FACEBOOK_Login_BTN = "//button[@name='login']";
	
	@FindBy(xpath = FACEBOOK_LOGIN_PAGE)
	WebElement facebookLoginPage;
	
	public boolean facebookLoginPageIsDisplayed() {
		facebookLoginPage.isDisplayed();
		return facebookLoginPage.isDisplayed();
	}
	
	@FindBy(xpath = FACEBOOK_EMAIL_BTN)
	WebElement facebookEmailBtn;
	
	public boolean facebookEmailBtnIsDisplayed() {
		return facebookEmailBtn.isDisplayed();
	}
	
	public void typeEmail(String email) {
		facebookEmailBtn.sendKeys(email);
	}
	
	@FindBy(xpath = FACEBOOK_PASSWORD_BTN)
	WebElement facebookPasswordBtn;
	
	public boolean facebookPasswordBtnIsDisplayed() {
		return facebookPasswordBtn.isDisplayed();
	}
	
	public void typePassword(String password) {
		facebookPasswordBtn.sendKeys(password);
	}
	
	@FindBy(xpath = FACEBOOK_Login_BTN)
	WebElement facebookLoginBtn;
	
	public boolean facebookLoginBtnIsDisplayed() {
		return facebookLoginBtn.isDisplayed();
	}
	
	public ProfilePage navigateToFacebookLoginBtn() {
		facebookLoginBtn.click();
		return new ProfilePage(this.driver);
	}
	

}

