package am.itu.qa.generalPage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public final String HOME_MAIN = "//nav[@class='navigation-main']";

	@FindBy(xpath = HOME_MAIN)
	WebElement homeMain;

	public boolean homeMainIsDisplayed() {
		return homeMain.isDisplayed();
	}

////// WAS USE IN #1-languageTest()/////
	public final String SETTINGS_BTN = "//i[@class='im-icon-settings']";
	public final String LANGUAGE_BTN = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']";
	public final String LANGUAGE_ENG = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='3']";
	public final String LANGUAGE_RUS = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='4']";
	public final String DROP_BOX_SETTINGS = "//nav[@class='shop-setings-navigation top-bar--navigation']";
	public final String LANG_RU = "//nav[@class='shop-setings-navigation top-bar--navigation']//option[@value='4' and contains(@selected,'selected')]";
	public final String LANG_EN = "//nav[@class='shop-setings-navigation top-bar--navigation']//option[@value='3' and contains(@selected,'selected')]";
	public final String LANG_HY = "//nav[@class='shop-setings-navigation top-bar--navigation']//option[@value='1' and contains(@selected,'selected')]";

	@FindBy(xpath = SETTINGS_BTN)
	WebElement settings;

	public boolean settingsElementIsDisplayed() {
		return settings.isDisplayed();
	}

	public void clickOnElementSettings() {
		settings.click();
	}

	@FindBy(xpath = LANGUAGE_BTN)
	WebElement language;

	public void clickOnElementLanguage() {
		language.click();
	}

	@FindBy(xpath = LANGUAGE_ENG)
	WebElement language_ENG;

	public HomePage clickOnElementLenguage_ENG() {
		language_ENG.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath = LANGUAGE_RUS)
	WebElement language_RUS;

	public HomePage clickOnElementLenguage_RUS() {
		language_RUS.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath = DROP_BOX_SETTINGS)
	WebElement dropBoxSettings;

	public boolean dropBoxIsDisplayed() {
		return dropBoxSettings.isDisplayed();
	}

	@FindBy(xpath = LANG_RU)
	WebElement langRU;

	public boolean langIsRussian() {
		return langRU.isDisplayed();
	}

	@FindBy(xpath = LANG_EN)
	WebElement langEN;

	public boolean langIsEnglish() {
		return langEN.isDisplayed();
	}

	@FindBy(xpath = LANG_HY)
	WebElement langHY;

	public boolean langIsArmenian() {
		return langHY.isDisplayed();
	}

///// WAS USE IN #2-registracionTest()/////
	public final String MY_ACCOUNT_BTN = "//a[@class='btn entry--link account--link']";
	public final String REGISTRACION_BTN = "//a[@class='blocked--link navigation--link navigation--register-btn']";
	public final String SALUTATION_FIELD = "//select[@class='is--required has--error]";

	@FindBy(xpath = MY_ACCOUNT_BTN)
	WebElement myAccount;

	public boolean myAccountElementIsDisplayed() {
		return myAccount.isDisplayed();
	}

	public void navigateToMyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = REGISTRACION_BTN)
	WebElement registracion;

	public boolean registracionElementIsDisplayed() {
		return registracion.isDisplayed();
	}

	public LoginPage navigateToRegistracion() {
		registracion.click();
		return new LoginPage(this.driver);
	}

	@FindBy(xpath = SALUTATION_FIELD)
	WebElement salutationField;

	public boolean salutationFieldIsDisplayed() {
		return salutationField.isDisplayed();
	}

	public void navigateToSalutationField() {
		salutationField.click();
	}

	public final String LOG_OUT_BTN = "//div[@class='account--dropdown-navigation']//span[@class='navigation--logout blocked--link']";

	@FindBy(xpath = LOG_OUT_BTN)
	WebElement logOutBtn;

	public boolean logOutBtnIsDisplayed() {
		return logOutBtn.isDisplayed();
	}

	public LogOutPage navigateToLogOutBtn() {
		logOutBtn.click();
		return new LogOutPage(this.driver);
	}

///// WAS USE IN #3-loginTest()/////
	public final String LOGIN_BTN = "//a[contains(@class,'blocked--link navigation--link navigation--signin-btn')]";
	public final String DROP_BOX_MYACCOUNT = "//div[@class='account--menu is--rounded is--personalized']";

	@FindBy(xpath = DROP_BOX_MYACCOUNT)
	WebElement dropBoxMyAccount;

	public boolean dropBoxMyAccountIsDisplayed() {
		return dropBoxMyAccount.isDisplayed();
	}

	@FindBy(xpath = LOGIN_BTN)
	WebElement login;

	public LoginPage navigateToLogin() {
		login.click();
		return new LoginPage(this.driver);
	}

///// WAS USE IN #4-forgotPasswordTest/////
	public final String ALLERT_CONTENT = "//div[@class='alert is--success is--rounded']";

	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}

/////WAS USE IN #6-shoppingCartBtnTest()/////
	public final String SHOPING_CART_BTN = "//a[@class='btn cart--link']";

	@FindBy(xpath = SHOPING_CART_BTN)
	WebElement shopingCartBtn;

	public boolean shopingCartBtnIsDisplayed() {
		return shopingCartBtn.isDisplayed();
	}

	public void shopingCartBtnClick() {
		shopingCartBtn.click();
	}

	public final String SHOPING_CART_PANEL = "//div[@class='ajax--cart']";

	@FindBy(xpath = SHOPING_CART_PANEL)
	WebElement shopingCartPanel;

	public boolean shopingCartPanelIsDisplayed() {
		return shopingCartPanel.isDisplayed();
	}

	public final String SHOPING_CART_EMPTY_MSG = "//span[@class='cart--empty-text']";

	@FindBy(xpath = SHOPING_CART_EMPTY_MSG)
	WebElement shopingCartEmptyMsg;

	public boolean emptyShopingCartIsDisplayed() {
		return shopingCartEmptyMsg.isDisplayed();
	}

	public final String CROSS_ICON = "//i[@class='icon--cross']";

	@FindBy(xpath = CROSS_ICON)
	WebElement crossIcon;

	public boolean crossIconIsDisplayed() {
		return crossIcon.isDisplayed();
	}

	public void navigateToCrossIcon() {
		crossIcon.click();
	}

///// WAS USE IN #8-searchTest/////?????
	public final String SEARCH_ICON = "//form[@class='main-search--form']//i[@class='im-icon-search']";
	public final String ALLERT_MESSAGE = "//div[@class='alert--content']";
	public final String SEARCH_INPUT_FIELD = "//input[@class='main-search--field']";

	// voronman ardyunqum nor eji headline - goyutyun unecox apranqi
	public final String EXISTING_PRODUCT_HEADLINE = "//h1[@class='search--headline']";
	// voronman ardyunqun nor eji headline - goyutyun chunecox apranqi
	public final String NON_EXISTING_PRODUCT_HEADLINE = "//div[@class='alert--content']";

	@FindBy(xpath = SEARCH_ICON)
	WebElement searchIcon;

	public void navigateToSearchIcon() {
		searchIcon.click();
	}

	@FindBy(xpath = ALLERT_MESSAGE)
	WebElement allertMessage;

	public boolean allertMessageIsDisplayed() {
		return allertMessage.isDisplayed();
	}

	@FindBy(xpath = SEARCH_INPUT_FIELD)
	WebElement searchInputField;

	public boolean searchInputFieldIsDisplayed() {
		return searchInputField.isDisplayed();
	}

	public void typeInSearhField(String name) {
		searchInputField.sendKeys(name);
	}

	@FindBy(xpath = EXISTING_PRODUCT_HEADLINE)
	WebElement existingProductHeadline;

/*	public boolean existingProductHeadlineIsDisplayed() {
		return existingProductHeadline.isDisplayed();
	}
*/
	@FindBy(xpath = NON_EXISTING_PRODUCT_HEADLINE)
	WebElement nonExistingProductHeadline;

/*	public boolean nonExistingProductHeadlineIsDisplayed() {
		try {
			return nonExistingProductHeadline.isDisplayed();
		} catch (NoSuchElementException e) {
			return nonExistingProductHeadline.isDisplayed();
		}
	*/	
		public boolean existingProductHeadlineIsDisplayed() {
			if(existingProductHeadline.isDisplayed()) {
			return existingProductHeadline.isDisplayed();
		}
			try {
				return nonExistingProductHeadline.isDisplayed();
			} catch (NoSuchElementException e) {
				return nonExistingProductHeadline.isDisplayed();
			}
	}

/////WAS USE IN #9-facebookTest/////
	public final String FACEBOOK_BTN = "//div[@class='footer--columns block-group']//a[@class='facebook-link']";

	@FindBy(xpath = FACEBOOK_BTN)
	WebElement facebookBtn;
	public WebDriver driverNewTab;

	public boolean facebookBtnIsDisplayed() {
		return facebookBtn.isDisplayed();
	}

	public FacebookPage navigateToFacebookBtn() {
		facebookBtn.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driverNewTab = driver.switchTo().window(tabs.get(1));
		return new FacebookPage(this.driverNewTab);
	}

/////WAS USE IN #10-instagramTest/////
	public final String INSTAGRAM_BTN = "//a[@class='instagram-link']";

	@FindBy(xpath = INSTAGRAM_BTN)
	WebElement instagramBtn;

	public boolean instagramBtnIsDisplayed() {
		return instagramBtn.isDisplayed();
	}

	public InstagramPage navigateToInstagramBtn() {
		instagramBtn.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new InstagramPage(this.driver);
	}

/////WAS USE IN #11-youtubeTest/////
	public final String YOUTUBE_BTN = "//footer[@class='footer-main']//a[@class='youtube-link']/i[@aria-hidden='true']";

	@FindBy(xpath = YOUTUBE_BTN)
	WebElement youtubeBtn;

	public boolean youtubeBtnIsDisplayed() {
		return youtubeBtn.isDisplayed();
	}

	public YoutubePage navigateToYoutubeBtn() {
		youtubeBtn.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new YoutubePage(this.driver);
	}

/////WAS USE IN #12-changeAddressTest/////
	public final String ADDRESS_BTN = "//a[contains(@href,'/address/index/sidebar/')]";
	public final String ACCOUNT_DROPDOWN = "//div[@class=\"account--dropdown-navigation\"]";

	@FindBy(xpath = ADDRESS_BTN)
	WebElement addressBtn;

	public boolean addressBtnIsDisplayed() {
		return addressBtn.isDisplayed();
	}

	@FindBy(xpath = ACCOUNT_DROPDOWN)
	WebElement accountDropdown;

	public boolean accountDropdownIsDisplayed() {
		return accountDropdown.isDisplayed();
	}

	public AddressPage navigateToAddressBtn() {
		addressBtn.click();
		return new AddressPage(this.driver);
	}

/////WAS USE IN #13-changeEmailTest/////
	public final String PROFILE_SETTINGS_BTN = "//div[@class='account--menu-container']//a[contains(@href,'/account/profile')]";

	@FindBy(xpath = PROFILE_SETTINGS_BTN)
	WebElement profileSettingsBtn;

	public boolean profileSettingsBtnIsDisplayed() {
		return profileSettingsBtn.isDisplayed();
	}

	public ProfileSettingsPage navigateToProfileSettingsBtn() {
		profileSettingsBtn.click();
		return new ProfileSettingsPage(this.driver);
	}

/////WAS USE IN #14-ordersTest/////
	public final String ORDERS_BTN = "//div[@class='account--menu-container']//a[contains(@href,'/account/orders') and @class='navigation--link']";

	@FindBy(xpath = ORDERS_BTN)
	WebElement ordersBtn;

	public boolean ordersBtnIsDisplayed() {
		return ordersBtn.isDisplayed();
	}

	public LoginPage navigateToOrdersBtnWithoutLogin() {
		ordersBtn.click();
		return new LoginPage(this.driver);
	}

/////WAS USE IN #15-newsletterTest/////
	public final String NEWWSLETTER_BTN = "//div[@class='account--menu-container']//a[@class='navigation--link' and contains(@href,'/newsletter')]";

	@FindBy(xpath = NEWWSLETTER_BTN)
	WebElement newsletterBtn;

	public boolean newsletterBtnIsDisplayed() {
		return newsletterBtn.isDisplayed();
	}

	public NewsletterPage navigateToNewsletterBtn() {
		newsletterBtn.click();
		return new NewsletterPage(this.driver);
	}
/////WAS USE IN #16-contactUsTest /////

	public final String CONTACT_US = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains(@href,'/contact')]";

	@FindBy(xpath = CONTACT_US)
	WebElement contactUs;

	public boolean contactUsIsDisplayed() {
		return contactUs.isDisplayed();
	}

	public ContactUsPage navigateToContactUs() {
		contactUs.click();
		return new ContactUsPage(this.driver);
	}

/////WAS USE IN #17-aboutUsTest /////
	/// russian
	public final String ABOUT_US_RU = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/ru/mer-masin']";

	@FindBy(xpath = ABOUT_US_RU)
	WebElement aboutUsRU;

	public boolean aboutUsRUIsDisplayed() {
		return aboutUsRU.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsRU() {
		aboutUsRU.click();
		return new AboutUsPage(this.driver);
	}

	/// english
	public final String ABOUT_US_EN = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/en/mer-masin']";

	@FindBy(xpath = ABOUT_US_EN)
	WebElement aboutUsEN;

	public boolean aboutUsENIsDisplayed() {
		return aboutUsEN.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsEN() {
		aboutUsEN.click();
		return new AboutUsPage(this.driver);
	}

	/// ARMENIAN
	public final String ABOUT_US_AM = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/hy/custom/index/sCustom/50']";

	@FindBy(xpath = ABOUT_US_AM)
	WebElement aboutUsAM;

	public boolean aboutUsAMIsDisplayed() {
		return aboutUsAM.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsAM() {
		aboutUsAM.click();
		return new AboutUsPage(this.driver);
	}
	///// WAS USE IN #18-deliveryAndPaymentTest /////

	public final String DELIVERY_AND_PAYMENT = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains(@href,'/contact')]";

	@FindBy(xpath = DELIVERY_AND_PAYMENT)
	WebElement deliveryAndPayment;

	public boolean deliveryAndPaymentIsDisplayed() {
		return deliveryAndPayment.isDisplayed();
	}

	public DeliveryAndPaymentPage navigateToDeliveryAndPayment() {
		deliveryAndPayment.click();
		return new DeliveryAndPaymentPage(this.driver);
	}

	///// WAS USE IN #19-googlePlayTest /////

	public final String GOOGLE_PLAY_BTN = "//footer[@class='footer-main']//div[@class='column--content']//a[@class='google-play-link']";

	@FindBy(xpath = GOOGLE_PLAY_BTN)
	WebElement googlePlayBtn;

	public boolean googlePlayBtnIsDisplayed() {
		return googlePlayBtn.isDisplayed();
	}

	public GooglePlayPage navigateToGooglePlayBtn() {
		googlePlayBtn.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new GooglePlayPage(this.driver);
	}

	///// WAS USE IN #20-appStoreTest /////

	public final String APP_STORE_BTN = "//footer[@class='footer-main']//a[@href='https://itunes.apple.com/app/buy-am/id1224598831']";

	@FindBy(xpath = APP_STORE_BTN)
	WebElement appStoreBtn;

	public boolean appStoreBtnIsDisplayed() {
		return appStoreBtn.isDisplayed();
	}

	public AppStorePage navigateToAppStoreBtn() {
		appStoreBtn.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new AppStorePage(this.driver);
	}

///// WAS USE IN #21-returnToTopTest /////
	// coment drac@ inchu chi ashxatum???
	public final String RETURN_TO_TOP_BTN = "//a[@id='return-to-top']";

	@FindBy(xpath = RETURN_TO_TOP_BTN)
	WebElement returnToTopBtn;
	
	public void ByPixel() {
		
		// WebElement element = driver.findElement(By.xpath("//a[@id='return-to-top']"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public void navigateToReturnToTopBtn() {
		returnToTopBtn.click();
	}

///// WAS USE IN #22-buyWithoutLoginTest /////?????????????

	public final String SHOPPING_CART_BTN_OF_PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	@FindBy(xpath = SHOPPING_CART_BTN_OF_PRODUCT)
	WebElement shopCartBtn;

	public boolean shopCartBtnIsDisplayed() {
		return shopCartBtn.isDisplayed();
	}

	public void navigateToShopCartBtn() {
		shopCartBtn.click();
	}

	/*public WebElement shoppingCartMassiv() {
		WebElement[] a = new WebElement[140];
		for (int i = 0; i < 140; i++) {
			a[i] = shopCartBtn;
		}
*/
	}
