package playground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		 driver.manage().window().maximize();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Mouse Hover").click();
		driver.manage().window().maximize();
		
		WebElement courses=driver.findElementByLinkText("TestLeaf Courses");
		 
		Actions actions = new Actions(driver);
		
		actions.moveToElement(courses).build().perform();
		driver.findElementByLinkText("WebServices").click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		driver.quit();
}
	

}
