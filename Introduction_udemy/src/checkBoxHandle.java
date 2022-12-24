import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxHandle {

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://book.spicejet.com/search.aspx");
	      
	      //select armed force defence checkbox//
	      System.out.println(driver.findElement(By.cssSelector("input[id*='InputSearchView_Defense']")).isSelected());

	      driver.findElement(By.cssSelector("input[id*='InputSearchView_Defense']")).click();
	      
	      System.out.println(driver.findElement(By.cssSelector("input[id*='InputSearchView_Defense']")).isSelected());
	      
	      //count number of checkboxs//
	      
	      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
