package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class AddressPage extends BasePage{

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	public final String CHANGE_ADDRESS_PANNEL = "//div[@class='panel has--border is--rounded block']";
	public final String CHANGE_BTN = "//a[@class='btn is--small']";

	@FindBy(xpath = CHANGE_ADDRESS_PANNEL)
	WebElement changeAddressPannel;
	
	public boolean changeAddressPanelIsDisplayed() {
		return changeAddressPannel.isDisplayed();
	}
	
	@FindBy(xpath = CHANGE_BTN)
	WebElement changeBtn;
	
	
	public boolean changeBtnIsDisplayed() {
		return changeBtn.isDisplayed();
	}
	
	public void navigateToChangeBtn() {
		changeBtn.click();
	}
}
