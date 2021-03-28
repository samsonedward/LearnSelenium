package playground;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Radio Button").click();
		 
		WebElement checked=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input");
		WebElement unchecked=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input");
		Boolean btn= checked.isSelected();
		boolean button=unchecked.isSelected();
		System.out.println(btn);
		System.out.println(button);
		driver.findElementByName("age").click();
		driver.quit();
		
	}

}
