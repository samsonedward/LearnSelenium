package playground;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Drop down").click();
		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElementById("dropdown1");
		dropdown1.sendKeys("UFT/QTP");

		// Select class using dropdown selection

		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		select.selectByValue("2");
		select.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		
		//Number of dropdowns.
		
		List<WebElement> listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println(size);
		
		Thread.sleep(5000);
		
		WebElement key=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select");
		key.sendKeys("Loadrunner");
		

		driver.close();

	}

}
