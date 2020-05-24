package am.itu.qa.generalPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	public final String ACCOUNT_PANEL = "//div[@class='account--welcome panel']";

///// WAS USE IN #5-wishlistBtnTest()/////
	public final String WISHLIST_BTN = "//ul[@class=\"navigation--list block-group\"]//a[@class=\"btn\"]";
	public final String WISHLIST_EMPTY_MSG = "//div[@class='empty-wishlist']";
	public final String WISHLIST_COUNT = "//span[@class='badge notes--quantity']";

	@FindBy(xpath = WISHLIST_BTN)
	WebElement wishlistBtn;

	public boolean wishlistBtnIsDisplayed() {
		return wishlistBtn.isDisplayed();
	}

	public void wishlistBtnClick() {
		wishlistBtn.click();
	}

	@FindBy(xpath = WISHLIST_EMPTY_MSG)
	WebElement wishlistEmptyMsg;

	public boolean emptyWishlistIsDisplayed() {
		return wishlistEmptyMsg.isDisplayed();
	}

	@FindBy(xpath = ACCOUNT_PANEL)
	WebElement accountPanel;

	public boolean profilePageIsOpen() {
		return accountPanel.isDisplayed();
	}

/////WAS USE IN #6-shoppingCartBtnTest()/////
	public final String SHOPING_CART_BTN = "//a[@class='btn cart--link']";
	public final String SHOPING_CART_PANEL = "//div[@class='ajax--cart']";
	public final String SHOPING_CART_EMPTY_MSG = "//span[@class='cart--empty-text']";

	@FindBy(xpath = SHOPING_CART_BTN)
	WebElement shopingCartBtn;

	public boolean shopingCartBtnIsDisplayed() {
		return shopingCartBtn.isDisplayed();
	}

	public void shopingCartBtnClick() {
		shopingCartBtn.click();
	}

	@FindBy(xpath = SHOPING_CART_PANEL)
	WebElement shopingCartPanel;

	public boolean shopingCartPanelIsDisplayed() {
		return shopingCartPanel.isDisplayed();
	}

	@FindBy(xpath = SHOPING_CART_EMPTY_MSG)
	WebElement shopingCartEmptyMsg;

	public boolean emptyShopingCartIsDisplayed() {
		return shopingCartEmptyMsg.isDisplayed();
	}

/////WAS USE IN  #7-returnHomeBtnTest/////
	public final String RETURN_HOME_PAGE_ICON = "//div[@class='logo-main block-group']//a[@class='logo--link']";
	public final String HOME_PAGE = "//nav[@class='navigation-main']";

	@FindBy(xpath = RETURN_HOME_PAGE_ICON)
	WebElement returnHomePageIcon;

	public boolean returnHomePageIconIsDisplayed() {
		return returnHomePageIcon.isDisplayed();
	}

	public HomePage returnHomePage() {
		returnHomePageIcon.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath = HOME_PAGE)
	WebElement homePage;

	public boolean homePageIsDisplayed() {
		return homePage.isDisplayed();
	}
}
