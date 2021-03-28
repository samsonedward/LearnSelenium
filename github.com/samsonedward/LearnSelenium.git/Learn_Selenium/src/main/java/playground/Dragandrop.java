package playground;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
