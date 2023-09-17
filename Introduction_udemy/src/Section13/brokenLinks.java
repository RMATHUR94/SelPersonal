package Section13;
//TESTING PUSH FROM Github Desktop

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws Exception {
		// broken url
		// Step-1 - IS to get all the urls tied up to the links using selenium
		// Java method will call url and gets the status code.
		// if status code are >400 that url is not --> link which tied to url is broken.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		// String url =
		// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		// System.out.println(url);
		// connectionSetup
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode < 400, "link with text" + link.getText() + "response code with" + resCode);
			
			/*
			 * if(resCode>400) {
			 * System.out.println("link with text"+link.getText()+"response code with"
			 * +resCode); Assert.assertTrue(false);
			 * 
			 * }
			 */
		}
		a.assertAll();

	}

}
