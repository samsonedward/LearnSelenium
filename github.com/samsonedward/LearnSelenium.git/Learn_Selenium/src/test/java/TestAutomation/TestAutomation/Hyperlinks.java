package TestAutomation.TestAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElementByLinkText("pages/Link").click();
	}

}
