package playground;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utils.snapshots;

public class Selectable extends snapshots{

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/selectable.html");
		
		/* List all the web Elements size*/
		
		List<WebElement> Selectable=driver.findElementsByXPath("//*[@id='selectable']/li");
		int listsize=Selectable.size();
		System.out.println(listsize);
		
		/*Take Away First Options*/
		
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(Selectable.get(0))
		.click(Selectable.get(1))
		.click(Selectable.get(2))
		.build().perform();
		
		// Calling FullScreenshot 
		
		Selectable page=new Selectable();
		page.Fullscreenshot();
		
		/*Take Away Second Options*/
		
		Actions actions1= new Actions(driver);
		actions1.clickAndHold(Selectable.get(5));
		actions1.clickAndHold(Selectable.get(6));
		actions1.build().perform(); 
		
		/*Take Away Third  Options*/
		
			
		driver.quit();
	}

}
