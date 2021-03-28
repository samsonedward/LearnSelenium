package TestNG;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {

	@Test
	public void frames() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Frame").click();
		driver.manage().window().maximize();

		// No Name in the frames need to get the position of the frame//

		driver.switchTo().frame(0);
		WebElement clickbtn = driver.findElementById("Click");
		clickbtn.click();
		String name = driver.findElementById("Click").getText();
		System.out.println(name);

		// Exit from Frame

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement clickbtns = driver.findElementById("Click1");
		clickbtns.click();

		driver.switchTo().defaultContent();

		// Find all the iframes tag

		List<WebElement> allframes = driver.findElementsByTagName("iframe");
		int size = allframes.size();

		System.out.println(size);

		driver.close();

	}

}
