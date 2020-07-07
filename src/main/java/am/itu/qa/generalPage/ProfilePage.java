package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	public final String PROFILE_PAGE = "//div[@class='account--welcome panel']";
	public final String ALLERT_CONTENT = "//div[@class='alert--content']";
	public final String WELCOME_PANEL = "//div[@class='content account--content']";
	
	@FindBy(xpath = PROFILE_PAGE)
	WebElement profilePage;

	public boolean profilePageIsDisplayed() {
		return profilePage.isDisplayed();
	}
	
	@FindBy(xpath = WELCOME_PANEL)
	WebElement welcomePanel;

	public boolean welcomePanelIsDisplayed() {
		return welcomePanel.isDisplayed();
	}

	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}
}
