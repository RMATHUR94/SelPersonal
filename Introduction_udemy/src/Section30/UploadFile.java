package Section30;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://pdf2jpg.net/");
		driver.findElement(By.cssSelector("#advanced_pdf_file")).click();
		//call the .exe file of Autoit
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\DriverChrome\\fileupload.exe");
		
	}

}
