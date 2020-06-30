package am.itu.qa.generalPage;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import am.itu.qa.basePage.BasePage;

public class OrdersPage extends BasePage {

	public OrdersPage(WebDriver driver) {
		super(driver);
	}

	public final String ORDERS_PANNEL = "//div[@class='account--welcome panel']";

	@FindBy(xpath = ORDERS_PANNEL)
	WebElement ordersPannel;

	public boolean ordersPannelIsDisplayed() {
		return ordersPannel.isDisplayed();
	}
	
	public final String DATE_DELIVERY = "//div[@class='date-picker__container']";

	@FindBy(xpath = DATE_DELIVERY)
	WebElement dateDelivery;

	public boolean dateDeliverylIsDisplayed() {
		return dateDelivery.isDisplayed();
	}
	
	
	public final String CURRENT_DATE = "//div[@class='datepicker--cell datepicker--cell-day -current- -selected-']";

	@FindBy(xpath = CURRENT_DATE)
	WebElement currentDate;

/*	Date date = new Date();
	date = currentDate;
	boolean a= date.before(date);
	WebDriverWait wait = new WebDriverWait(Scenario1Test.driver, 10);
	public boolean checkQlickibilityDate() {
	if(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='brandSlider']/div[1]/div/div/div/img)[50]")))==null);
	
		return a.;
	}
	*/
}
