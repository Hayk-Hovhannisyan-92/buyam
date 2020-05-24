package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class AboutUsPage extends BasePage{

	public AboutUsPage(WebDriver driver) {
		super(driver);
	}
	
	public final String ABOUT_US_PAGE = "//div[@class='content--wrapper']";

	@FindBy(xpath = ABOUT_US_PAGE)
	WebElement aboutUsPage;

	public boolean aboutUsPageIsDisplayed() {
		return aboutUsPage.isDisplayed();
	}

}
