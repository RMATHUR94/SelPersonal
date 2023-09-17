package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction86 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//Move to specific Element
		a.moveToElement(move).build().perform();
		//Type upperCase in search box
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Skybags").build().perform();
		//double click of search word
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(Keys.SPACE).sendKeys("laptop bag").doubleClick().build().perform();
		//Right-click on Retruns and order , at first move the right click option .
		WebElement move2 = driver.findElement(By.cssSelector("#nav-orders"));
		a.moveToElement(move2).contextClick().build().perform();
		
	}
}
