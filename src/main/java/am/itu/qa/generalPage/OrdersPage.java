package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class OrdersPage extends BasePage {

	public OrdersPage(WebDriver driver) {
		super(driver);
	}

	public final String ORDERS_PANNEL = "//div[@class='account--welcome panel']";

	@FindBy(xpath = ORDERS_PANNEL)
	WebElement ordersPannel;

	public boolean ordersPannelIsDisplayed() {
		return ordersPannel.isDisplayed();
	}
}
