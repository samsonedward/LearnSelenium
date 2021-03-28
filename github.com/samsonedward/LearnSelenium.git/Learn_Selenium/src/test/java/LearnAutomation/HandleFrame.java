package  LearnAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/selectable/");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		System.out.println(driver.findElementByXPath("//*[@id='selectable']/li[3]").getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
