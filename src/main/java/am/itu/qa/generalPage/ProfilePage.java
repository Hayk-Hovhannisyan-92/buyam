package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	public final String ACCOUNT_PANEL = "//div[@class='account--welcome panel']";

	@FindBy(xpath = ACCOUNT_PANEL)
	WebElement accountPanel;

	public boolean profilePageIsOpen() {
		return accountPanel.isDisplayed();
	}
	
	public final String ALLERT_CONTENT = "//div[@class='alert--content']";

	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}
}
