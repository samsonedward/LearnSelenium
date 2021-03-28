package TestNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public webtables() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		/*Get the count of number of columns*/
		
	List<WebElement> column=driver.findElementsByTagName("th");
	int columnsize=column.size();
	System.out.println("Number of Columns="+columnsize);
	
	/*Get the count of number of Rows*/
	
	List<WebElement> rows=driver.findElementsByTagName("tr");
	int rowssize=column.size();
	System.out.println("Number of Rows="+rowssize);
		
	//Get the progress value of 'Learn to interact with Elements
	
	//Function normalize-space removes leading and trailing spaces and 
	//replaces sequences of whitespace characters by a single space//
	
	//Calling normalize-space()method
	
	WebElement Percentage=driver.findElementByXPath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]");
	String percentagevalue=Percentage.getText();
	System.out.println("Get the Percentage value ="+percentagevalue);
	
	/*Check the vital task for the least completed progress*/
	
	List<WebElement> allprogress=driver.findElementsByXPath("//td[2]");
	
	//Converting String to Integer	
	List<Integer>numberList=new ArrayList<Integer>();
	
	for (WebElement webElement : allprogress)
	{
		String individualvalue=webElement.getText().replace("%", "");
		numberList.add(Integer.parseInt(individualvalue));
		}
	
	System.out.println(numberList);
	int smallvalue=Collections.min(numberList);
	System.out.println(smallvalue);
	
	//Converting Integer  to String	
	
	driver.quit();
	}
	
	

}
