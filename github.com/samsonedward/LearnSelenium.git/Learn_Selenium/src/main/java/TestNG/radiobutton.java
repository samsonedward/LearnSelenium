package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radiobutton {

	@Test
	public void radiobutton() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Radio Button").click();

		WebElement checked = driver
				.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input");
		WebElement unchecked = driver
				.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input");
		Boolean btn = checked.isSelected();
		boolean button = unchecked.isSelected();
		System.out.println(btn);
		System.out.println(button);
		driver.findElementByName("age").click();
		driver.quit();

	}

}
