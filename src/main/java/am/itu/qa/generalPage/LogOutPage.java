package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class LogOutPage extends BasePage {

	public LogOutPage(WebDriver driver) {
		super(driver);
	}

	public final String LOG_OUT_PANNEL = "//div[@class='account--logout account--content content is--wide']";

	@FindBy(xpath = LOG_OUT_PANNEL)
	WebElement logOutPannel;

	public boolean logOutPannelIsDisplayed() {
		return logOutPannel.isDisplayed();
	}

}
