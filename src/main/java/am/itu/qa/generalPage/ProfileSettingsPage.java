package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ProfileSettingsPage extends BasePage {

	public ProfileSettingsPage(WebDriver driver) {
		super(driver);
	}
	
	public final String ACCOUNT_PROFILE = "//div[@class='account--profile']";
	
	@FindBy(xpath = ACCOUNT_PROFILE)
	WebElement accountProfile;
	
	public boolean accountProfileIsDisplayed() {
		return accountProfile.isDisplayed();
	}
	

}
