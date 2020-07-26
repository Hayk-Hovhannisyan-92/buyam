package am.itu.qa.generalPage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
	
	Scanner scaner = new Scanner(System.in);

	////HeaderMain xpaths
	public final String MY_ACCOUNT_BTN = "//a[@class='btn entry--link account--link']";
	public final String LOGIN_BTN = "//a[contains(@class,'blocked--link navigation--link navigation--signin-btn')]";
	public final String LOG_OUT_BTN = "//div[@class='account--dropdown-navigation']//span[@class='navigation--logout blocked--link']";
	public final String DROP_BOX_MYACCOUNT = "//div[@class='account--menu is--rounded is--personalized']";
	public final String SHOPING_CART_BTN = "//a[@class='btn cart--link']";
	public final String WISHLIST_BTN = "//ul[@class=\"navigation--list block-group\"]//a[@class=\"btn\"]";
	public final String ACCOUNT_DROPDOWN = "//div[@class='account--dropdown-navigation']";
	public final String ADDRESS_BTN = "//a[contains(@href,'/address/index/sidebar/')]";
	public final String PAYMENT_METHOD_BTN = "//div[@class='account--dropdown-navigation']//div[@class='account--menu-container']//a[@class='navigation--link' and contains(@href,'/account/payment')]";
		public final String MY_PROFILE_BTN_AM = "//div[@class='account--menu-container']//a[@class='navigation--link'and @title='Իմ պրոֆիլը']";
		public final String MY_PROFILE_BTN_EN = "//div[@class='account--menu-container']//a[@class='navigation--link'and @title='My profile']";
		public final String MY_PROFILE_BTN_RU = "//div[@class='account--menu-container']//a[@class='navigation--link'and @title='Мой профиль']";
	public final String PROFILE_SETTINGS_BTN = "//div[@class='account--menu-container']//a[contains(@href,'/account/profile')]";
	public final String ORDERS_BTN = "//div[@class='account--menu-container']//a[contains(@href,'/account/orders') and @class='navigation--link']";
	public final String NEWWSLETTER_BTN = "//div[@class='account--menu-container']//a[@class='navigation--link' and contains(@href,'/newsletter')]";
	public final String RETURN_HOME_PAGE_ICON = "//div[@class='logo-main block-group']//a[@class='logo--link']";
	public final String SETTINGS_BTN = "//i[@class='im-icon-settings']";
	public final String LANGUAGE_BTN = "//nav[@class='shop-setings-navigation top-bar--navigation']//div[@class='top-bar--language navigation--entry']//div[@class='select-field']//select[@class='language--select']";
	public final String LANGUAGE_ENG = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='3']";
	public final String LANGUAGE_RUS = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='4']";
	public final String DROP_BOX_SETTINGS = "//nav[@class='shop-setings-navigation top-bar--navigation']";
	public final String LANG_RU = "//nav[@class='shop-setings-navigation top-bar--navigation']//option[@value='4' and contains(@selected,'selected')]";
	public final String LANG_EN = "//nav[@class='shop-setings-navigation top-bar--navigation']//option[@value='3' and contains(@selected,'selected')]";
	public final String LANG_HY = "//nav[@class='shop-setings-navigation top-bar--navigation']//div[@class='field--select']//select[@class='language--select']//option[@value='1' and contains(@selected,'selected')]";
	public final String CURRENCY_BTN = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']";
	public final String CURRENCY_BTN_AMD = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";
	public final String CURRENCY_BTN_USD = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";
	public final String CURRENCY_BTN_RUR = "nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='currency--select']/option[@value='1']";
	public final String REGISTRACION_BTN = "//a[@class='blocked--link navigation--link navigation--register-btn']";
	public final String SEARCH_ICON = "//form[@class='main-search--form']//i[@class='im-icon-search']";
	public final String SEARCH_INPUT_FIELD = "//input[@class='main-search--field']";

	////FooterMain xpaths
	public final String FACEBOOK_BTN = "//div[@class='footer--columns block-group']//a[@class='facebook-link']";
	public final String YOUTUBE_BTN = "//footer[@class='footer-main']//a[@class='youtube-link']/i[@aria-hidden='true']";
	public final String INSTAGRAM_BTN = "//a[@class='instagram-link']";
	public final String CONTACT_US = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains(@href,'/contact')]";
	public final String PRIVACY_POLICY_BTN = "//footer[@class='footer-main']//ul[@class='navigation--list']//a[@class='navigation--link' and contains (@href,'/custom/index/sCustom/51')]";
		public final String ABOUT_US_AM = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/hy/custom/index/sCustom/50']";
		public final String ABOUT_US_EN = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/en/mer-masin']";
		public final String ABOUT_US_RU = "//div[@class='footer--column column--menu block']//li[@class='navigation--entry']/a[@href='https://buy.am/ru/mer-masin']";
	public final String DELIVERY_AND_PAYMENT = "//div[@class='footer--column column--menu block']//a[@class='navigation--link' and contains(@href,'/custom/index/sCustom/52')]";
	public final String APP_STORE_BTN = "//footer[@class='footer-main']//a[@href='https://itunes.apple.com/app/buy-am/id1224598831']";
	public final String GOOGLE_PLAY_BTN = "//footer[@class='footer-main']//div[@class='column--content']//a[@class='google-play-link']";

	////HomePage xpaths
	public final String SHOPS_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link' and contains(@href,'/shops')]";
	public final String FOOD_COURT_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link'and contains(@href,'/food-court/')]";
	public final String CARREFOUR_BTN = "//div[@class='mobile-nav-bg']//a[@class='navigation--link' and contains(@href,'/carrefour')]";
	public final String RETURN_TO_TOP_BTN = "//a[@id='return-to-top']";
	public final String HOME_PAGE = "//nav[@class='navigation-main']";
	public final String SHOPPING_CART_BTN_OF_PRODUCT = "//button[@class='buybox--button block btn is--primary is--icon-right is--center is--large']";

	////Shopping container xpaths
	public final String SHOPING_CART_PANEL = "//div[@class='ajax--cart']";
	public final String SHOPING_CART_EMPTY_MSG = "//span[@class='cart--empty-text']";
	public final String CROSS_ICON_CONTAINER = "//div[@class='close--off-canvas-content']//i[@class='icon--cross']";
	public final String CROSS_ICON_ITEM = "//div[@class='cart--item']//i[@class='icon--cross']";
	public final String CHECKOUT_BTN = "//div[@class='button--container ']//a[@class='btn is--primary button--checkout is--icon-right']";
	public final String PRODUCT_IN_SHOPPING_CART = "//div[@class='cart--item']";
	public final String BADGE_CART_QUANTITY = "//span[contains(@class,'quantity')]/text()";
	public final String QUANTITY_OF_PRODUCT = "//div[@class='quantity-price-container']//input[@class='quantity']";
	public final String PLUS_SIGN = "//div[@class='ajax--cart']//div[@class='cart--item']//a[@class='im-change-quantity-btn action-plus']//i[@class='icon--plus3']";
	public final String PRICE = "//div[@class='products-price']/span[last()]";
	public final String PRODUCT_PRICE = "//div[@class='quantity-price-container']/span";
	public final String MINUS_SIGN = "//div[@class='quantity-price-container']//i[@class='icon--minus3']";
	public final String SHIPPING_PRICE = "//div[@class='cost-price']/span[last()]";
	public final String ALL_PRODUCTS_PRICE = "//div[@class='all-price']/span[last()]";
	
	////Wishlist xpaths
	public final String WISHLIST_EMPTY_MSG = "//div[@class='empty-wishlist']";
	public final String WISHLIST_COUNT = "//span[@class='badge notes--quantity']";


	@FindBy(xpath = SETTINGS_BTN)
	WebElement settingsBtn;

	public boolean settingsBtnIsDisplayed() {
		return settingsBtn.isDisplayed();
	}

	public void navigateToSettingsBtn() {
		settingsBtn.click();
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

	public void clickOnElementLenguage_RUS() {
		language_RUS.click();
	}

	@FindBy(xpath = DROP_BOX_SETTINGS)
	WebElement dropBoxSettings;

	public boolean dropBoxSettingsIsDisplayed() {
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

	@FindBy(xpath = CURRENCY_BTN)
	WebElement currencyBtn;

	public void navigateToCurrencyBtn() {
		currencyBtn.click();
	}

	@FindBy(xpath = CURRENCY_BTN_AMD)
	WebElement currencyBtnAMD;

	public boolean currencyBtnAMDIsDisplayed() {
		currencyBtnAMD.isDisplayed();
		return currencyBtnAMD.isDisplayed();
	}

	public void navigateToCurrencyBtnAMD() {
		currencyBtnAMD.click();
	}

	@FindBy(xpath = CURRENCY_BTN_USD)
	WebElement currencyBtnUSD;

	public boolean currencyBtnUSDIsDisplayed() {
		currencyBtnUSD.isDisplayed();
		return currencyBtnUSD.isDisplayed();
	}

	public void navigateToCurrencyBtnUSD() {
		currencyBtnUSD.click();
	}

	@FindBy(xpath = CURRENCY_BTN_RUR)
	WebElement currencyBtnRUR;

	public boolean currencyBtnRURIsDisplayed() {
		currencyBtnRUR.isDisplayed();
		return currencyBtnRUR.isDisplayed();
	}

	public void navigateToCurrencyBtnRUR() {
		currencyBtnRUR.click();
	}

	@FindBy(xpath = MY_ACCOUNT_BTN)
	WebElement myAccount;

	public boolean myAccountElementIsDisplayed() {
		return myAccount.isDisplayed();
	}

	public void navigateToMyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = REGISTRACION_BTN)
	WebElement registracionBtn;

	public boolean registracionBtnIsDisplayed() {
		return registracionBtn.isDisplayed();
	}

	public LoginPage navigateToRegistracion() {
		registracionBtn.click();
		return new LoginPage(this.driver);
	}

	@FindBy(xpath = LOG_OUT_BTN)
	WebElement logOutBtn;

	public boolean logOutBtnIsDisplayed() {
		return logOutBtn.isDisplayed();
	}

	public LogOutPage navigateToLogOutBtn() {
		logOutBtn.click();
		return new LogOutPage(this.driver);
	}

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
	
	@FindBy(xpath = SHOPING_CART_BTN)
	WebElement shopingCartBtn;

	public boolean shopingCartBtnIsDisplayed() {
		return shopingCartBtn.isDisplayed();
	}

	public void navigateToShopingCartBtn() {
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

	@FindBy(xpath = CROSS_ICON_ITEM)
	WebElement crossIconItem;

	public boolean crossIconItemIsDisplayed() {
		return crossIconItem.isDisplayed();
	}

	public void navigateToCrossIconItem() {
		crossIconItem.click();
	}
	
	@FindBy(xpath = CROSS_ICON_CONTAINER)
	WebElement crossIconContainer;

	public boolean crossIconContainerIsDisplayed() {
		return crossIconContainer.isDisplayed();
	}

	public void navigateToCrossIconContainer() {
		crossIconContainer.click();
	}
	
	@FindBy(xpath = SEARCH_ICON)
	WebElement searchIcon;

	public SearchResultPage navigateToSearchIcon() {
		searchIcon.click();
		return new SearchResultPage(this.driver);
	}

	@FindBy(xpath = SEARCH_INPUT_FIELD)
	WebElement searchInputField;

	public boolean searchInputFieldIsDisplayed() {
		return searchInputField.isDisplayed();
	}

	public SearchResultPage typeInSearhField(String name) {
		searchInputField.sendKeys(name);
		return new SearchResultPage(this.driver);

	}

	@FindBy(xpath = FACEBOOK_BTN)
	WebElement facebookBtn;
	//public WebDriver driverNewTab;

	public boolean facebookBtnIsDisplayed() {
		return facebookBtn.isDisplayed();
	}

	public FacebookPage navigateToFacebookBtn() {
		//public WebDriver driverNewTab;
		facebookBtn.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver = driver.switchTo().window(tabs.get(1));
		return new FacebookPage(this.driver);
	}

	@FindBy(xpath = INSTAGRAM_BTN)
	WebElement instagramBtn;

	public boolean instagramBtnIsDisplayed() {
		return instagramBtn.isDisplayed();
	}
	
	@FindBy(css = "body")
	WebElement bodyElement;

	public InstagramPage navigateToInstagramBtn() {
		instagramBtn.click();
		bodyElement.sendKeys(Keys.CONTROL + "t");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new InstagramPage(this.driver);
	}

	@FindBy(xpath = YOUTUBE_BTN)
	WebElement youtubeBtn;

	public boolean youtubeBtnIsDisplayed() {
		return youtubeBtn.isDisplayed();
	}

	public YoutubePage navigateToYoutubeBtn() {
		youtubeBtn.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new YoutubePage(this.driver);
	}

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

	@FindBy(xpath = MY_PROFILE_BTN_AM)
	WebElement myProfileBtnAM;

	public LoginPage navigateToMyProfileBtnAM() {
		myProfileBtnAM.click();
		return new LoginPage(this.driver);
	}

	public ProfilePage navigateToMyProfilBtnAM() {
		myProfileBtnAM.click();
		return new ProfilePage(this.driver);
	}
	
	@FindBy(xpath = MY_PROFILE_BTN_EN)
	WebElement myProfileBtnEN;

	public LoginPage navigateToMyProfileBtnEN() {
		myProfileBtnEN.click();
		return new LoginPage(this.driver);
	}

	public ProfilePage navigateToMyProfilBtnEN() {
		myProfileBtnEN.click();
		return new ProfilePage(this.driver);
	}
	
	@FindBy(xpath = MY_PROFILE_BTN_RU)
	WebElement myProfileBtnRU;

	public LoginPage navigateToMyProfileBtnRU() {
		myProfileBtnRU.click();
		return new LoginPage(this.driver);
	}

	public ProfilePage navigateToMyProfilBtnRU() {
		myProfileBtnRU.click();
		return new ProfilePage(this.driver);
	}
	
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

	@FindBy(xpath = ORDERS_BTN)
	WebElement ordersBtn;

	public boolean ordersBtnIsDisplayed() {
		return ordersBtn.isDisplayed();
	}

	public LoginPage navigateToOrdersBtnWithoutLogin() {
		ordersBtn.click();
		return new LoginPage(this.driver);
	}

	@FindBy(xpath = NEWWSLETTER_BTN)
	WebElement newsletterBtn;

	public boolean newsletterBtnIsDisplayed() {
		return newsletterBtn.isDisplayed();
	}

	public NewsletterPage navigateToNewsletterBtn() {
		newsletterBtn.click();
		return new NewsletterPage(this.driver);
	}
	
	@FindBy(xpath = CONTACT_US)
	WebElement contactUs;

	public boolean contactUsIsDisplayed() {
		return contactUs.isDisplayed();
	}

	public ContactUsPage navigateToContactUs() {
		contactUs.click();
		return new ContactUsPage(this.driver);
	}

	@FindBy(xpath = PRIVACY_POLICY_BTN)
	WebElement privacyPolicyBtn;

	public boolean privacyPolicyBtnIsDisplayed() {
		return privacyPolicyBtn.isDisplayed();
	}

	public PrivacyPolicyPage navigateToPrivacyPolicyBtn() {
		privacyPolicyBtn.click();
		return new PrivacyPolicyPage(this.driver);
	}

	@FindBy(xpath = ABOUT_US_RU)
	WebElement aboutUsRU;

	public boolean aboutUsRUIsDisplayed() {
		return aboutUsRU.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsRU() {
		aboutUsRU.click();
		return new AboutUsPage(this.driver);
	}

	@FindBy(xpath = ABOUT_US_EN)
	WebElement aboutUsEN;

	public boolean aboutUsENIsDisplayed() {
		return aboutUsEN.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsEN() {
		aboutUsEN.click();
		return new AboutUsPage(this.driver);
	}

	@FindBy(xpath = ABOUT_US_AM)
	WebElement aboutUsAM;

	public boolean aboutUsAMIsDisplayed() {
		return aboutUsAM.isDisplayed();
	}

	public AboutUsPage navigateToAboutUsAM() {
		aboutUsAM.click();
		return new AboutUsPage(this.driver);
	}
	
	@FindBy(xpath = DELIVERY_AND_PAYMENT)
	WebElement deliveryAndPayment;

	public boolean deliveryAndPaymentIsDisplayed() {
		return deliveryAndPayment.isDisplayed();
	}

	public DeliveryAndPaymentPage navigateToDeliveryAndPayment() {
		deliveryAndPayment.click();
		return new DeliveryAndPaymentPage(this.driver);
	}

	@FindBy(xpath = GOOGLE_PLAY_BTN)
	WebElement googlePlayBtn;

	public boolean googlePlayBtnIsDisplayed() {
		return googlePlayBtn.isDisplayed();
	}

	public GooglePlayPage navigateToGooglePlayBtn() {
		googlePlayBtn.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new GooglePlayPage(this.driver);
	}

	@FindBy(xpath = APP_STORE_BTN)
	WebElement appStoreBtn;

	public boolean appStoreBtnIsDisplayed() {
		return appStoreBtn.isDisplayed();
	}

	public AppStorePage navigateToAppStoreBtn() {
		appStoreBtn.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		return new AppStorePage(this.driver);
	}

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

	@FindBy(xpath = SHOPPING_CART_BTN_OF_PRODUCT)
	WebElement shopCartBtnOfProduct;

	public boolean shopCartBtnOfProductIsDisplayed() {
		return shopCartBtnOfProduct.isDisplayed();
	}

	public void navigateToShopCartBtnOfProduct() {
		shopCartBtnOfProduct.click();
	}

	@FindBy(xpath = PRODUCT_IN_SHOPPING_CART)
	WebElement productInShoppingCart;

	public boolean productInShoppingCartIsDisplayed() {
		return productInShoppingCart.isDisplayed();
	}

	@FindBy(xpath = CHECKOUT_BTN)
	WebElement checkoutBtn;

	public boolean checkoutBtnIsDisplayed() {
		return checkoutBtn.isDisplayed();
	}

	public LoginPage navigateToCheckoutBtn() {
		checkoutBtn.click();
		return new LoginPage(this.driver);
	}
	
	public BuyProductPage navigateCheckoutBtn() {
		checkoutBtn.click();
		return new BuyProductPage(this.driver);
	}

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

	@FindBy(xpath = BADGE_CART_QUANTITY)
	WebElement badgeCartQuantity;

	@FindBy(xpath = PLUS_SIGN)
	WebElement plusSign;

	public void navigateToPlusSign() {
		plusSign.click();
	}

	@FindBy(xpath = QUANTITY_OF_PRODUCT)
	WebElement quantityOfProduct;
	
	public boolean quantityOfProductIsDisplayed() {
		return quantityOfProduct.isDisplayed();
	}

	public void checkProductQuantityByAdd(int n) throws InterruptedException {
		int num  = 1;
		for (int i = 1; i < n; i++) {
			navigateToPlusSign();
			num++;
			Thread.sleep(2000);
		}
		num = Integer.parseInt( quantityOfProduct.getText());
	}

	public boolean checkQuantityOfNumber(int n) {
		return Integer.parseInt(quantityOfProduct.getText()) == n;
	}

	@FindBy(xpath = MINUS_SIGN)
	WebElement minusSign;

	public void navigateToMinusSign() {
		minusSign.click();
	}

	public boolean checkProductQuantityByRemove() throws InterruptedException {
		while (Integer.parseInt( quantityOfProduct.getText()) != 0) {
			navigateToMinusSign();
			Thread.sleep(2000);
		}
		return shopingCartEmptyMsg.isDisplayed();
	}

	@FindBy(xpath = PRICE)
	WebElement price;
	
	@FindBy(xpath = PRODUCT_PRICE)
	WebElement productPrice;
	
	public boolean checkEqualityInStart() {
		return Integer.parseInt( price.getText())==Integer.parseInt( productPrice.getText());
	}

	//public boolean checkProductsPriceEquality(int n) {
	//	for (int i = 0; i < n; i++) {
	//		navigateToPlusSign();
	//		Integer.parseInt(price.getText()) = Integer.parseInt(price.getText()) + Integer.parseInt( productPrice.getText());
		//}
	//	return pricees == n * price;
	//}

	public void addProductsInShoppingCart(int n) {
		for (int i = 0; i < n; i++) {
			navigateToShopCartBtnOfProduct();
		}
	}

	//@FindBy(xpath = PRODUCT_OF_CONTAINER)
	WebElement productOfContainer;

	public void productOfContainerIsDisplayed() {
		productOfContainer.isDisplayed();
	//}
	
	//public boolean sumOfProductsInContainer() {
	//	int numberOfProductInConteiner = Integer.parseInt(productOfContainer.getText());

	//	double price = Integer.parseInt( priceOfProduct.getText());
	//	double pricees = Integer.parseInt(productsPrice.getText());
		
	//	double sum = 0;
	//	for (int i = 0; i < numberOfProductInConteiner; i++) {
	//		sum = sum + price;
	}
	//	return sum == pricees;
	//}

	@FindBy(xpath = ALL_PRODUCTS_PRICE)
	WebElement allProductsPrice;

	public void allProductsPriceIsDisplayed() {
		allProductsPrice.isDisplayed();
	}

	@FindBy(xpath = SHIPPING_PRICE)
	WebElement shippingPrice;

	public boolean shippingPriceIsDisplayed() {
		return shippingPrice.isDisplayed();
	}

	
	//public boolean checkAllPrice() {
		//double allPrice = Integer.parseInt(allProductsPrice.getText());
		//double shipping = Integer.parseInt(shippingPrice.getText());

		//double pricees = Integer.parseInt(productsPrice.getText());
		//return allPrice == shipping + pricees;
	//}

///// WAS USE IN allPriceProductTest() /////

	public void sumOfPrices() {
		shippingPrice.isDisplayed();
	}

////WAS USE IN productsInDifferentSection() /////

	@FindBy(xpath = CARREFOUR_BTN)
	WebElement carrefourBtn;

	public void carrefourBtnIsDisplayed() {
		carrefourBtn.isDisplayed();
	}

	public CarrefourPage navigateToCarrefourBtn() {
		carrefourBtn.click();
		return new CarrefourPage(this.driver);
	}

	@FindBy(xpath = FOOD_COURT_BTN)
	WebElement foodCourtBtn;

	public boolean foodCourtBtnIsDisplayed() {
		return foodCourtBtn.isDisplayed();
	}

	public FoodCourtPage navigateToFoodCourtBtn() {
		foodCourtBtn.click();
		return new FoodCourtPage(this.driver);
	}
	
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
		double shipping = Integer.parseInt(shippingPrice.getText());

		int numberOfProductInConteiner = Integer.parseInt(productOfContainer.getText());

		if (numberOfProductInConteiner == 3) {
			return shipping == 3 * 500;
		}
		return false;
	}
	
	public void typeQuantity(String quantity) {
		quantityOfProduct.sendKeys(quantity);
	}
	
	public boolean restoreMaxQuantity(int quantity) {
		if(Integer.parseInt(quantityOfProduct.getText())>100000) {
			quantity = 100000;
			return quantity == 100000;
		}
		return quantity == quantity;
	}
	
	public boolean restoreMaxKG(int quantity) {
		if(Integer.parseInt(quantityOfProduct.getText())>100) {
			quantity = 100;
			return quantity == 100;
		}
		return quantity == quantity;
	}
}