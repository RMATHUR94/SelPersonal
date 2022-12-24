import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws Exception
	{

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	       WebDriver driver = new ChromeDriver();
	      //System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	      //WebDriver driver = new FirefoxDriver();
	      String name = "rahul";
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      String pass = getPassword(driver);
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      
	      driver.findElement(By.id("inputUsername")).sendKeys(name);
	      
	      driver.findElement(By.name("inputPassword")).sendKeys(pass);
	      
	      driver.findElement(By.className("signInBtn")).click();
	      
	      Thread.sleep(2000);
	      System.out.println(driver.findElement(By.tagName("p")).getText());
	      
	      Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	      
	      Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
	      
	      driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	}
     
	  public static String getPassword(WebDriver driver)throws Exception
	  {
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.findElement(By.cssSelector("div[class='forgot-pwd-container']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		  String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		  String[] passwordArray = passwordText.split("'");
		  String[] passwordArray2 = passwordArray[1].split("'");
		  String password= passwordArray2[0];
		  return password;
		  
	  }
}
