package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ProfileSettingsPage extends BasePage {

	public ProfileSettingsPage(WebDriver driver) {
		super(driver);
	}

	//// ProfileSettingsPage xpaths
	public final String PROFILE_SETTINGS_PAGE = "//div[@class='account--profile']";
	public final String NEW_EMAIL_FIELD = "//input[@name='email[email]']";
	public final String EMAIL_CONFIRMATION_FIELD = "//input[@name='email[emailConfirmation]']";
	public final String CURRENT_PASSWORD_FIELDIN_CHANGEEMAIL = "//input[@name='email[currentPassword]']";
	public final String EMAIL_SAVE_CHANGES_BTN = "//div[@class='profile-email--container']//button[@class='btn is--block is--primary']";
	public final String NEW_PASSWORD_FIELD = "//div[@class='profile--password']//input[@class='profile--field is--required ']";
	public final String RE_ENTER_PASSWORD_FIELD = "//div[@class='profile--password-confirmation']//input[@name='password[passwordConfirmation]']";
	public final String CURRENT_PASSWORD_FIELD_IN_CHANGEPASSWORD = "//div[@class='profile--current-password']//input[@name='password[currentPassword]']";
	public final String PASSWORD_SAVE_CHANGES_BTN = "//div[@class='profile-password--container']//button[@class='btn is--block is--primary']";
	public final String ALLERT_MESSAGE_IN_CHANGEPASSWORD = "//div[@class='alert--content']";

	@FindBy(xpath = PROFILE_SETTINGS_PAGE)
	WebElement profileSettingsPage;

	public boolean profileSettingsPageDisplayed() {
		return profileSettingsPage.isDisplayed();
	}

	@FindBy(xpath = NEW_EMAIL_FIELD)
	WebElement newEmailField;

	public boolean newEmailFieldIsDisplayed() {
		return newEmailField.isDisplayed();
	}

	public void navigateToNewEmailField(String email) {
		newEmailField.sendKeys(email);
	}

	@FindBy(xpath = EMAIL_CONFIRMATION_FIELD)
	WebElement emailConfirmationField;

	public boolean emailConfirmationFieldIsDisplayed() {
		return emailConfirmationField.isDisplayed();
	}

	public void navigateToEmailConfirmationField(String email) {
		emailConfirmationField.sendKeys(email);
	}

	@FindBy(xpath = CURRENT_PASSWORD_FIELDIN_CHANGEEMAIL)
	WebElement currentPasswordFieldInChangeEmail;

	public boolean currentPasswordFieldInChangeEmailIsDisplayed() {
		return currentPasswordFieldInChangeEmail.isDisplayed();
	}

	public void navigateToCurrentPasswordFieldInChangeEmail(String password) {
		currentPasswordFieldInChangeEmail.sendKeys(password);
	}

	@FindBy(xpath = EMAIL_SAVE_CHANGES_BTN)
	WebElement emailSaveChangesBtn;

	public boolean emailSaveChangesBtnIsDisplayed() {
		return emailSaveChangesBtn.isDisplayed();
	}

	public void navigateToEmailSaveChangesBtn() {
		emailSaveChangesBtn.click();
	}

	@FindBy(xpath = NEW_PASSWORD_FIELD)
	WebElement newPasswordField;

	public boolean newPasswordFieldIsDisplayed() {
		return newPasswordField.isDisplayed();
	}

	public void navigateToNewPasswordField(String password) {
		newPasswordField.sendKeys(password);
	}

	@FindBy(xpath = RE_ENTER_PASSWORD_FIELD)
	WebElement reEnterPasswordField;

	public boolean reEnterPasswordFieldIsDisplayed() {
		return reEnterPasswordField.isDisplayed();
	}

	public void navigateToReEnterPasswordField(String password) {
		reEnterPasswordField.sendKeys(password);
	}

	@FindBy(xpath = CURRENT_PASSWORD_FIELD_IN_CHANGEPASSWORD)
	WebElement currentPasswordFieldInChangePassword;

	public boolean currentPasswordFieldInChangePasswordIsDisplayed() {
		return currentPasswordFieldInChangePassword.isDisplayed();
	}

	public void navigateToCurrentPasswordFieldInChangePassword(String password) {
		currentPasswordFieldInChangePassword.sendKeys(password);
	}

	@FindBy(xpath = ALLERT_MESSAGE_IN_CHANGEPASSWORD)
	WebElement allertMessageInChangePassword;

	public boolean allertMessageInChangePasswordIsDisplayed() {
		return allertMessageInChangePassword.isDisplayed();
	}

	@FindBy(xpath = PASSWORD_SAVE_CHANGES_BTN)
	WebElement passwordSaveChangesBtn;

	public boolean passwordSaveChangesBtnIsDisplayed() {
		return passwordSaveChangesBtn.isDisplayed();
	}

	public void navigateToPasswordSaveChangesBtn() {
		passwordSaveChangesBtn.click();
	}

}
