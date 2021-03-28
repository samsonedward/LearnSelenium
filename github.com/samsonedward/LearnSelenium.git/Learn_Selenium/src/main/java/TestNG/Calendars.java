package TestNG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendars {

	@Test
	public void calendarusingsendkeys() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();

		/* Calendar using Sendkeys */

		WebElement Calendar = driver.findElementById("datepicker");
		Calendar.sendKeys("28/03/2021" + Keys.ENTER);
		Calendar.click();
	 	driver.quit();

	}

}
