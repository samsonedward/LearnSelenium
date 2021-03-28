package TestAutomation.TestAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	 
		
	driver.get("http://popuptest.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        String parentWindow = driver.getWindowHandle();
//        System.out.println("Parent Window Session ID :" +parentWindow);
//        
//        driver.findElementByLinkText("Multi-PopUp Test #2").click();
		
		Set<String> windowIDs = driver.getWindowHandles();
        Thread.sleep(2000);

        System.out.println("number of windows opened --> "+ windowIDs.size());

        Iterator<String> it = windowIDs.iterator();
        String parent  = it.next();

        // child pop 1
        String child  = it.next();
        driver.switchTo().window(child);
        driver.manage().window().maximize();

        WebElement attri = driver.findElement(By.xpath("//body[@bgcolor='#3D59AB']"));
        String bgOfChild = attri.getAttribute("bgcolor");
        System.out.println(bgOfChild);
        if(!bgOfChild.equals("#FF6633"))
        {
            driver.close();
        }

        // child pop 2
        String child2  = it.next();
        driver.switchTo().window(child2);
        driver.manage().window().maximize();

        WebElement attri2 = driver.findElement(By.xpath("//body[@bgcolor='#FF6633']"));
        String bgOfChild2 = attri2.getAttribute("bgcolor");
        System.out.println(bgOfChild2);
        if(!bgOfChild2.equals("#FF6633"))
        {
            driver.close();
        }

        // child pop 3
        String child3  = it.next();
        driver.switchTo().window(child3);
        driver.manage().window().maximize();

        WebElement attri3 = driver.findElement(By.xpath("//body[@bgcolor='#00C957']"));
        String bgOfChild3 = attri3.getAttribute("bgcolor");
        System.out.println(bgOfChild3);
        if(!bgOfChild3.equals("#FF6633"))
        {
            driver.close();
        }

        
        

	}

}
