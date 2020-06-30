package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class AddressPage extends BasePage {

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	//div[@class="account--welcome"]
	public final String ADDRESS_PAGE = "div[@class='account--welcome']";
	
	@FindBy(xpath = ADDRESS_PAGE)
	WebElement addressPage;

	public boolean addressPagelIsDisplayed() {
		return addressPage.isDisplayed();
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

	public ChangeAddressPage navigateToChangeBtn() {
		changeBtn.click();
		return new ChangeAddressPage(this.driver);
	}

	public final String ALLERT_CONTENT = "//div[@class='alert--content']";

	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}
}
