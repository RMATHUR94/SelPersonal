package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class FriendlyLocators {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\DriverChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		WebElement nameEditbox = driver.findElement(By.cssSelector("[name='email']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		
		
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(dob)).click();
	    
	   
	    
	    WebElement icec = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(icec)).click();
	    
	    
	    WebElement rb = driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rb)).getText());
	}

}
