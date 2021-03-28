package playground;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.model.Screencast;
import Utils.snapshots;

//import wrappers.GenericWrappers;

public class Edit extends snapshots{
	
	

	public static void main(String[] args) throws AWTException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Edit.html");
		//driver.findElementByLinkText("Edit");
		
		WebElement email=driver.findElementById("email");
		email.sendKeys("duck@gmail.com");
			
		WebElement append=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		append.sendKeys("Welcome to Selenium");
		
		WebElement gettextbox=driver.findElementByName("username");
		String value=gettextbox.getAttribute("value");
		System.out.println("value");
		
		WebElement clearfield=driver.findElementByName("username");
		clearfield.clear();
		
		WebElement disablebox=driver.findElementByXPath("/html/body/div/div/div[3]/section/div[5]/div/div/input");
		boolean enable=disablebox.isEnabled();
		System.out.println("enable");
		
		Edit screen=new Edit();
		screen.Fullscreenshot();
		
		driver.close();
		

	}

}
