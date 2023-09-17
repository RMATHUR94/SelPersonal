package Section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args)
	{
		// Number of rows present in the table.
				// Number of column present in the table.
		        // data of second table in the row.
 

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");	      WebDriver driver = new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    driver.manage().window().maximize();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,450)");
			
		    WebElement table = driver.findElement(By.id("product"));
		    
		    System.out.println(table.findElements(By.tagName("tr")).size());
		    
		    System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		    
		   	List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));   
			
		   	System.out.println(secondrow.get(0).getText());
		   	System.out.println(secondrow.get(1).getText());
		   	System.out.println(secondrow.get(2).getText());
		
	}

}
