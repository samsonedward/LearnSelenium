package playground;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class downloadfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Download Excel").click();
		Thread.sleep(3000);
		File filelocations=new File("C:\\Users\\WELCOME\\eclipse\\Downloads");
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
