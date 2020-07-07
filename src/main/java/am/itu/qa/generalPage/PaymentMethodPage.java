package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class PaymentMethodPage extends BasePage {

	public PaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	public final String PAYMENT_METHOD_PAGE = "//div[@class='account--welcome']";
	public final String PAYMENT_TYPE_POS_TERMINAL = "//input[@id='payment_mean3']";
	public final String SAVE_BTN = "//input[@class='btn is--primary register--submit right']";

	@FindBy(xpath = PAYMENT_METHOD_PAGE)
	WebElement paymentMethodPage;

	public boolean paymentMethodPageIsOpen() {
		return paymentMethodPage.isDisplayed();
	}

	@FindBy(xpath = PAYMENT_TYPE_POS_TERMINAL)
	WebElement paymentTypePosTerminal;

	public void navigateToPaymentTypePosTerminal() {
		paymentTypePosTerminal.click();
	}

	@FindBy(xpath = SAVE_BTN)
	WebElement saveBtn;

	public ProfilePage navigateToSaveBtn() {
		saveBtn.click();
		return new ProfilePage(this.driver);
	}
}
