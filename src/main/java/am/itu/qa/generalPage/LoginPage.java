package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

///// WAS USE IN #2-registracionTest()/////
	public final String SALUTATION_FIELD = "//select[@name='register[personal][salutation]']";
	
	@FindBy(xpath = SALUTATION_FIELD)
	WebElement salutationField;

	public boolean salutationFieldIsDisplayed() {
		return salutationField.isDisplayed();
	}
	
	public void navigateToSalutationField() {
		salutationField.click();
	}
	
	public final String MR_SUBFIELD = "//select[@name='register[personal][salutation]']//option[@value='Mr']";
	
	@FindBy(xpath = MR_SUBFIELD)
	WebElement mrSubfield;

	public boolean mrSubfieldIsDisplayed() {
		return mrSubfield.isDisplayed();
	}
	
	public void navigateToMrSubfield() {
		mrSubfield.click();
	}
	
	public final String FIRST_NAME_FIELD = "//input[@name='register[personal][firstname]']";
	
	@FindBy(xpath = FIRST_NAME_FIELD)
	WebElement firstNameField;

	public boolean firstNameFieldIsDisplayed() {
		return firstNameField.isDisplayed();
	}
	
	public void navigateTofirstNameField(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	public final String LAST_NAME_FIELD = "//div[@class='panel--body is--wide']//input[@name='register[personal][lastname]']";
	
	@FindBy(xpath = LAST_NAME_FIELD)
	WebElement lastNameField;

	public boolean lastNameFieldIsDisplayed() {
		return firstNameField.isDisplayed();
	}
	
	public void navigateToLastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	public final String EMAIL_FIELD_REGISTER = "//input[@name='register[personal][email]']";
	
	@FindBy(xpath = EMAIL_FIELD_REGISTER)
	WebElement emailFieldRegister;

	public boolean emailFieldRegisterIsDisplayed() {
		return emailFieldRegister.isDisplayed();
	}
	
	public void navigateToEmailFieldRegister(String email) {
		emailFieldRegister.sendKeys(email);
	}
	
	public final String PASSWORD_FIELD_REGISTER = "//input[@name='register[personal][password]']";
	
	@FindBy(xpath = PASSWORD_FIELD_REGISTER)
	WebElement passwordFieldRegister;

	public boolean passwordFieldRegisterIsDisplayed() {
		return passwordFieldRegister.isDisplayed();
	}
	
	public void navigateToPasswordFieldRegister(String password) {
		passwordFieldRegister.sendKeys(password);
	}
	
	public final String PASSWORDCONFIRM_FIELD_REGISTER = "//input[@name='register[personal][passwordConfirmation]']";
	
	@FindBy(xpath = PASSWORDCONFIRM_FIELD_REGISTER)
	WebElement passwordConfirmFieldRegister;

	public boolean passwordConfirmFieldRegisterIsDisplayed() {
		return passwordConfirmFieldRegister.isDisplayed();
	}
	
	public void navigateToPasswordConfirmFieldRegister(String password) {
		passwordConfirmFieldRegister.sendKeys(password);
	}
	
	public final String PHONE_NUMBER_FIELD = "//input[@name='register[personal][phone]']";
	
	@FindBy(xpath = PHONE_NUMBER_FIELD)
	WebElement phoneNumberField;

	public boolean phoneNumberFieldIsDisplayed() {
		return phoneNumberField.isDisplayed();
	}
	
	public void navigateToPhoneNumberField(String phoneNumber) {
		phoneNumberField.sendKeys(phoneNumber);
	}
	
	public final String CONTINUE_BTN_REGISTER = "//button[@class='register--submit btn is--primary is--large is--icon-right has--error']";
	
	@FindBy(xpath = CONTINUE_BTN_REGISTER)
	WebElement continueBtnRegister;

	public boolean continueBtnRegisterIsDisplayed() {
		return continueBtnRegister.isDisplayed();
	}
	
	public ProfilePage navigateToContinueBtnRegister() {
		continueBtnRegister.click();
		return new ProfilePage(this.driver);
	}
	
///// WAS USE IN #3-loginTest()/////
	public final String EMAIL_FIELD = "//input[@name='email']";
	public final String PASSWORD_FIELD = "//input[@name='password']";
	public final String LOGIN_BTN = "//button[@class='register--login-btn btn is--primary is--large']";
	// Every time write incorrect login or password must be showen errorMsg whose
	// xpath is below
	public final String ERROR_MSG = "//div[@class='alert--content']";
	// when written correct email and login must be openned ProfilPage
	// when showen user's name and surename whose xpath is below
	public final String WELCOME = "//div[@class='account--welcome panel']";

	@FindBy(xpath = EMAIL_FIELD)
	WebElement email_field;

	public void emailField(String email) {
		email_field.sendKeys(email);
	}

	@FindBy(xpath = PASSWORD_FIELD)
	WebElement password_field;

	public void passwordField(String password) {
		password_field.sendKeys(password);
	}

	@FindBy(xpath = LOGIN_BTN)
	WebElement loginBtn;

	public ProfilePage clickOnLoginBtn() {
		loginBtn.click();
		return new ProfilePage(this.driver);
	}
	
	public boolean loginPageIsOpen() {
		return email_field.isDisplayed();
	}

	@FindBy(xpath = ERROR_MSG)
	WebElement errorMsg;

	public boolean errorDisplayed() {
		return errorMsg.isDisplayed();
	}

	@FindBy(xpath = WELCOME)
	WebElement welcome;

	public boolean welcomeDisplayed() {
		return welcome.isDisplayed();
	}

	public void clearField() {
		email_field.clear();
		password_field.clear();
	}
	
///// WAS USE IN #4-forgotPasswordTest()/////
	public final String FORGOT_PASSWORD = "//a[contains(@href,'/account/password')]";
	
	@FindBy(xpath = FORGOT_PASSWORD)
	WebElement forgotPassword;
	
	public boolean forgotPasswordIsDisplayed() {
		return forgotPassword.isDisplayed();
	}
	
	public ForgotPasswordPage navigateToForgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage(this.driver);
	}
}
