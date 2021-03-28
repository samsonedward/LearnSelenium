package playground;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tooltip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Tool Tip").click();
		driver.manage().window().maximize();
		
		//Get the value of the given attribute of the element. Will return the current value
		
		WebElement name=driver.findElementById("age");
		String tooltipname=name.getAttribute("title");
		
		System.out.println(tooltipname);
		
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                
              //Move image file to new destination

                File DestFile=new File("snap.jpeg");

                //Copy file at destination

               FileUtils.copyFile(SrcFile, DestFile);
                //FileHandler.copy(SrcFile, DestFile);

		driver.close();
		
		
		

	}

}

 