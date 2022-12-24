import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      driver.findElement(By.id("autosuggest")).sendKeys("chi");
	      Thread.sleep(2000);
	      List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	      
	      for(WebElement option:options)
	      {
	    	  if(option.getText().equalsIgnoreCase("china"))
	    	  {
	    		  option.click();
	    		  break;
	    	  }
	      }
	}

}
