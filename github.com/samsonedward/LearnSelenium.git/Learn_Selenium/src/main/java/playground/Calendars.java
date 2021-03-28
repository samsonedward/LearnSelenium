package playground;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		/*Calendar using Sendkeys*/
		
		WebElement Calendar=driver.findElementById("datepicker");
		Calendar.sendKeys("12/05/2019"+Keys.ENTER);
		Calendar.click();
		
		/*Another Method for selecting Calendar using Xpath*/
	
		//*[@id="ui-datepicker-div"]/div/a[2]
		
		//a[@title='Next']
		
		WebElement Nxtbtn=driver.findElementByXPath("//a[@title='Next']");
		Nxtbtn.click();
		
		//*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4], 
		
		//a[contains(text),'10')]
		
		WebElement Dateselected=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]"));
		Dateselected.click();
		
		driver.quit();
		
		
		

	}

}
