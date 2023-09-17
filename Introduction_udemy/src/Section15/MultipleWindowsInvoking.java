package Section15;

import java.io.File;
import java.util.Set;
import java.util.logging.FileHandler;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsInvoking {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\DriverChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handels = driver.getWindowHandles();
		java.util.Iterator<String> it = handels.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com");
		String name = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentwindow);
		WebElement field = driver.findElement(By.cssSelector("[name='name']"));
		field.sendKeys(name);
		
		//screenshot taking
		File file=field.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("logo.png"));
		//FileHandler.copy(file, new File("logo.png"));
		//get height and Width
		System.out.println(field.getRect().getDimension().getHeight());
        System.out.println(field.getRect().getDimension().getWidth());


		

	}

}
