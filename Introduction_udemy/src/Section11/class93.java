package Section11;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class93 {

	public static void main(String[] args) throws Exception {
		// a. give me the count of the link of the page
		// b. count of the links present in the footer section.
		// c. count of link in first column in footer section.
		// d. click all the link in footer section and open.
		// e. get all the name of the links.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < coloumdriver.findElements(By.tagName("a")).size(); i++) {
			String keyscontrol = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(keyscontrol);
			Thread.sleep(3000);
		} // open all the tab

		Set<String> names = driver.getWindowHandles();
		java.util.Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
