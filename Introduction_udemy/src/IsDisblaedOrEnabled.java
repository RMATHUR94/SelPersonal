import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsDisblaedOrEnabled {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://book.spicejet.com/");
	      driver.manage().window().maximize();
	      
	      System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
	      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
	      System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
	      
	      //checking is enable by other process//
	      
	      System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
	      if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
	      {
	    	  System.out.println("IS ENABLED");
	    	  Assert.assertTrue(true);
	      }
	      else
	      {
	    	  Assert.assertTrue(false);

          }
	      
	}

}
