package am.itu.qa.generalPage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class AppStorePage extends BasePage {

	public AppStorePage(WebDriver driver) {
		super(driver);
	}

	public final String APP_STORE_PAGE = "//div[@class='ember-view']//section[@class='l-content-width section section--hero product-hero ember-view']";

	@FindBy(xpath = APP_STORE_PAGE)
	WebElement appStorePage;

	public boolean appStorePageIsDisplayed() {
		return appStorePage.isDisplayed();
	}

	public void closeNewTab() {
		WebDriver driverNewTab;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driverNewTab = driver.switchTo().window(tabs.get(1));
		driverNewTab.close();
	}

}
