package Waits;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_79 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//int j = 0; declaring inside of another method
		Thread.sleep(3000);
		driver.manage().window().maximize();
		addItem(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

	}
	
	public static void addItem(WebDriver driver ,String[] itemsNeeded)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// convert array into arraylist
		// check whether name what you extracted present or not
		// format it to a actual vegitable name

		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}
	}

}
	
