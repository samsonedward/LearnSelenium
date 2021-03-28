package playground;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.snapshots;

public class Buttonpage extends snapshots {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Button").click();
		driver.manage().window().maximize();

		// Get the position

		WebElement getposition = driver.findElementById("position");
		// Point Class
		Point xypoint = getposition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();

		System.out.println(xvalue);
		System.out.println(yvalue);

		// background color button

		Buttonpage page = new Buttonpage();

		// Calling FullScreenshot

		page.Fullscreenshot();

		WebElement bgcolor = driver.findElementById("color");
		String color = bgcolor.getCssValue("background-color");
		System.out.println(color);

		// size of the button

		WebElement bottonsize = driver.findElementById("size");
		int height = bottonsize.getSize().getHeight();
		int width = bottonsize.getSize().getWidth();

		System.out.println(height);
		System.out.println(width);

		WebElement Homebutton = driver.findElementById("home");
		Homebutton.click();

		driver.close();

	}

	private static void Buttonpage() {
		// TODO Auto-generated method stub

	}

}
