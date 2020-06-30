package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ProfileSettingsPage extends BasePage {

	public ProfileSettingsPage(WebDriver driver) {
		super(driver);
	}

	public final String PROFILE_SETTINGS_PAGE = "div[@class='account--profile']";

	@FindBy(xpath = PROFILE_SETTINGS_PAGE)
	WebElement profileSettingsPage;

	public boolean profileSettingsPageDisplayed() {
		return profileSettingsPage.isDisplayed();
	}
	
	/// WAS USE IN changeEmailTest ///
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

	public final String CURRENT_PASSWORD_FIELDIN_CHANGEEMAIL = "//input[@name='email[currentPassword]']";

	@FindBy(xpath = CURRENT_PASSWORD_FIELDIN_CHANGEEMAIL)
	WebElement currentPasswordFieldInChangeEmail;

	public boolean currentPasswordFieldInChangeEmailIsDisplayed() {
		return currentPasswordFieldInChangeEmail.isDisplayed();
	}

	public void navigateToCurrentPasswordFieldInChangeEmail(String password) {
		currentPasswordFieldInChangeEmail.sendKeys(password);
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

	/// WAS USE IN changePasswordTest ///

	public final String NEW_PASSWORD_FIELD = "//div[@class='profile--password']//input[@class='profile--field is--required ']";

	@FindBy(xpath = NEW_PASSWORD_FIELD)
	WebElement newPasswordField;

	public boolean newPasswordFieldIsDisplayed() {
		return newPasswordField.isDisplayed();
	}

	public void navigateToNewPasswordField(String password) {
		newPasswordField.sendKeys(password);
	}

	public final String RE_ENTER_PASSWORD_FIELD = "//div[@class='profile--password-confirmation']//input[@name='password[passwordConfirmation]']";

	@FindBy(xpath = RE_ENTER_PASSWORD_FIELD)
	WebElement reEnterPasswordField;

	public boolean reEnterPasswordFieldIsDisplayed() {
		return reEnterPasswordField.isDisplayed();
	}

	public void navigateToReEnterPasswordField(String password) {
		reEnterPasswordField.sendKeys(password);
	}

	public final String CURRENT_PASSWORD_FIELD_IN_CHANGEPASSWORD = "//div[@class='profile--current-password']//input[@name='password[currentPassword]']";

	@FindBy(xpath = CURRENT_PASSWORD_FIELD_IN_CHANGEPASSWORD)
	WebElement currentPasswordFieldInChangePassword;

	public boolean currentPasswordFieldInChangePasswordIsDisplayed() {
		return currentPasswordFieldInChangePassword.isDisplayed();
	}

	public void navigateToCurrentPasswordFieldInChangePassword(String password) {
		currentPasswordFieldInChangePassword.sendKeys(password);
	}
	
	public final String ALLERT_MESSAGE_IN_CHANGEPASSWORD = "//div[@class='alert--content']";

	@FindBy(xpath = ALLERT_MESSAGE_IN_CHANGEPASSWORD)
	WebElement allertMessageInChangePassword;

	public boolean allertMessageInChangePasswordIsDisplayed() {
		return allertMessageInChangePassword.isDisplayed();
	}
	
	public final String PASSWORD_SAVE_CHANGES_BTN = "//div[@class='profile-password--container']//button[@class='btn is--block is--primary']";

	@FindBy(xpath = PASSWORD_SAVE_CHANGES_BTN)
	WebElement passwordSaveChangesBtn;

	public boolean passwordSaveChangesBtnIsDisplayed() {
		return passwordSaveChangesBtn.isDisplayed();
	}

	public void navigateToPasswordSaveChangesBtn() {
		passwordSaveChangesBtn.click();
	}

}
