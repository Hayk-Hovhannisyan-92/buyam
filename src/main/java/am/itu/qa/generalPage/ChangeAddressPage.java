package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class ChangeAddressPage extends BasePage {

	public ChangeAddressPage(WebDriver driver) {
		super(driver);
	}

	public final String CHANGE_ADDRESS_PANNEL = "//div[@class='panel--body is--wide']";
	public final String CHANGE_ADDRESS_FIELD = "//input[@name='address[street]']";
	public final String SAVE_ADDRESS_BTN = "//input[@class='btn is--primary address--form-submit']";


	@FindBy(xpath = CHANGE_ADDRESS_PANNEL)
	WebElement changeAddressPannel;

	public boolean changeAddressPannelIsDisplayed() {
		return changeAddressPannel.isDisplayed();
	}

	@FindBy(xpath = CHANGE_ADDRESS_FIELD)
	WebElement changeAddressField;

	public boolean changeAddressFieldIsDisplayed() {
		return changeAddressField.isDisplayed();
	}

	public void navigateToChangeAddressField(String address) {
		changeAddressField.clear();
		changeAddressField.sendKeys(address);
	}

	@FindBy(xpath = SAVE_ADDRESS_BTN)
	WebElement saveAddressBtn;

	public AddressPage navigateToSaveAddressBtn() {
		saveAddressBtn.click();
		return new AddressPage(this.driver);
	}

}
