package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragandrop {

	@Test
	public void Dragandrop() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Droppable").click();
		driver.manage().window().maximize();

		WebElement from = driver.findElementById("draggable");
		WebElement to = driver.findElementById("droppable");

		Actions actions = new Actions(driver);
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();

		// another way

		actions.dragAndDrop(to,from).build().perform();

		driver.close();

	}

}
