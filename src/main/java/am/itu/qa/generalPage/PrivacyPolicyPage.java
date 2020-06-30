package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class PrivacyPolicyPage extends BasePage {

	public PrivacyPolicyPage(WebDriver driver) {
		super(driver);
	}

	public final String PRIVACY_POLICY_PAGE = "//div[@class='content--custom']";

	@FindBy(xpath = PRIVACY_POLICY_PAGE)
	WebElement privacyPolicyPage;

	public boolean privacyPolicyPageIsDisplayed() {
		return privacyPolicyPage.isDisplayed();
	}

}
