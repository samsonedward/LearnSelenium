package TestAutomation.TestAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Check Availability").click();
		
		//driver.switchTo().alert().accept();
		
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
