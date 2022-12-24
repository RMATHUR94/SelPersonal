import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableCheck {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://book.spicejet.com/");
	      
	      //check weather return date is enable or disable//
	      
	      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
	      driver.findElement(By.name("custom_date_picker")).click();
	      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();

	            
	
	
	
	
	}

}
