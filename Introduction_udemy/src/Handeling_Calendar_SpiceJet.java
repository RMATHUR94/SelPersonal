import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handeling_Calendar_SpiceJet {

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://book.spicejet.com/");
	      driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
	      driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).click();
	      driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
	      
	}     

}
