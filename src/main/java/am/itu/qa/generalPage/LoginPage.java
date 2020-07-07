package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//// LoginPage xpaths
	public final String SALUTATION_FIELD = "//select[@name='register[personal][salutation]']";
	public final String MR_SUBFIELD_AM = "//select[@name='register[personal][salutation]']//option[@value='Պրն']";
	public final String MR_SUBFIELD_EN = "//select[@name='register[personal][salutation]']//option[@value='Mr']";
	public final String MR_SUBFIELD_RU = "//select[@name='register[personal][salutation]']//option[@value='Мистер']";
	public final String FIRST_NAME_FIELD = "//input[@name='register[personal][firstname]']";
	public final String LAST_NAME_FIELD = "//div[@class='panel--body is--wide']//input[@name='register[personal][lastname]']";
	public final String EMAIL_FIELD_REGISTER = "//input[@name='register[personal][email]']";
	public final String PASSWORD_FIELD_REGISTER = "//input[@name='register[personal][password]']";
	public final String REGISTER_ERR_MSG = "//div[@class='register--error-msg']";
	public final String PASSWORDCONFIRM_FIELD_REGISTER = "//input[@name='register[personal][passwordConfirmation]']";
	public final String PHONE_NUMBER_FIELD = "//input[@name='register[personal][phone]']";
	public final String CITY_FIELD = "//a[@class='chosen-single']";
	public final String CITY_LIST = "//ul[@class='chosen-results']";
	public final String CHOOSE_CITY_1 = "//li[@data-option-array-index='1']";
	public final String BILLING_STREET_FIELD = "//input[@name='register[billing][street]']";
	public final String CONTINUE_BTN_REGISTER = "//div[@class='register--action']//button[@type='submit']";
	public final String EMAIL_FIELD = "//input[@name='email']";
	public final String PASSWORD_FIELD = "//input[@name='password']";
	public final String LOGIN_BTN = "//button[@class='register--login-btn btn is--primary is--large']";
	public final String ERROR_MSG = "//div[@class='alert--content']";
	public final String FORGOT_PASSWORD = "//a[contains(@href,'/account/password')]";
	public final String ALLERT_CONTENT = "//div[@class='alert--content']";
	public final String LOGIN_FACEBOOK_BTN = "//div[@class='panel--body is--wide']//a[@class='facebook-link']";

	
	
	@FindBy(xpath = SALUTATION_FIELD)
	WebElement salutationField;

	public boolean salutationFieldIsDisplayed() {
		return salutationField.isDisplayed();
	}

	public void navigateToSalutationField() {
		salutationField.click();
	}

	@FindBy(xpath = MR_SUBFIELD_AM)
	WebElement mrSubfieldAM;

	public boolean mrSubfieldAMIsDisplayed() {
		return mrSubfieldAM.isDisplayed();
	}

	public void navigateToMrSubfieldAM() {
		mrSubfieldAM.click();
	}

	@FindBy(xpath = MR_SUBFIELD_EN)
	WebElement mrSubfieldEN;

	public boolean mrSubfieldENIsDisplayed() {
		return mrSubfieldEN.isDisplayed();
	}

	public void navigateToMrSubfieldEN() {
		mrSubfieldEN.click();
	}

	@FindBy(xpath = MR_SUBFIELD_RU)
	WebElement mrSubfieldRU;

	public boolean mrSubfieldRUIsDisplayed() {
		return mrSubfieldRU.isDisplayed();
	}

	public void navigateToMrSubfieldRU() {
		mrSubfieldRU.click();
	}

	@FindBy(xpath = FIRST_NAME_FIELD)
	WebElement firstNameField;

	public boolean firstNameFieldIsDisplayed() {
		return firstNameField.isDisplayed();
	}

	public void navigateTofirstNameField(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	@FindBy(xpath = LAST_NAME_FIELD)
	WebElement lastNameField;

	public boolean lastNameFieldIsDisplayed() {
		return firstNameField.isDisplayed();
	}

	public void navigateToLastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	@FindBy(xpath = EMAIL_FIELD_REGISTER)
	WebElement emailFieldRegister;

	public boolean emailFieldRegisterIsDisplayed() {
		return emailFieldRegister.isDisplayed();
	}

	public void navigateToEmailFieldRegister(String email) {
		emailFieldRegister.sendKeys(email);
	}

	@FindBy(xpath = PASSWORD_FIELD_REGISTER)
	WebElement passwordFieldRegister;

	public boolean passwordFieldRegisterIsDisplayed() {
		return passwordFieldRegister.isDisplayed();
	}

	public void navigateToPasswordFieldRegister(String password) {
		passwordFieldRegister.sendKeys(password);
	}

	@FindBy(xpath = REGISTER_ERR_MSG)
	WebElement registerErrMsg;

	public boolean registerErrMsgIsDisplayed() {
		return registerErrMsg.isDisplayed();
	}

	public void clearEmailField() {
		emailFieldRegister.clear();
	}

	@FindBy(xpath = PASSWORDCONFIRM_FIELD_REGISTER)
	WebElement passwordConfirmFieldRegister;

	public boolean passwordConfirmFieldRegisterIsDisplayed() {
		return passwordConfirmFieldRegister.isDisplayed();
	}

	public void navigateToPasswordConfirmFieldRegister(String password) {
		passwordConfirmFieldRegister.sendKeys(password);
	}

	@FindBy(xpath = PHONE_NUMBER_FIELD)
	WebElement phoneNumberField;

	public boolean phoneNumberFieldIsDisplayed() {
		return phoneNumberField.isDisplayed();
	}

	public void navigateToPhoneNumberField(String phoneNumber) {
		phoneNumberField.sendKeys(phoneNumber);
	}

	@FindBy(xpath = CITY_FIELD)
	WebElement cityField;

	public boolean cityFieldIsDisplayed() {
		return cityField.isDisplayed();
	}

	public void navigateToCityField() {
		cityField.click();
	}

	@FindBy(xpath = CITY_LIST)
	WebElement cityList;

	public boolean cityListIsDisplayed() {
		return cityList.isDisplayed();
	}

	@FindBy(xpath = CHOOSE_CITY_1)
	WebElement chooseCity1;

	public boolean chooseCity1IsDisplayed() {
		return chooseCity1.isDisplayed();
	}

	public void navigateToChooseCity1() {
		chooseCity1.click();
	}

	@FindBy(xpath = BILLING_STREET_FIELD)
	WebElement billingStreetField;

	public boolean billingStreetFieldIsDisplayed() {
		return billingStreetField.isDisplayed();
	}

	public void navigateToBillingStreetField(String billingStreet) {
		billingStreetField.sendKeys(billingStreet);
	}

	@FindBy(xpath = CONTINUE_BTN_REGISTER)
	WebElement continueBtnRegister;

	public boolean continueBtnRegisterIsDisplayed() {
		return continueBtnRegister.isDisplayed();
	}

	public ProfilePage navigateToContinueBtnRegister() {
		continueBtnRegister.click();
		return new ProfilePage(this.driver);
	}

	@FindBy(xpath = EMAIL_FIELD)
	WebElement email_field;

	public void navigateToEmailField(String email) {
		email_field.sendKeys(email);
	}

	@FindBy(xpath = PASSWORD_FIELD)
	WebElement password_field;

	public void navigateToPasswordField(String password) {
		password_field.sendKeys(password);
	}

	@FindBy(xpath = LOGIN_BTN)
	WebElement loginBtn;

	public ProfilePage navigateToLoginBtn() {
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

	public void clearField() {
		email_field.clear();
		password_field.clear();
	}

	@FindBy(xpath = FORGOT_PASSWORD)
	WebElement forgotPassword;

	public boolean forgotPasswordIsDisplayed() {
		return forgotPassword.isDisplayed();
	}

	public ForgotPasswordPage navigateToForgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage(this.driver);
	}

	public OrdersPage navigateToLoginForOrders() {
		loginBtn.click();
		return new OrdersPage(this.driver);
	}
	
	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentldIsDisplayed() {
		return allertContent.isDisplayed();
	}
	
	@FindBy(xpath = LOGIN_FACEBOOK_BTN)
	WebElement loginWithFacebookBtn;

	public boolean loginWithFacebookBtnIsDisplayed() {
		return loginWithFacebookBtn.isDisplayed();
	}
	
	public FacebookLoginPage navigateToLoginWithFacebookBtn() {
		loginWithFacebookBtn.click();
		return new FacebookLoginPage(this.driver);
	}

	

}
