package am.itu.qa.generalPage;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.basePage.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
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
	public final String ALLERT_CONTENT = "//div[@class='alert--content;]";
	
	@FindBy(xpath = ALLERT_CONTENT)
	WebElement allertContent;
	
	public boolean allertContentIsDisplayed() {
		return allertContent.isDisplayed();
	}
	
///// WAS USE IN #8-searchTest/////
	public final String SEARCH_ICON = "//form[@class='main-search--form']//i[@class='im-icon-search']";
	public final String ALLERT_MESSAGE = "//div[@class='alert--content']";
	public final String SEARCH_INPUT_FIELD = "//input[@class='main-search--field']";

	// voronman ardyunqum nor eji headline - goyutyun unecox apranqi
	public final String SEARCH_HEADLINE_TRUE = "//h1[@class='search--headline']";
	// voronman ardyunqun nor eji headline - goyutyun chunecox apranqi
	public final String SEARCH_HEADLINE_FALSE = "//div[@class='alert--content']";

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

	@FindBy(xpath = SEARCH_HEADLINE_TRUE)
	WebElement searchHeadlineTrue;

	@FindBy(xpath = SEARCH_HEADLINE_FALSE)
	WebElement searchHeadlineFalse;

	// ete erevum e 'Ձեր որոնման արդյունքում գտնվել են հետևյալ ապրանքները:'
	// veradarcnum e true hakarak depqum eli petq e veradarcni true qani vor
	// ete chi erevum 'Ձեր որոնման արդյունքում գտնվել են հետևյալ ապրանքները:'
	// apa petq e ereva 'Ձեր որոնմանը համապատասխանող ապրանքներ չկան'
	public boolean searchHeadlineIsDisplayed() {
		if(searchHeadlineTrue.isDisplayed()) {
			return searchHeadlineTrue.isDisplayed();
		}else
		if(searchHeadlineFalse.isDisplayed()) {
			return searchHeadlineFalse.isDisplayed();
		}
		return false;
	}
/////WAS USE IN #9-facebookTest/////
	public final String FACEBOOK_BTN = "//div[@class='footer--columns block-group']//a[@class='facebook-link']";
	
	@FindBy(xpath = FACEBOOK_BTN)
	WebElement facebookBtn;
	protected WebDriver driverNewTab;
	
	public boolean facebookBtnIsDisplayed() {
		return facebookBtn.isDisplayed();
	}
	
	public FacebookPage navigateToFacebookBtn() {
		facebookBtn.click();
		return new FacebookPage(this.driver);
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
		return new YoutubePage(this.driver);
	}
	
/////WAS USE IN #12-changeAddressTest/////
	public final String ADDRESS_BTN = "//div[@class='account--dropdown-navigation']//a[@title='Addresses']";
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
	public final String PROFILE_SETTINGS_BTN = "//div[@class='account--dropdown-navigation']//a[@title='Profile settings']";
	
	@FindBy(xpath = PROFILE_SETTINGS_BTN)
	WebElement profileSettingsBtn;
	
	public boolean profileSettingsBtnIsDisplayed() {
		return profileSettingsBtn.isDisplayed();
	}
	
	public ProfileSettingsPage navigateToProfileSettingsBtn() {
		profileSettingsBtn.click();
		return new ProfileSettingsPage(this.driver);
	}
}
