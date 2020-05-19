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
	
	public final String NEW_EMAIL_FIELD = "//input[@name='email[email]']";
	
	@FindBy(xpath = NEW_EMAIL_FIELD)
	WebElement newEmailField;
	
	public boolean newEmailFieldIsDisplayed() {
		return newEmailField.isDisplayed();
	}
	
	public void navigateToNewEmailField(String email) {
		newEmailField.sendKeys(email);
	}
	
	public final String EMAIL_CONFIRMATION_FIELD = "//input[@name='email[emailConfirmation]']";
	
	@FindBy(xpath = EMAIL_CONFIRMATION_FIELD)
	WebElement emailConfirmationField;
	
	public boolean emailConfirmationFieldIsDisplayed() {
		return emailConfirmationField.isDisplayed();
	}
	
	public void navigateToEmailConfirmationField(String email) {
		emailConfirmationField.sendKeys(email);
	}
	
public final String CURRENT_PASSWORD_FIELD = "//input[@name='email[currentPassword]']";
	
	@FindBy(xpath = CURRENT_PASSWORD_FIELD)
	WebElement currentPasswordField;
	
	public boolean currentPasswordFieldIsDisplayed() {
		return currentPasswordField.isDisplayed();
	}
	
	public void navigateToCurrentPasswordField(String password) {
		currentPasswordField.sendKeys(password);
	}
	
public final String EMAIL_SAVE_CHANGES_BTN = "//div[@class='profile-email--container']//button[@class='btn is--block is--primary']";
	
	@FindBy(xpath = EMAIL_SAVE_CHANGES_BTN)
	WebElement emailSaveChangesBtn;
	
	public boolean emailSaveChangesBtnIsDisplayed() {
		return emailSaveChangesBtn.isDisplayed();
	}
	
	public void navigateToEmailSaveChangesBtn() {
		emailSaveChangesBtn.click();
	}
	
	

}
