package TestNG;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autocompletion {

	@Test
	public void Autocompletion() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/autoComplete.html");

		driver.manage().window().maximize();

		WebElement input = driver.findElementById("tags");
		input.sendKeys("s");

		List<WebElement> listoptions = driver.findElementsByXPath("//*[@id=\'ui-id-1\']/li");

		for (WebElement webElement : listoptions) {
			webElement.getText().equals("Web Services");
			webElement.click();

		}

		driver.close();

	}

}
