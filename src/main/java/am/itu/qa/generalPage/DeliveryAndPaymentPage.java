package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class DeliveryAndPaymentPage extends BasePage{

	public DeliveryAndPaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public final String DELIVERY_AND_PAYMENT_PAGE = "//div[@class='content--wrapper']";
	
	@FindBy(xpath = DELIVERY_AND_PAYMENT_PAGE)
	WebElement deliveryAndPaymentPage;

	public boolean deliveryAndPaymentPageIsDisplayed() {
		return deliveryAndPaymentPage.isDisplayed();
	}

}
