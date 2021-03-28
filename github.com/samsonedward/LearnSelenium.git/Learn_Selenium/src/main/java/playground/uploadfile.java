package playground;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public   void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/upload.html");
		//driver.findElementByLinkText("Upload Files").click();
		driver.manage().window().maximize();

		WebElement button =driver.findElementByXPath("//*[@id=\"mydiv\"]/input");
		button.click();

		// Created string for copying the location using stringselection class in
		// java.awt.datatransfer.StringSelection;

		String file = "C:\\Users\\WELCOME\\Documents\\Testleaf.docx";
		StringSelection selection = new StringSelection(file);

		// Returns:all of the AWTEventListeners or an empty array if no listeners are
		// currently registered
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Creating Robot class import java.awt.Robot;

		Robot robot = new Robot();

		// Initalize Virtual Keyboard//
		
		robot.keyPress(KeyEvent.VK_CONTROL);

		/*
		 * Presses a given key. The key should be released using the keyRelease method.
		 * Key codes that have more than one physical key associated with them (e.g.
		 * KeyEvent.VK_SHIFT could mean either the left or right shift key) will map to
		 * the left key.
		 */
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		/*
		 * Releases a given key. Key codes that have more than one physical key
		 * associated with them (e.g. KeyEvent.VK_SHIFT could mean either the left or
		 * right shift key) will map to the left key.
		 */

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();

		
	}

}
