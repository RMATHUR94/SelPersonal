import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserActivity {

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.navigate().to("https://rahulshettyacademy.com");
	       driver.navigate().back();
	       driver.navigate().forward();


	}

}
