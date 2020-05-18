package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ForgotPasswordPage extends BasePage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public final String FORGOT_PASSWORD_PANNEL = "//div[@class='password-reset--content panel has--border is--rounded']";
	public final String PASSWORD_RESET_INPUT = "//input[@class='password-reset--input']";
	public final String SEND_EMAIL_BTN = "//button[@class='password-reset--link btn is--primary is--icon-right is--center']";
	
	@FindBy(xpath = FORGOT_PASSWORD_PANNEL)
	WebElement forgotPasswordPannel;
	
	public boolean forgotPasswordPageIsDisplayed() {
		return forgotPasswordPannel.isDisplayed();
	}
	
	@FindBy(xpath = PASSWORD_RESET_INPUT)
	WebElement passwordResetInput;
	
	public boolean passwordResetInputIsDisplayed() {
		return passwordResetInput.isDisplayed();
	}
	
	public void passwordResetInputType(String email) {
		passwordResetInput.sendKeys(email);
	}
	
	@FindBy(xpath = SEND_EMAIL_BTN)
	WebElement sendEmailBtn;
	
	public boolean sendEmailBtnIsDisplayed() {
		return sendEmailBtn.isDisplayed();
	}

	public HomePage navigateToSendEmailBtn() {
		sendEmailBtn.click();
		return new HomePage(this.driver);
	}
}
