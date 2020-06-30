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

////// WAS USE IN languageTest()/////
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

//////WAS USE IN currencyTest()/////

	public final String CURRENCY_BTN = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']";

	@FindBy(xpath = CURRENCY_BTN)
	WebElement currencyBtn;

	public void navigateToCurrencyBtn() {
		currencyBtn.click();
	}

	public final String CURRENCY_BTN_AMD = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";

	@FindBy(xpath = CURRENCY_BTN_AMD)
	WebElement currencyBtnAMD;

	public boolean currencyBtnAMDIsDisplayed() {
		currencyBtnAMD.isDisplayed();
		return currencyBtnAMD.isDisplayed();
	}

	public HomePage navigateToCurrencyBtnAMD() {
		currencyBtnAMD.click();
		return new HomePage(this.driver);
	}

	public final String CURRENCY_BTN_USD = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";

	@FindBy(xpath = CURRENCY_BTN_USD)
	WebElement currencyBtnUSD;

	public boolean currencyBtnUSDIsDisplayed() {
		currencyBtnUSD.isDisplayed();
		return currencyBtnUSD.isDisplayed();
	}

	public HomePage navigateToCurrencyBtnUSD() {
		currencyBtnUSD.click();
		return new HomePage(this.driver);
	}

	public final String CURRENCY_BTN_RUR = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";

	@FindBy(xpath = CURRENCY_BTN_RUR)
	WebElement currencyBtnRUR;

	public boolean currencyBtnRURIsDisplayed() {
		currencyBtnRUR.isDisplayed();
		return currencyBtnRUR.isDisplayed();
	}

	public HomePage navigateToCurrencyBtnRUR() {
		currencyBtnRUR.click();
		return new HomePage(this.driver);
	}

///// WAS USE IN registracionTest()/////
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

///// WAS USE IN loginTest()/////
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

///// WAS USE IN forgotPasswordTest/////
	public final String ALLERT_CONTENT = "//div[@class='alert is--success is--rounded']";

	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;

	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}

/////WAS USE IN shoppingCartBtnTest()/////
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

///// WAS USE IN searchTest/////?????
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

	/*
	 * public boolean existingProductHeadlineIsDisplayed() { return
	 * existingProductHeadline.isDisplayed(); }
	 */
	@FindBy(xpath = NON_EXISTING_PRODUCT_HEADLINE)
	WebElement nonExistingProductHeadline;

	/*
	 * public boolean nonExistingProductHeadlineIsDisplayed() { try { return
	 * nonExistingProductHeadline.isDisplayed(); } catch (NoSuchElementException e)
	 * { return nonExistingProductHeadline.isDisplayed(); }
	 */
	public boolean existingProductHeadlineIsDisplayed() {
		if (existingProductHeadline.isDisplayed()) {
			return existingProductHeadline.isDisplayed();
		}
		try {
			return nonExistingProductHeadline.isDisplayed();
		} catch (NoSuchElementException e) {
			return nonExistingProductHeadline.isDisplayed();
		}
	}

/////WAS USE IN facebookTest/////
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

/////WAS USE IN instagramTest/////
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

/////WAS USE IN youtubeTest/////
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

/////WAS USE IN changeAddressTest/////
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

	public LoginPage navigateToAddresBtn() {
		addressBtn.click();
		return new LoginPage(this.driver);
	}

///// WAS USE IN paymentMethodTest /////

	public final String PAYMENT_METHOD_BTN = "//div[@class='account--dropdown-navigation']//div[@class='account--menu-container']//a[@class='navigation--link' and contains(@href,'/account/payment')]";

	@FindBy(xpath = PAYMENT_METHOD_BTN)
	WebElement paymentMethodBtn;

	public LoginPage navigateToPaymentMethodBtn() {
		paymentMethodBtn.click();
		return new LoginPage(this.driver);
	}

	public PaymentMethodPage navigateToPaymentMetodBtn() {
		paymentMethodBtn.click();
		return new PaymentMethodPage(this.driver);
	}

///// WAS USE IN myProfileTest /////

	public final String MY_PROFILE_BTN = "//div[@class='account--dropdown-navigation']//div[@class='account--menu-container']//a[@class='navigation--link' and contains(@href,'/account/payment')]";

	@FindBy(xpath = MY_PROFILE_BTN)
	WebElement myProfileBtn;

	public LoginPage navigateToMyProfileBtn() {
		myProfileBtn.click();
		return new LoginPage(this.driver);
	}

	public ProfilePage navigateToMyProfilBtn() {
		paymentMethodBtn.click();
		return new ProfilePage(this.driver);
	}

/////WAS USE IN changeEmailTest/////
	public final String PROFILE_SETTINGS_BTN = "//div[@class='account--menu-container']//a[contains(@href,'/account/profile')]";

	@FindBy(xpath = PROFILE_SETTINGS_BTN)
	WebElement profileSettingsBtn;

	public boolean profileSettingsBtnIsDisplayed() {
		return profileSettingsBtn.isDisplayed();
	}

	public ProfileSettingsPage navigateToProfileSettingBtn() {
		profileSettingsBtn.click();
		return new ProfileSettingsPage(this.driver);
	}

	public LoginPage navigateToProfileSettingsBtn() {
		profileSettingsBtn.click();
		return new LoginPage(this.driver);
	}

/////WAS USE IN ordersTest/////
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

/////WAS USE IN newsletterTest/////
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
/////WAS USE IN contactUsTest /////

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

/////WAS USE IN privaciPolicyTest /////

	public final String PRIVACY_POLICY_BTN = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains(@href,'/contact')]";

	@FindBy(xpath = PRIVACY_POLICY_BTN)
	WebElement privacyPolicyBtn;

	public boolean privacyPolicyBtnIsDisplayed() {
		return privacyPolicyBtn.isDisplayed();
	}

	public PrivacyPolicyPage navigateToPrivacyPolicyBtn() {
		privacyPolicyBtn.click();
		return new PrivacyPolicyPage(this.driver);
	}

/////WAS USE IN aboutUsTest /////
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
	///// WAS USE IN deliveryAndPaymentTest /////

	public final String DELIVERY_AND_PAYMENT = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains (@href,'/araqum-ev-vcharum')]";

	@FindBy(xpath = DELIVERY_AND_PAYMENT)
	WebElement deliveryAndPayment;

	public boolean deliveryAndPaymentIsDisplayed() {
		return deliveryAndPayment.isDisplayed();
	}

	public DeliveryAndPaymentPage navigateToDeliveryAndPayment() {
		deliveryAndPayment.click();
		return new DeliveryAndPaymentPage(this.driver);
	}

	///// WAS USE IN googlePlayTest /////

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

	///// WAS USE IN appStoreTest /////

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

///// WAS USE IN returnToTopTest /////
	// coment drac@ inchu chi ashxatum???
	public final String RETURN_TO_TOP_BTN = "//a[@id='return-to-top']";

	@FindBy(xpath = RETURN_TO_TOP_BTN)
	WebElement returnToTopBtn;

	public void ByPixel() {

		// WebElement element =
		// driver.findElement(By.xpath("//a[@id='return-to-top']"));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", element);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	public void navigateToReturnToTopBtn() {
		returnToTopBtn.click();
	}

///// WAS USE IN buyWithoutLoginTest /////?????????????

	public final String SHOPPING_CART_BTN_OF_PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	@FindBy(xpath = SHOPPING_CART_BTN_OF_PRODUCT)
	WebElement shopCartBtnOfProduct;

	public boolean shopCartBtnIsDisplayed() {
		return shopCartBtnOfProduct.isDisplayed();
	}

	public void navigateToShopCartBtnOfProduct() {
		shopCartBtnOfProduct.click();
	}

	public final String PRODUCT_IN_SHOPPING_CART = "//div[@class='is--rounded panel-supplier']";

	@FindBy(xpath = PRODUCT_IN_SHOPPING_CART)
	WebElement productInShoppingCart;

	public boolean productInShoppingCartIsDisplayed() {
		return productInShoppingCart.isDisplayed();
	}
	// a[@class="btn is--primary button--checkout is--icon-right"]

	public final String CHECKOUT_BTN = "//div[@class='button--container ']//a[@class='btn is--primary button--checkout is--icon-right']";

	@FindBy(xpath = CHECKOUT_BTN)
	WebElement checkoutBtn;

	public boolean checkoutBtnIsDisplayed() {
		return checkoutBtn.isDisplayed();
	}

	public LoginPage navigateToCheckoutBtn() {
		checkoutBtn.click();
		return new LoginPage(this.driver);
	}

/////WAS USE IN  returnHomeBtnTest/////
	public final String RETURN_HOME_PAGE_ICON = "//div[@class='logo-main block-group']//a[@class='logo--link']";
	public final String HOME_PAGE = "//nav[@class='navigation-main']";

	@FindBy(xpath = RETURN_HOME_PAGE_ICON)
	WebElement returnHomePageIcon;

	public boolean returnHomePageIconIsDisplayed() {
		return returnHomePageIcon.isDisplayed();
	}

	public HomePage navigateToReturnHomePage() {
		returnHomePageIcon.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath = HOME_PAGE)
	WebElement homePage;

	public boolean homePageIsDisplayed() {
		return homePage.isDisplayed();
	}

///// WAS USE IN wishlistBtnTest()/////
	public final String WISHLIST_BTN = "//ul[@class=\"navigation--list block-group\"]//a[@class=\"btn\"]";
	public final String WISHLIST_EMPTY_MSG = "//div[@class='empty-wishlist']";
	public final String WISHLIST_COUNT = "//span[@class='badge notes--quantity']";

	@FindBy(xpath = WISHLIST_BTN)
	WebElement wishlistBtn;

	public boolean wishlistBtnIsDisplayed() {
		return wishlistBtn.isDisplayed();
	}

	public void navigateToWishlistBtn() {
		wishlistBtn.click();
	}

	public LoginPage navigateToWishlistButton() {
		wishlistBtn.click();
		return new LoginPage(this.driver);
	}

	@FindBy(xpath = WISHLIST_EMPTY_MSG)
	WebElement wishlistEmptyMsg;

	public boolean emptyWishlistIsDisplayed() {
		return wishlistEmptyMsg.isDisplayed();
	}

///// WAS USE IN ordersTest()/////
	public final String SHOPING_CART_BUTTON = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	@FindBy(xpath = SHOPING_CART_BUTTON)
	WebElement shopingCartButton;

	public int navigateToShopingCartButton() {
		shopingCartButton.click();
		return Integer.parseInt(driver.findElement((By) badgeCartQuantity).getText());
	}

	public final String BADGE_CART_QUANTITY = "//span[contains(@class,'quantity')]/text()";

	@FindBy(xpath = BADGE_CART_QUANTITY)
	WebElement badgeCartQuantity;

	int quantity = Integer.parseInt(driver.findElement((By) badgeCartQuantity).getText());

///// WAS USE IN addProductQuantityTest() /////

	public final String PLUS_SIGN = "//div[@class='ajax--cart']//div[@class='cart--item']//a[@class='im-change-quantity-btn action-plus']//i[@class='icon--plus3']";

	@FindBy(xpath = PLUS_SIGN)
	WebElement plusSign;

	public void navigateToPlusSign() {
		plusSign.click();
	}

	public final String QUANTITY_OF_PRODUCT = "//div[@class='quantity-price-container']//input[@value='1']";

	@FindBy(xpath = QUANTITY_OF_PRODUCT)
	WebElement quantityOfProduct;

	public void checkProductQuantityByAdd(int n) throws InterruptedException {
		// int k = Integer.parseInt(driver.findElement((By)
		// quantityOfNumber).getText());
		int k = 1;
		for (int i = 1; i < n; i++) {
			navigateToPlusSign();
			k++;
			Thread.sleep(2000);

		}
		k = Integer.parseInt(driver.findElement((By) quantityOfProduct).getText());
	}

	public boolean checkQuantityOfNumber(int n) {
		return Integer.parseInt(driver.findElement((By) quantityOfProduct).getText()) == n;
	}

///// WAS USE IN removeProductQuantityTest() /////

	public final String MINUS_SIGN = "//div[@class='quantity-price-container']//i[@class='icon--minus3']";

	@FindBy(xpath = MINUS_SIGN)
	WebElement minusSign;

	public void navigateToMinusSign() {
		minusSign.click();
	}

	public boolean checkProductQuantityByRemove() throws InterruptedException {
		while (Integer.parseInt(driver.findElement((By) quantityOfProduct).getText()) != 0) {
			navigateToMinusSign();
			Thread.sleep(2000);
		}
		return shopingCartEmptyMsg.isDisplayed();
	}

///// WAS USE IN priceProductTest() /////

	public final String PRICE_OF_PRODUCT = "//div[@class='quantity-price-container']/span";

	@FindBy(xpath = PRICE_OF_PRODUCT)
	WebElement priceOfProduct;

	public void priceOfProductIsDisplayed() {
		priceOfProduct.isDisplayed();
	}

	public final String PRODUCTS_PRICE = "//div[@class='products-price']/span[last()]";

	@FindBy(xpath = PRODUCTS_PRICE)
	WebElement productsPrice;

	public void productsPriceIsDisplayed() {
		productsPrice.isDisplayed();
	}

	// convert type WebElement to int
	double price = Integer.parseInt(driver.findElement((By) priceOfProduct).getText());
	double pricees = Integer.parseInt(driver.findElement((By) productsPrice).getText());

	public boolean checkEqualityInStart() {
		return pricees == price;
	}

	public boolean checkProductsPriceEquality(int n) {
		for (int i = 0; i < n; i++) {
			navigateToPlusSign();
			pricees = pricees + price;
		}
		return pricees == n * price;
	}

///// WAS USE IN priceDifferentProduct() /////

	public void addProductsInShoppingCart(int n) {
		for (int i = 0; i < n; i++) {
			navigateToShopCartBtnOfProduct();
		}
	}

	public final String PRODUCT_OF_CONTAINER = "//div[@class='cart--item']";

	@FindBy(xpath = PRODUCT_OF_CONTAINER)
	WebElement productOfContainer;

	public void productOfContainerIsDisplayed() {
		productOfContainer.isDisplayed();
	}

	// convert type WebElement to int
	int numberOfProductInConteiner = Integer.parseInt(driver.findElement((By) productOfContainer).getText());

	public boolean sumOfProductsInContainer() {
		double sum = 0;
		for (int i = 0; i < numberOfProductInConteiner; i++) {
			sum = sum + price;
		}
		return sum == pricees;
	}

///// WAS USE IN allPriceProductTest() /////

	public final String ALL_PRODUCTS_PRICE = "//div[@class='all-price']/span[last()]";

	@FindBy(xpath = ALL_PRODUCTS_PRICE)
	WebElement allProductsPrice;

	public void allProductsPriceIsDisplayed() {
		allProductsPrice.isDisplayed();
	}

	public final String SHIPPING_PRICE = "//div[@class='cost-price']/span[last()]";

	@FindBy(xpath = SHIPPING_PRICE)
	WebElement shippingPrice;

	public boolean shippingPriceIsDisplayed() {
		return shippingPrice.isDisplayed();
	}

	double allPrice = Integer.parseInt(driver.findElement((By) allProductsPrice).getText());
	double shipping = Integer.parseInt(driver.findElement((By) shippingPrice).getText());

	public boolean checkAllPrice() {
		return allPrice == shipping + pricees;
	}

///// WAS USE IN allPriceProductTest() /////

	public void sumOfPrices() {
		shippingPrice.isDisplayed();
	}

////WAS USE IN productsInDifferentSection() /////

	public final String CARREFOUR_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link' and contains(@href,'/carrefour')]";

	@FindBy(xpath = CARREFOUR_BTN)
	WebElement carrefourBtn;

	public void carrefourBtnIsDisplayed() {
		carrefourBtn.isDisplayed();
	}

	public CarrefourPage navigateToCarrefourBtn() {
		carrefourBtn.click();
		return new CarrefourPage(this.driver);
	}

	public final String FOOD_COURT_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link'and contains(@href,'/food-court/')]";

	@FindBy(xpath = FOOD_COURT_BTN)
	WebElement foodCourtBtn;

	public boolean foodCourtBtnIsDisplayed() {
		return foodCourtBtn.isDisplayed();
	}

	public FoodCourtPage navigateToFoodCourtBtn() {
		foodCourtBtn.click();
		return new FoodCourtPage(this.driver);
	}

	public final String SHOPS_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link' and contains(@href,'/shops')]";

	@FindBy(xpath = SHOPS_BTN)
	WebElement shopsBtn;

	public boolean shopsBtnIsDisplayed() {
		return shopsBtn.isDisplayed();
	}

	public ShopsPage navigateToShopsBtn() {
		shopsBtn.click();
		return new ShopsPage(this.driver);
	}

	public boolean checkShippingPrice() {
		if (numberOfProductInConteiner == 3) {
			return shipping == 3 * 500;
		}
		return false;
	}
	
////WAS USE IN maxQuantityPurchasedProductTest() /////

	public final String QUANTITY_FIELD = "//input[@class='quantity']";

	@FindBy(xpath = QUANTITY_FIELD)
	WebElement quantityField;

	public void quantityFieldIsDisplayed() {
		quantityField.isDisplayed();
	}
	
	public void typeQuantity(String quantity) {
		quantityField.sendKeys(quantity);
	}
	
	public boolean restoreMaxQuntity(String quantity) {
		if(Integer.parseInt(quantity)>100000) {
			quantity = "100000";
			return quantity == "100000";
		}
		quantityField.sendKeys(quantity);
		return quantity == quantity;
	}
	
////WAS USE IN maxKGPurchasedProductTest() /////

	public final String QUANTITY_FIELD = "//input[@class='quantity']";

	@FindBy(xpath = QUANTITY_FIELD)
	WebElement quantityField;

	public void quantityFieldIsDisplayed() {
		quantityField.isDisplayed();
	}
	
	public void typeQuantity(String quantity) {
		quantityField.sendKeys(quantity);
	}
	
	public boolean restoreMaxQuntity(String quantity) {
		if(Integer.parseInt(quantity)>100000) {
			quantity = "100000";
			return quantity == "100000";
		}
		quantityField.sendKeys(quantity);
		return quantity == quantity;
	}
}