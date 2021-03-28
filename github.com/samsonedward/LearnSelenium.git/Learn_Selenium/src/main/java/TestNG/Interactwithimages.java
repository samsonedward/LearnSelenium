package TestNG;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.snapshots;

public class Interactwithimages {

	@Test
	public static void Interactwithimages()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		WebElement homepage=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img");
		homepage.click();
		
		driver.findElementByLinkText("Image").click();
		
		/* Find Broken Image */
		
		Interactwithimages shot=new Interactwithimages();
		//shot.Fullscreenshot();
		
		WebElement brokeimage=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img");
		
				if(brokeimage.getAttribute("naturalWidth").equals("0"))
				{
					System.out.println("The Image is Broken");
				}
				
				else
				{
					System.out.println("The Image is Not Broken");
				}
	}
				 

	}

