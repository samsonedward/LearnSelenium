package TestNG;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownpage {

	@Test
	public void dropdownpage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Drop down").click();
		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElementById("dropdown1");
		dropdown1.sendKeys("UFT/QTP");

		WebElement dropdown2 = driver.findElementByName("dropdown2");

		// Select class using dropdown selection

		Thread.sleep(2000);

		Select select = new Select(dropdown2);

		select.selectByValue("1");

		WebElement dropdown3 = driver.findElementById("dropdown3");
		select.selectByVisibleText("Appium");

		List<WebElement> listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println(size);

		WebElement key = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		key.sendKeys("Loadrunner");

	}

}
