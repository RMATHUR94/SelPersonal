import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.rahulshettyacademy.com/");
	     driver.findElement(By.linkText("Practice")).click();
	     driver.findElement(By.id("name")).sendKeys("Rahul");
	     driver.findElement(By.id("email")).sendKeys("rahul.tisl001@gmail.com");
	     driver.findElement(By.id("form-submit")).click();
	     driver.findElement(By.xpath("//a[normalize-space()='Automation Practise - 2'][1]")).click();
	     driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	}

}
