package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	//	driver.get("https://developer.salesforce.com/en/");
		driver.get("http://testleaf.herokuapp.com/");
		
		/// Find the title of the browser
				System.out.println("Title : " + driver.getTitle());
//				Can compare using 
				if (driver.getTitle().contains("TestLeaf - Selenium playground")) {
					System.out.println("VERIFIED SUCCESSFULLY : Title contains 'TestLeaf - Selenium Playground'");
				}

				// Find the current URL
				System.out.println("Current URL : " + driver.getCurrentUrl());

				// Find background color of testleaf.herokuapp login element
				System.out.println("BG Color : " + driver.findElementByTagName("ul").getCssValue("background-color"));

				// Find the destination URL
				System.out.println("Destination link : "+driver.findElementByTagName("a").getAttribute("href"));
								
				// Get the tag name of the element
				System.out.println("Tag name of Paticular Element : " +driver.findElementByClassName("wp-categories-title").getTagName());
				
				//get location
				System.out.println(driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[2]/a").getLocation().getX());
				System.out.println(driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[2]/a").getLocation().getY());
				
				//isDisplayed
				
			}


}

