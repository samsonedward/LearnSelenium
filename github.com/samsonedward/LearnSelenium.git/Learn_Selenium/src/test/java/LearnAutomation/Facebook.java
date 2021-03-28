package LearnAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	
	public static void main(String[] args) {
		
		// Start chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// load facebook
		driver.get("http://facebook.com");
		
		// wait for implicit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// maximize the window
		driver.manage().window().maximize();
		
		// Get all links
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		
		// print the number of links
		System.out.println(allLinks.size());
		
		// click the second link
		allLinks.get(1).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
