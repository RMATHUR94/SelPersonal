package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarDateSelection {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Scroll the Page
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();
         WebElement month = driver.findElement(By.xpath("//div[@class='flatpickr-month']"));
		
         while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("October"))

         {

         Thread.sleep(2000);

              driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

         }
        
         int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
         
         for(int i=0;i<count;i++)
         {
           String text = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
           
           if(text.equalsIgnoreCase("24"))
        		   {
        	        driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
        	         System.out.println(text);
        	         break;
        		   }
         }
         //System.out.println(driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value")); 
	}

}
