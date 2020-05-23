package am.itu.qa.generalPage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class FacebookPage extends BasePage {

	public FacebookPage(WebDriver driver) {
		super(driver);
	}
	
	public final String FACEBOOK_BUYAM_PAGE = "//div[@class='_li']//div[@class='_6tay']";
	
	@FindBy(xpath = FACEBOOK_BUYAM_PAGE)
	WebElement facebookBuyamPage;
	
	public boolean facebookBuyamPageIsDisplayed() {
		return facebookBuyamPage.isDisplayed();
	}
	
	public void closeNewTab() {
	WebDriver driverNewTab;
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driverNewTab = driver.switchTo().window(tabs.get(1));
    driverNewTab.close();
   
	}
}