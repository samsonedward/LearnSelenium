package TestNG;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadfiles {

	@Test
	public void downloadfiles() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Download Excel").click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File filelocations=new File("C:\\Users\\insaedw\\Downloads");
		File[] totalfiles=filelocations.listFiles();
		
		for (File file : totalfiles) {
			file.getName().equals("testleaf.xlsx");
			{
				System.out.println(" File Downloaded");
				break;
			}
			}
		driver.quit();

	}

}
