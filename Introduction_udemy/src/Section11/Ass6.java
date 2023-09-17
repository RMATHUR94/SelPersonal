package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass6 {

	public static void main(String[] args)
	{
		// Assignment - 6
        //select check-box
		//grab the lebel of selected checkbox
		//select option in dropdown , here option to select should come from step 2
		//click alert and verify , text present in step 2 present in the pop up message
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	    String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	    System.out.println(opt);
	   WebElement dropdown =  driver.findElement(By.id("dropdown-class-example"));
	    Select s = new Select(dropdown);
	    s.selectByVisibleText(opt);
	    
	    driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        String text = driver.switchTo().alert().getText();
        
        if(text.contains(opt))
        {
        	System.out.println("Success");
        }
        else
        {
        	System.out.println("Fail");
        }
        driver.switchTo().alert().accept();
	}

}
