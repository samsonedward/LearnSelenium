package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {

	@Test
	public void checkbox() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/87/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		WebElement check=driver.findElementByLinkText("Checkbox");
		check.click();
		
		
		WebElement Java=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input");
		Java.click();
		
		WebElement selenium=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/input");
		boolean seleniumcheckbox=selenium.isSelected();
		System.out.println(seleniumcheckbox);
	
		WebElement first=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input");
		if(first.isSelected())
		{
			first.click();
		}
		WebElement second=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input");
		if(second.isSelected())
		{
			second.click();
		}
		
		driver.close();
		
		
	}
	
	
		

}
 