package LearnAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElementsByLinkText("Get-a-Quote");
		
		System.out.println(allLinks.size());
		
		System.out.println(allLinks.get(0).getText());
		
		System.out.println(allLinks.get(allLinks.size()-1).getText());
		
		
		for (WebElement eachLink : allLinks) {
			String txt = eachLink.getAttribute("href");
			System.out.println(txt);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
