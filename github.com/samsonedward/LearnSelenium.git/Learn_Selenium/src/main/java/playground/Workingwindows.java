package playground;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwindows {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		
		driver.manage().window().maximize();
		String oldwindow = driver.getWindowHandle();

		WebElement Homepage = driver.findElementById("home");
		Homepage.click();

		// find the number of windows opened

		Set<String> allwindows = driver.getWindowHandles();

		for (String newwindow : allwindows) {
			driver.switchTo().window(newwindow);
		}
		driver.findElementByXPath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img").click();
		System.out.println(allwindows.size());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(oldwindow);
		
		/* Mulitple Windows opened*/
		
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button").click();
		System.out.println(allwindows.size());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Close all the child Windows*/
		
		//Take screenshot using Robot class//
				Robot robot=new Robot();
				
				/*The Dimension class encapsulates the width and height of a component (in integer precision) in a single object.*/
				Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
				
				/*Constructs a new Rectangle whose top left corner is (0, 0) and whose width and height
				 *  are specified by the Dimension argument*
				 */
				  
				  Rectangle rectangle=new Rectangle(screensize); 
				  
				 /* Creates an image containing pixels read from the screen. This image does not include the mouse cursor*/
				  BufferedImage source= robot.createScreenCapture(rectangle);
				  
				  int i=1;
				  File DestFile=new File("./snap/snap"+i+".jpeg");
				  
				  /*Rendered Images*/
				  
				  ImageIO.write(source,"jpeg", DestFile);
		
		driver.findElementById("color").click();
		Set<String> Newwindows=driver.getWindowHandles();
		for (String allwindow : Newwindows) {
			if(!allwindow.equals(allwindows));
			{
				driver.switchTo().window(allwindow);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
			
		}
		
		driver.quit();
				
		
		}

}
