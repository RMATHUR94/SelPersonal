import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown2 {

	public static void main(String[] args) throws Exception
	{

	      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	      driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();
	}

}
