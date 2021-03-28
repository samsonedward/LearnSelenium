package LearnAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {


	public static void main(String[] args) throws InterruptedException {

		// Start chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load W3 Schools
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		// wait for implicit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// switch to the frame
		driver.switchTo().frame("iframeResult");

		// Click Try It
		driver.findElementByXPath("/html/body/button").click();
		
		// accept the alert
		driver.switchTo().alert().accept();
		
		// Print the text
		System.out.println(driver.findElementById("demo").getText());
		

















	}

}
