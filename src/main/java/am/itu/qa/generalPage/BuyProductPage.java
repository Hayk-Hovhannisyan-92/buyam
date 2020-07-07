package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class BuyProductPage extends BasePage{

	public BuyProductPage(WebDriver driver) {
		super(driver);
	}
	
	public final String PRODUCT_PANEL = "//div[@class='panel--body is--rounded']";
	public final String PRODUCT_PANEL_QUANTITY = "//input[@name=sQuantity']";
	
	@FindBy(xpath = PRODUCT_PANEL)
	WebElement productPanel;

	public boolean productPanelIsDisplayed() {
		return productPanel.isDisplayed();
	}
	
	@FindBy(xpath = PRODUCT_PANEL_QUANTITY)
	WebElement productPanelQuantity;

	public boolean productPanelQuantityIsDisplayed() {
		return productPanelQuantity.isDisplayed();
	}


}
