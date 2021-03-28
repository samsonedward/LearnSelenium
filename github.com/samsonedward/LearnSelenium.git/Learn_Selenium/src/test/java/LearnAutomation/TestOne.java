package LearnAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img").click();
		
		driver.findElementById("email").sendKeys("gopinath@testleaf.com");
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/input").sendKeys("Test");
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div/div/input").clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
