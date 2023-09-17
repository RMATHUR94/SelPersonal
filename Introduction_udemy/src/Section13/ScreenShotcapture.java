package Section13;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenShotcapture {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("D:\\all_docs\\google.png"));
				
	}

}
