import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws Exception
	{
      System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      driver.get("https://rahulshettyacademy.com/locatorspractice/");
      
      driver.findElement(By.id("inputUsername")).sendKeys("ram009@gmail.com");
      
      driver.findElement(By.name("inputPassword")).sendKeys("789456RAM");
      
      driver.findElement(By.className("signInBtn")).click();
      
      System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
      
      driver.findElement(By.linkText("Forgot your password?")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("RAHUL");
      
      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul001@hotmail.com");
      
      driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
      
      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mathur001@hotmail.com");
      
      driver.findElement(By.xpath("//form/input[3]")).sendKeys("7001396692");
      
      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
      
      System.out.println(driver.findElement(By.cssSelector("form p")).getText());
      
      driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
      
      Thread.sleep(1000);
      
      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
      
      driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
      
      driver.findElement(By.id("chkboxOne")).click();
      
      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

      
	}

}
