package am.itu.qa.generalPage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class GooglePlayPage extends BasePage {

	public GooglePlayPage(WebDriver driver) {
		super(driver);
	}

	public final String GOOGLE_PLAY_PAGE = "//div[@class='UTg3hd']";

	@FindBy(xpath = GOOGLE_PLAY_PAGE)
	WebElement googlePlayPage;

	public boolean googlePlayPageIsDisplayed() {
		return googlePlayPage.isDisplayed();
	}

	public void closeNewTab() {
		WebDriver driverNewTab;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driverNewTab = driver.switchTo().window(tabs.get(1));
		driverNewTab.close();
		driver = driver.switchTo().window(tabs.get(0));
	}

}
