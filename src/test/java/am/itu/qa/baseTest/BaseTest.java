package am.itu.qa.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;

	@BeforeTest
	public void openDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Buy.am");
	}
	
	@AfterTest
	public void closeDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
