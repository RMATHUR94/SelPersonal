package Section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Class115 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");	      WebDriver driver = new ChromeDriver();
		    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		    driver.manage().window().maximize();
		    
		    //click on the column veg-fruit
		    //capture all the webElement into list
		    //capture all text into another(original) new list
		    //sort the original list into new list --> sorted list
		    //compare sorted list with original list
		    //if both are equal name are sorted order.
		    //-----------------------------------------------------------------//
		  //1. click on the column veg-fruit
		  //2.capture all the webElement into list
		    driver.findElement(By.xpath("//tr/th[1]")).click();
		    List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		  //3.capture all text into another(original) new list
		   List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		  //4.sort the original list into new list --> sorted list 
		   List<String> SortedList = originalList.stream().sorted().collect(Collectors.toList());
		  //5.compare sorted list with original list
		  Assert.assertTrue(originalList.equals(SortedList));
		  List<String> price;
		  //6.scan the name column with getText ->Rice->Print the price of the Rice
	      do
	      {
	     List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));	  
	       price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	      //print the price.
	        price.forEach(a->System.out.println(a));
	      if(price.size()<1)
	      {
	    	  driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	      }
	      }
	      while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) 
	{
		String beansprice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return beansprice;
		
	}

}
