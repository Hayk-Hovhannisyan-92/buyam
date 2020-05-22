package am.itu.qa.generalPage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class YoutubePage extends BasePage{

	public YoutubePage(WebDriver driver) {
		super(driver);
	}
	
	public final String YOUTUBE_BUYAM_PAGE = "//div[@class='style-scope ytd-c4-tabbed-header-renderer']//yt-img-shadow[@id='avatar']";

	@FindBy(xpath = YOUTUBE_BUYAM_PAGE)
	WebElement youtubeBuyamPage;

	public boolean youtubeBuyamPageIsDisplayed() {
		return youtubeBuyamPage.isDisplayed();	
	}
	
	public void closeNewTab() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.close();
		}
}
