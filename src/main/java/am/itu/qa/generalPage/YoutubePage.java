package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class YoutubePage extends BasePage{

	public YoutubePage(WebDriver driver) {
		super(driver);
	}
	
	public final String YOUTUBE_BUYAM_PAGE = "//div[@class='style-scope ytd-c4-tabbed-header-renderer' and contains(@id,'channel-header-container')]//img[@class='style-scope yt-img-shadow']";

	@FindBy(xpath = YOUTUBE_BUYAM_PAGE)
	WebElement youtubeBuyamPage;
	
	public boolean youtubeBuyamPageIsDisplayed() {
		return youtubeBuyamPage.isDisplayed();
	}
	
	public void closeTab() {
		driver.close();		
	}
}
