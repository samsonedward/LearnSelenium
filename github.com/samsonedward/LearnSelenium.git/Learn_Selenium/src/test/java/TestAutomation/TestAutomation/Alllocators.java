package TestAutomation.TestAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alllocators {

	public static <WebElement> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initalize Webdriver
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img").click();
		
		driver.findElementById("email").sendKeys("gopinath@testleaf.com");
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input").sendKeys("Test");
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div/div/input").clear();
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// wait for implicit
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		
		//every page to get loaded 
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
		
		// Get all links
		
		List<org.openqa.selenium.WebElement> allLinks= driver.findElementsByLinkText("a");
		
		//No of Links
		
		System.out.println(allLinks.size());
		
		//Second Link
		
		allLinks.get(1).click();
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
	 
		
		 		
		
		

	}

}
