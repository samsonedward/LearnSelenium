package playground;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.snapshots;

public class Hyperlinkpage extends snapshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Link.html");

		/* Find where am supposed to go without clicking me */

		WebElement wheretogo = driver.findElementByPartialLinkText("Find where");
		String where = wheretogo.getAttribute("href");
		System.out.println(where);

		/* Verify am I broken? */
		
		Hyperlinkpage broken=new Hyperlinkpage();
		broken.screenshot();
		

		WebElement brokenlink = driver.findElementByLinkText("Verify am I broken?");
		brokenlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println(title);

		}

		driver.navigate().back();

		driver.findElementByLinkText("Go to Home Page").click();

		/* How many links are available in this page? */

		List<WebElement> total = driver.findElementsByTagName("a");
		int totallinks = total.size();
		System.out.println(totallinks);
		driver.close();

	}

}
