package  LearnAutomation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {


	public static void main(String[] args) throws InterruptedException {

		// Start Chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load crystal cruises
		driver.get("http://legacy.crystalcruises.com/");

		// wait for implicit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// click on the guest check in
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		// find the number of windows opened

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		for (String eachWindow : allWindows) {

			System.out.println(eachWindow);
			driver.switchTo().window(eachWindow);

		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		Set<String> allWindows1 = driver.getWindowHandles();

		
		for (String eachWindow : allWindows1) {

			System.out.println(eachWindow);
			driver.switchTo().window(eachWindow);
			break;

		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		
		driver.quit();



































	}

}
