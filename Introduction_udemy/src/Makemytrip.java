import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement popup = driver.findElement(By.cssSelector(".autopop__wrap.autopop__wrap__new.makeFlex.column.defaultCursor"));
		WebElement login = driver.findElement(By.xpath("//li[@data-cy='account']"));
		if(popup.isDisplayed())
	    {
	    	login.click();
	    }
		
		driver.findElement(By.id("fromCity")).click();

		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		source.sendKeys("MUM");

		Thread.sleep(2000);

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		// Enter text Bangalore to destination search

		WebElement dest = driver.findElement(By.xpath("//label[@for='toCity']"));

		dest.sendKeys("bankok");

		Thread.sleep(2000);

		dest.sendKeys(Keys.ARROW_DOWN);

		dest.sendKeys(Keys.ENTER);

     
	}

}
