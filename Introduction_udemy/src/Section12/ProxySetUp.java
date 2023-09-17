package Section12;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySetUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions(""); to add extension
		
		options.setAcceptInsecureCerts(true);
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://expired.badssl.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.google.com/");
	    
	   //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //FileUtils.copyFile(src,new File("/home/vyrazu-66/Pictures/ss1.png"));
	}

}
