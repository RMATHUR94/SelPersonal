import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("divpaxinfo")).click();
	      Thread.sleep(2000);
	      for(int i=1 ; i<5 ;i++)
	      {
	    	  driver.findElement(By.id("hrefIncAdt")).click();
	      }
	      driver.findElement(By.xpath("//input[@value='Done']")).click();
	}

}
