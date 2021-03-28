package playground;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		
		WebElement dragme=driver.findElementByXPath("//*[@id=\"draggable\"]");
		dragme.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(dragme);
		//actions.clickAndHold().dragAndDrop(dragme, null);
		

	}

}
