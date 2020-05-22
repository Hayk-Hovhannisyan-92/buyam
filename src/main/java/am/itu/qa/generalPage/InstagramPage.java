package am.itu.qa.generalPage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class InstagramPage extends BasePage {

	public InstagramPage(WebDriver driver) {
		super(driver);
	}
	
	public final String INSTAGRAM_BUYAM_PAGE = "//img[@class='_6q-tv']";
	
	@FindBy(xpath = INSTAGRAM_BUYAM_PAGE)
	WebElement instagramBuyamPage;
	
	public boolean instagramBuyamPageIsDisplayed() {
		return instagramBuyamPage.isDisplayed();
	}
	
	public void closeNewTab() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
	   
		}

}
